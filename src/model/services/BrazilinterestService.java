package model.services;

public class BrazilinterestService {
    private Double interest;

    public BrazilinterestService(Double interest) {
        this.interest = interest;
    }

    public double payment(double ammount, int month) {
        return ammount * Math.pow(1 + interest / 100, month);
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }
}
