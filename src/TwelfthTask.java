public class TwelfthTask {
    static void twelfthTask() {
        System.out.print("Total salary is ");
        System.out.println(TaskList.assignmentList()
                .stream()
                .map(Employee::getSalary)
                .mapToDouble(salary -> salary)
                .sum());
    }
}
