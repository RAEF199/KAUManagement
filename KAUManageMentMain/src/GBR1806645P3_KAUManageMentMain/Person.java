// Rawan Abdulkareem, 1806645, GBR 
package GBR1806645P3_KAUManageMentMain;

import java.util.Date;
public class Person {
 
   private int id;
   private String name;
   private String nationality;
   private Date dateOfBirthYear;
   private char gender;
   private int phone;
   private String address;
   
   
    public Person() {
    }

    public Person(int id, String name, String nationality, int dateOfBirthYear, int dateOfBirthMonth,int dateOfBirthDay, char gender, int phone, String address) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirthYear=new Date(dateOfBirthYear, dateOfBirthMonth, dateOfBirthDay);
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getDateOfBirth() {
        return dateOfBirthYear ;
    }

    public void setDateOfBirthYear(int dateOfBirthYear, int dateOfBirthMonth,int dateOfBirthDay) {
        this.dateOfBirthYear = new Date(dateOfBirthYear,dateOfBirthMonth,dateOfBirthDay);
        
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        int month = getDateOfBirth().getMonth();
        if(getDateOfBirth().getMonth()==0){
            month = 12;}
            
        return "ID: "+getId()+", Name: "+getName()+", Nationality :"+getNationality()+", Date of Birth :"+ getDateOfBirth().getYear()+"-"+month+"-"+getDateOfBirth().getDate()+", Gender: "+getGender()+", Phone: "+getPhone()+", Address: "+getAddress();
    }

    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
