package ProgramareProcedurala;

public class Ex4 {

    public static void main(String[] args) {
        int suma = 0;
        for (int i = 0; i < 10; i++) {
            suma += suma + i;
        }
        System.out.println("Suma este: " + suma);
    }
}

