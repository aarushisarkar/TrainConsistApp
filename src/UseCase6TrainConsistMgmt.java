import java.util.HashMap;
import java.util.Map;

public class UseCase6TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("======================================\n");

        // Create HashMap
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Add bogies with capacity
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 50);
        bogieCapacity.put("First Class", 24);

        System.out.println("Bogie Capacity Mapping:\n");

        // Iterate using entrySet
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() + " → Capacity: " + entry.getValue());
        }
    }
}
