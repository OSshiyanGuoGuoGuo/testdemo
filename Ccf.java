import java.util.Scanner;

public class Ccf {
    public void foo() {
        System.out.println("This is demo that shows changes in control flow");
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        if (a < b)
            System.out.println("a < b");
        else
            System.out.println("a >= b");

        if (a == 1)
            System.out.println("a=1");

        if (b == 1)
            System.out.println(b);

        if (a + b > 0)
            System.out.println("a + b > 0");

        if (a > b && b > -1) {
            System.out.println("stmt's branches changed");
            System.out.println();
        }
        else {
            System.out.println();
        }
    }
}