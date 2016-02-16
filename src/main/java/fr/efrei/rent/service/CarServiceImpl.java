package fr.efrei.rent.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.efrei.rent.model.Car;
import fr.efrei.rent.repository.CarRepository;

@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	private CarRepository carRepository;
	
	@Override
	public Collection<Car> getAllCars() {
		return carRepository.findAllCars();
	}

	@Override
	public Car saveCar(Car car) {
		// TODO Auto-generated method stub
		return carRepository.saveCar(car);
	}
	
	@Override
	public void deleteCar(Car car) {
		// TODO Auto-generated method stub
		carRepository.deleteCar(car);
	}

	@Override
	public Car getCar(Long carId) {
		// TODO Auto-generated method stub
		return carRepository.findById(carId);
	}
	
	@Override
	public void deleteCar(Long carId) {
		carRepository.deleteCar(carId);
	}
}
