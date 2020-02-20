package ProgramareProcedurala;

public class Ex2 {

    public static void main(String[] args) {
        double d = 2.95;
        int i = 4;
        System.out.println(++d > i ? d : i);
        //Programul compileaza, afiseaza 4.0
        //d incrementeaza, dar conditia nu este satisfacuta (d > i)
        //este afisat i
    }
}
