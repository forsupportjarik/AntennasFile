
public class Utilities {

    public static String getLacFromRefULocationAreaZte(String lacFromDb) {

        lacFromDb.substring(lacFromDb.lastIndexOf("=") + 1);

        return lacFromDb;
    }
}
