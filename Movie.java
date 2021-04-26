import java.util.Scanner;

class MovieDetails
 {

   
    public static void main(String[] args) 
{
 
        Scanner read=new Scanner(System.in);
        System.out.println("Enter Movie name : ");
        String movie_name=read.nextLine(); // String is not variable
        System.out.println("Enter Actor name : ");
        String actor_name=read.nextLine();
        System.out.println("Enter Movie Rating: ");
        int rating=read.nextInt();
        System.out.println("Turnover of 1st month: ");
        float turnover=read.nextFloat();
        
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Movie :"+movie_name);
        System.out.println("Movie Actor:"+actor_name);
        System.out.println("Rating:"+rating);
        System.out.println("Turnover :"+turnover); 
    }
    
}