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

/**
 * Esta clase pretende crear la interfaz del programa y utiliza la funcion de mostrar los datos de las piezas y las salas
 * @author Diego
 *
 */
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
		frame.setBounds(100, 100, 546, 422);
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
		
		
		
		JButton btnConsularSala = new JButton("Consultar Salas");
		btnConsularSala.addActionListener(new ActionListener() {
			/**
			 * Evento que al pulsar pasa al metodo de mostrarSala
			 */
			public void actionPerformed(ActionEvent e) {
				mostrarSala();
			}
			/**
			 * Este metodo muestra las piezas de la sala en la que se encuentra
			 */
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
		
		
		
		
		JButton btnConsultarPieza = new JButton("Consultar Piezas");
		btnConsultarPieza.addActionListener(new ActionListener() {
			/**
			 * Evento que al pulsar pasa al metodo de mostrarPiezas
			 */
			public void actionPerformed(ActionEvent e) {
						mostrarPieza();
			}
			
			/**
			 * Este metodo muestra las piezas que hay en el museo
			 */
			private void mostrarPieza() {
				ArrayList<Pieza> pz= new ArrayList<Pieza>();
				Dinosaurio d1 = new Dinosaurio("002",20.67,2000,"Tiranosaurus rex", "cretacico");
				Cuadro c1 = new Cuadro("002",20.67,2000,"Tinta china","Madera","Prehistoria");
				
				pz.add(d1);
				pz.add(c1);
				
				for(int i=0;i<pz.size();i++)
				{
					System.out.println(pz.get(i).toString()	);
				}
			}
		});
		btnConsultarPieza.setBounds(28, 343, 214, 23);
		btnConsultarPieza.setVisible(true);
		frame.getContentPane().add(btnConsultarPieza);		
	}


}
