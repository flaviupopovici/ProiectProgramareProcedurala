import java.util.Arrays;

public class Tema3Ex2 {
    public static void main(String[] args) {

        int array[] = new int[] {4, 9, 3, 1, 30, 450, 7, 20, 10, -30};
        Arrays.sort(array);

        System.out.println("Minimum este " + array[0]);
        System.out.println("Maximum este " + array[array.length-1]);
    }
}
