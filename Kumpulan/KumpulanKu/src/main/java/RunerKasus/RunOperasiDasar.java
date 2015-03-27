package RunerKasus;

import Kasus.OperasiDasar;

/**
 * Created by HP on 06/03/2015.
 */
public class RunOperasiDasar {
    public static void main(String[] args) {
        OperasiDasar kalkulator=new OperasiDasar();
        System.out.println(" [1] 10 * 2 = "+kalkulator.kali(10, 2)); //hasilnya seharusnya 20
        System.out.println(" [1] 10 / 2 = "+kalkulator.bagi(10, 2)); //hasilnya seharusnya 5
        System.out.println(" [1] 10 + 2 = "+kalkulator.tambah(10, 2)); //hasilnya seharusnya 12
        System.out.println(" [1] 10 - 2 = "+kalkulator.kurang(10, 2)); //hasilnya seharusnya 8

    }
}
