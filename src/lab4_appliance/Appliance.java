package lab4_appliance;

public class Appliance {
	
	// shared private fields
	private String brand;
	private String model;
	private double capacityKg;
	
	// getters and setters + brand validation
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		if(brand == null || brand == "") {
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

	// constructor that calls the setters
	public Appliance(String brand, String model, double capacityKg) {
		this.brand = brand;
		this.model = model;
		this.capacityKg = capacityKg;
	}

	// toString() using the getters
	@Override
	public String toString() {
		return "Appliance [brand=" + getBrand() + ", model=" + getModel() + ", capacityKg=" + getCapacityKg() ;
	}
}
