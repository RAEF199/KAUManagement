// Rawan Abdulkareem, 1806645, GBR 
package GBR1806645P3_KAUManageMentMain;
import java.util.*;
import java.io.*;
import java.time.Instant;
public class GBR1806645P3_KAUManageMentMain {

    public static void main(String[] args) throws Exception{
       
        //check the file 
        File input = new File("input.txt");
        if (!input.exists())
            System.out.println("the file doesn't exist! ");
        //make scanner to read from file 
        Scanner read1 = new Scanner(input);
        Scanner read2 = new Scanner(input);
        Scanner read3 = new Scanner(input);
        //creat file to write into
        File studentWrite = new File("StudentWrite.txt");
        //creat PrintWriter to write into file 
        PrintWriter write1 = new PrintWriter(studentWrite);  
        // creat arrays of object
        Teacher[] teachers = new Teacher[read1.nextInt()];
        Invigilator[] invigilators = new Invigilator[read1.nextInt()];
        ExamVenue[] examVenues = new ExamVenue[read1.nextInt()];
        CourseLab[] courseLab = new CourseLab[read1.nextInt()];
        Course[] course = new Course[read1.nextInt()];
        Student[] students = new Student[read1.nextInt()];
        //initialize counter foe while loop
        int count = 0;
        int count1=0;
        int count2=0;
        int count3 = 0;
        int count4=0;
        int count5=0;
        int count6=0;
        //print in the file studentWrite.txt
        write1.println("--------------- Welcome to KAU Management System ---------------");
        //read from input.txt file
        while(read1.hasNext()){
         String command = read1.next();
         // command Add_Teacher
         if(command.equalsIgnoreCase("Add_Teacher")){
             
                 teachers[count]= getTeacher(read1);
                 count++;
               
         }
        
         //command Add_Invigilator
         if(command.equalsIgnoreCase("Add_Invigilator")){
             
             invigilators[count1]= getInvigilators(read1);
             count1++;
         }
          //command Add_ExamVenue
         if(command.equalsIgnoreCase("Add_ExamVenue")){
             
            examVenues[count2]= getExamVenue(read1);
            count2++;
         }
         //command Add_CourseLab
         if(command.equalsIgnoreCase("Add_CourseLab")){
             
            courseLab[count3]= getCourseLab(read1);
            count3++;
         }
          //command Add_Course
         if(command.equalsIgnoreCase("Add_Course")){
             
             course[count4]= getCourse(read1);
             count4++;
         }
         //command Add_Student
         if(command.equalsIgnoreCase("Add_Student")){
           
             students[count5]= getStudent(read1);
             count5++;
          //to stop the loop     
         if(command.equalsIgnoreCase("Assign_Teacher_Student"))
             break;
        
         }  
        }
        //print or save information in the studentWrite.txt file
        printTeacher(teachers, write1);
        printInvigilators(invigilators,write1);
        printExamVenue(examVenues, write1);
        printCourseLab(courseLab,write1);
        printCourse(course,write1);
        printStudent(students, write1);
        read1.close();
        //while loop for the assign
        while(read2.hasNext()){
         String command = read2.next(); 
            //command Assign_Teacher_Student
           if(command.equalsIgnoreCase("Assign_Teacher_Student")){
           
             assignTeacher(read2,teachers,students, write1);
              
         }  //command Assign_ExamVenue_Student
            if(command.equalsIgnoreCase("Assign_ExamVenue_Student")){
           
             assignExamVenue(read2, examVenues, students, write1);
               
         }  //command Assign_Invigilator_Student
            if(command.equalsIgnoreCase("Assign_Invigilator_Student")){
           
             assignInvigilator(read2, invigilators, students, write1);
               
         }
            if(command.equalsIgnoreCase("Assign_CourseLab_Student")){
           
             assignCourseLab(read2, courseLab, students, write1);
            
               
         }  //command Assign_CourseLab_Student
            if(command.equalsIgnoreCase("Assign_Course_Student")){
           
             assignCourse(read2, course, students, write1);
            }
            //command Assign_Course_Student
            if(command.equalsIgnoreCase("Print_Report")){
             break;
               
         }     
         
        }
        write1.println("Thank you for using KAU Management System, Good Bye!");
        //close write and read 
        write1.close();
        read2.close();
       //command Print_Report
       while(read3.hasNext()){
           String command = read3.next();
           if(command.equalsIgnoreCase("Print_Report")){
           //creat array of File to store student's files
            File[] print=new File[students.length];
             //creat file for each student and print his/her information
            for (int i = 0; i < students.length; i++) {
             String name = students[i].getName().substring(0,2);
             print[i] = new File(name+students[i].getId()+"_Student_Report"+".txt");
             printReport(students[i], print[i]);
              
         }
       }    
    }
       read3.close();
 }

private static Teacher getTeacher(Scanner read1){
    
    String degree =read1.next();
    String department=read1.next();
    double teachingHours=read1.nextDouble();
    String jobTitle =read1.next();
    int officeNumber =read1.nextInt();
    boolean onLeave = read1.nextBoolean();
    int id =read1.nextInt();
    String name =read1.next();
    String nationality=read1.next();
    int dateOfBirthYear =read1.nextInt();
    int dateOfBirthMonth =read1.nextInt();
    int dateOfBirthDay =read1.nextInt();
    char gender = read1.next().charAt(0);
    int phone = read1.nextInt();
    String address = read1.next();
    Teacher teacher =  new Teacher(degree,department,teachingHours, jobTitle, officeNumber, onLeave,  id,  name, nationality, dateOfBirthYear,  dateOfBirthMonth,  dateOfBirthDay, gender, phone, address );           
    teacher.setGender(gender);
    teacher.setId(id);
    teacher.setJobTitle(jobTitle);
    teacher.setName(name);
    teacher.setNationality(nationality);
    teacher.setOfficeNumber(officeNumber);
    teacher.setPhone(phone);
    teacher.setTeachingHours(teachingHours);
    teacher.setAddress(address);
    teacher.setOnLeave(onLeave);
    teacher.setDateOfBirthYear(dateOfBirthYear, dateOfBirthMonth, dateOfBirthDay);
    
    return teacher;
    
}

private static void printTeacher(Teacher[] teachers, PrintWriter write1){
    for (int i = 0; i < teachers.length; i++) {
       write1.println("Command Add_Teacher: Add a new doctor record in the System");
       write1.println(teachers[i]);
       write1.println("\r\n----------------------------------------------------------------");
        
    }
    
}

private static Invigilator getInvigilators(Scanner read1){
    
    int invigilatonExperienceYears = read1.nextInt();
    String invigilatonSkill= read1.next();
    String jobTitle =read1.next();
    int officeNumber =read1.nextInt();
    boolean onLeave = read1.nextBoolean();
    int id =read1.nextInt();
    String name =read1.next();
    String nationality=read1.next();
    int dateOfBirthYear =read1.nextInt();
    int dateOfBirthMonth =read1.nextInt();
    int dateOfBirthDay =read1.nextInt();
    char gender = read1.next().charAt(0);
    int phone = read1.nextInt();
    String address = read1.next();
    
   Invigilator invigilator= new Invigilator( invigilatonExperienceYears,invigilatonSkill, jobTitle, officeNumber,  onLeave,  id, name, nationality,dateOfBirthYear,  dateOfBirthMonth,  dateOfBirthDay, gender,  phone, address);
      
    invigilator.setGender(gender);
    invigilator.setId(id);
    invigilator.setJobTitle(jobTitle);
    invigilator.setName(name);
    invigilator.setNationality(nationality);
    invigilator.setOfficeNumber(officeNumber);
    invigilator.setPhone(phone);
    invigilator.setAddress(address);
    invigilator.setOnLeave(onLeave);
    invigilator.setDateOfBirthYear(dateOfBirthYear, dateOfBirthMonth, dateOfBirthDay);
    
   return invigilator;  
}

private static void printInvigilators(Invigilator[] invigilators, PrintWriter write1){
    for (int i = 0; i < invigilators.length; i++) {
      write1.println("Command Add_Invigilator: Add a new invigilator record in the System");
      write1.println(invigilators[i]);
      write1.println("\r\n----------------------------------------------------------------");   
   }
    
}

private static ExamVenue getExamVenue(Scanner read1){
    
    int examvenueNo =  read1.nextInt();
    String floor = read1.next();
    int buildingNo = read1.nextInt();
    
    return new ExamVenue( examvenueNo, floor, buildingNo);
}

private static void printExamVenue(ExamVenue[] examVenues, PrintWriter write1){
    
 for (int i = 0; i < examVenues.length; i++) {
      write1.println("Command Add_ExamVenue: Add a new exam venue record in the System");
      write1.println(examVenues[i]);
      write1.println("\r\n----------------------------------------------------------------");
        
   }
    
}   
   
private static CourseLab getCourseLab(Scanner read1){
    
int labID = read1.nextInt();
String labName  = read1.next();
double hourse = read1.nextDouble();

return new CourseLab(labID, labName, hourse);

}

private static void printCourseLab(CourseLab[] courseLab, PrintWriter write1){
    
    for (int i = 0; i < courseLab.length; i++) {
      write1.println("Command Add_CourseLab: Add a new course lab record in the System");
      write1.println(courseLab[i]);
        
   } 
    
}

private static Course getCourse(Scanner read1){
   
    int courseCode = read1.nextInt();
    String courseTitle=read1.next();
    double hours= read1.nextDouble();
    
   return new Course(courseCode,courseTitle,hours);
}

private static void printCourse(Course[] course, PrintWriter write1){
   
     for (int i = 0; i < course.length; i++) {
       write1.println("Command Add_Course: Add a new course record in the System");
       write1.println(course[i]);
        
   } 
    
    
}

private static Student getStudent(Scanner read1){
    
    String department = read1.next();
    int semester  = read1.nextInt();
    double cgpa = read1.nextDouble();
    int year = read1.nextInt();
    int month = read1.nextInt();
    int day = read1.nextInt();
    Date enrollDate = new Date(year,month,day);
    int id = read1.nextInt();
    String name =read1.next();
    String nationalty =read1.next();
    int dateOfBirthYear =read1.nextInt();
    int dateOfBirthMonth =read1.nextInt();
    int dateOfBirthDay =read1.nextInt();
    char gender = read1.next().charAt(0);
    int phone = read1.nextInt();
    String address = read1.next();
    int totalCourse=read1.nextInt();
    int totalCourseLab=read1.nextInt();
    
    Student student =new Student(department,semester, cgpa,enrollDate, id,  name , nationalty,dateOfBirthYear, dateOfBirthMonth, dateOfBirthDay,  gender, phone, address, totalCourse, totalCourseLab); 
    student.setId(id);
    student.setName(name);
    student.setNationality(nationalty);
    student.setDateOfBirthYear(dateOfBirthYear, dateOfBirthMonth, dateOfBirthDay);
    student.setGender(gender);
    student.setPhone(phone);
    student.setAddress(address);
    
  return  student;
    
}

private static void printStudent(Student[] students, PrintWriter write1){
   
     for (int i = 0; i < students.length; i++) {
       write1.println("Command Add_Student: Add a new Student record in the System");
       write1.println(students[i].toString()+students[i].printStudentBasicInfo());
       write1.println("\r\n----------------------------------------------------------------"); 
   } 
    
    
}
 
private static void assignTeacher(Scanner read1, Teacher[] teachers, Student[] students, PrintWriter write2){
    
    int teacherID = read1.nextInt();
    int studentID = read1.nextInt();
    int index1 = 0;
    int index2 = 0;
    for (int i = 0; i < teachers.length; i++) {
        
        if(teacherID==teachers[i].getId())
            index1=i;
        
    }
    for (int i = 0; i < students.length; i++) {
        
        if(studentID==students[i].getId())
            index2=i;
        
    }
    students[index2].setTeacher(teachers[index1]);
    
    write2.println("Command Assign_Teacher_Student: Successfully Processed by the System, Following are the details:");
    write2.println("		Student: "+students[index2].getName()+"\r\n		Assigned to Teacher: "+teachers[index1].getName());
    write2.println("----------------------------------------------------------------");
  
}
 
private static void assignExamVenue(Scanner read1,ExamVenue[] examvenue, Student[] students, PrintWriter write2){
    
    int ExamvenueNumber = read1.nextInt();
    int studentID = read1.nextInt();
    int index1 = 0;
    int index2 = 0;
    for (int i = 0; i < examvenue.length; i++) {
        
        if(ExamvenueNumber==examvenue[i].getRoomNo())
            index1=i;
        
    }
    for (int i = 0; i < students.length; i++) {
        
        if(studentID==students[i].getId())
            index2=i;
        
    }
    students[index2].setExamVenue(examvenue[index1]);
    
    write2.println("Command Assign_ExamVenue_Student: Successfully Processed by the System, Following are the details:");
    write2.println("		Student: "+students[index2].getName()+"\r\n		Assigned to ExamVenue:\r\n"+"Exam Venue Details are as follows:\r\n"+" Exam Venue No.: "+examvenue[index1].getRoomNo()+", Floor: "+examvenue[index1].getFloor()+", Building No.:"+examvenue[index1].getBuildingNo());
    write2.println("\r\n----------------------------------------------------------------");
 
    
}
       
private static void assignInvigilator(Scanner read1,Invigilator[] invigilators, Student[] students, PrintWriter write2){
    
    int invigilatorID = read1.nextInt();
    int studentID = read1.nextInt();
    int index1 = 0;
    int index2 = 0;
    for (int i = 0; i < invigilators.length; i++) {
        
        if(invigilatorID==invigilators[i].getId())
            index1=i;
        
    }
    for (int i = 0; i < students.length; i++) {
        
        if(studentID==students[i].getId())
            index2=i;
        
    }
    students[index2].setInvigilator(invigilators[index1]);
    
    write2.println("Command Assign_Invigilator_Student: Successfully Processed by the System, Following are the details:");
    write2.println("		Student: "+students[index2].getName()+"\r\n		Assigned to Invigilator: "+invigilators[index1].getName());
    write2.println("----------------------------------------------------------------");
 
}

private static void assignCourseLab(Scanner read1,CourseLab[] courseLabs, Student[] students, PrintWriter write2){
    
   
    int studentID = read1.nextInt();
    
    CourseLab courseLabInfo []= new CourseLab[courseLabs.length];
    int index1 = 0;
    //index for a student courselab
    int y = 0;
    //to read student Id 
    for (int i = 0; i < students.length; i++) {
        if(studentID==students[i].getId())
            index1=i;
    }
    // to read student labs
    int labID [] = new int[students[index1].getTotCourseLabHrs()];
    
    for (int i = 0; i < students[index1].getTotCourseLabHrs(); i++) {
       labID [i]= read1.nextInt();
  
    }
    
//to compare the lab-id
 for(int j=0; j<labID.length; j++){   
  for(int i=0; i<courseLabs.length;i++){
       if(labID [j]==courseLabs[i].getLabID()){
           //System.out.println(labID [j]+"=="+courseLabs[i].getLabID());
           courseLabInfo[y]=new CourseLab(courseLabs[i].getLabID(),courseLabs[i].getLabName(), courseLabs[i].getHourse());
           y++;
      
   }
   } 
}
 write2.println("Command Assign_CourseLab_Student: Successfully Processed by the System, Following are the details:");
 write2.println("		Student: "+students[index1].getName());
 
 for(int j=0; j<students[index1].getTotCourseLabHrs(); j++){ 
    if(courseLabInfo[j]!=null){
 
 students[index1].setCourseLab(courseLabInfo[j], j);
 write2.println("		 Course Lab added:  Labe Code: "+students[index1].getCourseLab(j).getLabID()+", Lab Name: "+students[index1].getCourseLab(j).getLabName()+", Credit Hour :"+students[index1].getCourseLab(j).getHourse());
 write2.println();
    }
 }
 write2.println("----------------------------------------------------------------");
 for(int i=0; i<3;i++ ){
    
 }
}

private static void assignCourse(Scanner read1,Course[] course, Student[] students, PrintWriter write2){
    
      int studentID = read1.nextInt();
    
    Course courseInfo []= new Course[course.length];
    int index1 = 0;
    int y = 0;
    //to read student Id 
    for (int i = 0; i < students.length; i++) {
        if(studentID==students[i].getId())
            index1=i;
    }
    // to read student labs
    int courseID  [] = new int[students[index1].getTotCourseHrs()];
    
    for (int i = 0; i < students[index1].getTotCourseHrs(); i++) {
       courseID  [i]= read1.nextInt();
  
    }
    

 for(int j=0; j<courseID .length; j++){   
  for(int i=0; i<course.length;i++){
       if(courseID  [j]==course[i].getCourseCode()){
           courseInfo[y]=new Course(course[i].getCourseCode(),course[i].getCourseTitle(), course[i].getHours());
           y++;
      
   }
   } 
}

 
 write2.println("Command Assign_Course_Student: Successfully Processed by the System, Following are the details:");
 write2.println("		Student: "+students[index1].getName());
 
 for(int j=0; j<students[index1].getTotCourseHrs(); j++){ 
    if(courseInfo[j]!=null){
 
 students[index1].setCourse(courseInfo[j], j);
 write2.println("		 Course added:  Course Code: "+students[index1].getCourse(j).getCourseCode()+", Course Title: "+students[index1].getCourse(j).getCourseTitle()+", Credit Hours :"+students[index1].getCourse(j).getHours());
 write2.println();
    }
 }
 write2.println("----------------------------------------------------------------");
 for(int i=0; i<3;i++ ){
    
 }
 
 
  
    
    
    
    
    
    
}

private static void printReport(Student stud, File file) throws Exception{
    
    java.util.Date date = new java.util.Date();
    PrintWriter write = new PrintWriter(file);
    double totalHour = 0;
    write.println("--------------- Welcome to KAU Management System ---------------");
    write.println("--------- Current Date :  "+date+"--------");
    write.println("Command: Print_Report\r\n");
    write.println("		--- Student Detail are as Follows: ---");
    write.println(stud.toString()+stud.toString1());
    write.println("		--- Teacher Detail are as Follows: ---");
    write.println(stud.getTeacher());
    write.println("-------------------------------------------------------------------------------------------");
    write.println("		--- Invigilator Detail are as Follows: ---");
    write.println(stud.getInvigilator());
    write.println("-------------------------------------------------------------------------------------------");
    write.println("Course Lab Details are as follows:");
    for (int i = 0; i <stud.getTotCourseLabHrs() ; i++) {   
    write.println(" Labe Code: "+stud.getCourseLab(i).getLabID()+", Lab Name: "+stud.getCourseLab(i).getLabName()+", Credit Hour :"+stud.getCourseLab(i).getHourse());   
    totalHour += stud.getCourseLab(i).getHourse();
    }
    write.println("-------------------------------------------------------------------------------------------");
    write.println("Course Details are as follows:");
    for (int i = 0; i <stud.getTotCourseHrs() ; i++){
     write.println(" Course Code: "+stud.getCourse(i).getCourseCode()+", Course Title: "+stud.getCourse(i).getCourseTitle()+", Credit Hours :"+stud.getCourse(i).getHours());
     totalHour += stud.getCourse(i).getHours();
    }
    write.println("-------------------------------------------------------------------------------------------");
    write.println(stud.getExamVenue());
    write.println("-------------------------------------------------------------------------------------------");
    write.println("		Total Hours :"+stud.calTotalHours());
    write.println("	-----------------------------------");
    write.close();
     
}
}
    