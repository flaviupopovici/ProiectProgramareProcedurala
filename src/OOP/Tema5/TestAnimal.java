package OOP.Tema5;

import java.sql.SQLOutput;

public class TestAnimal {

    public static void main(String[] args) {

        Leu leu1 = new Leu();
        leu1.setTipAnimal("leu");
        leu1.setCuloare("maro");
        leu1.setVarsta(21);
        leu1.afiseazaDetalii();

        System.out.println(leu1.afiseazaDetalii());

        Leopard leopard1 = new Leopard();
        leopard1.setTipAnimal("leopard");
        leopard1.setCuloare("negru");
        leopard1.setVarsta(23);
        System.out.println(leopard1.afiseazaDetalii());


    }

}