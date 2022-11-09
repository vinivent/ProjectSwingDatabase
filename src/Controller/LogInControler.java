package Controller;

import Model.DAO.AccountDAO;
import Model.Entity.Account;

public class LogInControler implements ILogInController<Account> {

    private AccountDAO accountDAO;

    public LogInControler() {
        super();
        try {
            accountDAO = new AccountDAO();
            System.out.println("DAO successfully built.");
        } catch (Exception e) {
            System.out.println("Problem managing the connection to the data source");
        }
    }

    @Override
    public boolean logIn(String username, String password) {
        // TODO Auto-generated method stub
        return false;
    }

}
