package com.jspiders.springrest1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.springrest1.pojo.Car;
import com.jspiders.springrest1.repository.CarRepository;

@Service
public class CarService {
	@Autowired
	private CarRepository carRepository;

	public Car addCar(Car car) {
		return carRepository.addCar(car);
	}

	public List<Car> findAllCars() {
		List<Car> cars = carRepository.findAllCars();
		if (cars != null && cars.size() > 0) {
			return cars;
		} else {
			return null;
		}
	}

	public Car deleteCar(int carId, int userId) {
		return carRepository.deleteCar(carId, userId);
	}

	public Car updateCar(Car car) {
		return carRepository.updateCar(car);
	}
}
