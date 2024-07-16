package java_methods;

import javax.swing.*;

public class Methods {
    public static void main(String[] args){
        find_max_min();
    }
    private static void find_max_min(){
        int num1 = input_validate_number("Enter num1");
        int num2 = input_validate_number("Enter num2");
        int num3 = input_validate_number("Enter num3");
        int min = num1, max = num1;

        if(num2 > max){
            max = num2;
        }else
            min = num2;
        if (num3 > max) {
            max = num3;
        }else{
            if(num3 < min){
                min = num3;
            }
        }
        System.out.println(
                "The smallest number is: "+min+
                        "\nThe largest number is: "+max+
                        "\n"+max+" is your largest "+min+" is smallest number."
        );

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
