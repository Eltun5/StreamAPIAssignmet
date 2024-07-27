import java.util.Comparator;

public class ThirdTask {
    static void thirdTask() {
        System.out.print("Employee with highest salary:");
        TaskList.assignmentList()
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(1)
                .forEach(System.out::println);
    }
}
