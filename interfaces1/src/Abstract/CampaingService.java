package Abstract;
import Entities.Customer;
import Entities.Games;
public interface CampaingService {
void campaignAdd(Games games, Customer customer );
void campaingUpdate(Games games, Customer customer);
void campaingDelete(Games games, Customer customer);
}
