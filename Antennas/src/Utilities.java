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

        if (cI.endsWith("1") || cI.endsWith("4") || cI.endsWith("7")) {
            return antennaId.concat("/1");
        } else if (cI.endsWith("2") || cI.endsWith("5") || cI.endsWith("8")) {
            return antennaId.concat("/2");
        } else if (cI.endsWith("3") || cI.endsWith("6") || cI.endsWith("9")) {
            return antennaId.concat("/3");
        } else if (cI.equals(null)) {
            return nodeBNameOss.concat("/1");
        } else return nodeBNameOss.concat("/1");


    }

}
