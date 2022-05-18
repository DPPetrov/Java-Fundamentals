import java.util.Scanner;

public class BackIn30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var hours = Integer.parseInt(sc.nextLine());
        var minutes = Integer.parseInt(sc.nextLine());

        minutes += 30;

       if (minutes > 59) {
           hours++;
           minutes -= 60;
       }
       if (hours > 23) {
           hours = 0;
       }
           if (minutes >= 10){
               System.out.printf("%d:%d", hours, minutes);
           }else {
               System.out.printf("%d:0%d", hours, minutes);
           }

    }
}
