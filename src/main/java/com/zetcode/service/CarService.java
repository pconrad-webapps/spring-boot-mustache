package com.zetcode.service;

import com.zetcode.bean.Car;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CarService implements ICarService {

    /*
        @Autowired
	private JdbcTemplate jtm;
    */
    
        @Override
	public List<Car> findAll() {

	    // String sql = "SELECT * FROM CARS";

	    // List<Car> cars = jtm.query(sql, new BeanPropertyRowMapper(Car.class));

	    List<Car> cars = new java.util.ArrayList<Car>();

	    cars.add(new Car(1L,"Toyota Corola",10000));
	    cars.add(new Car(2L,"Ford Mustang",15000));
	    cars.add(new Car(3L,"Dodge Dart",4000));
	    
	    return cars;
	}
}
