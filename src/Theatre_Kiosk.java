import java.util.Scanner;
public class Theatre_Kiosk {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter Your age : ");
        int N = console.nextInt();

        if (N > 20) {
            System.out.println("You get a wrist band.");
        }
    }
}
