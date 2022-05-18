import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var input = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("%d X %d = %d", input, i, input* i);
            System.out.println();
        }
    }
}
