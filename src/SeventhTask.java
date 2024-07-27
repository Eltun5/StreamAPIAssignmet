public class SeventhTask {
    static void seventhTask() {
        System.out.print("IT department employees:");
        TaskList.assignmentList()
                .stream()
                .filter(employee -> Department.IT.equals(employee.getDepartment()))
                .map(Employee::getName)
                .forEach(s -> System.out.print(s + ", "));
        System.out.println();
    }
}
