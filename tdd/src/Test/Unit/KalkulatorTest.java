package Test.Unit;

import Kasus.Tes.Unit.Kalkulator;
import junit.framework.Assert;
import junit.framework.TestCase;

public class KalkulatorTest extends TestCase {

    Kalkulator kalkulator;


    public void init(){

        kalkulator=new Kalkulator();

    }

    public void testKali() throws Exception {
        Assert.assertEquals(20, kalkulator.kali(10, 2), 0);
    }

    public void testBagi() throws Exception {
        Assert.assertEquals(5, kalkulator.bagi(10, 2), 0);
    }

    public void testTambah() throws Exception {
        Assert.assertEquals(12, kalkulator.tambah(10, 2), 0);
    }

    public void testKurang() throws Exception {
        Assert.assertEquals(8, kalkulator.kurang(10, 2), 0);
    }

}