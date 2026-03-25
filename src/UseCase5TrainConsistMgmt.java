import java.util.LinkedHashSet;

public class UseCase5TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("UC5 - Preserve Insertion Order (LinkedHashSet)");
        System.out.println("==========================================\n");

        // Create LinkedHashSet
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Add duplicate intentionally
        train.add("Sleeper");

        System.out.println("Train Formation (after adding bogies):");
        System.out.println(train + "\n");

        System.out.println("Note: Duplicate 'Sleeper' was ignored.\n");

        System.out.println("Final Train Consist:");
        System.out.println(train);
    }
}