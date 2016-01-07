package fr.efrei.rent.service;

import java.util.Collection;

import fr.efrei.rent.model.Car;

public interface CarService {
	Car saveCar(Car car);
	void deleteCar(Car car);
	Car getCar(Long carId);
	Collection<Car> getAllCars();
	void deleteCar(Long carId);

}
