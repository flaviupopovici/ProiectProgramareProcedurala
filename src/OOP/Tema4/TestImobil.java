package OOP.Tema4;

public class TestImobil {

    public static void main(String[] args) {

        Imobil imobil1 = new Imobil("Apartament", 2, 70000);

        Imobil imobil2 = new Imobil();
        imobil2.setNrEtaje(2);
        imobil2.setTipCasa("Penthouse");

        Imobil imobil3 = new Imobil();
        imobil3.setTipCasa("Vila");
    }
}
