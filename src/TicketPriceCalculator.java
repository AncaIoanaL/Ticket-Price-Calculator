import java.io.*;

public class TicketPriceCalculator {

    public static void main(String[] args) throws IOException {
        BufferedReader input;
        PrintWriter output = new PrintWriter(new FileWriter("final.csv"));

        double exchangeRate = Double.parseDouble(args[0]);

        input = new BufferedReader(new FileReader(args[1]));

        StringBuilder finalLine = new StringBuilder(input.readLine()).append(",Exchange Rate,Ticket Price");
        output.println(finalLine);

        String inputLine;

        for (int i = 1; i < args.length; i++) {
            while ((inputLine = input.readLine()) != null) {
                String[] fields = inputLine.split(",");
                finalLine = new StringBuilder();

                double costPrice = Double.parseDouble(fields[0]);
                double freight = Double.parseDouble(fields[1]);
                double margin = Double.parseDouble(fields[2]);
                String duty = fields[3];

                switch (duty) {
                    case "y":
                        costPrice = costPrice + costPrice * 0.1;

                    case "n":
                        break;
                }

                double priceA = (costPrice + freight) / exchangeRate;

                double ticketPrice = (priceA + (priceA * margin) / 100) / 0.7;

                if (ticketPrice % 1 == 0) {
                    ticketPrice+= 0.99;
                } else {
                    ticketPrice = Math.ceil(ticketPrice) - 0.01;
                }

                for (int j = 0; j < 4; j++) {
                    finalLine.append(fields[j]).append(",");
                }

                finalLine.append(exchangeRate).append(",");
                finalLine.append(ticketPrice);

                output.println(finalLine);
            }
        }

        output.close();
    }
}
