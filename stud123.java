import java.util.Scanner;

// Step 1: Define Interface
interface CalculateResult {
    int CalculateTotal();
    double CalculatePercentage();
    String CalculateGrade();
}

// Step 2: Student class implementing CalculateResult
class Student implements CalculateResult {
    private String name;
    private int marks[];
    private int totalSubjects;

    // Constructor
    Student(String name, int marks[]) {
        this.name = name;
        this.marks = marks;
        this.totalSubjects = marks.length;
    }

    // Calculate total marks
    public int CalculateTotal() {
        int total = 0;
        for (int m : marks) {
            total += m;
        }
        return total;
    }

    // Calculate percentage
    public double CalculatePercentage() {
        return (double) CalculateTotal() / totalSubjects;
    }

    // Calculate grade
    public String CalculateGrade() {
        double percentage = CalculatePercentage();
        if (percentage >= 90) return "A+";
        else if (percentage >= 75) return "A";
        else if (percentage >= 60) return "B";
        else if (percentage >= 50) return "C";
        else return "Fail";
    }

    // Display student result
    public void displayResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + CalculateTotal());
        System.out.println("Percentage: " + CalculatePercentage() + "%");
        System.out.println("Grade: " + CalculateGrade());
    }
}

// Step 3: First Main class
public class stud123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input student details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        int marks[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Create student object
        Student s1 = new Student(name, marks);

        // Display result
        s1.displayResult();

        sc.close();
    }
}
