public class SecondTask {
    static void secondTask() {
        System.out.print("Employee names:");
        TaskList.assignmentList()
                .stream()
                .map(Employee::getName)
                .forEach(s -> System.out.print(s + ", "));
        System.out.println();
    }
}
