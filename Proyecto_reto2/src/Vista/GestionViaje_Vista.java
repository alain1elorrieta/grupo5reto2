package Vista;

import javax.swing.*;
import java.awt.*;

public class GestionViaje_Vista extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private CardLayout cardLayout;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GestionViaje_Vista frame = new GestionViaje_Vista();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

  
    public GestionViaje_Vista() {
    	setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1280, 1024); 
        contentPane = new JPanel();
        contentPane.setLayout(new CardLayout()); 

     
        cardLayout = (CardLayout) contentPane.getLayout();

     
        Bienvenida_Vista bienvenidaPanel = new Bienvenida_Vista(cardLayout, contentPane);
        Login_Vista loginPanel = new Login_Vista();
        NuevoPerfil_Vista nuevoPerfil = new NuevoPerfil_Vista();
        ViajeEvento_Vista vistaEvento = new ViajeEvento_Vista();
        NuevoViaje_Vista vistaNuevoViaje = new NuevoViaje_Vista();

        contentPane.add(bienvenidaPanel, "Bienvenida");  
        contentPane.add(loginPanel, "Login"); 
        contentPane.add(nuevoPerfil, "NuevoPerfil"); 
        contentPane.add(vistaEvento, "VistaEvento");
        contentPane.add(vistaNuevoViaje, "NuevoViaje");
        

        setContentPane(contentPane);  
    }

   
    
    public void mostrarBienvenida() {
    	cardLayout.show(contentPane, "Bienvenida");
    }
    
    public void mostrarLoginPanel() {
        cardLayout.show(contentPane, "Login");  
    }

    public void mostrarNuevoPerfil() {
        cardLayout.show(contentPane, "NuevoPerfil");  
    }
    
    public void mostrarVistaEvento() {
    	cardLayout.show(contentPane, "VistaEvento");
    }
    
    public void mostrarNuevoViaje() {
    	cardLayout.show(contentPane, "NuevoViaje");
    }
}
