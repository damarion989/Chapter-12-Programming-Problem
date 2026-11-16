public class CoffeePotModel {
    private int currentVolume;
    private int maxCapacity;

public CoffeePotModel(int maxCapacity) {
  if (maxCapacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0.");
        }
       this.maxCapacity = maxCapacity;
        this.currentVolume = 0;
    }

      public int getCurrentVolume() {
        return currentVolume;
    }


     public int getMaxCapacity() {
        return maxCapacity;
    }

    public void brew(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }

        if (currentVolume + amount > maxCapacity) {
            throw new IllegalStateException("Brewing that amount would exceed capacity.");
        }

        currentVolume += amount;
    }

 public void pour(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }

        if (amount > currentVolume) {
            throw new IllegalStateException("There is not enough coffee to pour that amount.");
        }

        currentVolume -= amount;
    }
}
