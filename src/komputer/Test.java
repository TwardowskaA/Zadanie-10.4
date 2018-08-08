package komputer;

import komponenty.DyskTwardy;
import komponenty.PamiecRam;
import komponenty.Procesor;
import wyjatki.ReachedMaxTempException;

public class Test {
    public static void main(String[] args) {

        PamiecRam ram = new PamiecRam("HyperX", "Kingston", "740617244366", 2400, 20, 8);
        Procesor pro = new Procesor("Intel Core i7", "Intel", "BX80684I78700K", 3730, 40);
        DyskTwardy dysk = new DyskTwardy("IronWolf", "Seagate", "ST8000VN0022", 8000);

        Komputer komputer = new Komputer(pro, ram, dysk);

        System.out.println(pro.toString());
        try{
            pro.podkrecanieP(400);
        } catch(ReachedMaxTempException e) {
            e.printStackTrace();
        }
        System.out.println(pro.toString());

        System.out.println(ram.toString());
        try{
            ram.podkrecanieR(200);
        } catch(ReachedMaxTempException ex){
            ex.printStackTrace();
        }

        System.out.println(ram.toString());

    }
}
