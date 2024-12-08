import java.util.Scanner;

public class TemperatureConverter {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Welcome message
        System.out.println("Welcome to the Temperature Converter!");

        // Get user choice
        int choice = getChoice();

        // Get temperature value
        double temperature = getTemperature();

        // Perform conversion based on choice
        double convertedTemperature = convertTemperature(choice, temperature);

        // Display converted temperature
        System.out.println("The converted temperature is: " + convertedTemperature + (choice == 1 ? "°F" : "°C"));
    }

    /**
     * Prompts the user to choose between Celsius to Fahrenheit (1) or Fahrenheit to Celsius (2).
     * Validates user input to ensure it's either 1 or 2.
     *
     * @return The user's choice (1 or 2)
     */
    private static int getChoice() {
        int choice;
        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Fahrenheit to Celsius");
            System.out.print("Enter your choice (1 or 2): ");

            choice = scanner.nextInt();
            if (choice != 1 && choice != 2) {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        } while (choice != 1 && choice != 2);

        return choice;
    }

    /**
     * Prompts the user to enter the temperature value.
     * Validates user input to ensure it's a number.
     *
     * @return The temperature value entered by the user
     */
    private static double getTemperature() {
        double temperature;
        do {
            System.out.print("\nEnter the temperature value: ");

            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
            }

            temperature = scanner.nextDouble();
        } while (true); // Loop exits when valid input is entered
    }

    /**
     * Performs the temperature conversion based on the user's choice and provided temperature value.
     *
     * @param choice The user's choice (1 for Celsius to Fahrenheit, 2 for Fahrenheit to Celsius)
     * @param temperature The temperature value to be converted
     * @return The converted temperature
     */
    private static double convertTemperature(int choice, double temperature) {
        switch (choice) {
            case 1:
                return (temperature * 9.0 / 5.0) + 32; // Celsius to Fahrenheit
            case 2:
                return (temperature - 32) * 5.0 / 9.0; // Fahrenheit to Celsius
            default:
                throw new IllegalArgumentException("Invalid choice for conversion"); // Handle unexpected choice
        }
    }
}

