package ChainedExcp;

public class Database {
    public void connect() throws DatabaseConnectionException{
        throw new DatabaseConnectionException("Connection failed!");
    }
}
