public class TwentyNinethTask {
    static void twentyNinethTask(){
        System.out.print("Get the combined salary of all employees:");
        System.out.println(TaskList.assignmentList().stream()
                .map(Employee::getSalary)
                .reduce(Double::sum).orElseThrow());
    }
}
