import java.util.Comparator;

public class TwentyEighthTask {
    static void twentyEighthTask(){
        System.out.print("Longest-serving employee:");
        TaskList.assignmentList().stream()
                .sorted(Comparator.comparing(Employee::getStartDate).reversed())
                .limit(1)
                .forEach(System.out::println);
    }
}
