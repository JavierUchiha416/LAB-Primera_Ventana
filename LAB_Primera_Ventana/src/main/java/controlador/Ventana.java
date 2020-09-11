package controlador;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import vista.Vista;

public class Ventana extends JFrame {

    public Ventana() {

        setSize(350, 250);
        setLocationRelativeTo(null);
        setResizable(false);
        Vista vista = new Vista();
        add(vista.panel);

    }
}
