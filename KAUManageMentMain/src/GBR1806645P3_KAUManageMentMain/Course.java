// Rawan Abdulkareem, 1806645, GBR 
package GBR1806645P3_KAUManageMentMain;


public class Course {

    private int courseCode;
    private String courseTitle;
    private double hours;

    public Course(int courseCode, String courseTitle, double hours) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.hours = hours;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return " Course Code: "+getCourseCode()+", Course Title: "+getCourseTitle()+", Credit Hours :"+getHours()
                +"\r\n\r\n----------------------------------------------------------------";
    }
    
 










    
}
