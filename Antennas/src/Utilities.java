import java.io.File;
import java.io.IOException;

public class Utilities {

    public static File createFileForXeus(String path) {

        return createFile(path);

    }

    public static File createFile(String path) {
        File file = null;
        try {
            file = new File(path);
            boolean fvar = file.createNewFile();
            if (fvar) {
                System.out.println("File has been created successfully");
            } else {
                System.out.println("File already present at the specified location");
            }
        } catch (IOException e) {
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }
        return file;
    }

    public static String getLacFromRefULocationAreaZte(String lacFromDb) {

        String lac = lacFromDb.substring(lacFromDb.lastIndexOf("=") + 1);


        return lac;
    }

    public static String defineAntennaIdForAntennasFile(String nodeBNameOss, String cellId) {

        String antennaId = nodeBNameOss;
        String cI = cellId;

        if (cI.endsWith("1") && cI.equals(antennaId.concat("1"))) {
            return antennaId.concat("/1");
        } else if (cI.endsWith("4") && cI.equals(antennaId.concat("4"))) {
            return antennaId.concat("/1");
        } else if (cI.endsWith("7") && cI.equals(antennaId.concat("7"))) {
            return antennaId.concat("/1");
        } else if (cI.endsWith("1") && !cI.equals(antennaId.concat("1"))) {
            return antennaId.concat("/4");
        } else if (cI.endsWith("4") && !cI.equals(antennaId.concat("4"))) {
            return antennaId.concat("/4");
        } else if (cI.endsWith("7") && !cI.equals(antennaId.concat("7"))) {
            return antennaId.concat("/4");

        } else if (cI.endsWith("2") || cI.endsWith("5") || cI.endsWith("8")) {
            return antennaId.concat("/2");
        } else if (cI.endsWith("3") || cI.endsWith("6") || cI.endsWith("9")) {
            return antennaId.concat("/3");
        } else return antennaId.concat("/N/A");


    }

    public static String defineIntegralManufacturer(String antennaName) {

        String name = antennaName;
        String result = "BE AWARE FOR CALCULATION WITH INTEGRAL ANTENNA";
        if (name.startsWith("INT")) {
            return result;
        } else

            return "";
    }

    public static String fixAzimuthForLte(String azimuth) {

        String a = azimuth;

        if(a.startsWith("00")) {
            return a.substring(2);
        } else if (a.startsWith("0")) {
            return a.substring(1);
        }
        else return a;
    }

}
