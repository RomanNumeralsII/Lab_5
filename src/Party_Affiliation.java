import java.util.Scanner;

public class Party_Affiliation {

    public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    System.out.println("Enter Your Party [D R I]: ");
    String choice = console.next();

    switch (choice) {
        case "D":
            System.out.println("You get a Democratic Donkey.");
            break;
        case "R":
            System.out.println("You get a Republican Elephant.");
            break;
        case "I":
            System.out.println("You get an Inependent Party! that sounds lonely.");
            break;
        default:
            System.out.println("You selected a party not recognized by the system");
    }
}
}

