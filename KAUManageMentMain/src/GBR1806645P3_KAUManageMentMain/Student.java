// Rawan Abdulkareem, 1806645, GBR 
package GBR1806645P3_KAUManageMentMain;

import java.util.Date;

public class Student extends Person {
  
    
private  String department;
private int semester;
private double cgpa;
private Teacher teacher;
private Invigilator invigilator;
private Course[] course;
private CourseLab[] courseLab;
private ExamVenue examVenue;
private Date enrollDate;
private int totCourse;
private int totCourseLab;

    public Student() {
        
    }

public Student(String department,int semester,double cgpa,Date enrollDate,int id, String name, String nationality, int dateOfBirthYear, int dateOfBirthMonth, int dateOfBirthDay, char gender, int phone, String address, int totCourse, int totCourseLab) {
        super(id, name, nationality, dateOfBirthYear, dateOfBirthMonth, dateOfBirthDay, gender, phone, address);
        this.department=department;
        this.semester=semester;
        this.cgpa=cgpa;
        this.enrollDate=enrollDate;
        this.course= new Course[totCourse];
        this.courseLab=new CourseLab[totCourseLab];
        this.totCourse=totCourse;
        this.totCourseLab=totCourseLab;
        
   
}

    public int getTotCourseHrs() {
        return totCourse;
    }

    public int getTotCourseLabHrs() {
        return totCourseLab;
    }

     

    
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Invigilator getInvigilator() {
        return invigilator;
    }

    public void setInvigilator(Invigilator invigilator) {
        this.invigilator = invigilator;
    }

    public Course getCourse(int index) {
        return course[index];
    }

   public void setCourse(Course course, int index) {
        this.course[index] = course;
    }

    public CourseLab getCourseLab(int index) {
        return courseLab[index];
    }

   public void setCourseLab(CourseLab courseLab, int index) {
        this.courseLab[index] = courseLab;
    }
   
   

    public ExamVenue getExamVenue() {
        return examVenue;
    }

    public void setExamVenue(ExamVenue examVenue) {
        this.examVenue = examVenue;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }
   public double calTotalHours(){
      double  totalHour =0;
       for (int i = 0; i < courseLab.length; i++) {
          totalHour +=  courseLab[i].getHourse();
       }
       for (int i = 0; i < course.length; i++) {
          totalHour +=  course[i].getHours();
       }
       return totalHour;
      
    }
   
   public String printStudentBasicInfo(){
    return 
                "\r\n-------------------------------------------------------------------------------------------"+
                "\r\nDepartment: "+getDepartment()+", Semester: "+getSemester()+"\r\nCGPA: "+getCgpa()+"\r\nEnrollment Date: "+getEnrollDate()+
                "\r\n-------------------------------------------------------------------------------------------";   
   }
   
    @Override
    public String toString() {
        return super.toString();
    }
    
    public String toString1(){
        return 
                "\r\n-------------------------------------------------------------------------------------------"+
                "\r\nDepartment: "+getDepartment()+", Semester: "+getSemester()+"\r\n, CGPA: "+getCgpa()+"\r\n, Enrollment Date: "+getEnrollDate()+
                "\r\n-------------------------------------------------------------------------------------------";  
        
    }
   
   
   
    
    
    
    
    
    
    
    
    
}
