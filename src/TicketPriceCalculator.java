import java.util.Scanner;

public class TicketPriceCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cost price: ");
        double costPrice = scanner.nextDouble();

        System.out.print("Does duty need to be added? ");
        String duty = scanner.next();

        switch (duty) {
            case "yes":
                costPrice = costPrice + costPrice * 0.1;

            case "no:":
              break;
        }

        System.out.print("Freight rate: ");
        double freightRate = scanner.nextDouble();

        System.out.print("Exchange rate: ");
        double exchangeRate = scanner.nextDouble();

        double priceA = (costPrice + freightRate) / exchangeRate;

        System.out.print("Margin %: ");
        int margin = scanner.nextInt();

        double ticketPrice = (priceA + (priceA * margin) / 100) / 0.7;

        System.out.println(ticketPrice);
    }
}
