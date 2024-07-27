public class SixthTask {
    static void sixthTask() {
        System.out.print("Employee ages grater than 25: ");
        System.out.println(TaskList.assignmentList()
                .stream()
                .allMatch(Employee -> Employee.getAge() > 25));
    }
}
