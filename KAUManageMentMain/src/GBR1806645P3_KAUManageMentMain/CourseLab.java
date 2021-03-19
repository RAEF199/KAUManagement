// Rawan Abdulkareem, 1806645, GBR 
package GBR1806645P3_KAUManageMentMain;


public class CourseLab {
 
   private int labID;
   private String labName;
   private double hourse;

    public CourseLab(int labID, String labName, double hourse) {
        this.labID = labID;
        this.labName = labName;
        this.hourse = hourse;
    }

    public int getLabID() {
        return labID;
    }

    public void setLabID(int labID) {
        this.labID = labID;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public double getHourse() {
        return hourse;
    }

    public void setHourse(double hourse) {
        this.hourse = hourse;
    }

    @Override
    public String toString() {
        return " Labe Code: "+getLabID()+", Lab Name: "+getLabName()+", Credit Hour :"+getHourse()
                +"\r\n\r\n----------------------------------------------------------------";
    }
   
    
    
    
    
    
    
    
    
    
    
    
    
}
