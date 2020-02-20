package ProgramareProcedurala;

public class Mediu {
    int x = 0;

    void method1() {
        int x = 1, y;
        y = x;
    }

    void method2() {
        int z = 1;
        System.out.println(x);
        x = 4 + z;
        System.out.println(x);
    }
}
