import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var input = Integer.parseInt(sc.nextLine());

        while (input % 2 != 0) {
            System.out.println("Please write an even number.");
            input = Integer.parseInt(sc.nextLine());
        }

        System.out.println("The number is: " + Math.abs(input));
    }
}
