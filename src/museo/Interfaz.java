package museo;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
		
		
		JButton btnConsularSala = new JButton("Consula Sala");
		btnConsularSala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mostrarSala();
			}

			private void mostrarSala() {
				// TODO Auto-generated method stub
				
			}

		});
		btnConsularSala.setBounds(261, 343, 214, 23);
		btnConsularSala.setVisible(true);
		frame.getContentPane().add(btnConsularSala);
		
		JButton btnConsultarPieza = new JButton("Consultar pieza");
		btnConsultarPieza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						mostrarPieza();
			}

			private void mostrarPieza() {
				
			}

		
		});
		btnConsultarPieza.setBounds(28, 343, 214, 23);
		btnConsultarPieza.setVisible(true);
		frame.getContentPane().add(btnConsultarPieza);		
	}

}
