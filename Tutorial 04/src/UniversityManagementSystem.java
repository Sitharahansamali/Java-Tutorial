public class UniversityManagementSystem {
    public static void main(String[] args) {
        Department department = new Department("Software Engineering");
        Degree degree = new Degree("Computer Science", 120);
        Course course = new Course("Object-Oriented Programming", "Mandatory", 30);

        Lecturer lecturer = new Lecturer("Dr. John Smith", "Senior Lecturer", department);
        department.appointDepartmentHead(lecturer);
        department.addLecturer(lecturer);
        department.offerCourse(course);

        Student student = new Student("Alice Johnson", "S123", "Second Year", degree);
        student.enrollCourse(course);

        lecturer.displayInfo();
        student.displayInfo();
        department.displayInfo();
        course.displayInfo();
        degree.displayInfo();
    }
}
