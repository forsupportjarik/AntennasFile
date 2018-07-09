import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, IOException {

        String fileNameAntennas = "Antennas.txt";
        String fileNameXeusZte = "SiteFileForXeusZTE.xif";
        String fileNameXeusNokia = "SiteFileForXeusNokia.xif";
        String fileNameExportRpdb = "ExportFromRpdb.csv";
        String fileNameCoordinatesGsm = "Coordinates.txt";
        String pathForAntennas = "C:\\DATA\\HLAM\\" + fileNameAntennas;
        String pathForXeusZte = "C:\\DATA\\HLAM\\" + fileNameXeusZte;
        String pathForXeusNokia = "C:\\DATA\\HLAM\\" + fileNameXeusNokia;
        String pathForGsm = "C:\\DATA\\HLAM\\" + fileNameCoordinatesGsm;
        String pathToFileNameExportRpdb = "C:\\DATA\\HLAM\\" + fileNameExportRpdb;

        AntennasData antennasData = new AntennasData();
        SiteFileDataZte siteFileDataZte = new SiteFileDataZte();
        SiteFileDataNokia siteFileDataNokia = new SiteFileDataNokia();
        UpdateRpdbData updateRpdbData = new UpdateRpdbData();
        PerformingProcedures performingProcedures = new PerformingProcedures();
        CoordinatesFileGsm coordinatesFileGsm = new CoordinatesFileGsm();

        updateRpdbData.exportDataFromRpdb(Utilities.createFile(pathToFileNameExportRpdb));
        updateRpdbData.importDataFromRpdb();

        performingProcedures.callProcedure1();
        performingProcedures.callProcedure2();

        antennasData.writeDataToFile(Utilities.createFile(pathForAntennas));
        antennasData.writeDataToFileLteData(pathForAntennas);

        coordinatesFileGsm.writeDataToCoordinatesFile(Utilities.createFile(pathForGsm));

        siteFileDataZte.writeDataToXeusFile(Utilities.createFileForXeus(pathForXeusZte));
        siteFileDataNokia.writeDataToXeusFileNokia(Utilities.createFileForXeus(pathForXeusNokia));

    }
}
