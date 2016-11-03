package cen4270.fakes;

import cen4270.clients.Bank;
import cen4270.exceptions.ChargeCreditCardException;
import cen4270.models.CreditCard;

public class BankFake implements Bank {
    private CreditCard creditCard;
    private int amount;

    public void chargeCreditCard(CreditCard creditCard, int amount) throws ChargeCreditCardException {
        this.creditCard = creditCard;
        this.amount = amount;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public int getAmount() {
        return amount;
    }
}
