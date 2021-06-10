package Abstract;
import Entities.Customer;
public interface CustomerServise {
	
	public static void add(Customer customer) {
		System.out.println("Müþteri eklendi" + customer.getFirstName() + customer.getLastName() );
		
	}
	public static void update(Customer customer) {
		System.out.println("Müþteri silindi" + customer.getFirstName() + customer.getLastName());
		
	}
	public static void delete(Customer customer) {
		System.out.println("Müþteri güncellendi" + customer.getFirstName() + customer.getLastName());
	}

}
