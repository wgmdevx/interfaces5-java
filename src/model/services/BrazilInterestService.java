package model.services;

public class BrazilInterestService implements InterestService {
    private Double interest;

    public BrazilInterestService(Double interest) {
        this.interest = interest;
    }

    @Override
    public double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }
}
