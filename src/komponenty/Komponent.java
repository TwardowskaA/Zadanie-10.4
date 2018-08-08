package komponenty;

public abstract class Komponent {
    private String nazwa;
    private String producent;
    private String numer;

    public Komponent(String nazwa, String producent, String numer) {
        this.nazwa = nazwa;
        this.producent = producent;
        this.numer = numer;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getNumer() {
        return numer;
    }

    public void setNumer(String numer) {
        this.numer = numer;
    }

    @Override
    public String toString() {
        return "Nazwa:" + " " + nazwa + " " + "producent:" + " " + producent + " " +"numer:" + numer;
    }
}
