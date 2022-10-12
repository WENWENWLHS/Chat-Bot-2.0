
/**
 * Write a description of class Bot2Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       System.out.println("Hello. What is your name? ");
       String name = input.nextLine();
       
       Bot2 bot = new Bot2(name);
       bot.greeting();
       
       System.out.println("What is your favorite animal? ");
       String yourAnimal = input.nextLine();
       bot.favoriteAnimal(yourAnimal);
       
       System.out.println("Where do you live? ");
       String location = input.nextLine();
       bot.home(location);
       
       System.out.println("What is your Favorite number? ");
       int yourNumber = input.nextInt();
       bot.favoriteNumber(yourNumber);
       
       bot.goodbye();
        
    }
}
