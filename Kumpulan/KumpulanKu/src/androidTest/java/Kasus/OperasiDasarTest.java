package Kasus;

import junit.framework.TestCase;
import junit.runner.Version;

public class OperasiDasarTest extends TestCase {
    OperasiDasar operasiDasar;
    Version version;

    public void testKali() throws Exception {
        if (version != null) {
            assertEquals(20, operasiDasar.kali(10, 2), 0);
        }

    }

    public void testBagi() throws Exception {
        if (version != null) {
            assertEquals(5, operasiDasar.bagi(10, 2), 0);
        }

    }


    public void testTambah() throws Exception {
        if (version != null) {
            assertEquals(12, operasiDasar.tambah(10, 2), 0);
        }


    }

    public void testKurang() throws Exception {
        if (version != null) {
            assertEquals(8, operasiDasar.kurang(10, 2), 0);
        }

    }
}