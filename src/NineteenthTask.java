public class NineteenthTask {
    static void nineteenthTask() {
        double sum = TaskList.assignmentList().stream()
                .filter(Employee -> Department.IT.equals(Employee.getDepartment()))
                .map(Employee::getSalary)
                .mapToDouble(salary -> salary)
                .sum();
        System.out.println("Sum of the salaries of all employees in the IT department:" + sum);
    }
}
