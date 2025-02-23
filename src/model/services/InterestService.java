package model.services;

public interface InterestService {
    double getInterest();

    default double payment(double ammount, int month) {
        return ammount * Math.pow(1 + getInterest() / 100, month);
    }
}
