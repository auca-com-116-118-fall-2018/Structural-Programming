import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the weight of the package? ");
        float weight = scanner.nextFloat();
        double costPerPound = 0;
        if (weight > 0 && weight <= 1) {
            costPerPound = 3.5;
        } else if (weight > 1 && weight <= 3) {
            costPerPound = 5.5;
        } else if (weight > 3 && weight <= 10) {
            costPerPound = 8.5;
        } else if (weight > 10 && weight <= 20) {
            costPerPound = 10.5;
        } else if (weight > 50) {
            System.out.println("The package cannot be shipped.");
        } double totalCost = costPerPound * weight;
            System.out.println("Shipping cost is " + totalCost);
    }
}
