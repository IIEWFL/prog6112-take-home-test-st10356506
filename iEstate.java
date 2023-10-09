import java.util.Scanner;  //import the Scanner class to read user input

//define the iEstateAgent interface
//https://www.geeksforgeeks.org/interfaces-in-java/
interface iEstateAgent {
    String getAgentName();
    double getPropertyPrice();
    double getAgentCommission();
}

//create an abstract class EstateAgent that implements iEstateAgent
//https://www.geeksforgeeks.org/implement-interface-using-abstract-class-in-java/
abstract class EstateAgent implements iEstateAgent {
    private String agentName;
    private double propertyPrice;
//declare the variables agentName and propertyPrice
    public EstateAgent(String agentName, double propertyPrice) {
        this.agentName = agentName;
        this.propertyPrice = propertyPrice;
    }
    //scans agent name and stores it the getAgentName variable
    public String getAgentName() {
        return agentName;
    }
   //scans property price and stores it the getPropertyPrice variable
    public double getPropertyPrice() {
        return propertyPrice;
    }
   //scans agent commision and stores it the getAgentCommision variable
    public double getAgentCommission() {
        //calculate the agents commission by 20% of the property sale price
        return 0.2 * propertyPrice;
    }
}

//create a subclass EstateAgentSales that extends EstateAgent
class EstateAgentSales extends EstateAgent {
    //https://www.w3schools.com/java/java_inheritance.asp
    public EstateAgentSales(String agentName, double propertySaleAmount) {
        super(agentName, propertySaleAmount);
    }

    public void printPropertyReport() {
        //method prints the property report with agent name, property price and agent commission
        System.out.println("ESTATE AGENT REPORT\n******************");
        System.out.println("Estate Agent Name: " + getAgentName());
        System.out.println("Property Sale Price: R " + getPropertyPrice());
        System.out.println("Agent Commission: R " + getAgentCommission());
    }
}

public class iEstate {
    public static void main(String[] args) {
        //create a scanner object to scan keyboard input
        Scanner scanner = new Scanner(System.in);

        //prompt the user to enter information
        System.out.print("Enter the estate agent name: ");
        String agentName = scanner.nextLine();

        System.out.print("Enter the property price: ");
        double propertyPrice = scanner.nextDouble();

        //create an EstateAgentSales instance variable
        EstateAgentSales e1 = new EstateAgentSales(agentName, propertyPrice);

        //print the property report
        e1.printPropertyReport();

        //close the scanner
        scanner.close();
    }
}
