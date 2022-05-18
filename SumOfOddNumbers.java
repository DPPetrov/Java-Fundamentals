import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var input = Integer.parseInt(sc.nextLine());
        var temp = 0;

        for (int i = 1; i <= input * 2; i++) {
            if (i %2 != 0) {
                System.out.println(i);
                temp += i;
            }
        }

        System.out.println("Sum: " + temp);
    }

}

