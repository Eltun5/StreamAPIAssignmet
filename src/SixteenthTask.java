public class SixteenthTask {
    static void sixteenthTask() {
        System.out.println("List the names of employees who are not employers:");
        TaskList.assignmentList()
                .stream()
                .filter(employee -> !employee.isEmployer())
                .map(Employee::getName)
                .forEach(System.out::print);
        System.out.println();
    }
}
