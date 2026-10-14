package lab4;

public class WashingMachine {

	// attributes list
	private String brand;
	private String model;
	private double capacityKg;
	private int powerWatts;
	
	// methods
	public void startWash() {
		System.out.println("The washing machine has started washing.");
	}
	
	public void stopWash() {
		System.out.println("The washing machine has stopped.");
	}
	
	// getters and setter for all four fields
	public String getBrand() {
		return brand;
	}

	// special requirements needed to retrieve brand
	public void setBrand(String brand) {
		String newBrand = brand.trim();
		if(brand == null || newBrand == "") {
			System.out.println("ERROR - Brand can't be null");
		} else {
			this.brand = brand;
		}
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getCapacityKg() {
		return capacityKg;
	}

	public void setCapacityKg(double capacityKg) {
		this.capacityKg = capacityKg;
	}

	public int getPowerWatts() {
		return powerWatts;
	}

	public void setPowerWatts(int powerWatts) {
		this.powerWatts = powerWatts;
	}
	
	// constructor that receives all four values and calls the setters
	public WashingMachine(String brand, String model, double capacityKg, int powerWatts) {
		this.brand = brand;
		this.model = model;
		this.capacityKg = capacityKg;
		this.powerWatts = powerWatts;
	}

	// toString using all four getters
	@Override
	public String toString() {
		return "WashineMachine [brand=" + getBrand() + ", model=" + getModel() + ", capacityKg=" + getCapacityKg() + ", powerWatts=" + getPowerWatts() + "]";
	}
	
}
