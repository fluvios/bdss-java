package bdss.trajdb;

//Include the following imports to use table APIs
import com.microsoft.azure.storage.*;
import com.microsoft.azure.storage.table.*;
import com.microsoft.azure.storage.table.TableQuery.*;

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
