/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author javier
 */
public class Vista {
    /* Constructor que le da un color al panel y desactiva los Layouts */
    public Vista(){
        panel.setBackground(new Color(223, 63, 12, 200));
        panel.setLayout(null);
        inicializarComponentes();
    }
    
    /* Metodo para inicializar los Componentes */
    private void inicializarComponentes() {
        colocarEtiquetas(modelo.etiquetaNombre, "Nombre:");
        colocarCampoTexto(modelo.campoNombre, 100);
        colocarEtiquetas(modelo.etiquetaApellidoPaterno, "Apellido Paterno:");
        colocarCampoTexto(modelo.campoApellidoPaterno, 160);
        colocarEtiquetas(modelo.etiquetaApellidoMaterno, "Apellido Materno: ");
        colocarCampoTexto(modelo.campoApellidoMaterno, 160);
        colocarEtiquetas(modelo.etiquetaPais, "Pais: ");
        colocarComboBox();
        colocarAceptar();
        colocarCancelar();

    }
    /* Metodo para crear las etiquetas con la Clase JLabel */
    private void colocarEtiquetas(JLabel etiqueta, String texto) {

        modelo.width = 0;
        for (int i = 0; i < texto.length(); i++) {
            modelo.width += 11;
        }

        etiqueta = new JLabel(texto);
        etiqueta.setBounds(modelo.x, modelo.y, modelo.width, modelo.height);
        etiqueta.setFont(new Font("Tahoma", 2, 15));
        etiqueta.setForeground(new Color(255, 255, 255));
        panel.add(etiqueta);
        modelo.y += 30;

    }

    /* Metodo para crear los campos de texto con la Clase JTextField */
    private void colocarCampoTexto(JTextField campoTexto, int xCampo) {

        campoTexto.setBounds(xCampo, modelo.y - 30, 130, 20);
        campoTexto.setFont(new Font("Times New Roman", 2, 13));
        panel.add(campoTexto);

    }
    
    
    /* Creacion del combo box de los paises con la Clase JComboBox*/
    private void colocarComboBox() {

        modelo.comboPais.setBounds(70, 128, 90, 20);
        modelo.comboPais.setFont(new Font("Tahoma", 2, 10));
        modelo.comboPais.addItem("Seleccione");
        modelo.comboPais.addItem("Guatemala");
        modelo.comboPais.addItem("Peru");
        modelo.comboPais.addItem("Mexico");
        modelo.comboPais.addItem("España");
        panel.add(modelo.comboPais);

    }
    
    /* Creacion del boton aceptar  con la Clase JButton */
    private void colocarAceptar() {

        modelo.botonAceptar.setFont(new Font("Times New Roman", 2, 10));
        modelo.botonAceptar.setBounds(50, 170, 80, 25);
        panel.add(modelo.botonAceptar);
        modelo.xboton += 160;
        
        modelo.botonAceptar.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                controlador.Controlador controlador = new controlador.Controlador();
                controlador.eventoBotonAceptar(modelo);
            }
            
        });
        
        
    }
    /* Creacion del boton cancelar  con la Clase JButton */
    private void colocarCancelar() {

        modelo.botonCancelar.setFont(new Font("Times New Roman", 2, 10));
        modelo.botonCancelar.setBounds(modelo.xboton, 170, 80, 25);
        panel.add(modelo.botonCancelar);
        modelo.xboton += 160;
        
        modelo.botonCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                controlador.Controlador controlador = new controlador.Controlador();
                controlador.eventoBotonCancelar(modelo);
            }
        });
        
    }
    
    modelo.Modelo modelo = new modelo.Modelo();
    public JPanel panel = new JPanel();
    
    
}
