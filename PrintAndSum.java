import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startNumber = Integer.parseInt(sc.nextLine());
        int endNumber = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = startNumber; i <= endNumber ; i++) {
            System.out.print(i + " " );

            sum +=i;
        }
        System.out.println();
        System.out.println("Sum: " +sum);
    }
}
