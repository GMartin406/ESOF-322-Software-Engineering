#Greg Martin and Alex Alvarez

public class Vehicle implements IRentable{

}
public class Truck extends Vehicle{
  public UnlimitedNatural weight;
  public UnlimitedNatural power;
  public String manufacturer;
  public String regNo;
}
public class Car extends Vehicle{
  public CarKind kind;
  public UnlimitedNatural noSeats;
  public UnlimitedNatural power;
  public String manufacturer;
  public String regNo;
}
public class Motorbike extends Vehicle{
  public MbKind kind;
  public UnlimitedNatural cylinderCap;
  public UnlimitedNatural power;
  public String manufacturer;
  public String regNo;
}

public class Company{
  public String name;
  public Address headquarters;
  public Motorbike[] motorbike;
  public Car[] car;
  public Truck[] truck;
  public Employee[] employee;
  public Customer[] customer;
  public VehicleRentalService service;
}

public class VehicleRentalService extends Service{
  public Vehicle vehicle;
  public offerCar();
  public offerMotorbike();
  public offerTruck();
}

public class Service{
  public Customer customer;
}

public class Address{
  public String street;
  public String postalCode;
  public String city;
}

public class Person{
  public Address address;
  public String name;
  public String email;
}
public class Employee extends Person{

}
public class Customer extends Person{
  public BankAccount bankAccount;
}
public class Subcontractor extends Employee, Customer{

}

public class BankAccount{
  public UnlimitedNatural number;
  public String depositor;
  public String bank;
}
