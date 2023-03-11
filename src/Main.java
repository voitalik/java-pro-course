import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = List.of(
                new Student("Nick", "N.", 1),
                new Student("Alex", "A.", 2),
                new Student("Mark", "M", 3)
        );

        List<User> users = studentList.stream()
                .filter(student -> student.getYearOfStudy() > 1)
                .map(student ->
                        new User(student.getName(), student.getSurname()))
                .toList();

        System.out.println(users);
    }
}
