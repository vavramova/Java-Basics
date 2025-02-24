package ChainedExcp;

public class App {
    public void startApp(){
        try{
            Database database = new Database();
            database.connect();
        }catch (DatabaseConnectionException dce){
            throw new RuntimeException("Application error", dce);
        }

    }
}
