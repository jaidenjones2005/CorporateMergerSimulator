
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

        System.out.println("\nStarting companies: " + market.size());

        // Phase 1: Check smallest company
        System.out.println("\n--- Smallest Company Test ---");

        Company smallest = market.poll();
        System.out.println("Smallest company: " + smallest);
        market.add(smallest);

        // Phase 2: Merger Logic
        System.out.println("\n--- Beginning Corporate Mergers ---");

        int mergerCount = 0;

        while (market.size() >= 2) {

            // Remove two smallest companies
            Company companyA = market.poll();
            Company companyB = market.poll();

            // Calculate 10% synergy bonus
            int newSize = (int) ((companyA.getSize()
                    + companyB.getSize()) * 1.1);

            // Create merged company
            String newName = companyA.getName()
                    + "-" + companyB.getName();

            Company mergedCompany = new Company(newName, newSize);

            // Add merged company back to market
            market.add(mergedCompany);

            mergerCount++;

            System.out.println(
                    "MERGER: " + companyA.getName()
                            + " and " + companyB.getName()
                            + " have merged into "
                            + mergedCompany.getName()
                            + " with size "
                            + mergedCompany.getSize() + "!"
            );
        }

        System.out.println("\n--- Merger Results ---");

        System.out.println("Total mergers: " + mergerCount);

        System.out.println("Final company: " + market.peek());
    }
}
