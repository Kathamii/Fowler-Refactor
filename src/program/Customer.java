package program;

import java.util.*;
public class Customer
{

    private String name;
    private Vector rentals = new Vector();

    public Customer(String newname)
    {
        name = newname;
    }

    public void addRental(Rental arg)
    {
        rentals.addElement(arg);
    }

    public String getName()
    {
        return name;
    }

    public String statement()
    {
        Enumeration enum_rentals = rentals.elements();
        String result = "program.Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        while (enum_rentals.hasMoreElements())
        {
            Rental rental = (Rental) enum_rentals.nextElement();
            result += "\t" + rental.getMovie().getTitle() + "\t" + "\t" + rental.getDaysRented() + "\t" + String.valueOf(rental.getCharge()) + "\n";
        }
        //add footer lines
        result += "Amount owed is " + getTotalCharge() + "\n";
        result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";
        return result;
    }

    public double getTotalCharge()
    {
        double result = 0;
        Enumeration rentals = this.rentals.elements();
        while (rentals.hasMoreElements())
        {
            Rental rental = (Rental) rentals.nextElement();
            result += rental.getCharge();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints()
    {
        int result = 0;
        Enumeration rentals = this.rentals.elements();
        while (rentals.hasMoreElements())
        {
             Rental rental = (Rental) rentals.nextElement();
             result += rental.getFrequentRenterPoints();
        }
        return result;
    }

}

    