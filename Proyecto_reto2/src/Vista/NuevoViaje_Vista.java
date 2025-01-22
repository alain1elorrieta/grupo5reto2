package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.SwingConstants;

public class NuevoViaje_Vista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField txtNombreViaje;
    private JTextField textFieldInicio;
    private JTextField textFieldFin;
    private JTextField txtDias;
    private JTextField txtDescripcion;
    private JTextField txtServicios;

    /**
     * Create the panel.
     */
    public NuevoViaje_Vista() {

        setLayout(null);

        setPreferredSize(new Dimension(1280, 1024));
        
        JPanel whiteBackgroundPanel = new JPanel();
        whiteBackgroundPanel.setLayout(null);
        whiteBackgroundPanel.setBounds(0, 141, 1280, 678);
        whiteBackgroundPanel.setBackground(Color.WHITE);
        add(whiteBackgroundPanel);
        
        JLabel lblNombreViaje = new JLabel("Nombre Viaje");
        lblNombreViaje.setFont(new Font("Arial Black", Font.BOLD, 17));  
        lblNombreViaje.setForeground(Color.BLACK);
        lblNombreViaje.setBounds(32, 85, 187, 30);  
        whiteBackgroundPanel.add(lblNombreViaje);
        
        JLabel lblTipoViaje = new JLabel("Tipo Viaje");
        lblTipoViaje.setForeground(Color.BLACK);
        lblTipoViaje.setFont(new Font("Arial Black", Font.BOLD, 17));
        lblTipoViaje.setBounds(32, 137, 187, 30);
        whiteBackgroundPanel.add(lblTipoViaje);
        
        JLabel lblInicio = new JLabel("Inicio");
        lblInicio.setForeground(Color.BLACK);
        lblInicio.setFont(new Font("Arial Black", Font.BOLD, 17));
        lblInicio.setBounds(32, 188, 187, 30);
        whiteBackgroundPanel.add(lblInicio);
        
        JLabel lblFin = new JLabel("Fin");
        lblFin.setForeground(Color.BLACK);
        lblFin.setFont(new Font("Arial Black", Font.BOLD, 17));
        lblFin.setBounds(32, 239, 187, 30);
        whiteBackgroundPanel.add(lblFin);
        
        JLabel lblDias = new JLabel("Dias");
        lblDias.setForeground(Color.BLACK);
        lblDias.setFont(new Font("Arial Black", Font.BOLD, 17));
        lblDias.setBounds(32, 290, 187, 30);
        whiteBackgroundPanel.add(lblDias);
        
        JLabel lblPais = new JLabel("Pais");
        lblPais.setForeground(Color.BLACK);
        lblPais.setFont(new Font("Arial Black", Font.BOLD, 17));
        lblPais.setBounds(32, 341, 187, 30);
        whiteBackgroundPanel.add(lblPais);
        
        JLabel lblDescripcion = new JLabel("Descripcion");
        lblDescripcion.setForeground(Color.BLACK);
        lblDescripcion.setFont(new Font("Arial Black", Font.BOLD, 17));
        lblDescripcion.setBounds(32, 392, 187, 30);
        whiteBackgroundPanel.add(lblDescripcion);
        
        JLabel lblServicios = new JLabel("Servicios No Incluidos");
        lblServicios.setForeground(Color.BLACK);
        lblServicios.setFont(new Font("Arial Black", Font.BOLD, 17));
        lblServicios.setBounds(10, 544, 217, 47);
        whiteBackgroundPanel.add(lblServicios);
        
        txtNombreViaje = new JTextField();
        txtNombreViaje.setForeground(Color.BLACK);
        txtNombreViaje.setFont(new Font("Arial", Font.BOLD, 16));
        txtNombreViaje.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        txtNombreViaje.setBackground(UIManager.getColor("Button.background"));
        txtNombreViaje.setBounds(229, 82, 388, 40);
        whiteBackgroundPanel.add(txtNombreViaje);

     
        JComboBox<String> comboTipoViaje = new JComboBox<>(new String[] { "Nose", "Doce", "Jose" });
        comboTipoViaje.setForeground(Color.BLACK);
        comboTipoViaje.setFont(new Font("Arial", Font.BOLD, 16));
        comboTipoViaje.setBounds(229, 134, 388, 40);
        whiteBackgroundPanel.add(comboTipoViaje);

   
        textFieldInicio = new JTextField();
        textFieldInicio.setForeground(Color.BLACK);
        textFieldInicio.setFont(new Font("Arial", Font.BOLD, 16));
        textFieldInicio.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        textFieldInicio.setBackground(UIManager.getColor("Button.background"));
        textFieldInicio.setBounds(229, 185, 388, 40);
        whiteBackgroundPanel.add(textFieldInicio);

    
        textFieldFin = new JTextField();
        textFieldFin.setForeground(Color.BLACK);
        textFieldFin.setFont(new Font("Arial", Font.BOLD, 16));
        textFieldFin.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        textFieldFin.setBackground(UIManager.getColor("Button.background"));
        textFieldFin.setBounds(229, 236, 388, 40);
        whiteBackgroundPanel.add(textFieldFin);

        txtDias = new JTextField();
        txtDias.setForeground(Color.BLACK);
        txtDias.setFont(new Font("Arial", Font.BOLD, 16));
        txtDias.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        txtDias.setBackground(UIManager.getColor("Button.background"));
        txtDias.setBounds(229, 287, 388, 40);
        whiteBackgroundPanel.add(txtDias);

     
        JComboBox<String> comboPais = new JComboBox<>(new String[] {
            "Pakistan", "Afghanistan", "Uzbekistan", "Tajikistan", "Kyrgistan", "Daghestan"
        });
        comboPais.setForeground(Color.BLACK);
        comboPais.setFont(new Font("Arial", Font.BOLD, 16));
        comboPais.setBounds(229, 338, 388, 40);
        whiteBackgroundPanel.add(comboPais);

        txtDescripcion = new JTextField();
        txtDescripcion.setForeground(Color.BLACK);
        txtDescripcion.setFont(new Font("Arial", Font.BOLD, 16));
        txtDescripcion.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        txtDescripcion.setBackground(UIManager.getColor("Button.background"));
        txtDescripcion.setBounds(229, 389, 388, 113);
        whiteBackgroundPanel.add(txtDescripcion);
        
        txtServicios = new JTextField();
        txtServicios.setForeground(Color.BLACK);
        txtServicios.setFont(new Font("Arial", Font.BOLD, 16));
        txtServicios.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        txtServicios.setBackground(UIManager.getColor("Button.background"));
        txtServicios.setBounds(229, 543, 388, 98);
        whiteBackgroundPanel.add(txtServicios);
        
        JLabel lblNuevoViaje = new JLabel("Nuevo Viaje");
        lblNuevoViaje.setHorizontalAlignment(SwingConstants.LEFT);
        lblNuevoViaje.setForeground(Color.WHITE);
        lblNuevoViaje.setFont(new Font("Candara", Font.BOLD, 100));
        lblNuevoViaje.setBounds(20, 11, 1280, 130);
        add(lblNuevoViaje);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/Imagenes/fondo2_proyecto.jpg"));
        g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
    }
}
