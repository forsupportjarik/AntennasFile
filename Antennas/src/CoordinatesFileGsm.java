import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class CoordinatesFileGsm {

public static void writeDataToCoordinatesFile (File file)throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {

    String latitude = "";
    String longitude = "";
    int lengthLatitude = 0;
    int lengthLongitude = 0;

    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection(
            "jdbc:mysql://172.20.237.235:3306/All_DB",
            "ykovalenko", "yaroslav");
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT CellNameOSS, SUBSTRING(Latitude, 1, 10), SUBSTRING(Lontitude, 1, 10), Azimuth, LAC_RPDB, CellID_RPDB FROM mentor WHERE CellNameOSS LIKE \"%D\" || CellNameOSS LIKE \"%G\"");
    FileWriter fw = new FileWriter(file);
    fw.append("Sector\tLatitude\tLongitude\tAzimuth\tLAC\tCI");
    fw.append("\n");

    while (rs.next()) {
        fw.append(rs.getString(1)+ "\t");
        fw.append(rs.getString(2)+ "\t");
        fw.append(rs.getString(3)+ "\t");
        fw.append(rs.getString(4)+ "\t");
        fw.append(rs.getString(5)+ "\t");
        fw.append(rs.getString(6));
        fw.append("\n");
    }
    fw.flush();
    fw.close();

    System.out.println("Coordinates.txt file is done.");
}
}
