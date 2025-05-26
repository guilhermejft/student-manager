import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
            System.out.println("\n ** Student Management System **");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            //switch statement to match behaviour to input
            switch (choice) {
                case 1:
                    //Add student
                    int id = 0;
                    while (true) {
                        try {
                            System.out.println("Enter student ID: ");
                            id = scanner.nextInt();
                            scanner.nextLine();
                            break;
                        } catch (InputMismatchException e){
                            System.out.println("Please input a whole number.");
                            scanner.nextLine();
                        }
                    }
                    
                    String name;
                    while (true) {
                        System.out.println("Enter student name: ");
                        name = scanner.nextLine();
                        if (!name.trim().isEmpty()) {
                            break; //name not empty, valid!
                        }
                        System.out.println("Name cannot be empty.");
                    }

                    int age = 0;
                    while (true){
                        try {
                            System.out.println("Enter student age: ");
                            age = scanner.nextInt();
                            scanner.nextLine();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Please input a whole number.");
                            scanner.nextLine();
                        }
                    }
                    
                        Student student = new Student(id, name, age);
                        students.put(id, student);

                        System.out.println("Student added successfully");
                    break;
                    
                case 2:
                    //Get all students
                    if (students.isEmpty()) {
                        System.out.println("No students found");
                    }
                    else {
                    System.out.println("All students: ");
                    for (Student s : students.values()) {
                        System.out.println(s);
                    }
                    }
                    break;
                case 3:
                    // get by id / name
                    System.out.println("Search by:");
                    System.out.println("1. Student ID");
                    System.out.println("2. Student Name");
                    System.out.print("Enter choice: "); 
                    
                    int searchOption = scanner.nextInt();
                    scanner.nextLine();
                        switch (searchOption) {
                    case 1:
                        System.out.print("Enter student ID: ");
                        int searchId = scanner.nextInt();
                        scanner.nextLine(); // clear buffer

                        Student s = students.get(searchId);
                        if (s != null) {
                            System.out.println("Student found:");
                            System.out.println(s);
                        } else {
                            System.out.println("Student with ID " + searchId + " not found.");
                        }
                        break;

                    case 2:
                        System.out.print("Enter student name: ");
                        String searchName = scanner.nextLine();

                        boolean found = false;
                        for (Student stdnt : students.values()) {
                            if (stdnt.getName().equalsIgnoreCase(searchName)) {
                                System.out.println("Student found:");
                                System.out.println(stdnt);
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("No student found with the name \"" + searchName + "\".");
                        }
                        break;

                    default:
                        System.out.println("Invalid choice. Please select 1 or 2.");
                }
                break;
                
                case 4:
                    System.out.println("Goodbye");
                    System.exit(0);
                default:
                    System.out.println("Pick a valid choice.");
            }
        }
    }

    static Map<Integer, Student> students = new HashMap<>();

    static Scanner scanner = new Scanner(System.in);
}
