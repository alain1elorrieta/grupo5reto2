package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Bienvenida_Vista extends JPanel {

    private static final long serialVersionUID = 1L;

    private CardLayout cardLayout;
    private JPanel contentPane;

   
    public Bienvenida_Vista(CardLayout cardLayout, JPanel contentPane) {
        this.cardLayout = cardLayout;
        this.contentPane = contentPane;

      
        setLayout(null);

      
        setPreferredSize(new Dimension(1280, 1024));

     
        JButton loginButton = new JButton("LOGIN");
        loginButton.setBounds(540, 850, 200, 60); 
        
      
        loginButton.setBackground(Color.BLACK);
        loginButton.setForeground(new Color(39, 195, 216));
        loginButton.setFont(new Font("Arial", Font.BOLD, 18));
        loginButton.setFocusPainted(false);
        loginButton.setBorder(BorderFactory.createLineBorder(new Color(39, 195, 216), 5));
        loginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

 
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ((GestionViaje_Vista) SwingUtilities.getWindowAncestor(Bienvenida_Vista.this)).mostrarLoginPanel();
            }
        });

        loginButton.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "loginAction");
        loginButton.getActionMap().put("loginAction", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginButton.doClick(); 
            }
        });

    
        add(loginButton);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

       
        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/Imagenes/fondo_proyecto.jpg"));
        g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
    }
}
