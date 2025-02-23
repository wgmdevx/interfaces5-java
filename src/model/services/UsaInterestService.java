package model.services;

public class UsaInterestService implements InterestService {
    private Double interest;

    public UsaInterestService(Double interest) {
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
