package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
	public static void main(String[] args) {
		LocalTime currentTime = new LocalTime();
<<<<<<< HEAD
		System.out.println("The current time is: " + currentTime);
=======
		System.out.println("The current local time is: " + currentTime);
>>>>>>> 40d64ffbfea63f39b78e52b4bd9bcd061f8cce24
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
	}
}
