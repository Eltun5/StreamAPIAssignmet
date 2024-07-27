import java.util.stream.Collectors;

public class TwentiethTask {
    static void twentyTask() {
        System.out.println("Group employees by department and calculate the total salary for each department:");
        TaskList.assignmentList().stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((key, value) -> {
                    System.out.println(key + " total salary is" + value.stream()
                            .map(Employee::getSalary)
                            .mapToDouble(salary -> salary)
                            .sum());
                });
    }
}
