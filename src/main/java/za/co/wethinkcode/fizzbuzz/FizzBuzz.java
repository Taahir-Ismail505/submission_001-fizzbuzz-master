package za.co.wethinkcode.fizzbuzz;

import java.util.ArrayList;

public class FizzBuzz {
    public String checkNumber(int number) {
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;


        if ((divisibleBy3 & divisibleBy5)) {
            return "FizzBuzz";

        }
        if (divisibleBy3) {
            return "Fizz";

        }
        if (divisibleBy5) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }

    public String countTo(int number) {
        int end = 1;
        ArrayList<String> Mylist = new ArrayList<>();
        while (end < number+1){
            Mylist.add(String.valueOf(checkNumber(end)));
            end ++ ;
        }
        return String.valueOf(Mylist);
    }

}