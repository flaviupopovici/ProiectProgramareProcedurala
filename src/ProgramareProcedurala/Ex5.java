package ProgramareProcedurala;

public class Ex5 {

    public static void main(String[] args) {
        int i, fact = 1;
        for (i = 1; i <= 13; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial pentru numarul 13 este " + fact);
    }
}
