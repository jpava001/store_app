package cen4270.models;

import java.util.Date;

public class CreditCard {
    private String number;

    private Date expirationDate;

    public CreditCard(String number, Date expirationDate) {
        this.number = number;
        this.expirationDate = expirationDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreditCard that = (CreditCard) o;

        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        return expirationDate != null ? expirationDate.equals(that.expirationDate) : that.expirationDate == null;

    }
}
