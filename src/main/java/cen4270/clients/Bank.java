package cen4270.clients;

import cen4270.exceptions.ChargeCreditCardException;
import cen4270.models.CreditCard;

public interface Bank {
    public void chargeCreditCard(CreditCard creditCard, int amount) throws ChargeCreditCardException;
}
