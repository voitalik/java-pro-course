import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
//        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
//        priorityQueue.offer("C");
//        priorityQueue.offer("A");
//        priorityQueue.offer("B");
//
//        String polledString = priorityQueue.poll();
//        System.out.println(polledString);

//        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
//        priorityQueue.offer(new Student("Alex", "M"));
//        priorityQueue.offer(new Student("Victor", "A"));
//        priorityQueue.offer(new Student("Joe", "B"));
//
//        Student polledStudent = priorityQueue.poll();
//        System.out.println(polledStudent);

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(new StudentComparator());
        priorityQueue.offer(new Student("Alex", "M"));
        priorityQueue.offer(new Student("Victor", "A"));
        priorityQueue.offer(new Student("Joe", "B"));

        Student polledStudent = priorityQueue.poll();
        System.out.println(polledStudent);
    }
}
