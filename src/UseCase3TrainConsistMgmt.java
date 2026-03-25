import java.util.HashSet;
import java.util.Set;

public class UseCase3TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC3 - Track Unique Bogie IDs (HashSet)");
        System.out.println("======================================\n");

        // Create HashSet
        Set<String> bogieIds = new HashSet<>();

        // Add bogies (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        System.out.println("After adding bogie IDs (with duplicates):");
        System.out.println("Bogie IDs : " + bogieIds + "\n");

        System.out.println("Notice that duplicates are automatically removed.\n");

        System.out.println("Final Unique Bogie IDs:");
        System.out.println(bogieIds);
    }
}
