
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Corporate Merger Simulator ===");

        PriorityQueue<Company> market = new PriorityQueue<>();

        // Add companies to the market
        market.add(new Company("Disney", 45000));
        market.add(new Company("GE", 32000));
        market.add(new Company("Wayland-Yutani", 18000));
        market.add(new Company("ACME Corp", 5000));
        market.add(new Company("Stark Industries", 40000));
        market.add(new Company("Oscorp", 12000));
        market.add(new Company("Umbrella Corp", 8000));
        market.add(new Company("Cyberdyne Systems", 15000));
        market.add(new Company("Initech", 3000));
        market.add(new Company("Globex Corporation", 25000));

        System.out.println("\nCompanies in market: " + market.size());

        // Test the priority queue
        System.out.println("\n--- Smallest Company Test ---");

        Company smallest = market.poll();

        System.out.println("Smallest company: " + smallest);

        // Add the company back
        market.add(smallest);

        System.out.println("\nCompany returned to market.");
        System.out.println("Total companies: " + market.size());
    }
}
