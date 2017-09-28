import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class CoordinatesFileGsm {

public static void writeDataToCoordinatesFile (File file)throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection(
            "jdbc:mysql://172.20.237.235:3306/All_DB",
            "ykovalenko", "yaroslav");
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM mentor WHERE CellNameOSS LIKE \"%D\" || CellNameOSS LIKE \"%G\"");
    FileWriter fw = new FileWriter(file);
    fw.append("Sector\tLatitude\tLongitude\tAzimuth\tLAC\tCI");
    fw.append("\n");

    while (rs.next()) {
        fw.append(rs.getString(6)+ "\t");
        fw.append(rs.getString(5)+ "\t");
        fw.append(rs.getString(4)+ "\t");
        fw.append(rs.getString(10)+ "\t");
        fw.append(rs.getString(13)+ "\t");
        fw.append(rs.getString(14)+ "\t");
        fw.append("\n");
    }
    fw.flush();
    fw.close();

    System.out.println("Coordinates.txt file is done.");
}
}
