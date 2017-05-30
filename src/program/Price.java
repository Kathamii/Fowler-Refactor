package program;

abstract class Price {

    public abstract double getCharge(int days);
    public abstract int getPriceCode();
    public int getFrequentRenterPoints(int days)
    {
        return 1;
    }
}