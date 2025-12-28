import java.util.Scanner;

public class RangePrinter {

    static void printRange(int a, int b) {
        int start = a;
        int end = b;

        if (a > b) {
            start = b;
            end = a;
        }

        int i = start + 1;
        while (i < end) {
            System.out.println(i);
            i = i + 1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        int n2 = input.nextInt();

        printRange(n1, n2);
        input.close();
    }
}
