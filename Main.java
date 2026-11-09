
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

        final int TITAN_THRESHOLD = 500000;

        int mergerCount = 0;
        Company titan = null;

        System.out.println("\nStarting companies: " + market.size());

        // Phase 1: Test smallest company
        System.out.println("\n--- Smallest Company Test ---");

        Company smallest = market.poll();
        System.out.println("Smallest company: " + smallest);
        market.add(smallest);

        // Check for an existing titan
        for (Company company : market) {
            if (company.getSize() >= TITAN_THRESHOLD) {
                titan = company;
                break;
            }
        }

        // Phase 2 & 3: Merger simulation
        System.out.println("\n--- Beginning Corporate Mergers ---");

        while (market.size() >= 2 && titan == null) {

            // Remove the two smallest companies
            Company companyA = market.poll();
            Company companyB = market.poll();

            // Calculate synergy bonus
            int newSize = (int) ((companyA.getSize()
                    + companyB.getSize()) * 1.1);

            // Combine company names
            String newName = companyA.getName()
                    + "-" + companyB.getName();

            // Create new merged company
            Company mergedCompany = new Company(newName, newSize);

            // Add merged company back to the market
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

            // Check for Industry Titan
            if (mergedCompany.getSize() >= TITAN_THRESHOLD) {
                titan = mergedCompany;

                System.out.println(
                        "\nAn Industry Titan has emerged!"
                );
                break;
            }
        }

        // Final Report
        System.out.println("\n=== FINAL INDUSTRY REPORT ===");

        if (titan != null) {
            System.out.println("Industry Titan: " + titan.getName());
            System.out.println("Titan Size: " + titan.getSize());
        } else {
            System.out.println("No titan has emerged.");
        }

        System.out.println("Total mergers: " + mergerCount);
        System.out.println("Companies remaining: " + market.size());

        System.out.println("\nSimulation complete!");
    }
}
