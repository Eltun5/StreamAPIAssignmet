import java.util.stream.Collectors;

public class TwentySecondTask {
    static void twentySecondTask(){
        System.out.println("Map where the key is the employee's ID and the value is the employee object:");
        TaskList.assignmentList()
                .stream()
                .collect(Collectors.groupingBy(Employee::getId))
                .forEach((key,value)-> System.out.println(key+". "+value.getFirst()));
    }
}
