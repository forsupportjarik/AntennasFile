import java.io.File;
import java.io.IOException;

public class Utilities {

    public static File createFileForXeus(String fileName) {

        return createFile(fileName);

    }

    public static File createFile(String fileName) {
        File file = null;
        try {
            file = new File("C:\\DATA\\Mentor projects\\" + fileName);
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

    public static String defineAntennaIdForAntennasFile(String cellNameOss) {

        String antennaId;

        return antennaId;
    }
}
