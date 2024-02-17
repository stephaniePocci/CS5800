public class Course {
    private final String courseName;
    private final Instructor instructor;
    private final Textbook textbook;

    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public Textbook getTextbook() {
        return textbook;
    }

    public void printCourseInfo() {
        System.out.println("Course name: " + getCourseName() + "\n");
        System.out.println("Instructor's name: " + instructor.getFirstName() + " " + instructor.getLastName() + "\n");
        System.out.println("Textbook title: " + textbook.getTitle() + "\n");
        System.out.println("Author: " + textbook.getAuthor() + "\n");
    }
}
