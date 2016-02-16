package fr.efrei.rent.service;

import java.util.Collection;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.efrei.rent.model.Car;

@ContextConfiguration(locations = "classpath:/META-INF/spring/applicationContext-test*.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class CarServiceTest {
	
	@Autowired
	private CarService service;

	@Test
	public void testSave() {
		Car car = new Car();
		car.setPlateNumber("007");
		car.setRented(false);
		car = service.saveCar(car);
		Assert.assertTrue(car.getId()!=null);
	}
	
	@Test
	public void testGetAll() {
		Collection<Car> initCars = service.getAllCars();
		Car car = new Car();
		car.setPlateNumber("008");
		car.setRented(false);
		service.saveCar(car);
		car = new Car();
		car.setPlateNumber("009");
		car.setRented(false);
		service.saveCar(car);
		Collection<Car> cars = service.getAllCars();
		Assert.assertEquals("Nb saved cars", initCars.size()+2, cars.size());
	}
	
	@Test
	public void testDelete() {
		Collection<Car> initCars = service.getAllCars();
		Car car = new Car();
		car.setPlateNumber("008");
		car.setRented(false);
		service.saveCar(car);
		car = new Car();
		car.setPlateNumber("009");
		car.setRented(false);
		car = service.saveCar(car);
		car = service.getCar(car.getId());
		service.deleteCar(car);
		Collection<Car> cars = service.getAllCars();
		Assert.assertEquals("Nb saved cars", initCars.size()+1, cars.size());
	}
	
	@Test
	public void testDeleteById() {
		Collection<Car> initCars = service.getAllCars();
		Car car = new Car();
		car.setPlateNumber("008");
		car.setRented(false);
		service.saveCar(car);
		car = new Car();
		car.setPlateNumber("009");
		car.setRented(false);
		car = service.saveCar(car);
//		car = repository.findById(car.getId());
		service.deleteCar(car.getId());
		Collection<Car> cars = service.getAllCars();
		Assert.assertEquals("Nb saved cars", initCars.size()+1, cars.size());
	}
	
	@Test
	public void testFind() {
		Car car1 = new Car();
		car1.setPlateNumber("008");
		car1.setRented(false);
		car1 = service.saveCar(car1);
		Car car2 = new Car();
		car2.setPlateNumber("009");
		car2.setRented(false);
		car2 = service.saveCar(car2);
		Car car = service.getCar(car1.getId());
		Assert.assertEquals("Wrong car: ",car1.getId(), car.getId());
	}
}
