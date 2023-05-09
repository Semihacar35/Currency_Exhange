package CurrencyExchange;

import java.util.Scanner;

public class Currency_ExchangeTekrar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the currency code you want to convert");
        System.out.println("1) Euro to Dollar");
        System.out.println("2) Pound to Dollar");
        System.out.println("3) Dollar to Turkish Lira");
        System.out.println("4) Euro to Turkish Lira ");
        System.out.println("5) Pound to Turkish Lira");

        int exchange = scan.nextInt();

        double euro;
        double pound;
        double dollar;


        switch (exchange) {

            case 1:
                System.out.println("Please enter of the Euro");

                euro = scan.nextDouble();

                if (euro >= 0) {
                    System.out.println(euro + " Euro " + euro * 1.101 + " Dollar");
                } else {
                    System.out.println("Please enter the positive amount");
                }
                break;

            case 2:
                System.out.println("Please enter of the Pound");

                pound = scan.nextDouble();

                if (pound >= 0) {
                    System.out.println(pound + " Pound " + pound * 1.2608 + " Dollar");
                } else {
                    System.out.println("Please enter the positive amount");
                }
                break;

            case 3:
                System.out.println("Please enter of the Dollar");

                dollar = scan.nextDouble();

                if (dollar >= 0) {
                    System.out.println(dollar + " Dollar " + dollar * 19.49 + " Turkish Lira");
                } else {
                    System.out.println("Please enter the positive amount");
                }
                break;

            case 4:
                System.out.println("Please enter of the EURO");

                euro = scan.nextDouble();

                if (euro >= 0) {
                    System.out.println(euro + " EURO " + euro * 21.395 + " Turkish Lira");

                } else {
                    System.out.println("Please enter the positive amount");
                }
                break;

            case 5:
                System.out.println("Please enter of the Pound");

                pound = scan.nextDouble();

                if (pound >= 0) {
                    System.out.println(pound + " Pound " + pound * 24.565 + " Turkish Lira");
                }
                break;

            default:
                System.out.println("Invalid choice. Please choose a number between 1 and 5.");
                break;
        }

        scan.close();


    }
}
