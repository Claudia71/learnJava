package fundamentals.test_18_11_10;

public class Movies {

    private String name;
    private int year;
    private float ticketPrice;



    public Movies(String name, int year, float ticketPrice) {
        this.name = name;
        this.year = year;
        this.ticketPrice = ticketPrice;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public  float getTicketPrice() {
        return ticketPrice;

    }
     float getPrice()
    {
        return ticketPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String toString ()
        {

            String text = "Name: " + this.name + "\n" + "year:  " + this.year + "\n" + "price : " + this.ticketPrice +"$";

           return text;


        }
    }





