import java.util.stream.Collectors;

public class FourteenthTask {
    static void fourteenthTask() {
        System.out.println("List of the unique surnames of all employees:");
        TaskList.assignmentList()
                .stream()
                .map(Employee::getSurname)
                .collect(Collectors.toSet())
                .forEach(s -> System.out.print(s+" ,"));
        System.out.println();
    }
}
