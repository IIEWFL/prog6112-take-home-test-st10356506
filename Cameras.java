package cameras;

public class Cameras {

    public static void main(String[] args) {
        //declare and populate the manufacurer array (single dimention array)
        String manufacturers[] = {"CANON", "SONY", "NIKON"};
        //declare and populate the prices array (two-dimentional array)
        double prices[][] = {{10500, 8500}, {9500, 7200}, {12000, 8000}};
        //initialize the variables
        double maxDifference = 0;
        String manufacturerMaxDiff = " ";

        System.out.println("-------------------------------------------------------------------");
        System.out.println("CAMERA TECHNOLOGY REPORT");
        System.out.println("-------------------------------------------------------------------");
        //https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
        //printf followed by %-15s generates rows and columns in the output. %-15s%n writes the output in the line beloits current line.
        System.out.printf("%-15s %-15s %-15s%n", "Manufacturer", "Mirrorless ", "DSLR ");
        
        //for loop to calculate and display the price difference of each camera based on the number of manufacturers
        for (int i = 0; i < manufacturers.length; i++) {
            String manufacturer = manufacturers[i];
            double mirrorlessPrice = prices[i][0];
            double dslrPrice = prices[i][1];

            //print manufacturer, mirrorless price, and DSLR price
            System.out.printf("%-15s %-15s %-15s%n", manufacturer, "R " + mirrorlessPrice, "R " + dslrPrice);

         
        }

        System.out.println("-------------------------------------------------------------------");
        System.out.println("CAMERA TECHNOLOGY RESULTS");
        System.out.println("-------------------------------------------------------------------");

        for (int i = 0; i < manufacturers.length; i++) {
            String manufacturer = manufacturers[i];
            double mirrorlessPrice = prices[i][0];
            double dslrPrice = prices[i][1];
            //calculates the price difference between dslr and mirrorless
            double difference = mirrorlessPrice - dslrPrice;
            
            System.out.printf("%-15s %-15s", manufacturer, "R " + difference);
              if (difference >= 2500) {
                //print stars if the difference is greater than or equal to 2500
                System.out.print("***");
            }

            System.out.println();
           //determines the manufacturer with the max price difference 
            if (difference > maxDifference) {
                maxDifference = difference;
                manufacturerMaxDiff = manufacturer;
            }
        }

        System.out.println("");
        //displays the camera with the most cost difference 
        System.out.println("CAMERA WITH THE MOST COST DIFFERENCE: " + manufacturerMaxDiff);
        System.out.println("-------------------------------------------------------------------");
    }
}