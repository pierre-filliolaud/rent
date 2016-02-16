package fr.efrei.rent.web.dto;


public class CarDTO {
	
	Long id;
	String plateNumber;

	public CarDTO() {
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

}
