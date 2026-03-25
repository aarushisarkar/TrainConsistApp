import java.util.ArrayList;
import java.util.List;

public class UseCase1TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===\n");

        List<String> train = new ArrayList<>();

        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count : " + train.size());
        System.out.println("Current Train Consist : " + train);

        System.out.println("\nSystem ready for operations...");
    }
}