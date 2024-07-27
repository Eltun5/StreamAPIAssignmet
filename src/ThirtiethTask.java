import java.util.stream.Collectors;

public class ThirtiethTask {
    static void thirtiethTask() {
        System.out.println("Number of employees with each position:");
        TaskList.assignmentList().stream()
                .collect(Collectors.groupingBy(Employee::getPosition))
                .forEach((key, value) -> System.out.println(key + " : " + value.size()));
    }
}
