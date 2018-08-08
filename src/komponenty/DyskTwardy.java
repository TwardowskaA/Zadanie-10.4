package komponenty;

public class DyskTwardy extends Komponent{
    private int pojemosc;

    public DyskTwardy(String nazwa, String producent, String numer, int pojemosc) {
        super(nazwa, producent, numer);
        this.pojemosc = pojemosc;
    }

    public int getPojemosc() {
        return pojemosc;
    }

    public void setPojemosc(int pojemosc) {
        this.pojemosc = pojemosc;
    }

    @Override
    public String toString() {
        return super.toString() + "Pojemność:" + pojemosc;
    }
}
