package Adapters;
import Abstract.CustomerCheckServise;
import Entities.Customer;
public abstract class EdevletServiceAdapter implements CustomerCheckServise {
	
@Override
public boolean checkIfRealPerson(Customer customer) {
	return false;
	 }
}
