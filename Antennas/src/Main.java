import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, IOException {

        String fileNameAntennas = "Antennas.txt";
        String fileNameXeus = "SiteFileForXeus.xif";
        String fileNameExportRpdb = "ExportFromRpdb.csv";
        String fileNameCoordinatesGsm = "Coordinates.txt";
        AntennasData antennasData = new AntennasData();
        SiteFileData siteFileData = new SiteFileData();
        UpdateRpdbData updateRpdbData = new UpdateRpdbData();
        PerformingProcedures performingProcedures = new PerformingProcedures();
        CoordinatesFileGsm coordinatesFileGsm = new CoordinatesFileGsm();

        updateRpdbData.exportDataFromRpdb(antennasData.createFile(fileNameExportRpdb));
        updateRpdbData.importDataFromRpdb();

        performingProcedures.callProcedure1();
        performingProcedures.callProcedure2();

        antennasData.writeDataToFile(antennasData.createFile(fileNameAntennas));

        siteFileData.writeDataToXeusFile(siteFileData.createFileForXeus(fileNameXeus));


        coordinatesFileGsm.writeDataToCoordinatesFile(antennasData.createFile(fileNameCoordinatesGsm));


    }
}
