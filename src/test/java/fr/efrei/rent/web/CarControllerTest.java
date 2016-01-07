package fr.efrei.rent.web;

import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.efrei.rent.repository.CarRepository;
import fr.efrei.rent.web.dto.CarDTO;

@ContextConfiguration(locations = "classpath:/META-INF/spring/applicationContext-test*.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class CarControllerTest {
	
	@Autowired
	private CarController controller;
	
	private CarRepository repository;
	
	@Before
	public void before() {
		
	}

	@Test
	public void testSave() {
		CarDTO car = new CarDTO();
		car.setPlateNumber("007");
		car = controller.createCar(car);
		Assert.assertTrue(car.getId()!=null);
	}
	
	@Test
	public void testGetAll() {
		List<CarDTO> initCars = controller.getCars();
		CarDTO car = new CarDTO();
		car.setPlateNumber("008");
		controller.createCar(car);
		car = new CarDTO();
		car.setPlateNumber("009");
		controller.createCar(car);
		List<CarDTO> cars = controller.getCars();
		Assert.assertEquals("Nb saved cars", initCars.size()+2, cars.size());
	}
	
	@Test
	public void testDelete() {
		List<CarDTO> initCars = controller.getCars();
		CarDTO car = new CarDTO();
		car.setPlateNumber("008");
		controller.createCar(car);
		car = new CarDTO();
		car.setPlateNumber("009");
		car = controller.createCar(car);
		car = controller.getCar(car.getId());
		controller.deleteCar(car.getId());
		List<CarDTO> cars = controller.getCars();
		Assert.assertEquals("Nb saved cars", initCars.size()+1, cars.size());
	}
	
	@Test
	public void testDeleteById() {
		List<CarDTO> initCars = controller.getCars();
		CarDTO car = new CarDTO();
		car.setPlateNumber("008");
		controller.createCar(car);
		car = new CarDTO();
		car.setPlateNumber("009");
		car = controller.createCar(car);
//		car = repository.findById(car.getId());
		controller.deleteCar(car.getId());
		List<CarDTO> cars = controller.getCars();
		Assert.assertEquals("Nb saved cars", initCars.size()+1, cars.size());
	}
	
	@Test
	public void testFind() {
		CarDTO car1 = new CarDTO();
		car1.setPlateNumber("008");
		car1 = controller.createCar(car1);
		CarDTO car2 = new CarDTO();
		car2.setPlateNumber("009");
		car2 = controller.createCar(car2);
		CarDTO car = controller.getCar(car1.getId());
		Assert.assertEquals("Wrong car: ",car1.getId(), car.getId());
	}
}
