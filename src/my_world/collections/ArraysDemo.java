package my_world.collections;

/**
 * Created by root on 6/15/15.
 */
public class ArraysDemo {
    public static void main(String args[]) {
        String plainTextWithSalt = "Str@Str@nGov13woAZutHWZEX123DD7PL89  ";
        String salt = "oAZutHWZEX123DD7PL89";
        System.out.println(plainTextWithSalt.lastIndexOf(salt));

        Double assetVersion = null;
        String version = "2";
        System.out.println(version);
        System.out.println(version.contains("."));

        if(version != null) {
            String decimals[] = version.split("\\.");
            if(decimals[0].equals("2")) {
                assetVersion = Double.valueOf(version);
            }
        }
        System.out.println(assetVersion);
        getdb(assetVersion);
        System.out.println(assetVersion);
    }

    private static Double getdb(Double version){
        Double assetVersion = version;
        assetVersion = 2.1;
        return assetVersion;
    }
}
