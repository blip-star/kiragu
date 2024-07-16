package question_four;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Palindrome {
    public static void main(String[]args){
        new MainGui();
    }
    static class MainGui extends JFrame{
        JLabel jLabel_display_result;
        public MainGui(){
            this.setSize(new Dimension(400,400));
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            initializeUI();
            this.setLocationRelativeTo(null);
            this.setVisible(true);
        }
        private JFrame initializeUI(){
            GridBagConstraints gbc = new GridBagConstraints();
            JPanel jPanel_main_layout = new JPanel(new GridBagLayout());
            gbc.weightx = 1;
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            JLabel jLabel_input_number = new JLabel("Enter a number");
            jPanel_main_layout.add(jLabel_input_number,gbc);
            JTextField jtf_input_number = new JTextField();
            jtf_input_number.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createEmptyBorder(8,8,8,8),
                    BorderFactory.createLineBorder(Color.BLUE, 2, true)
            ));
            gbc.gridy = 1;
            jPanel_main_layout.add(jtf_input_number,gbc);
            jLabel_display_result = new JLabel();
            gbc.gridy = 2;
            jPanel_main_layout.add(jLabel_display_result,gbc);

            jtf_input_number.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    jLabel_display_result.setText(
                            check_palindrome(jtf_input_number.getText().trim()) ? "Is palindrome" : "Not palindrome"
                    );
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    jLabel_display_result.setText(
                            check_palindrome(jtf_input_number.getText().trim()) ? "Is palindrome" : "Not palindrome"
                    );
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    jLabel_display_result.setText(
                            check_palindrome(jtf_input_number.getText().trim()) ? "Is palindrome" : "Not palindrome"
                    );
                }
            });

            this.add(jPanel_main_layout);
            return this;
        }
        private boolean check_palindrome(String input_string_number){
            try{
                if(!input_string_number.isEmpty()){
                    int number_check = Integer.parseInt(input_string_number);
                    if(number_check < 0){
                        return false;
                    }else{
                        int reverseNum = 0;
                        int temp = number_check;

                        while(temp > 0){
                            int last_digit = temp % 10;
                            reverseNum = (reverseNum * 10) + last_digit;
                            temp /= 10;
                        }
                        if(reverseNum == number_check){
                            return true;
                        }
                    }
                }

            }catch (Exception e){
                e.printStackTrace();
            }
            return false;
        }
    }
}
