import java.util.Comparator;

public class TwentyThirdTask {
    static void twentyThirdTask(){
        System.out.println("Names of employees sorted by their salary in descending order");
        TaskList.assignmentList()
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .map(Employee::getName)
                .forEach(s -> System.out.print(s + " ,"));
        System.out.println();
    }
}
