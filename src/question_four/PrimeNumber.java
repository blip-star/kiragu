package question_four;

import java.util.ArrayList;

public class PrimeNumber {
    public PrimeNumber(){}
    public static void main(String[]args){
        for(int i = 1; i <= 500;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    private static boolean isPrime(int number){
        if(number == 1){
            return true;
        }
        for(int i = 2;i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
