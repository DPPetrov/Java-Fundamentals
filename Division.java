import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());

        if (input % 10 == 0){
            System.out.println("The number is divisible by 10");
        }else if(input % 6 == 0){
            System.out.println("The number is divisible by 6");
        }else if (input % 7 == 0){
            System.out.println("The number is divisible by 7");
        }else if (input % 3 == 0) {
            System.out.println("The number is divisible by 3");
        }
        else if (input % 2 == 0){
            System.out.println("The number is divisible by 2");
        }else{
            System.out.println("Not divisible");
        }
    }
}
