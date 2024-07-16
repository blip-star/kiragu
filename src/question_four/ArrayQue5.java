package question_four;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayQue5 {
    public  static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 1; i <= 15; i++){
            numbers.add(input_validate_number("Enter the "+i+" element"));
        }
        System.out.println("Original array: "+numbers);
        int num_to_check = input_validate_number("Enter a number to check");
        System.out.println(
                (numbers.indexOf(num_to_check) != -1) ?
                        "The number found at index "+numbers.indexOf(num_to_check) :
                        "Number not found in this Array"
        );
        ArrayList<Integer> reversed_numbers = new ArrayList<>(numbers.reversed());
        System.out.println("Reverses array: "+reversed_numbers);

        int sum = 0, multiply = 1;
        for (int number : numbers){
            sum += number;
            multiply *= number;
        }
        System.out.println("Sum: "+sum);
        System.out.println("Multiply: "+multiply);

    }
    private static String show_input_value_dialog(String input_message){
        return JOptionPane.showInputDialog(null, input_message);
    }
    private static int input_validate_number(String message){

        String age_string = show_input_value_dialog(message);
        int number;
        try {
            number = Integer.parseInt(age_string);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Invalid or no number entered!!!","Error", JOptionPane.ERROR_MESSAGE);
            //Recursively calls itself to input a new age if an invalid age has been entered
            return input_validate_number("Enter a new number");
        }
        return number;
    }
}
