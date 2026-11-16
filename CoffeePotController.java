public class CoffeePotController {
    private CoffeePotModel model;
    private CoffeePotView view;
    private boolean running;

    public CoffeePotController(CoffeePotModel model, CoffeePotView view) {
        this.model = model;
        this.view = view;
        this.running = true;
    }

    public void start() {
        view.displayMessage("Welcome to the Coffee Pot!");

        while (running) {
            view.showMenu();
            String input = view.getUserInput().trim();

            if (input.isEmpty()) {
                view.displayMessage("Please enter a command.");
                continue;
            }

            String[] parts = input.split("\\s+");
            String command = parts[0].toLowerCase();

            if (command.equals("exit")) {
                running = false;
                view.displayMessage("Goodbye!");
            } else if (command.equals("status")) {
                showStatus();
            } else if (command.equals("brew") || command.equals("pour")) {
                handleAmountCommand(command, parts);
            } else {
                view.displayMessage("Unknown command. Try brew, pour, status, or exit.");
            }
        }
    }

    private void handleAmountCommand(String command, String[] parts) {
        if (parts.length != 2) {
            view.displayMessage("Please enter an amount. Example: " + command + " 5");
            return;
        }

        try {
            int amount = Integer.parseInt(parts[1]);

            if (command.equals("brew")) {
                model.brew(amount);
                view.displayMessage("Coffee brewed.");
            } else {
                model.pour(amount);
                view.displayMessage("Coffee poured.");
            }

            showStatus();
        } catch (NumberFormatException e) {
            view.displayMessage("Please enter a whole number for the amount.");
        } catch (IllegalArgumentException | IllegalStateException e) {
            view.displayMessage("Error: " + e.getMessage());
        }
    }

    private void showStatus() {
        view.displayMessage(
            "Coffee in pot: " + model.getCurrentVolume()
            + " / " + model.getMaxCapacity()
        );
    }
}
