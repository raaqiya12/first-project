import java.util.Scanner;

public class palidom {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number or word");
        String text= input.next();
        String reverse=new
                StringBuilder(text).reverse().toString();

        if (text.equals(reverse)){
            System.out.println("this is palindom");
        }
        else {
            System.out.println("is not palindom");
 }
    }
}