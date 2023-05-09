package CurrencyExchange;

import java.util.Scanner;

public class Currency_Exchange {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Choose one from the following options");
        System.out.println("1)USD to Euro");
        System.out.println("2)EURO to USD");
        System.out.println("3)TRY to USD");
        System.out.println("4)USDT to TRY");

        int exchange = scan.nextInt();

        switch (exchange) {
            case 1:
                System.out.println("Enter the number of USD");

                double usd = scan.nextDouble();

                if (usd >= 0) {
                    System.out.println(usd + "USD is " + usd * 0.908 + "Euro.");
                } else {
                    System.out.println("Please put in positive numbers of USD");
                }
                break;

            case 2:
                System.out.println("Please enter the number of EURO");

                double euro = scan.nextDouble();

                if (euro >= 0) {
                    System.out.println(euro + " EURO is " + euro * 1.101 + "USD.");
                } else {
                    System.out.println("Please put in positive numbers of EURO");
                }
                break;

            case 3:
                System.out.println("Please enter the number of TRY");

                double Try = scan.nextDouble();

                if (Try >= 0) {
                    System.out.println(Try + " TRY is " + Try * 0.051 + "USD.");
                } else {
                    System.out.println("Please put in positive numbers of TRY");
                }
                break;

            case 4:
                System.out.println("Please enter the number of TRY");

                double usdt = scan.nextDouble();

                if (usdt >= 0) {
                    System.out.println(usdt + " USDT is " + usdt * 20.66 + "TRY.");
                } else {
                    System.out.println("Please put in positive numbers of TRY");
                }
                break;
        }
        scan.close();

    }
}
