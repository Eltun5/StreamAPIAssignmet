public class SeventeenthTask {
    static void seventeenthTask() {
        System.out.print("List of employees' full names (name + surname):");
        TaskList.assignmentList().stream()
                .map(employee -> employee.getName() + " " + employee.getSurname()+" ,")
                .forEach(System.out::print);
        System.out.println();
    }
}
