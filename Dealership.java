package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		Customer tom = new Customer();
		tom.setCash(6000);
		tom.setAddress("50 woodcrest");
		tom.setCredit(601);
		tom.setName("Tom");
		
		Employee chris = new Employee();
		chris.setName("Chris");
		
		Vehicle toyota = new Vehicle();
		toyota.setName("Toyota Camry");
		toyota.setPrice(5000);
		
		tom.purchaseCar(toyota, chris, true);	
		System.out.println("The price of your car is : " + toyota.getPrice());

	}
}