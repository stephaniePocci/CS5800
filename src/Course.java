public class Course {
    private final String courseName;
    private final Instructor instructor;
    private final Instructor instructor2;
    private final Textbook textbook;
    private final Textbook textbook2;

    public Course(String courseName, Instructor instructor, Instructor instructor2, Textbook textbook, Textbook textbook2) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.instructor2 = instructor2;
        this.textbook2 = textbook2;
        this.textbook = textbook;
    }

    public String getCourseName() { // courseName accessor
        return courseName;
    }

    public Instructor getInstructor() { // instructor accessor
        return instructor;
    }

    public Textbook getTextbook() { // textbook accessor
        return textbook;
    }

    public Instructor getInstructor2() { // instructor2 accessor
        return instructor2;
    }

    public Textbook getTextbook2() { // textbook2 accessor
        return textbook2;
    }

    public void printCourseInfo() {
        System.out.println("Course name: " + getCourseName() + "\n");
        System.out.println("1st Instructor's name: " + instructor.getFirstName() + " " + instructor.getLastName() + "\n");
        System.out.println("2nd Instructor's name: " + instructor2.getFirstName() + " " + instructor2.getLastName() + "\n");
        System.out.println("1st Textbook title: " + textbook.getTitle() + "\n");
        System.out.println("2nd Textbook title: " + textbook2.getTitle() + "\n");
        System.out.println("Author 1: " + textbook.getAuthor() + "\n");
        System.out.println("Author 2: " + textbook2.getAuthor() + "\n");
    }
}
