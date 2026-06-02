public class Student {
    // Properties
    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    private String stage;
    private String[] registeredCourses;
    
    // Constructor that accepts all properties
    public Student(String name, int age, String email, String phoneNumber, 
                   String stage, String[] registeredCourses) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.stage = stage;
        
        // Ensure we don't exceed 6 courses
        if (registeredCourses.length > 6) {
            this.registeredCourses = new String[6];
            System.arraycopy(registeredCourses, 0, this.registeredCourses, 0, 6);
            System.out.println("Warning: " + name + " tried to register for " + 
                             registeredCourses.length + " courses. Only first 6 were registered.");
        } else {
            this.registeredCourses = new String[registeredCourses.length];
            System.arraycopy(registeredCourses, 0, this.registeredCourses, 0, registeredCourses.length);
        }
    }
    
    // Method to print all student information
    public void printMe() {
        System.out.println("========================================");
        System.out.println("Student Information:");
        System.out.println("========================================");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Stage: " + stage);
        System.out.println("Registered Courses: ");
        
        if (registeredCourses.length == 0) {
            System.out.println("  No courses registered");
        } else {
            for (int i = 0; i < registeredCourses.length; i++) {
                System.out.println("  " + (i + 1) + ". " + registeredCourses[i]);
            }
        }
        System.out.println("========================================\n");
    }
    
    // Main method to create and test Student objects
    public static void main(String[] args) {
        // Student 1: 2 courses
        String[] courses1 = {"Mathematics", "Physics"};
        Student student1 = new Student("Alice Johnson", 20, "alice.johnson@university.com", 
                                       "555-0101", "Sophomore", courses1);
        
        // Student 2: 4 courses
        String[] courses2 = {"Computer Science", "Data Structures", "Algorithms", "Database Systems"};
        Student student2 = new Student("Bob Smith", 22, "bob.smith@university.com", 
                                       "555-0102", "Junior", courses2);
        
        // Student 3: 6 courses (maximum)
        String[] courses3 = {"English Literature", "History", "Philosophy", "Sociology", 
                            "Psychology", "Art History"};
        Student student3 = new Student("Carol Davis", 19, "carol.davis@university.com", 
                                       "555-0103", "Freshman", courses3);
        
        // Print all student information
        student1.printMe();
        student2.printMe();
        student3.printMe();
        
        // Demonstrate that the array size is limited to 6
        System.out.println("Testing course limit (7 courses):");
        String[] courses4 = {"Course 1", "Course 2", "Course 3", "Course 4", 
                            "Course 5", "Course 6", "Course 7"};
        Student student4 = new Student("Test Student", 21, "test@university.com", 
                                       "555-0199", "Senior", courses4);
        student4.printMe();
    }
}