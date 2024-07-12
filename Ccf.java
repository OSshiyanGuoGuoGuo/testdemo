import java.util.Scanner;

public class Ccf1 {
    public void foo() {
        Scanner scanner = new Scanner(System.in);
        // Stmt location changed
        System.out.println("This is demo that shows changes in control flow");
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        // delete branch
        if (a < b)
            System.out.println("a < b");

        // add branch
        if (a == 1)
            System.out.println("a=1");
        else
            System.out.println("a!=1");

        // control condition changed
        if (b == 2)
            System.out.println(b);

        // delete control condition stmt

        // add control condition stmt
        for (int i = 1; i < a; i++)
            System.out.println(i);

        if (a > b && b > -1) {
            System.out.println();
        }
        else {
            System.out.println("stmt's branches changed");
            System.out.println();
        }
    }
}