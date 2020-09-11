/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author javier
 */
public class Modelo {
    
    /* Creacion de Variables para crear la interfaz grafica */
    public JLabel etiquetaNombre;
    public JLabel etiquetaApellidoMaterno;
    public JLabel etiquetaApellidoPaterno;
    public JLabel etiquetaPais = new JLabel();
    public int x = 25;
    public int y = 35;
    public int width = 0;
    public int height = 30;
    public JTextField campoNombre = new JTextField();
    public JTextField campoApellidoMaterno = new JTextField();
    public JTextField campoApellidoPaterno = new JTextField();
    public JComboBox comboPais = new JComboBox();

    public JButton botonAceptar = new JButton("Aceptar");
    public JButton botonCancelar = new JButton("Cancelar");
    public int xboton = 50;
    
}
