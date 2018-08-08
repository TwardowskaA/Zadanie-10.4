package Komputer;

import Komponenty.DyskTwardy;
import Komponenty.PamiecRam;
import Komponenty.Procesor;

public class Test {
    public static void main(String[] args) {

        PamiecRam ram = new PamiecRam("HyperX", "Kingston", "740617244366", 2400, 20, 8);
        Procesor pro = new Procesor("Intel Core i7", "Intel", "BX80684I78700K", 3730, 40);
        DyskTwardy dysk = new DyskTwardy("IronWolf", "Seagate", "ST8000VN0022", 8000);

        Komputer komputer = new Komputer(pro, ram, dysk);

        System.out.println(pro.toString());
        pro.podkrecanie(300);
        System.out.println(pro.toString());

        System.out.println(ram.toString());
        ram.podkrecanie(160);
        System.out.println(ram.toString());

    }
}
