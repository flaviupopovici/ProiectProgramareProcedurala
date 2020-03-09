package OOP.Tema5;

public class Leopard extends Animal {


    public Leopard() {

    }

    public Leopard(String tipAnimal, String culoare) {
        super(tipAnimal, culoare);
    }

    public Leopard(String tipAnimal, String culoare, int varsta) {
        super(tipAnimal, culoare, varsta);
    }

    public String getAnimal() {
        return "Leopard";
    }

    public void setTipAnimal(String tipAnimal) {
        this.tipAnimal = "leopard";
    }

    public String afiseazaDetalii() {
        return "Tip Animal " + tipAnimal + " culoarea animalului este " + culoare + " varsta animalului este " + varsta;
    }
}
