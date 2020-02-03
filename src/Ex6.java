import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        min();
    }

    public static void min() {
        int minimum;
        int a;
        int b;
        int c;
        System.out.println("Introduceti cele 3 numere");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if (a <= b && a <= c) {
            minimum = a;
        } else if (b <= c && b <= a) {
            minimum = b;
        } else {
            minimum = c;
        }
        System.out.println("Cel mai mic numar este " + minimum);
    }

}
