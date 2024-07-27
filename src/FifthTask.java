import java.util.Comparator;

public class FifthTask {
    static void fifthTask() {
        System.out.println("Sorted (surname):");
        TaskList.assignmentList()
                .stream()
                .sorted(Comparator.comparing(Employee::getSurname))
                .forEach(System.out::print);
        System.out.println();
    }
}
