import java.util.stream.Collectors;

public class NinthTask {
    static void ninthTask() {
        System.out.println("Count the number of employees in each department:");
        TaskList.assignmentList()
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((key, value) -> System.out.println(key + " has " + value.size() + " employees."));
    }
}
