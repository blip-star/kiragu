package question_two;

import javax.swing.*;

public class UnitAvg {
    public static void main(String[] args){
        int java = input_validate_number("Enter marks for Java");
        int network = input_validate_number("Enter marks for Networking");
        int math = input_validate_number("Enter marks for Math");

        System.out.println(
                "\nmarks for java programming is: "+java+
                    "\nmarks for networking is: "+network+
                    "\nmarks for maths is: "+math+
                    "\nthe average is: "+(((float) java+network+math)/3)
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
