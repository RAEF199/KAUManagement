// Rawan Abdulkareem, 1806645, GBR 
package GBR1806645P3_KAUManageMentMain;


public class Invigilator extends Employee {
 
  private int invigilatonExperienceYears;
  private String invigilatonSkill; 
  

   public Invigilator(int invigilatonExperienceYears, String invigilatonSkill, String jobTitle, int officeNumber, boolean onLeave, int id, String name, String nationality, int dateOfBirthYear, int dateOfBirthMonth, int dateOfBirthDay, char gender, int phone, String address) {
       super( jobTitle,  officeNumber, onLeave,  id,  name,  nationality,  dateOfBirthYear,  dateOfBirthMonth, dateOfBirthDay, gender,phone,address);
       this.invigilatonExperienceYears = invigilatonExperienceYears;
        this.invigilatonSkill = invigilatonSkill;
    }

    public int getInvigilatonExperienceYears() {
        return invigilatonExperienceYears;
    }

    public void setInvigilatonExperienceYears(int invigilatonExperienceYears) {
        this.invigilatonExperienceYears = invigilatonExperienceYears;
    }

    public String getInvigilatonSkill() {
        return invigilatonSkill;
    }

    public void setInvigilatonSkill(String invigilatonSkill) {
        this.invigilatonSkill = invigilatonSkill;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + ", Name: " + getName() + ", Nationality :" + getNationality() + ", Date of Birth :" + getDateOfBirth().getYear()+"-"+ getDateOfBirth().getMonth()+"-"+getDateOfBirth().getDate()+ ", Gender: " + getGender() + ", Phone: " + getPhone() + ", Address: " + getAddress() +
                "\r\nJob Title: "+getJobTitle()+", Office Number: "+getOfficeNumber()+", On Leave : "+ isOnLeave()+"\r\nYear(s) of Invigilaton Experience: " +getInvigilatonExperienceYears()+", Invigilaton Expertise: "+getInvigilatonSkill();
                
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
