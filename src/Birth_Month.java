import java.util.Scanner;
public class Birth_Month
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter your birth month$(1-12): ");
        int N = console.nextInt();
// N = value entered
        if (N >= 1 & N <= 12) {
            System.out.println("Your birth month is: " + N);
        } else {
            System.out.println("You entered an incorrect month value: " + N);
        }
        console.close();
    }
}
