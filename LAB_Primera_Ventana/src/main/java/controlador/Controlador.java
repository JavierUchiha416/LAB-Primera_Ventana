/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import modelo.Modelo;

public class Controlador {
    
    
     
    
    public void eventoBotonAceptar(Modelo modelo) {
        

                
                if (modelo.campoNombre.getText().equals("")) {

                    JOptionPane.showMessageDialog(null, "Campos Sin Rellenar");
                    modelo.campoNombre.setBackground(new Color(200, 111, 111));

                
                } else {
                    
                    if(modelo.comboPais.getSelectedItem().toString().equals("Seleccione")){
                        pais = "Desconocido";
                    }else{
                        pais = modelo.comboPais.getSelectedItem().toString();
                    }
                        JOptionPane.showMessageDialog(null, "Su Nombre es: " + modelo.campoNombre.getText() + " " + modelo.campoApellidoPaterno.getText() + " " +modelo. campoApellidoMaterno.getText() + "\nPais: " + pais);
                        modelo.campoNombre.setBackground(new Color(255, 255, 255));
                        modelo.campoApellidoPaterno.setBackground(new Color(255, 255, 255));
                        modelo.campoApellidoMaterno.setBackground(new Color(255, 255, 255));
                        modelo.comboPais.setBackground(new Color(255, 255, 255));
                        modelo.comboPais.setSelectedIndex(0);
                        modelo.campoNombre.setText("");
                        modelo.campoApellidoPaterno.setText("");
                        modelo.campoApellidoMaterno.setText("");
                    }
                }
    public void eventoBotonCancelar(Modelo modelo){
        
        modelo.comboPais.setSelectedIndex(0);
        modelo.campoNombre.setText("");
        modelo.campoApellidoPaterno.setText("");
        modelo.campoApellidoMaterno.setText("");
        
    }
                
        private String pais;

    }
    


