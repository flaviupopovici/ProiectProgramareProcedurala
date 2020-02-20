package OOP;

public class Animal {

    String tipAnimal;
    String culoare;
    int varsta;


    public Animal() {
    }

    public Animal(String tipAnimal, String culoare) {
        this.culoare = culoare;
        this.tipAnimal = tipAnimal;
    }

    public Animal(String tipAnimal, String culoare, int varsta) {
        this.culoare = culoare;
        this.tipAnimal = tipAnimal;
        this.varsta = varsta;
    }


    public String getTipAnimal() {
        return tipAnimal;
    }

    public void setTipAnimal(String tipAnimal) {
        this.tipAnimal = tipAnimal;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }


}
