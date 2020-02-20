package ProgramareProcedurala;

import java.util.Arrays;

public class Tema3Ex1 {

    public static void main(String[] args) {

        double[] vector;
        vector = new double[3];

        vector[0] = 2.3;
        vector[1] = 3.2;
        vector[2] = 213.0;

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Elementele arrayului sunt " + vector[i]);
        }
    }
}
