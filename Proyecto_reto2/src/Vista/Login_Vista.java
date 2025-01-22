package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login_Vista extends JPanel {

    private static final long serialVersionUID = 1L;

    public Login_Vista() {
        setLayout(null);
        setPreferredSize(new Dimension(1280, 1024));

      
        JLabel titleLabel = new JLabel("LOG IN");
        titleLabel.setFont(new Font("Candara", Font.BOLD, 100));  
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(0, 27, 1280, 130);  
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(titleLabel);

       
        JPanel whiteBackgroundPanel = new JPanel();
        whiteBackgroundPanel.setLayout(null);
        whiteBackgroundPanel.setBounds(0, 255, 1280, 429);
        whiteBackgroundPanel.setBackground(Color.WHITE);
        add(whiteBackgroundPanel);

        
        JLabel agenciaLabel = new JLabel("AGENCIA");
        agenciaLabel.setFont(new Font("Arial Black", Font.BOLD, 20));  
        agenciaLabel.setForeground(Color.BLACK);
        agenciaLabel.setBounds(423, 116, 187, 30);  
        whiteBackgroundPanel.add(agenciaLabel);

        
        JTextField agenciaTextField = new JTextField();
        agenciaTextField.setBounds(601, 109, 250, 40);  
        agenciaTextField.setBackground(new Color(240, 240, 240));  
        agenciaTextField.setForeground(Color.BLACK);  
        agenciaTextField.setFont(new Font("Arial", Font.BOLD, 16));  
        agenciaTextField.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));  
        whiteBackgroundPanel.add(agenciaTextField);

      
        ImageIcon agenciaIcon = new ImageIcon(getClass().getResource("/Imagenes/Agencia.png"));
        Image agenciaImage = agenciaIcon.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);  // Resize to 30x30
        agenciaIcon = new ImageIcon(agenciaImage);
        JLabel agenciaIconLabel = new JLabel(agenciaIcon);
        agenciaIconLabel.setBounds(855, 109, 30, 30); 
        whiteBackgroundPanel.add(agenciaIconLabel);

       
        JLabel passwordLabel = new JLabel("PASSWORD");
        passwordLabel.setFont(new Font("Arial Black", Font.BOLD, 20));  
        passwordLabel.setForeground(Color.BLACK);
        passwordLabel.setBounds(423, 251, 187, 30);  
        whiteBackgroundPanel.add(passwordLabel);

       
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(601, 244, 250, 40);  
        passwordField.setBackground(new Color(240, 240, 240));  
        passwordField.setForeground(Color.BLACK);  
        passwordField.setFont(new Font("Arial", Font.BOLD, 16));  
        passwordField.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));  
        whiteBackgroundPanel.add(passwordField);

        
        ImageIcon passwordIcon = new ImageIcon(getClass().getResource("/Imagenes/password.png"));
        Image passwordImage = passwordIcon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);  
        passwordIcon = new ImageIcon(passwordImage);
        JLabel passwordIconLabel = new JLabel(passwordIcon);
        passwordIconLabel.setBounds(855, 244, 30, 30); 
        whiteBackgroundPanel.add(passwordIconLabel);

    
        JButton btnIniciar = new JButton("INICIAR");
        btnIniciar.setBounds(416, 757, 150, 50);  
        btnIniciar.setBackground(new Color(37, 131, 219));  
        btnIniciar.setForeground(Color.WHITE);  
        btnIniciar.setFont(new Font("Arial", Font.BOLD, 18));  
        btnIniciar.setFocusPainted(false);  
        btnIniciar.setBorder(BorderFactory.createLineBorder(new Color(37, 131, 219)));  
        btnIniciar.setFocusable(false);  
        btnIniciar.setMargin(new Insets(15, 30, 15, 30));  
        add(btnIniciar);
        
        btnIniciar.addActionListener(e -> {
            
            JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(Login_Vista.this);
            if (parentFrame instanceof GestionViaje_Vista) {
                ((GestionViaje_Vista) parentFrame).mostrarVistaEvento();  
            }
        });

       
        JButton btnCrear = new JButton("CREAR");
        btnCrear.setBounds(744, 757, 150, 50);  
        btnCrear.setBackground(new Color(37, 131, 219));  
        btnCrear.setForeground(Color.WHITE);  
        btnCrear.setFont(new Font("Arial", Font.BOLD, 18));  
        btnCrear.setFocusPainted(false);  
        btnCrear.setBorder(BorderFactory.createLineBorder(new Color(37, 131, 219)));  
        btnCrear.setFocusable(false);  
        btnCrear.setMargin(new Insets(15, 30, 15, 30));  
        add(btnCrear);

       
        btnCrear.addActionListener(e -> {
            
            JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(Login_Vista.this);
            if (parentFrame instanceof GestionViaje_Vista) {
                ((GestionViaje_Vista) parentFrame).mostrarNuevoPerfil();  
            }
        });

        
        passwordField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    btnIniciar.doClick();  
                }
            }
        });

       
        agenciaTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    passwordField.requestFocus();  
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

      
        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/Imagenes/fondo2_proyecto.jpg"));
        g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
    }
}
