import java.util.Scanner;

public class UserCommunicator {

    Scanner scanner = new Scanner(System.in);

    public String askForNumber() {
        System.out.print("Enter a number: ");
        return scanner.nextLine();
    }

    public String askForMessage() {
        System.out.print("Enter a message: ");
        return scanner.nextLine();
    }

    public int askForNumberOfMessages() {
        System.out.print("How many messages would you like to send?: ");
        return scanner.nextInt();
    }
}
