package OOP.Tema5;

public class TestImobil {

    public static void main(String[] args) {

        Apartament ap1 = new Apartament();
        ap1.setTipCasa("Apartament 3 camere");
        ap1.setNrEtaje(1);
        System.out.println(ap1.afiseazaDetalii());

        Vila vila1 = new Vila();
        vila1.setTipCasa("vila");
        vila1.setPret(34521);

    }
}
