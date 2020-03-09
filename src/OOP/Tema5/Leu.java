package OOP.Tema5;

public class Leu extends Animal {

    public Leu() {
        super();
    }

    public Leu(String tipAnimal, String culoare) {
        super(tipAnimal, culoare);
    }

    public Leu(String tipAnimal, String culoare, int varsta) {
        super(tipAnimal, culoare, varsta);
    }

    public String getTipAnimal() {
        return "Leu";
    }

    public String afiseazaDetalii() {
        return "Tip Animal " + tipAnimal + " culoarea animalului este " + culoare + " varsta animalului este " + varsta;
    }
}
