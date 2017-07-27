import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PerformingProcedures {

    public static void callProcedure1() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://172.20.237.235:3306/All_DB",
                "ykovalenko", "yaroslav");
        Statement stmt = conn.createStatement();

        String createProcedure = "CALL UPDATENAMEBSCLACCI;";
        stmt.execute(createProcedure);

        System.out.println("Procedure #1 is executed");
    }

    public static void callProcedure2() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://172.20.237.235:3306/All_DB",
                "ykovalenko", "yaroslav");
        Statement stmt = conn.createStatement();
        String createProcedure = "CALL UPDATE_CellName2;";

        stmt.execute(createProcedure);
        System.out.println("Procedure #2 is executed");
    }
}
