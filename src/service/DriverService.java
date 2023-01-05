package service;

import classes.Taxi;

import java.sql.Driver;
import java.util.List;

public interface DriverService {
    Driver add(Driver driver);

    List<Driver> add(List<Driver> drivers);

    Driver findById(Long id);

    List<Driver> findByName(String name);

    String assignTaxiToDriver(String taxiName, Long driverId);

    String changeTaxiOrDriver(Long driverId, Long taxiId);

    List<Taxi> getDriverByTaxiModel(String model);

    void update(String driverName);
}
