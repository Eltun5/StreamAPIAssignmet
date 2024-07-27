import java.util.stream.Collectors;

public class TenthTask {
    static void tenthTask() {
        System.out.println("Find the average age of employees in each department:");
        TaskList.assignmentList()
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((key, value) -> System.out.println(key + " average age : " +
                                                            (value
                                                                     .stream()
                                                                     .map(Employee::getAge)
                                                                     .mapToDouble(age -> (double) age)
                                                                     .sum()
                                                             / value
                                                                     .size())
                ));
    }
}
