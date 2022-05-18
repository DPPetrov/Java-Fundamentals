import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity = Integer.parseInt(sc.nextLine());
        double price;
        String typeOfGuest = sc.nextLine();
        String day = sc.nextLine();

        switch (day){

            case "Friday":
                switch(typeOfGuest){
                    case "Students":
                    if (quantity >= 30){
                        price = quantity * 8.45 - quantity * 8.5 * 0.15;
                    }else{
                        price = quantity * 8.45;
                    }
                        System.out.printf("Total price: %.2f", price);
                        break;
                    case "Business":
                    if (quantity >= 100) {
                        price = (quantity - 10) * 10.9;
                    }else {
                        price = quantity * 10.9;
                    }
                        System.out.printf("Total price: %.2f", price);
                        break;
                    case "Regular":
                    if(quantity >= 10 && quantity <=20){
                        price = quantity * 15 - quantity * 15 * 0.05;

                    }else {
                        price = quantity * 15;

                    }
                        System.out.printf("Total price: %.2f", price);
                    break;
                }
                break;

            case "Saturday":
                switch (typeOfGuest){
                    case "Students":
                        if (quantity >= 30){
                            price = quantity * 9.8 - quantity * 9.8 * 0.15;
                        }else{
                            price = quantity * 9.8;
                        }
                        System.out.printf("Total price: %.2f", price);
                        break;

                    case "Business":
                        if (quantity >= 100) {
                            price = (quantity - 10) * 15.6;
                        }else {
                            price = quantity * 15.6;
                        }
                        System.out.printf("Total price: %.2f", price);
                        break;
                    case "Regular":
                        if(quantity >= 10 && quantity <=20){
                            price = quantity * 20 - quantity * 20 * 0.05;
                        }else{
                            price = quantity * 20;
                        }
                        System.out.printf("Total price: %.2f", price);
                        break;
                }
                break;

            case "Sunday":
                switch (typeOfGuest) {
                    case "Students":
                        if (quantity >= 30) {
                            price = quantity * 10.46 - quantity * 10.46 * 0.15;
                        } else {
                            price = quantity * 10.46;
                        }
                        System.out.printf("Total price: %.2f", price);
                        break;

                    case "Business":
                        if (quantity >= 100) {
                            price = (quantity - 10) * 16;
                        } else {
                            price = quantity * 16;
                        }
                        System.out.printf("Total price: %.2f", price);
                        break;

                    case "Regular":
                        if(quantity >= 10 && quantity <=20){
                            price = quantity * 22.5 - quantity * 22.5 * 0.05;
                        }else{
                            price = quantity * 22.5;
                        }
                        System.out.printf("Total price: %.2f", price);
                        break;
                }
            break;
        }
    }
}
