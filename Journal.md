# Phase 0: The Blueprint
The pot needs to track how much coffee it has and its maximum capacity. The user can brew, pour, check the status, or exit. The Controller will make sure the user enters a number and that there is enough coffee to pour.

# Phase 1: The Pot
I created the CoffeePotModel to store the coffee amount and capacity. It checks that brewing and pouring stay within the pot’s limits. The Model manages the pot’s data and protects it from invalid changes.

# Phase 2: The Terminal Interface
I created the CoffeePotView to show the menu and read the user’s input. Keeping input and output in the View makes it easier to keep the screen code separate from the pot’s logic.

# Phase 3: The Command Center
The user types a command in the View. The Controller reads and checks it, then tells the Model to brew or pour coffee. The Model changes the volume.

# Phase 4: The Full Cycle
I connected the Model, View, and Controller. The Controller handles errors and shows the updated volume after brewing or pouring. Separating the classes made it easier to handle invalid commands.

# Phase 5: Validation and Reflection
I tested brewing and pouring, including trying to brew too much, pour too much, and enter text instead of a number. The program showed helpful messages and continued running instead of crashing.
