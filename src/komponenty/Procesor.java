package komponenty;

import wyjatki.ReachedMaxTempException;

public class Procesor extends Komponent{
    private double taktowanie;
    private double temperatura;
    private static final double MAX_TEMP = 71;

    public Procesor(String nazwa, String producent, String numer, double taktowanie, double temperatura) {
        super(nazwa, producent, numer);
        this.taktowanie = taktowanie;
        this.temperatura = temperatura;
    }

    public double getTaktowanie() {
        return taktowanie;
    }

    public void setTaktowanie(double taktowanie) {
        this.taktowanie = taktowanie;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public static double getMaxTemp() {
        return MAX_TEMP;
    }

    public void podkrecanieP(double podkrecenie){
        taktowanie = taktowanie + podkrecenie;
        temperatura = temperatura + (podkrecenie / 100) * 10;
        if(temperatura > MAX_TEMP)
            throw new ReachedMaxTempException("Nie można wykonać. Osiągnięto MAX temperature komponentu");
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Taktowanie:" + " " + taktowanie + " " + "Temperatura:" + temperatura;
    }
}
