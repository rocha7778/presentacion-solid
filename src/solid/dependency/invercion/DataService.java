package solid.dependency.invercion;

public class DataService implements IDataService {
	
	private MySQL mySql; 

	@Override
	public boolean findUserByNameAndPassword(String name, String pasword) {
		return mySql.findUserByNameAndPassword(name, pasword);
	}

}
