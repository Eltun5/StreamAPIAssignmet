public class FirstTask {
     public static void firstTask() {
        System.out.println("Age>30:");
        TaskList.assignmentList()
                .stream()
                .filter(employee -> employee.getAge() > 30)
                .forEach(System.out::println);
    }
}
