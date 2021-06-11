package models;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    //ring method from Ringable interface
    @Override
    public String ring() {
      	
    	return this.getRingTone();
    }
    
    //unlock method from Ringable interface
    @Override
    public String unLock() {
       
    	return "Unlocking via facial recognition";
    }
    
    //displayInfo function from the abstract class
    @Override
    public void displayInfo() {
    	System.out.println("Iphone " + this.getVersionNumber() + " from " + this.getCarrier());             
    }
}


