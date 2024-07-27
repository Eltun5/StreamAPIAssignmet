public class TwentyFirstTask {
    static void twentyOneTask() {
        System.out.println("List employees who have a salary greater than the average salary of all employees.");
        double average = TaskList.assignmentList()
                                 .stream()
                                 .map(Employee::getSalary)
                                 .mapToDouble(salary -> salary)
                                 .sum() / TaskList.assignmentList().size();
        TaskList.assignmentList().stream()
                .filter(employee -> employee.getSalary() > average)
                .forEach(System.out::println);
    }
}
