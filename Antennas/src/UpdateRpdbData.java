import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class UpdateRpdbData {


    public static void exportDataFromRpdb(File file) throws ClassNotFoundException, SQLException, IOException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = DriverManager.getConnection(
                "jdbc:sqlserver://172.20.215.71:1433;databaseName=rpdb",
                "kovalenko", "parafin14");
        Statement stmt = conn.createStatement();
        FileWriter fw = new FileWriter(file);
        ResultSet rs = stmt.executeQuery("SELECT [BSC_RNC],[SiteName],[LAC],[CellID],[CellName],[CellName2],[AntennaName],[Latitude],[Longitude],[AntennaHeight],[Azimuth],[TiltMechanical],[TiltElectrical] FROM [rpdb].[dbo].[vMentor]");
        while (rs.next()) {
            fw.append(rs.getString(1));
            fw.append(",");
            fw.append(rs.getString(2));
            fw.append(",");
            fw.append(rs.getString(3));
            fw.append(",");
            fw.append(rs.getString(4));
            fw.append(",");
            fw.append(rs.getString(5));
            fw.append(",");
            fw.append(rs.getString(6));
            fw.append(",");
            fw.append(rs.getString(7));
            fw.append(",");
            fw.append(rs.getString(8));
            fw.append(",");
            fw.append(rs.getString(9));
            fw.append(",");
            fw.append(rs.getString(10));
            fw.append(",");
            fw.append(rs.getString(11));
            fw.append(",");
            fw.append(rs.getString(12));
            fw.append(",");
            fw.append(rs.getString(13));
            fw.append("\n");
        }
        fw.flush();
        fw.close();

        System.out.println("ExportCsv file is wrote.");
    }

    public static void importDataFromRpdb() throws SQLException, ClassNotFoundException, IOException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://172.20.237.235:3306/All_DB",
                "ykovalenko", "yaroslav");
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("DELETE FROM allCellMentor");
        System.out.println("Data from allCellMentor is deleted");
        String path = "'C:/DATA/PROGRAMMING/filesToHide/ExportFromRpdb.csv'";
        stmt.executeUpdate("load data local infile " + path + " into TABLE allCellMentor fields terminated by ','");

        System.out.println("Data from ExportFromRpdb.csv is wrote to allCellMentor");
    }
}
