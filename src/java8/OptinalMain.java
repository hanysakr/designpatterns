package java8;

import java.util.Optional;

public class OptinalMain {

	public static void main(String[] args) {
		Person person = new Person();
		Car car = new Car();
		//car.setName("FIAT");
		person.setCar(car);
		//String v = Optional.ofNullable(person).map(Person::getCar).map(Car::getName).orElse("nothing");
		String v = Optional.ofNullable(car.getName()).orElse("0");
		System.out.println(v);

	}

}
