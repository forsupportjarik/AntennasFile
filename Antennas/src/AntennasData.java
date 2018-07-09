import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class AntennasData {


    public static void writeDataToFile(File file) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://172.20.237.235:3306/All_DB",
                "ykovalenko", "yaroslav");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM mentor WHERE mentor.CellNameOSS NOT LIKE \"%null%\"");
        FileWriter fw = new FileWriter(file);
        fw.append("Technology\tRNC Name\tRNC Id\tNodeB Name\tNodeB Id\tENB ID\tNodeB Longitude\tNodeB Latitude\tSector Name\tActive\tNoise Figure\tAntennaID\tAntenna Model\tSector Keywords\tAntenna Longitude\tAntenna Latitude\tHeight\tMechanical DownTilt\tAzimuth\tDownlink Loss\tUplink Loss\tRTT fix A Coefficient\tRTT fix B Coefficient\tRET ID\tIn Building\n");
        while (rs.next()) {
            Antennas antennas = new Antennas(fw.append("UMTS" + "\t") + "",
                    fw.append("RNC" + rs.getString(1) + "\t") + "",
                    fw.append(rs.getString(1) + "\t") + "",
                    fw.append(rs.getString(2) + "\t") + "",
                    fw.append(rs.getString(3) + "\t") + "",
                    fw.append("N/A" + "\t") + "",
                    fw.append(rs.getString(4) + "\t") + "",
                    fw.append(rs.getString(5) + "\t") + "",
                    fw.append(rs.getString(6) + "\t") + "",
                    fw.append("true" + "\t") + "",
                    fw.append("5" + "\t") + "",
                    fw.append(Utilities.defineAntennaIdForAntennasFile(rs.getString(3), rs.getString(14)) + "\t") + "",
                    fw.append(CheckAntenna.checkAntennaName(rs.getString(7)) + "\t") + "",
                    fw.append("\t") + Utilities.defineIntegralManufacturer(rs.getString(7)),
                    fw.append(rs.getString(4) + "\t") + "",
                    fw.append(rs.getString(5) + "\t") + "",
                    fw.append(rs.getString(8) + "\t") + "",
                    fw.append(rs.getString(9) + "\t") + "",
                    fw.append(rs.getString(10) + "\t") + "",
                    fw.append("3" + "\t") + "",
                    fw.append("3" + "\t") + "",
                    fw.append("0" + "\t") + "",
                    fw.append("0" + "\t") + "",
                    fw.append("\t") + "",
                    fw.append("false" + "\n") + "");

        }
        fw.flush();
        fw.close();

        System.out.println("Antenna.txt file is done.");
    }

    public static void writeDataToFileLteData(String pathToAntennaFile) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://172.20.237.235:3306/All_DB",
                "ykovalenko", "yaroslav");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT `a`.`cellName` AS `CELLNAME`,\n" +
                "      `d`.`enbName` AS `NODEBNAME`,\n" +
                "      REPLACE(`b`.`Latitude`,',','.') AS `LAT`,\n" +
                "      REPLACE(`b`.`Longitude`,',','.') AS `LONG`,\n" +
                "      '255' AS `MCC`,\n" +
                "      '01' AS `MNC`,\n" +
                "      `a`.`tac` AS `LAC`,\n" +
                "      `a`.`MRBTS` AS `MRBTS`,\n" +
                "      `a`.`LNBTS` AS `LNBTS`,\n" +
                "      `a`.`MRBTS` AS `NODE`,\n" +
                "      `a`.`LNCEL` AS `CELLID`,\n" +
                "      `c`.`Height` AS `HEIGHT`,\n" +
                "      IF((SUBSTRING_INDEX(SUBSTRING_INDEX(`a`.`cellName`,'_',-(2)),'_',1) LIKE 'IN%'),'000',SUBSTRING_INDEX(SUBSTRING_INDEX(`a`.`cellName`,'_',-(2)),'_',1)) AS `AZIMUTH`,\n" +
                "      'LTE' AS `TECH`\n" +
                "FROM `All_DB`.`nsn_lte_lncel` `a`\n" +
                "      LEFT JOIN `All_DB`.`bd_coord` `b` ON REPLACE(`b`.`Site_Name`,' ','_') = `a`.`NodeB`\n" +
                "      LEFT JOIN `All_DB`.`LCS_Coordinate_LTE` `c` ON REPLACE(`c`.`Site_Name`,' ','_') = `a`.`NodeB`\n" +
                "      LEFT JOIN `All_DB`.`NSN_LTE_LNBTS` `d` ON REPLACE(`d`.`NodeB`,' ','_') = `a`.`NodeB` GROUP BY `a`.`cellName`");

        FileWriter fw = new FileWriter(pathToAntennaFile,true);
        while (rs.next()) {
            Antennas antennas = new Antennas(fw.append("LTE" + "\t") + "",
                    fw.append(rs.getString(7) + "\t") + "",
                    fw.append(rs.getString(7) + "\t") + "",
                    fw.append(rs.getString(2) + "\t") + "",
                    fw.append(rs.getString(8) + "\t") + "",
                    fw.append(rs.getString(9) + "\t") + "",
                    fw.append(rs.getString(4) + "\t") + "",
                    fw.append(rs.getString(3) + "\t") + "",
                    fw.append(rs.getString(1) + "\t") + "",
                    fw.append("true" + "\t") + "",
                    fw.append("5" + "\t") + "",
                    fw.append(rs.getString(1) + "/1" + "\t") + "",
                    fw.append("dummy/dummy" + "\t") + "",
                    fw.append("\t") + "",
                    fw.append(rs.getString(4) + "\t") + "",
                    fw.append(rs.getString(3) + "\t") + "",
                    fw.append(rs.getString(12) + "\t") + "",
                    fw.append("0" + "\t") + "",
                    fw.append(Utilities.fixAzimuthForLte(rs.getString(13) + "\t")) + "",
                    fw.append("0" + "\t") + "",
                    fw.append("0" + "\t") + "",
                    fw.append("0" + "\t") + "",
                    fw.append("0" + "\t") + "",
                    fw.append("\t") + "",
                    fw.append("false" + "\n") + "");

        }
        fw.flush();
        fw.close();

        System.out.println("LTE data is added to Antenna.txt file.");
    }


}

