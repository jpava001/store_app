package cen4270.fakes;

import cen4270.exceptions.RegisterUserException;
import cen4270.models.User;
import cen4270.services.Account;

public class AccountFake implements Account {
    private User user;

    public AccountFake(User user) {
        this.user = user;
    }

    public void registerUser(User user) throws RegisterUserException {

    }

    public User getRegisteredUser(String email) {
        return user;
    }
}
