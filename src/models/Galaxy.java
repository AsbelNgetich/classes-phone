package models;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    //ring method from the Ringable interface
    @Override
    public String ring() {
    	
    	return this.getRingTone();
    }
    
    //unlock method from the interface
    @Override
    public String unLock() {
        
    	return "unlocking via finger print";
    }
    @Override
    public void displayInfo() {
    	System.out.println("Galaxy " + this.getVersionNumber() + " from " + this.getCarrier());
    }
}


