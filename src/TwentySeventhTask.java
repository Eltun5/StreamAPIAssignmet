import java.util.stream.IntStream;

public class TwentySeventhTask {
    static void twentySeventhTask(){
        System.out.print("Total number of years of experience for all employees:");
        System.out.println(TaskList.assignmentList().stream()
                .map(employee -> 2024-employee.getStartDate().getYear())
                .mapToDouble(year->(double)year)
                .sum());
    }
}
