package lab1;

import javax.swing.*;

public class Classes {
    private String prerequisites;
    private String courseName;
    private double credits;
     private String courseNumber;
    public final void setPrerequisites(String prerequisites) {
        this.prerequisites = checkForStuff(prerequisites);
    }
    public final void setCourseNumber(String courseNumber) {
        this.courseNumber = checkForStuff(courseNumber);
    }
    public final void setCourseName(String courseName) {
        this.courseName = checkForStuff(courseName);
    }
    public void setCredits(double credits) {
        this.credits = checkForStuff(credits);
    }

    public String checkForStuff(String Stuff){
        if(Stuff == null || Stuff.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        return Stuff;
    }
    public double checkForStuff(double Stuff){
        System.out.println("Credits " + (Stuff - 1));
        if(Stuff < 0.5 || Stuff > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0" );
            System.exit(0);
        }
        return Stuff;
    }

    public double getCredits() {
        return credits;
    }
    public void displayOutput(){
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Number: " + courseNumber);
        System.out.println("Credits: " + credits);
        System.out.println("Prerequisites: " + prerequisites);

    }
    public String getcourseName() {
        return courseName;
    }
    public String getPrerequisites() {
        return courseName;
    }
    public String getCourseNumber() {
        return courseNumber;
    }
}
