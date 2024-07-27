import java.util.Comparator;

public class ThirteenthTask {
    static void thirteenthTask() {
        System.out.print("Employee with the lowest salary:");
        TaskList.assignmentList()
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .limit(1)
                .forEach(System.out::print);
        System.out.println();
    }
}
