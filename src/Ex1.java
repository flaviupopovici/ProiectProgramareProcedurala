public class Ex1 {

    public static void main(String[] args) {

        int a = 3;
        int b = (a = 2) * a;
        int c = b * (b = 5);
        System.out.println("a=" + a + ", b=" + b + ", c=" + c);
        //a = 2, b = 5, c = 20 se va afisa
        //valoare lui a este 2 deoarece este setata in variabila b, chiar daca aceasta a fost setata anterior
        //valoarea lui b este 2 * 2
        //valoarea lui c este 4 * 5 = 20
        //
    }
}
