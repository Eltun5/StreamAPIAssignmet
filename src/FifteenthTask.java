import java.util.stream.Collectors;

public class FifteenthTask {
    static void fifteenthTask() {
        System.out.print("Map of employee names to their respective salaries:");
        TaskList.assignmentList()
                .stream()
                .collect(Collectors.groupingBy(Employee::getSalary))
                .forEach((key,value)-> {
                    System.out.print(key + "$: ");
                    value.forEach(employee -> System.out.print(employee.getName()+" ,"));
                    System.out.println();
                });
    }
}
