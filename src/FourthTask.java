public class FourthTask {
    static void fourthTask() {
        System.out.print("Average salary:");
        System.out.println(TaskList.assignmentList()
                .stream()
                .map(Employee::getSalary)
                .mapToDouble(salary -> salary)
                .sum()
                           / TaskList.assignmentList()
                                   .size());
    }
}
