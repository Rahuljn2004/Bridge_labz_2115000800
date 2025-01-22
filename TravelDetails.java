import java.util.Scanner;

class TravelDetails {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String travelerName = inputScanner.nextLine();

        System.out.println("Enter your starting city:");
        String startingCity = inputScanner.nextLine();

        System.out.println("Enter the city you will travel via:");
        String transitCity = inputScanner.nextLine();

        System.out.println("Enter your final destination city:");
        String destinationCity = inputScanner.nextLine();

        System.out.println("Enter the distance from " + startingCity + " to " + transitCity + " in miles:");
        double distanceToTransitCity = inputScanner.nextDouble();

        System.out.println("Enter the distance from " + transitCity + " to " + destinationCity + " in miles:");
        double distanceToDestinationCity = inputScanner.nextDouble();

        System.out.println("Enter the total time taken for the trip in hours:");
        double totalTravelTime = inputScanner.nextDouble();

        double totalTravelDistance = distanceToTransitCity + distanceToDestinationCity;
        double averageTravelSpeed = totalTravelDistance / totalTravelTime;

        System.out.println("\nTravel Details:");
        System.out.println("Traveler: " + travelerName);
        System.out.println("Route: " + startingCity + " -> " + transitCity + " -> " + destinationCity);
        System.out.println("Total Distance: " + totalTravelDistance + " miles");
        System.out.println("Average Speed: " + averageTravelSpeed + " miles/hour");
    }
}
