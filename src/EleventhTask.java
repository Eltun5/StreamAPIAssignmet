import java.util.stream.Collectors;

public class EleventhTask {
    static void eleventhTask() {
        System.out.println("Partition employees into employers and non-employers");
        TaskList.assignmentList().stream().collect(Collectors.groupingBy(Employee::isEmployer))
                .forEach((key, value) -> {
                    System.out.println(key ? "Employees:" : "non-Employees");
                    value.forEach(System.out::print);
                });
        System.out.println();
    }
}
