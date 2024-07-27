public class EighteenthTask {
    static void eighteenthTask() {
        System.out.println("The salary of all employees by 10% and collect the updated list:");
        TaskList.assignmentList().stream()
                .peek(employee -> employee.setSalary(employee.getSalary() * 1.1))
                .toList()
                .forEach(System.out::print);
        System.out.println();
    }
}
