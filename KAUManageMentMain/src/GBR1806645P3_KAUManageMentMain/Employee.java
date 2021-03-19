// Rawan Abdulkareem, 1806645, GBR 
package GBR1806645P3_KAUManageMentMain;


public class Employee extends Person{

    public Employee() {
    }
  
 private String jobTitle;
 private int officeNumber;
 private boolean onLeave;

    public Employee(String jobTitle, int officeNumber, boolean onLeave, int id, String name, String nationality, int dateOfBirthYear, int dateOfBirthMonth, int dateOfBirthDay, char gender, int phone, String address) {
       super( id, name,  nationality,  dateOfBirthYear,  dateOfBirthMonth, dateOfBirthDay,  gender,  phone,  address) ;
        this.jobTitle = jobTitle;
        this.officeNumber = officeNumber;
        this.onLeave = onLeave;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    public boolean isOnLeave() {
        return onLeave;
    }

    public void setOnLeave(boolean onLeave) {
        this.onLeave = onLeave;
    }

    @Override
    public String toString() {
        return super.toString()+"\r\nJob Title: "+getJobTitle()+", Office Number: "+getOfficeNumber()+", On Leave : "+ isOnLeave();
    }

    
   
    
    
    
    
    
    
    
    
    
    
    
    
}
