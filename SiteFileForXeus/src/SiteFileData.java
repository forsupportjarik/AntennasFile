import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;


public class SiteFileData{

   public static File createFileForXeus(String fileName) {

      return AntennasData.createFile("");

   }

   public static void writeDataToXeusFile(File file) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {

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
                 fw.append(rs.getString(6) + "/1" + "\t") + "",
                 fw.append(CheckAntenna.checkAntennaName(rs.getString(7)) + "\t") + "",
                 fw.append("\t") + "",
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
}
