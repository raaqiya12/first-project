import java.util.Scanner;

public class SUM {
    public static void main(String[] args) {

        int sum = 0;
        int number = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("enter integer number or n to exit");
        while (true) {
            if (input.hasNextInt()) {
                number = input.nextInt();
                sum = sum + number;
            } else {
                String i = input.next();
                if (i.equals("n")) {
                    System.out.println("exit");
                    System.out.println("enter integer number or n to exit");
                } else {
                    System.out.println("invalid number");
                }
            }

            System.out.println("the sum of number are " + sum);


        }
    }
}