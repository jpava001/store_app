package cen4270.clients;

import cen4270.exceptions.SendEmailException;
import cen4270.models.Email;

public interface Notification {
    public void sendEmail(Email email) throws SendEmailException;
}
