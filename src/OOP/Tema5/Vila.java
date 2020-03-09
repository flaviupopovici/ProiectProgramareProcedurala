package OOP.Tema5;

public class Vila extends Imobil {
    public Vila() {
        super();
    }

    public Vila(String tipCasa, int nrEtaje) {
        super(tipCasa, nrEtaje);
    }

    public Vila(String tipCasa, int nrEtaje, double pret) {
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
