package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import java.awt.Component;

public class ViajeEvento_Vista extends JPanel {

	private static final long serialVersionUID = 1L;

	
	public ViajeEvento_Vista() {
		
		 setLayout(null);
	        setPreferredSize(new Dimension(1280, 1024));

	       
	        JLabel titleLabel = new JLabel("[Nombre Agencia]");
	        titleLabel.setFont(new Font("Candara", Font.BOLD, 50));  
	        titleLabel.setForeground(Color.WHITE);
	        titleLabel.setBounds(322, 58, 428, 130);  
	        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
	        add(titleLabel);

	    
	        JPanel whiteBackgroundPanel = new JPanel();
	        whiteBackgroundPanel.setLayout(null);
	        whiteBackgroundPanel.setBounds(0, 271, 1280, 753);
	        whiteBackgroundPanel.setBackground(new Color(37, 131, 219)); 
	        add(whiteBackgroundPanel);
	        
	        JLabel titleLabel2 = new JLabel("Viajes");
	        titleLabel2.setBounds(10, 11, 1270, 73);
	        whiteBackgroundPanel.add(titleLabel2);
	        titleLabel2.setFont(new Font("Candara", Font.BOLD, 50));  
	        titleLabel2.setForeground(Color.WHITE);
	        titleLabel2.setHorizontalAlignment(SwingConstants.LEFT);
	        
	        JLabel lblEventos = new JLabel("Eventos");
	        lblEventos.setHorizontalAlignment(SwingConstants.LEFT);
	        lblEventos.setForeground(Color.WHITE);
	        lblEventos.setFont(new Font("Candara", Font.BOLD, 50));
	        lblEventos.setBounds(10, 329, 1270, 73);
	        whiteBackgroundPanel.add(lblEventos);
	        

	        ImageIcon logoIcon = new ImageIcon(getClass().getResource("/Imagenes/logo.png"));
	        Image logoImage = logoIcon.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
	        logoIcon = new ImageIcon(logoImage);
	        JLabel logoLabel = new JLabel(logoIcon);
	        logoLabel.setBounds(0, 0, 312, 260);
	        add(logoLabel);
	        
	       
	        
	        String[] columnNames = {"Column 1", "Column 2", "Column 3"};  
	        Object[][] data = {};  //INFO VACIO HERMANO

	   
	        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);

	       
	        JTable table = new JTable(tableModel);

	       
	        table.setFont(new Font("Arial", Font.PLAIN, 16));  
	        table.setRowHeight(30);  
	        table.setIntercellSpacing(new Dimension(5, 5));  
	        table.setGridColor(Color.BLACK);  
	        table.setShowGrid(true);  

	      
	        table.getColumnModel().getColumn(0).setPreferredWidth(150);  
	        table.getColumnModel().getColumn(1).setPreferredWidth(150);
	        table.getColumnModel().getColumn(2).setPreferredWidth(150);

	     
	        JScrollPane scrollPane = new JScrollPane(table);
	        scrollPane.setBounds(10, 75, 951, 256);  
	        
	       
	        whiteBackgroundPanel.add(scrollPane);
	        ///////////////////////////////////////////////////////////////////////////////////
	        
