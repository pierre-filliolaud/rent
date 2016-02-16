package fr.efrei.rent.web;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import fr.efrei.rent.model.Car;
import fr.efrei.rent.service.CarService;
import fr.efrei.rent.web.dto.CarDTO;

@Controller
@RequestMapping(value="/")
//@Component
public class CarController {
	
	@Autowired
	private CarService carService;
	
	List<Car> cars = new ArrayList<Car>();
	
	@RequestMapping(value = "/cars", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public CarDTO createCar(CarDTO carDTO) {
		Car car = convertToEntity(carDTO);
		car = carService.saveCar(car);
		return convertToDTO(car);
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public CarDTO updateCar(CarDTO carDTO) {
		Car car = convertToEntity(carDTO);
		car = carService.saveCar(car);
		return convertToDTO(car);
	}
	
	@RequestMapping(value = "/cars/{id}",
	        method = RequestMethod.GET,
	        produces = MediaType.APPLICATION_JSON_VALUE)
	public CarDTO getCar(@PathVariable Long id) {
		Car car = carService.getCar(id);
		return convertToDTO(car);
	}
	
	@RequestMapping(value = "/cars/{id}",
	        method = RequestMethod.DELETE,
	        produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteCar(@PathVariable Long id) {
		carService.deleteCar(id);
	}
	
//	public CarController(){
//		Car car = new Car();
//		car.setPlateNumber("11AA22");
//		car.setRented(false);
//		
//		cars.add(car);
//
//		car = new Car();
//		car.setPlateNumber("33BB44");
//		car.setRented(false);
//		
//		cars.add(car);
//	}
	
	/**
	*
	* @return all cars not rented
	*/
	@RequestMapping(value = "/cars", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<CarDTO> getCars() {
		Collection<Car> cars = carService.getAllCars();
		
		List<CarDTO> dtos = new ArrayList<CarDTO>();
		
		for(Car car: cars){
			if(car.isRented() == false){
				dtos.add( convertToDTO(car));
			}
		}
		return dtos;
	}

	/**
	* Return specifications of a car.
	* @param plateNumber
	* @return car specifications only (if not rented)
	* @throws Exception no car with this plate number or already rented
	*/
	@RequestMapping(value = "/cars/{plateNumber}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public CarDTO getCar(@PathVariable("plateNumber") String plateNumber) throws Exception {
		int i=0;
		while(i<cars.size() && cars.get(i).getPlateNumber().equals(plateNumber)==false){
			i++;
		}
		if(i<cars.size()){
			Car car = cars.get(i);
			if(car.isRented() == false){
				return convertToDTO(car);
			} else {
				throw new Exception("Car already rented");
			}
		} else {
			throw new Exception("No car with such a plate number");
		}
	}

	/**
	* Rent a car.
	* @param plateNumber
	* @return car specifications
	* @throws Exception no car with this plate number or already rented
	*/
	@RequestMapping(value = "/cars/{plateNumber}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void rentCar(@PathVariable("plateNumber") String plateNumber, @RequestParam(value="rent",required=true)boolean rent) throws Exception {
		int i=0;
		while(i<cars.size() && cars.get(i).getPlateNumber().equals(plateNumber)==false){
			i++;
		}
		if(i<cars.size()){		// trouv� 
			Car car = cars.get(i);
			if(rent == true){	// location
				cars.get(i).setRented(true);
			} else {			// ramener
				cars.get(i).setRented(false);
			}
		} else {
			throw new Exception("No car with such a plate number");
		}
		
	}
	
	private CarDTO convertToDTO(Car car) {
		CarDTO carDTO = new CarDTO();
		carDTO.setId(car.getId());
		carDTO.setPlateNumber(car.getPlateNumber());
		return carDTO;
	}
	
	private Car convertToEntity(CarDTO carDTO) {
		Car car = new Car();
		car.setId(carDTO.getId());
		car.setPlateNumber(carDTO.getPlateNumber());
		return car;
	}

}
