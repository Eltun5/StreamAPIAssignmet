import java.util.Comparator;
import java.util.stream.Collectors;

public class TwentyFourthTask {
    static void twentyFourthTask(){
        System.out.println("Oldest employee in each department:");
        TaskList.assignmentList().stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((key,value)->{
                    System.out.println("Department "+key+" oldest employee:");
                    value.stream()
                            .sorted(Comparator.comparing(Employee::getStartDate))
                            .limit(1)
                            .forEach(System.out::print);
                    System.out.println();
                });
    }
}
