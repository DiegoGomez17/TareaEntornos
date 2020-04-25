package museo;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;





public class Interfaz {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 546, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image imagen = new ImageIcon(this.getClass().getResource("/museo.png")).getImage();
		frame.setIconImage(imagen);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(28, 9, 447, 288);
		frame.getContentPane().add(lblNewLabel);
		ImageIcon lblImage = new ImageIcon(this.getClass().getResource("/museo.png"));
		lblNewLabel.setIcon(lblImage);
		
		
		JButton btnConsularSala = new JButton("Consula Salas");
		btnConsularSala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mostrarSala();
			}

			private void mostrarSala() {
				System.out.println("Datos de las salas");
				Escultura e1 = new Escultura("002",20.67,2000,"Piedra", "Esculpido");
				Escultura e2 = new Escultura("003",20.67,2000,"Arcilla", "Modelado");
				Dinosaurio d1 = new Dinosaurio("002",20.67,2000,"Tiranosaurus rex", "cretacico");
				Dinosaurio d2 = new Dinosaurio("003",20.67,2000,"velociraptor", "jurasico");
				Cuadro c1 = new Cuadro("002",20.67,2000,"Tinta china","Madera","Prehistoria");
				Cuadro c2 = new Cuadro("003",20.67,2000,"Tinta china","Madera","Prehistoria");
				
				ArrayList<Pieza> piezas = new ArrayList<Pieza>();
				piezas.add(e1);
				piezas.add(e2);
		        piezas.add(d1);
		        piezas.add(d2);
		        piezas.add(c1);
		        piezas.add(c2);
		        
		        Sala s1 = new Sala("001", piezas);
				s1.mostrarSala();
				
			}

		
		});
		btnConsularSala.setBounds(261, 343, 214, 23);
		btnConsularSala.setVisible(true);
		frame.getContentPane().add(btnConsularSala);
		
		JButton btnConsultarPieza = new JButton("Consultar piezas");
		btnConsultarPieza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						mostrarPieza();
			}

			private void mostrarPieza() {
				System.out.println("Datos de Piezas");
				Pieza p1 = new Pieza("001",79.0,12);
				Pieza p2 = new Pieza("002",45.8,20);
				Pieza p3 = new Pieza("003",34.78,90);
				Pieza p4 = new Pieza("004",5.8,70);
				Pieza p5 = new Pieza("005",40.9,220);
				p1.mostrarPieza();
				p2.mostrarPieza();
				p3.mostrarPieza();
				p4.mostrarPieza();
				p5.mostrarPieza();
				
			}

			
		});
		btnConsultarPieza.setBounds(28, 343, 214, 23);
		btnConsultarPieza.setVisible(true);
		frame.getContentPane().add(btnConsultarPieza);		
	}

	


}
