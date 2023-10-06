# Ticket-Price-Calculator
Java program to calculate tickets prices based on freight, exchange rate and margin.

In my day to day job, I am often costing multiple products with various factories and these costings are usually done in excel. For example, for a season alone I can end up with multiple spreadsheet with prices which I have to manually put together to create the collection of the season. The program helps me by calculating all of the ticket prices and also merging all of the costings from each factory in one master file that I can then share with my team.

As the exchange rate can change quite often depending on the dollar-pound rate, the program takes the current exchange rate as the first argument. The rest of the arguments are csv files that contain multiple lines of cost prices, freight, margin and duty. The program calculates the ticket price for each line in the csv file and outputs the result in a new file which now has two extra columns for exchange rate and ticket price.

Input csv file given as argument

![TPC - input.png](images%2FTPC%20-%20input.png)

Output csv file

![TPC - output.png](images%2FTPC%20-%20output.png)