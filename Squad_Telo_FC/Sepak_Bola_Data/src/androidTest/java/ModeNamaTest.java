import junit.framework.Assert;
import junit.framework.TestCase;

public class ModeNamaTest extends TestCase {

    public void testGetLastNameValid() throws Exception {
        // test data valid
        String fullName = "Eko Khannedy";
        String lastName = ModeNama.getLastName(fullName);

        // last name harus Khannedy
        Assert.assertEquals("Khannedy", lastName);
    }

    public void testGetLastNameOnlyOneWord() throws Exception {
        // test satu kata
        String fullName = "Eko";
        String lastName = ModeNama.getLastName(fullName);

        // last name harus NULL
        Assert.assertNull(lastName);
    }

    public void testGetLastNameNull() throws Exception {
        // test NULL
        String fullName = null;
        String lastName = ModeNama.getLastName(fullName);

        // last name harus null
        Assert.assertNull(lastName);
    }

    public void testGetLastNameMoreThan2Words() throws Exception {
        // test satu kata
        String fullName = "Eko Kurniawan Khannedy";
        String lastName = ModeNama.getLastName(fullName);

        // last name harus Khannedy
        Assert.assertEquals("Khannedy", lastName);
    }
}