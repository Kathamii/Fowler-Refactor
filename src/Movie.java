public class Movie
{
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private Price price;

    public Movie(String newtitle, int newpriceCode)
    {
        this.title = newtitle;
        this.setPriceCode(newpriceCode);
    }
    public int getPriceCode()
    {
        return this.price.getPriceCode();
    }
    public void setPriceCode(int arg)
    {
        switch (arg)
        {
            case REGULAR:
                price = new RegularPrice();
                break;

            case CHILDRENS:
                price = new ChildrensPrice();
                break;

            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;

            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }
    public String getTitle ()
    {
        return title;
    }
    double getCharge(int days)
    {
        double result = 0;
        switch (this.getPriceCode())
        {
            case Movie.REGULAR:
                result += 2;
                if (days > 2)
                {
                    result += (days - 2) * 1.5;
                }
                break;

            case Movie.NEW_RELEASE:
                result += days * 3;
                break;

            case Movie.CHILDRENS:
                result += 1.5;
                if (days > 3)
                {
                    result += (days - 3) * 1.5;
                }
                break;
        }
        return result;
    }
    int getFrequentRenterPoints(int days)
    {
        if (getPriceCode() == Movie.NEW_RELEASE && days > 1)
        {
            return 2;
        }
        else
        {
            return 1;
        }
    }
}