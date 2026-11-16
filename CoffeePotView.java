import java.util.Scanner;

public class CoffeePotView {
    private Scanner scanner = new Scanner(System.in);

public void showMenu() {
        System.out.println();
        System.out.println("Coffee Pot Menu");
        System.out.println("Type: brew <amount>");
        System.out.println("Type: pour <amount>");
        System.out.println("Type: status");
        System.out.println("Type: exit");
        System.out.print("> ");
    }

    public String getUserInput() {
        return scanner.nextLine();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
