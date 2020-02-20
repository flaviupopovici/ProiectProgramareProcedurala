package ProgramareProcedurala;

public class Tema3Ex3 {

    public static void main(String[] args) {

        int arrayOfNumbers[] = {1, 7, 3, 8, -2, 30, 4};

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] < 0) {
                System.out.println("Elementul negativ se afla pe pozitia " + i);
            }
        }
    }
}
