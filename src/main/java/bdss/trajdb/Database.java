package bdss.trajdb;

public class Database {
	private static final String storageConnectionString =
		    "DefaultEndpointsProtocol=https;" + 
		    "AccountName=your_cosmosdb_account;" + 
		    "AccountKey=your_account_key;" + 
		    "TableEndpoint=https://your_endpoint;" ;
	
	public void connect() {
		// Retrieve storage account from connection-string.
//		String storageConnectionString =
//		    RoleEnvironment.getConfigurationSettings().get("StorageConnectionString");
	}
}
