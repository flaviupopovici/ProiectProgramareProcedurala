import java.util.Scanner;

public class Tema3Ex5 {

    public static void main(String[] args) {
        {
            Scanner in = new Scanner(System.in);

            System.out.println("Introduceti un cuvant ");
            String s = in.next();

            String word = "";

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (i % 2 == 0)
                    ch = Character.toUpperCase(ch);
                word = word + ch;
            }
            System.out.println("Cuvantul transformat este " + word);
        }
    }
}

