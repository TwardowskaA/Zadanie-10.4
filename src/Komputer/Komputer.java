package Komputer;

import Komponenty.DyskTwardy;
import Komponenty.PamiecRam;
import Komponenty.Procesor;

public class Komputer {

    Procesor procesor;
    PamiecRam ram;
    DyskTwardy dyskTwardy;

    public Komputer(Procesor procesor, PamiecRam ram, DyskTwardy dyskTwardy) {
        this.procesor = procesor;
        this.ram = ram;
        this.dyskTwardy = dyskTwardy;
    }

    public Procesor getProcesor() {
        return procesor;
    }

    public void setProcesor(Procesor procesor) {
        this.procesor = procesor;
    }

    public PamiecRam getRam() {
        return ram;
    }

    public void setRam(PamiecRam ram) {
        this.ram = ram;
    }

    public DyskTwardy getDyskTwardy() {
        return dyskTwardy;
    }

    public void setDyskTwardy(DyskTwardy dyskTwardy) {
        this.dyskTwardy = dyskTwardy;
    }
}
