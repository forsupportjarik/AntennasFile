import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, IOException {

        String fileNameAntennas = "Antennas.txt";
        String fileNameXeus = "SiteFileForXeus.xif";
        String fileNameExportRpdb = "ExportFromRpdb.csv";
        String fileNameCoordinatesGsm = "Coordinates.txt";
        String pathForAntennas = "E:\\PhysicalData_UMTS\\" + fileNameAntennas;
        String pathForXeus = "//172.20.237.243//optimization//" + fileNameXeus;
        String pathForGsm = "E:\\PhysicalData_GSM\\" + fileNameCoordinatesGsm;
        String pathToFileNameExportRpdb = "E:\\Teoco_supp\\" + fileNameExportRpdb;

        AntennasData antennasData = new AntennasData();
        SiteFileData siteFileData = new SiteFileData();
        UpdateRpdbData updateRpdbData = new UpdateRpdbData();
        PerformingProcedures performingProcedures = new PerformingProcedures();
        CoordinatesFileGsm coordinatesFileGsm = new CoordinatesFileGsm();

        updateRpdbData.exportDataFromRpdb(Utilities.createFile(pathToFileNameExportRpdb));
        updateRpdbData.importDataFromRpdb();

        performingProcedures.callProcedure1();
        performingProcedures.callProcedure2();

        antennasData.writeDataToFile(Utilities.createFile(pathForAntennas));

        coordinatesFileGsm.writeDataToCoordinatesFile(Utilities.createFile(pathForGsm));

        siteFileData.writeDataToXeusFile(Utilities.createFileForXeus(pathForXeus));
    }
}
