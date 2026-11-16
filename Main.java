public class Main {
    public static void main(String[] args) {
        CoffeePotModel model = new CoffeePotModel(12);
        CoffeePotView view = new CoffeePotView();
        CoffeePotController controller = new CoffeePotController(model, view);

        controller.start();
    }
}
