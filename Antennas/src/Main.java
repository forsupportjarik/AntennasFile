import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, IOException {

        String fileNameAntennas = "Antennas.txt";
        String fileNameXeusZte = "SiteFileForXeusZTE.xif";
        String fileNameXeusNokia = "SiteFileForXeusNokia.xif";
        String fileNameXeusHuawei = "SiteFileForXeusHuawei.xif";
        String fileNameExportRpdb = "ExportFromRpdb.csv";
        String fileNameCoordinatesGsm = "Coordinates.txt";
        String pathForAntennas = "E:\\PhysicalData_UMTS\\" + fileNameAntennas;
        String pathForXeusZte = "//172.20.237.243//optimization//" + fileNameXeusZte;
        String pathForXeusNokia = "//172.20.237.243//optimization//" + fileNameXeusNokia;
        String pathForXeusHuawei = "//172.20.237.243//optimization//" + fileNameXeusHuawei;
        String pathForGsm = "E:\\PhysicalData_GSM\\" + fileNameCoordinatesGsm;
        String pathToFileNameExportRpdb = "E:\\Teoco_supp\\" + fileNameExportRpdb;

        AntennasData antennasData = new AntennasData();
        SiteFileDataZte siteFileDataZte = new SiteFileDataZte();
        SiteFileDataNokia siteFileDataNokia = new SiteFileDataNokia();
        SiteFileDataHuawei siteFileDataHuawei = new SiteFileDataHuawei();
        UpdateRpdbData updateRpdbData = new UpdateRpdbData();
        PerformingProcedures performingProcedures = new PerformingProcedures();
        CoordinatesFileGsm coordinatesFileGsm = new CoordinatesFileGsm();

        updateRpdbData.exportDataFromRpdb(Utilities.createFile(pathToFileNameExportRpdb));
        updateRpdbData.importDataFromRpdb();

        performingProcedures.callProcedure1();
        performingProcedures.callProcedure2();

        antennasData.writeDataToFile(Utilities.createFile(pathForAntennas));
        antennasData.writeDataToFileLteDataNsn(pathForAntennas);
        antennasData.writeDataToFileLteDataHuawei(pathForAntennas);

        coordinatesFileGsm.writeDataToCoordinatesFile(Utilities.createFile(pathForGsm));

        siteFileDataZte.writeDataToXeusFile(Utilities.createFileForXeus(pathForXeusZte));
        siteFileDataNokia.writeDataToXeusFileNokia(Utilities.createFileForXeus(pathForXeusNokia));
        siteFileDataHuawei.writeDataToXeusFileHuawei(Utilities.createFileForXeus(pathForXeusHuawei));

    }
}
