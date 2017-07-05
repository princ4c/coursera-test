import coffee.Coffee;
import person.VirtualPerson;

public class DemoException {

	public static void main(String[] args) {
		
		int temperature = 0;
		
		if (args.length > 0) {
			try {
				temperature = Integer.parseInt(args[0]);
			}
			catch(NumberFormatException e) {
				System.out.println(
				"Must enter integer as first argument.");
				return;
			}
			}
			else {
				System.out.println(
				"Must enter temperature as first argument.");
			return;
			}
			// Create a new coffee cup and set the temperature of
			// its coffee.
			Coffee cup = new Coffee();
			cup.setTemperature(temperature);
			// Create and serve a virtual customer.
			VirtualPerson cust = new VirtualPerson();
			Caffee.serveCustomer(cust, cup);

	}

}
