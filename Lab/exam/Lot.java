import java.util.Scanner;

public class Lot {
    public static void main(String args[]){

        
        int random_number = (int)(Math.random() * 100);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 digit number :");
        int guess_number = input.nextInt();

        int random_number_digit1 = random_number / 10 ;
        int random_number_digit2 = random_number % 10 ;

        int guess_number_digit1 = guess_number / 10 ;
        int guess_number_digit2 = guess_number % 10 ;
        System.out.println(random_number);
        
        boolean exact_match =   random_number == guess_number;
        boolean match_all_digits =   random_number_digit1 == guess_number_digit2 && random_number_digit2 == guess_number_digit1;
        boolean match_one_digit =   random_number_digit1 == guess_number_digit1 ||
                                    random_number_digit1 == guess_number_digit2 ||
                                    random_number_digit2 == guess_number_digit1 ||
                                    random_number_digit2 == guess_number_digit2;

        
        if (exact_match){
            System.out.println("Exact match: you win $10,000");
        }
        else if(match_all_digits){
            System.out.println("Match all digits: you win $3,000");
        }
        else if (match_one_digit){
            System.out.println("Match one digit: you win $1,000");
        }
        else {
            System.out.println("sorry, no match");
        }
    }
}