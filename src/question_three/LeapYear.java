package question_three;

import javax.swing.*;

public class LeapYear {
    public static void main(String[]args){
        int year = input_validate_number("Enter a year");
        if(year % 4 == 0 && ! (year % 100 ==0 || year % 400 == 0)){
            System.out.println("The year you entered is a leap year.");
        }else {
            System.out.println("Not a leap year.");
        }
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
