package Kasus.Tes.Unit;

/**
 * Created by HP on 11/03/2015.
 */
public class AmbilNamaBelakang {
    public static String AmbilNama(String name) {
        if (name == null) {
            return null;
        }

        String[] split = name.split(" ");

        if (split.length < 2) {
            return null;
        }

        return split[split.length - 1];
    }


}
