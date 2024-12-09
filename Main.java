import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Option to choose the method of conversion
        System.out.println("Which conversion method do you want :\n1. Celcius to fahrenheit\n2. Fahrenheit to celcius");

        // user input preference
        Scanner preference = new Scanner(System.in);
        double userChoice = preference.nextDouble();

        // user choice eligibility check before conversion
        if (userChoice < 1 || userChoice > 2) {
            System.out.println("Please choose either 1 or 2 ");
        }

        if (userChoice == 1) {
            System.out.println("Enter C value:");
            double Celc = preference.nextDouble();
            double temperatureInFahrenheit = (Celc * 9 / 5) + 32;
            System.out.println("Temperature in fahrenheit is " + temperatureInFahrenheit + "F");
        }

        if (userChoice == 2) {
            System.out.println("Enter F value");
            double Fahr = preference.nextDouble();
            double temperatureInCelcius = (Fahr - 32) * 5 / 9;
            System.out.println("Temperature in celcius is " + temperatureInCelcius + "C");
        }

        preference.close();
    }

}
