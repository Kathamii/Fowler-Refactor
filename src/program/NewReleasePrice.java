package program;

class NewReleasePrice extends Price {

    @Override
    public double getCharge(int days)
    {
        return days * 3;
    }

    @Override
    public int getPriceCode()
    {
        return Movie.NEW_RELEASE;
    }

    @Override
    public int getFrequentRenterPoints(int days)
    {
        if (days > 1) return 2;
        return super.getFrequentRenterPoints(days);
    }


}