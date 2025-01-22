package Vista;

import javax.swing.*;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import javax.swing.plaf.basic.BasicComboBoxUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NuevoPerfil_Vista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField txtNombreAgencia;
    private JTextField txtColorMarca;
    private JTextField txtLogoAgencia;
    private JTextField txtPassword;

   
    private JComboBox<String> comboNumEmpleados;
    private JComboBox<String> comboTipoAgencia;

    public NuevoPerfil_Vista() {
        
        setLayout(null);

       
        setPreferredSize(new Dimension(1280, 1024));
        
        JPanel whiteBackgroundPanel= new JPanel();
        whiteBackgroundPanel.setLayout(null);
        whiteBackgroundPanel.setBounds(0, 207, 1280, 516);
        whiteBackgroundPanel.setBackground(Color.WHITE);
        add(whiteBackgroundPanel);
        
    
        ImageIcon logoIcon = new ImageIcon(getClass().getResource("/Imagenes/logo2.png"));

       
        Image logoImage = logoIcon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);

        
        logoIcon = new ImageIcon(logoImage);

      
        JLabel logoLabel = new JLabel(logoIcon);

        
        logoLabel.setBounds(872, 100, 366, 327); 

       
        whiteBackgroundPanel.add(logoLabel);
        
        
        ImageIcon logoIcon2 = new ImageIcon(getClass().getResource("/Imagenes/plane.png"));

        
        Image logoImage2 = logoIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);

        
        logoIcon = new ImageIcon(logoImage);

        JLabel lblnombreAgencia = new JLabel("Nombre Agencia");
        lblnombreAgencia.setFont(new Font("Arial Black", Font.BOLD, 17));  
        lblnombreAgencia.setForeground(Color.BLACK);
        lblnombreAgencia.setBounds(34, 85, 187, 30);  
        whiteBackgroundPanel.add(lblnombreAgencia);

        JLabel lblcolorMarca = new JLabel("Color de Marca");
        lblcolorMarca.setForeground(Color.BLACK);
        lblcolorMarca.setFont(new Font("Arial Black", Font.BOLD, 17));
        lblcolorMarca.setBounds(34, 149, 187, 30);
        whiteBackgroundPanel.add(lblcolorMarca);

        JLabel lblnumEmpleados = new JLabel("Nº Empleados");
        lblnumEmpleados.setForeground(Color.BLACK);
        lblnumEmpleados.setFont(new Font("Arial Black", Font.BOLD, 17));
        lblnumEmpleados.setBounds(34, 210, 187, 30);
        whiteBackgroundPanel.add(lblnumEmpleados);

        JLabel lblTipoAgencia = new JLabel("Tipo Agencia");
        lblTipoAgencia.setForeground(Color.BLACK);
        lblTipoAgencia.setFont(new Font("Arial Black", Font.BOLD, 17));
        lblTipoAgencia.setBounds(34, 275, 187, 30);
        whiteBackgroundPanel.add(lblTipoAgencia);

        JLabel lblLogo = new JLabel("Logo Agencia");
        lblLogo.setForeground(Color.BLACK);
        lblLogo.setFont(new Font("Arial Black", Font.BOLD, 17));
        lblLogo.setBounds(34, 347, 187, 30);
        whiteBackgroundPanel.add(lblLogo);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setForeground(Color.BLACK);
        lblPassword.setFont(new Font("Arial Black", Font.BOLD, 17));
        lblPassword.setBounds(34, 412, 187, 30);
        whiteBackgroundPanel.add(lblPassword);

      
        txtColorMarca = new JTextField();
        txtColorMarca.setBounds(287, 146, 388, 40);  
        txtColorMarca.setBackground(new Color(240, 240, 240));  
        txtColorMarca.setForeground(Color.BLACK);  
        txtColorMarca.setFont(new Font("Arial", Font.BOLD, 16));  
        txtColorMarca.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));  
        whiteBackgroundPanel.add(txtColorMarca);

       
        JButton colorPickerButton = new JButton("Elegir");
        colorPickerButton.setBounds(690, 146, 140, 40);
        colorPickerButton.setBackground(new Color(37, 131, 219)); 
        colorPickerButton.setFont(new Font("Arial", Font.BOLD, 16)); 
        colorPickerButton.setForeground(Color.WHITE); 
        colorPickerButton.setFocusPainted(false); 
        colorPickerButton.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1)); 
        whiteBackgroundPanel.add(colorPickerButton);

        
        colorPickerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color selectedColor = JColorChooser.showDialog(NuevoPerfil_Vista.this, "Selecciona Color", Color.BLACK);
                if (selectedColor != null) {
                    txtColorMarca.setText(String.format("#%02X%02X%02X", selectedColor.getRed(), selectedColor.getGreen(), selectedColor.getBlue()));
                    txtColorMarca.setBackground(selectedColor);  
                }
            }
        });

        
        txtNombreAgencia = new JTextField();
        txtNombreAgencia.setForeground(Color.BLACK);
        txtNombreAgencia.setFont(new Font("Arial", Font.BOLD, 16));
        txtNombreAgencia.setBorder(BorderFactory.createLineBorder(new Color(37, 131, 219)));
        txtNombreAgencia.setBackground(UIManager.getColor("Button.background"));
        txtNombreAgencia.setBounds(287, 85, 388, 40);
        whiteBackgroundPanel.add(txtNombreAgencia);

       
        String[] empleadosOptions = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10+"};
        comboNumEmpleados = new JComboBox<>(empleadosOptions);
        comboNumEmpleados.setFont(new Font("Arial", Font.BOLD, 16));
        comboNumEmpleados.setBounds(287, 210, 388, 40);

      
        comboNumEmpleados.setBorder(BorderFactory.createEmptyBorder());

      
        comboNumEmpleados.setBackground(UIManager.getColor("Button.background")); 

      
        comboNumEmpleados.setUI(new BasicComboBoxUI() {
            @Override
            protected JButton createArrowButton() {
                JButton arrowButton = super.createArrowButton();
                arrowButton.setBackground(new Color(37, 131, 219)); 
                return arrowButton;
            }
        });

     
        whiteBackgroundPanel.add(comboNumEmpleados);

       
        String[] tipoAgenciaOptions = {"Agencia A", "Agencia B", "Agencia C", "Agencia D"};
        comboTipoAgencia = new JComboBox<>(tipoAgenciaOptions);
        comboTipoAgencia.setFont(new Font("Arial", Font.BOLD, 16));
        comboTipoAgencia.setBounds(287, 275, 388, 40);

      
        comboTipoAgencia.setBorder(BorderFactory.createEmptyBorder());

     
        comboTipoAgencia.setBackground(UIManager.getColor("Button.background")); 

     
        comboTipoAgencia.setUI(new BasicComboBoxUI() {
            @Override
            protected JButton createArrowButton() {
                JButton arrowButton = super.createArrowButton();
                arrowButton.setBackground(new Color(37, 131, 219)); 
                return arrowButton;
            }
        });

        
        whiteBackgroundPanel.add(comboTipoAgencia);

       
        txtLogoAgencia = new JTextField();
        txtLogoAgencia.setForeground(Color.BLACK);
        txtLogoAgencia.setFont(new Font("Arial", Font.BOLD, 16));
        txtLogoAgencia.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        txtLogoAgencia.setBackground(UIManager.getColor("Button.background"));
        txtLogoAgencia.setBounds(287, 344, 388, 40);
        whiteBackgroundPanel.add(txtLogoAgencia);

       
        txtPassword = new JTextField();
        txtPassword.setForeground(Color.BLACK);
        txtPassword.setFont(new Font("Arial", Font.BOLD, 16));
        txtPassword.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        txtPassword.setBackground(UIManager.getColor("Button.background"));
        txtPassword.setBounds(287, 409, 388, 40);
        whiteBackgroundPanel.add(txtPassword);

        JLabel titleLabel = new JLabel("NUEVO PERFIL");
        titleLabel.setFont(new Font("Candara", Font.BOLD, 100));  
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(0, 47, 1280, 112);  
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(titleLabel);
        
        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(26, 820, 127, 60);
        btnCancelar.setBackground(new Color(37, 131, 219));  
        btnCancelar.setForeground(Color.WHITE);  
        btnCancelar.setFont(new Font("Arial", Font.BOLD, 18));  
        btnCancelar.setFocusPainted(false);  
        btnCancelar.setBorder(BorderFactory.createLineBorder(new Color(37, 131, 219)));  
        btnCancelar.setFocusable(false);  
        btnCancelar.setMargin(new Insets(15, 30, 15, 30));  
        add(btnCancelar);
        
 btnCancelar.addActionListener(e -> {
            
            JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(NuevoPerfil_Vista.this);
            if (parentFrame instanceof GestionViaje_Vista) {
                ((GestionViaje_Vista) parentFrame).mostrarLoginPanel();  
            }
        });
        
        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(1108, 820, 127, 60);
        btnGuardar.setBackground(new Color(37, 131, 219));  
        btnGuardar.setForeground(Color.WHITE);  
        btnGuardar.setFont(new Font("Arial", Font.BOLD, 18));  
        btnGuardar.setFocusPainted(false);  
        btnGuardar.setBorder(BorderFactory.createLineBorder(new Color(37, 131, 219)));  
        btnGuardar.setFocusable(false);  
        btnGuardar.setMargin(new Insets(15, 30, 15, 30));  
        add(btnGuardar);
        
             
                JLabel logoLabel2 = new JLabel(logoIcon2);
                logoLabel2.setBounds(360, 642, 691, 382);
                add(logoLabel2);
    }

    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

       
        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/Imagenes/fondo2_proyecto.jpg"));
        g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
    }
}
