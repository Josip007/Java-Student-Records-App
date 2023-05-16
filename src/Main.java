import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Evidencija evidencija = new Evidencija();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("1. Add student");
            System.out.println("2. Search for student");
            System.out.println("3.All students");
            System.out.println("4. Exit");
            System.out.println("Choose an option");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.println("Lastname please: ");
                    String lastName = scanner.nextLine();

                    int yearOfStudy = 0;
                    boolean validInput = false;
                    while(!validInput) {
                        try {
                            yearOfStudy = scanner.nextInt();
                            validInput = true;
                            scanner.nextLine();
                        } catch (InputMismatchException e) {
                            System.out.println("Please enter a number.");
                            scanner.nextLine();
                        }
                    }

                  //  System.out.println("Year of study: ");
                    //int yearOfStudy = scanner.nextInt();
                 //   scanner.nextLine();

                    System.out.println("Index Number: ");
                    String indexNumber = scanner.nextLine();
                    Student student = new Student(name, lastName, yearOfStudy, indexNumber);
                    evidencija.addStudent(student);
                    break;
                case 2:
                    System.out.println("Enter your index number: ");
                    String searchByIndex = scanner.nextLine();
                    Student foundStudent = evidencija.searchStudent(searchByIndex);
                    if(foundStudent != null) {
                        System.out.println(foundStudent);
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
                case 3:
                    evidencija.allStudents();
                case 4:
                    System.out.println("Exit from program");
                    return;
                default:
                    System.out.println("Unknown option");
            }
        }

    }
}