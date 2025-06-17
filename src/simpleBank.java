import java.util.Scanner;

public class simpleBank{
    static double balance = 0;
    static String pin;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("create pin(4-digit): ");
            pin = sc.nextLine();
            if (pin.matches("\\d{4}")) break;
            System.out.println("the pin must be4 digits ");
        }

        int tries = 3;
        while (tries-- > 0) {
            System.out.print("enter pin: ");
            if (sc.nextLine().equals(pin)) {
                menu(sc);
                return;
            }
            System.out.println("incorrect pin. options: " + tries);
        }
        System.out.println("the system is locked ");
        sc.close();
    }

    static void menu(Scanner sc) {
        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Balance\n4. Exit");
            System.out.print("choose: ");
            int c = sc.nextInt();
            if (c == 1) {
                System.out.print("money deposit: ");
                balance += sc.nextDouble();
            } else if (c == 2) {
                System.out.print("money withdraw: ");
                double w = sc.nextDouble();
                if (w <= balance) balance -= w;
                else System.out.println("There is not enough money ");
            } else if (c == 3) {
                System.out.println("Balance: $" + balance);
            } else if (c == 4) {
                System.out.println("Exit ");
                break;
            } else {
                System.out.println(" wrong choose");
            }
        }
}
}
