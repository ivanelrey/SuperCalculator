/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.supercalculatormaven;

import javax.swing.JTextField;

/**
 *
 * @author zeus
 */
public class controlTextField {
    
    boolean canPutDot=true;
    
     public void inputedNumber(JTextField textField, String number )
    {
        if(textField.getText().contentEquals("0"))
            textField.setText("");
        textField.setText(textField.getText() +  number);
    }
     public void inputedClear(JTextField textField)
    {
        textField.setText("0");
        
        canPutDot=true;
    }
    
}
