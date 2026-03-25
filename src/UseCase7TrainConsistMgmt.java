import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UseCase7TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC7 - Sort Bogies by Capacity");
        System.out.println("======================================\n");

        // Create list
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("Before Sorting:");
        System.out.println(bogies + "\n");

        // Sort using Comparator
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("After Sorting (by capacity):");
        System.out.println(bogies);
    }
}