package fr.efrei.rent.repository;

import java.util.Collection;
import java.util.List;

import fr.efrei.rent.model.Car;

public interface CarRepository {

	List<Car> findCars();
	Collection<Car> findAllCars();
	Car findById(Long carId);
	Car saveCar(Car car);
	void deleteCar(Car car);
	void deleteCar(Long carId);

}