	        DefaultTableModel tableModel2 = new DefaultTableModel(data, columnNames);

	   
	        JTable table2 = new JTable(tableModel2);

	      
	        table2.setFont(new Font("Arial", Font.PLAIN, 16));  
	        table2.setRowHeight(130);  
	        table2.setIntercellSpacing(new Dimension(5, 5));  
	        table2.setGridColor(Color.BLACK);  
	        table2.setShowGrid(true);  
	       

	      
	        table2.getColumnModel().getColumn(0).setPreferredWidth(150);
	        table2.getColumnModel().getColumn(1).setPreferredWidth(150);
	        table2.getColumnModel().getColumn(2).setPreferredWidth(150);

	        
	        JScrollPane scrollPane2 = new JScrollPane(table2);
	        scrollPane2.setBounds(10, 383, 951, 250);  
	        whiteBackgroundPanel.add(scrollPane2);
	        ///////////////////////////////////////////////////////////////////////////////////
	        JButton btnNuevoViaje = new JButton("+");
	        btnNuevoViaje.setBounds(1040, 119, 183, 172);
	        whiteBackgroundPanel.add(btnNuevoViaje);
	        btnNuevoViaje.setBackground(new Color(112, 175, 233));  
	        btnNuevoViaje.setForeground(Color.WHITE);  
	        btnNuevoViaje.setFont(new Font("Arial", Font.BOLD, 120));  
	        btnNuevoViaje.setFocusPainted(false);  
	        btnNuevoViaje.setBorder(BorderFactory.createLineBorder(new Color(37, 131, 219)));  
	        btnNuevoViaje.setFocusable(false);  
	        btnNuevoViaje.setMargin(new Insets(15, 30, 15, 30));
	        
	        
 btnNuevoViaje.addActionListener(e -> {
	            
	            JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(ViajeEvento_Vista.this);
	            if (parentFrame instanceof GestionViaje_Vista) {
	                ((GestionViaje_Vista) parentFrame).mostrarNuevoViaje();  
	            }
	        });
	        
	        
	        
	        JButton btnNuevoEvento = new JButton("+");
	        btnNuevoEvento.setMargin(new Insets(15, 30, 15, 30));
	        btnNuevoEvento.setForeground(Color.WHITE);
	        btnNuevoEvento.setFont(new Font("Arial", Font.BOLD, 120));
	        btnNuevoEvento.setFocusable(false);
	        btnNuevoEvento.setFocusPainted(false);
	        btnNuevoEvento.setBorder(BorderFactory.createLineBorder(new Color(37, 131, 219)));
	        btnNuevoEvento.setBackground(new Color(112, 175, 233));
	        btnNuevoEvento.setBounds(1040, 427, 183, 172);
	        whiteBackgroundPanel.add(btnNuevoEvento);
	        
	        JButton btnGenerarOferta = new JButton("Generar Oferta");
	        btnGenerarOferta.setMargin(new Insets(15, 30, 15, 30));
	        btnGenerarOferta.setForeground(new Color(51, 124, 48));
	        btnGenerarOferta.setFont(new Font("Arial", Font.BOLD, 30));
	        btnGenerarOferta.setFocusable(false);
	        btnGenerarOferta.setFocusPainted(false);
	        btnGenerarOferta.setBorder(BorderFactory.createLineBorder(new Color(170, 255, 167)));
	        btnGenerarOferta.setBackground(new Color(170, 255, 167));
	        btnGenerarOferta.setBounds(10, 644, 505, 63);
	        whiteBackgroundPanel.add(btnGenerarOferta);
	        
	        JButton btnLogOut = new JButton("LOG OUT");
	        btnLogOut.setMargin(new Insets(15, 30, 15, 30));
	        btnLogOut.setForeground(Color.WHITE);
	        btnLogOut.setFont(new Font("Arial", Font.BOLD, 15));
	        btnLogOut.setFocusable(false);
	        btnLogOut.setFocusPainted(false);
	        btnLogOut.setBorder(BorderFactory.createLineBorder(new Color(190, 83, 83)));
	        btnLogOut.setBackground(new Color(190, 83, 83));
	        btnLogOut.setBounds(824, 644, 137, 63);
	        whiteBackgroundPanel.add(btnLogOut);
	        
	        btnLogOut.addActionListener(e -> {
	            
	            JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(ViajeEvento_Vista.this);
	            if (parentFrame instanceof GestionViaje_Vista) {
	                ((GestionViaje_Vista) parentFrame).mostrarBienvenida();  
	            }
	        });
	        
	    
	        
	        
	}
	
	  private static void setResizable(boolean b) {
		// TODO Auto-generated method stub
		
	}

	protected void paintComponent(Graphics g) {
	        super.paintComponent(g);

	      
	        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/Imagenes/fondo2_proyecto.jpg"));
	        g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
	    }
}
