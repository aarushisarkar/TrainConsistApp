import java.util.ArrayList;
import java.util.List;

public class UseCase10TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC10 - Total Seating Capacity");
        System.out.println("======================================\n");

        // Create list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("Bogies:");
        System.out.println(bogies + "\n");

        // AGGREGATION (SUM)
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("Total Seating Capacity:");
        System.out.println(totalSeats);
    }
}
