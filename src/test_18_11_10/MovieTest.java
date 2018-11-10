package test_18_11_10;

import java.util.ArrayList;

public class MovieTest {

   

    public static void filter (ArrayList<Movies> list, float fPrice){

        for (int i =0; i< list.size(); i++)

            if (list.get(i).getTicketPrice()> fPrice){

                System.out.println(list.get(i).toString());
            }
    }

    public static float average(ArrayList<Movies>list){

        float sum = 0; int n = 0;
        for( int i =0 ; i < list.size(); i++  )

            if (list.get(i).getYear()!=2017)
            {

                n++;
                sum = sum + list.get(i).getTicketPrice();

        }

        if(n==0){
            return 0;
        }

        return sum/n;
    }

    public static void main(String[] args) {

        Movies movie1 = new Movies( "Venom", 2018 ,10 );
        /*Movies movie2 = new Movies("Aquaman", 2018, 8);
        Movies movie3 = new Movies("Mile 22" , 2018, 9);
        Movies*/


        movie1.toString();
        System.out.println(movie1);
        System.out.println(movie1.toString());

        float price = MovieUtils.getPrice(movie1);
        System.out.println(price);

        ArrayList<Movies> movieList = new ArrayList();

        movieList.add(new Movies("Venom", 20018, 10));
        movieList.add(new Movies("Aquaman",2018, 9));
        movieList.add(new Movies("Mile", 20018, 10));
        movieList.add(new Movies("Blade Runner 2049", 2017,9));
        movieList.add(new Movies("Murder on the Orient Express", 2017, 8));
        movieList.add(new Movies("Baby Driver", 2017, 6));
        movieList.add(new Movies("Deadpool", 2016, 5));
        movieList.add(new Movies("Nocturnal Animals", 2016, 9));
        movieList.add(new Movies("Manchester by the Sea", 2016, 8));
        movieList.add(new Movies("The Invisible Guest", 2016, 7));

        System.out.println(average(movieList));

        filter(movieList, 8);









    }
}
