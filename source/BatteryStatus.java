package pt.lanware.secdedup;

public class BatteryStatus {
	private int batteryLevel;
	private long elapsedTime;

	public BatteryStatus (int batLevel, long eTime){
		this.batteryLevel = batLevel;
		this.elapsedTime  = eTime;
	}
	
	public int getBatteryLevel() {
		return batteryLevel;
	}
	
	public long getElapsedTime() {
		return elapsedTime;
	}

}
