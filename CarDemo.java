public class CarDemo {
	String make;
	String model;
	int year;

	public void displayInfo(){
		System.out.println("car: " + year + " " + make + " " + model);
	}
    public static void main(String[] args) {
       CarDemo myCar = new CarDemo();
	   myCar.make = "Toyota";
	   myCar.model = "Corolla";
	   myCar.year= 2020;
	   myCar.displayInfo();
    }
}
