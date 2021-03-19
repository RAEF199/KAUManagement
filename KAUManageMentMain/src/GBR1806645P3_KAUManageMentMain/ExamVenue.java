// Rawan Abdulkareem, 1806645, GBR 
package GBR1806645P3_KAUManageMentMain;


public class ExamVenue {
  
private int examvenueNo;
private String floor;
private int buildingNo;

    public ExamVenue(int examvenueNo, String floor, int buildingNo) {
        this.examvenueNo = examvenueNo;
        this.floor = floor;
        this.buildingNo = buildingNo;
    }

    public int getRoomNo() {
        return examvenueNo;
    }

    public void setRoomNo(int examvenueNo) {
        this.examvenueNo = examvenueNo;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public int getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(int buildingNo) {
        this.buildingNo = buildingNo;
    }

    @Override
    public String toString() {
        
        return "Exam Venue Details are as follows:"+"\r\n Exam Venue No.: "+getRoomNo()+", Floor: "+getFloor()+", Building No.:"+getBuildingNo();
                
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
