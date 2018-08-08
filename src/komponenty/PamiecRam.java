package komponenty;

import wyjatki.ReachedMaxTempException;

public class PamiecRam extends Komponent {

    private double taktowanie;
    private double temperatura;
    private int pamiec;
    private static final double MAX_TEMP = 45;

    public PamiecRam(String nazwa, String producent, String numer, double taktowanie, double temperatura, int pamiec) {
        super(nazwa, producent, numer);
        this.taktowanie = taktowanie;
        this.temperatura = temperatura;
        this.pamiec = pamiec;
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

    public int getPamiec() {
        return pamiec;
    }

    public void setPamiec(int pamiec) {
        this.pamiec = pamiec;
    }

    public static double getMaxTemp() {
        return MAX_TEMP;
    }

    public void podkrecanieR(double podkrecenie) {
        if (temperatura + (podkrecenie / 100) * 15 < MAX_TEMP) {
            temperatura = temperatura + (podkrecenie / 100) * 15;
            taktowanie = taktowanie + podkrecenie;
        } else throw new ReachedMaxTempException("Nie można wykonać. Osiągnięto MAX temperature komponentu");
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Taktowanie:" + " " + taktowanie + " " + "Temperatura:" + temperatura + " " + "Pamięć:" + " " + pamiec;
    }
}
