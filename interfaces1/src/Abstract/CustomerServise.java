package Abstract;
import Entities.Customer;
public interface CustomerServise {
	
	public static void add(Customer customer) {
		System.out.println("M��teri eklendi" + customer.getFirstName() + customer.getLastName() );
		
	}
	public static void update(Customer customer) {
		System.out.println("M��teri silindi" + customer.getFirstName() + customer.getLastName());
		
	}
	public static void delete(Customer customer) {
		System.out.println("M��teri g�ncellendi" + customer.getFirstName() + customer.getLastName());
	}

}
