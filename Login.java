import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        String password = sc.nextLine();
        StringBuilder reversePass = new StringBuilder(userName).reverse();
        int counter = 0;

        while (!password.contentEquals(reversePass)){

            counter++;

            if (counter == 4){
                break;
            }

            System.out.println("Incorrect password. Try again.");

            password = sc.nextLine();

        }

        if (counter == 4){
            System.out.printf("User %s blocked!", userName);
        }

        if (password.contentEquals(reversePass)) {
            System.out.printf("User %s logged in.", userName);
        }
        }
    }


