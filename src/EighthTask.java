import java.util.stream.Collectors;

public class EighthTask {
    static void eighthTask() {
        System.out.println("Group employees by department:");
        TaskList.assignmentList()
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((key, value) -> {
                    System.out.println(key+" :");
                    value.forEach(System.out::println);
                });
    }
}
