import java.util.Scanner;

public class password {
    public static boolean isStrong(String pwd) {
        return pwd.length() >= 8 &&
                pwd.matches(".[A-Z].") &&
                pwd.matches(".[a-z].") &&
                pwd.matches(".\\d.") &&
                pwd.matches(".[!@#$%^&(),.?\":{}|<>].*");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter passeword: ");
        String pwd = sc.nextLine();

        if (isStrong(pwd)) {
            System.out.println(" the Password is a service ");
        } else {
            System.out.println(" the Password is weak ");
        }
        sc.close();
}
}