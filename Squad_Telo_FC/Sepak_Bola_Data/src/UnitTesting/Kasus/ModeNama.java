/**
 * Created by HP on 03/03/2015.
 */
public class ModeNama {
    public static String getLastName(String name) {
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
