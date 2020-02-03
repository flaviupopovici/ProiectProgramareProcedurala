import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int num;
        System.out.println("Introduceti un numar intreg:");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        if (num % 2 == 0)
            System.out.println("Numarul introdus este par");
        else
            System.out.println("Numarul introdus este impar");
    }
}
