package question_three;

import javax.swing.*;

public class AreaTriangle {
    int height, base;
    public static void main(String[]args){
        AreaTriangle areaTriangle = new AreaTriangle();
        areaTriangle.input_height_width();
        areaTriangle.display_results(areaTriangle.calculate_area_triangle());
    }
    private void input_height_width(){
        height = input_validate_number("Enter height");
        base = input_validate_number("Enter width");
    }
    private double calculate_area_triangle(){
        return 0.5*base*height;
    }
    private void display_results(double results){
        System.out.println("Area is: "+results);
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
