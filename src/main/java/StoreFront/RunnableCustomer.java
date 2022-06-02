package StoreFront;

import java.util.List;

import com.fdm.services.Cashier;

public class RunnableCustomer extends Customer implements Runnable {

	private Cashier cashier;


	public RunnableCustomer(String name, double wallet, List<String> groceryList, Cashier cashier) {
		super(name, wallet, groceryList);
		this.cashier = cashier;
	}

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
