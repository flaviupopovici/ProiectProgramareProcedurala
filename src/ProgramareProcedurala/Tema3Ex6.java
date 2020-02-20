package ProgramareProcedurala;

public class Tema3Ex6 {
    public static void main(String[] args) {
        int[] intArray = new int[]{40, 50, 90};
        double[] doubleArray = new double[3];
        double number = 1.3;

        for (int i = 0; i < intArray.length; i++) {
            doubleArray[i] = intArray[i] + number;
        }

        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println(doubleArray[i]);
        }
    }
}
