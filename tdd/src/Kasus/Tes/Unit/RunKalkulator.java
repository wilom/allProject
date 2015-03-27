package Kasus.Tes.Unit;

/**
 * Created by HP on 04/03/2015.
 */
public class RunKalkulator {
    public static void main(String[] args) {

        Kalkulator kalkulator=new Kalkulator();
        System.out.println(" [1] 10 * 2 = "+kalkulator.kali(10, 2)); //hasilnya seharusnya 20
        System.out.println(" [2] 10 / 2 = "+kalkulator.bagi(10, 2)); //hasilnya seharusnya 5
        System.out.println(" [3] 10 + 2 = "+kalkulator.tambah(10, 2)); //hasilnya seharusnya 12
        System.out.println(" [4] 10 - 2 = "+kalkulator.kurang(10, 2)); //hasilnya seharusnya 8

    }
}
