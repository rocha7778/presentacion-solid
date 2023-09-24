package solid.dependency.invercion.coupling.coustomer.lib;

import java.util.UUID;

public class DataService implements IDataService {
	
	private MySQL_V2 mySql; 

	@Override
	public boolean findUserByNameAndPassword(String name, String pasword) {
		UUID uuid = UUID.randomUUID();
		return mySql.findUserByNameAndPassword(name, pasword, uuid.toString());
	}

}
