import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var firstNumber = Integer.parseInt(sc.nextLine());
        var secondNumber = Integer.parseInt(sc.nextLine());

        for (int i = secondNumber; i <= 10 ; i++) {

            System.out.printf("%d X %d = %d", firstNumber, i, firstNumber * i);
            System.out.println();
        }

        if (secondNumber > 10){
            System.out.printf("%d X %d = %d", firstNumber, secondNumber, firstNumber * secondNumber);

        }
    }
}
