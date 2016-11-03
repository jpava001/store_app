package cen4270.fakes;

import cen4270.clients.Notification;
import cen4270.exceptions.SendEmailException;
import cen4270.models.Email;

public class NotificationFake implements Notification {
    private Email email;

    public void sendEmail(Email email) throws SendEmailException {
        this.email = email;
    }

    public Email getEmail() {
        return email;
    }
}
