package Test.Unit;

import Kasus.Tes.Unit.AmbilNamaBelakang;
import junit.framework.Assert;
import junit.framework.TestCase;

public class AmbilNamaBelakangTest extends TestCase {

    public void testValidAmbilNamaBelakang() throws Exception {
        String fullName = "Wilom Pradumansyah";
        String lastName = AmbilNamaBelakang.AmbilNama(fullName);

        // last name harus Khannedy
        Assert.assertEquals("Pradumansyah", lastName);
    }
    public void testSatuKataAmbilNamaBelakang() throws Exception {
        // test satu kata
        String fullName = "Wilom";
        String lastName = AmbilNamaBelakang.AmbilNama(fullName);

        // last name harus NULL
        Assert.assertNull(lastName);
    }

    public void testKosongAmbilNamaBelakang() throws Exception {
        // test NULL
        String fullName = null;
        String lastName = AmbilNamaBelakang.AmbilNama(fullName);

        // last name harus null
        Assert.assertNull(lastName);
    }

    public void testLebihDariDuaKataAmbilNamaBelakang() throws Exception {
        // test satu kata
        String fullName = "Wilom Pradumansyah Suryanto";
        String lastName = AmbilNamaBelakang.AmbilNama(fullName);

        // last name harus Khannedy
        Assert.assertEquals("Suryanto", lastName);
    }
}