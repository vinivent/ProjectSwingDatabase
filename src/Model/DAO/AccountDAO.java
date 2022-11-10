package Model.DAO;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

import Model.Entity.Account;

public class AccountDAO extends GenericDAO<Account> {

    private Connection con = null;
    private Statement stmt = null;
    private Account answer = null;
    private ResultSet result = null;

    public boolean logIn(Account account) {
        return false;
    }
}
