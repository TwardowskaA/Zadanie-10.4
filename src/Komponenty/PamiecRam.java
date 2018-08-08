package Komponenty;

import Wyjątki.ReachedMaxTempException;

public class PamiecRam extends Procesor {

    private int pamiec;
    private static final double MAX_TEMP = 45;

    public PamiecRam(String nazwa, String producent, String numer, double taktowanie, double temperatura, int pamiec) {
        super(nazwa, producent, numer, taktowanie, temperatura);
        this.pamiec = pamiec;
    }

    public int getPamiec() {
        return pamiec;
    }

    public void setPamiec(int pamiec) {
        this.pamiec = pamiec;
    }

    @Override
    public void podkrecanie(double podkrecenie) {
        super.podkrecanie(podkrecenie);
        setTemperatura(getTemperatura() + (podkrecenie / 100) * 5);
        if (getTemperatura() > MAX_TEMP)
            throw new ReachedMaxTempException("Nie można wykonać. Osiągnięto MAX temperature komponentu");
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Pamięć:" + " " + pamiec;
    }
}
