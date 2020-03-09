package OOP.Tema5;

public class Apartament extends Imobil {

    public Apartament() {
        super();
    }

    public Apartament(String tipCasa, int nrEtaje) {
        super(tipCasa, nrEtaje);
    }

    public Apartament(String tipCasa, int nrEtaje, double pret) {
        super(tipCasa, nrEtaje, pret);
    }

    @Override
    public String getTipCasa() {
        return super.getTipCasa();
    }

    @Override
    public void setTipCasa(String tipCasa) {
        super.setTipCasa(tipCasa);
    }

    @Override
    public double getPret() {
        return super.getPret();
    }

    @Override
    public void setPret(double pret) {
        super.setPret(pret);
    }
}
