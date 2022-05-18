import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var grade = Double.parseDouble(sc.nextLine());

        if(grade >= 3.00){
            System.out.println("Passed!");
        }else{
            System.out.println("Failed!");
        }
    }
}
