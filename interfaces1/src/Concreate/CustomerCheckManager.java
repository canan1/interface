package Concreate;
import Abstract.CustomerCheckServise;
import Entities.Customer;

public abstract class CustomerCheckManager implements CustomerCheckServise {
@Override
public boolean checkIfRealPerson(Customer customer) {
return false;
}
}
