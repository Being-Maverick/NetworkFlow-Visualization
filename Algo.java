import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;
// Ford Fulkerson
public class Algo extends Thread
{
	
	 JFrame w = new JFrame("Ford Fulkerson Algorithm Visualizer");
	 JPanel contentPane;
	 JLabel label = new JLabel("");


	public Algo()
	{
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textField.setEditable(false);
		textField.setBounds(1170, 552, 96, 19);
		textField.setColumns(10);
		
		w.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		w.setBounds(100, 100, 1357, 855);
		w.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		w.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		label.setIcon(new ImageIcon("C:\\Users\\Charchit\\Documents\\EGDownloads\\Graph1\\Graph1\\initial.png"));
		label.setBounds(216, 10, 930, 531);
		contentPane.add(label);
		txtrglowingEdgesAre.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtrglowingEdgesAre.setText("1) Glowing Edges are Part of Augmenting Path and the Corresponding Residual Network\r\n2) The Residual Network induced by the Augmenting Path is shown in the form of X/Y\r\n3) X/Y :- Flow/Capacity  [X = Flow of an edge, Y = Capacity of an Edge]\r\n");
		txtrglowingEdgesAre.setBounds(71, 547, 767, 84);
		
		contentPane.add(txtrglowingEdgesAre);
		lblTheOutputFrom.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTheOutputFrom.setBounds(876, 536, 270, 53);
		
		contentPane.add(lblTheOutputFrom);
		
		contentPane.add(textField);
		//w.setUndecorated(true);
		
	}
	String image[] = new String[12];
	
	void display()
	{	
		//image[0] = "initial1.png";
		image[1] = "a).png";
		image[2] = "a1).png";
		image[3] = "b).png";
		image[4] = "b1).png";
		image[5] = "c).png";
		image[6] = "c1).png";
		image[7] = "d).png";
		image[8] = "d1).png";
		image[9] = "e).png";
		image[10] = "e1).png";
		image[11] = "f).png";
		start();
	}
	int i = 2;
	private final JTextArea txtrglowingEdgesAre = new JTextArea();
	private final JLabel lblTheOutputFrom = new JLabel("The Output from Implementation :");
	private final JTextField textField = new JTextField();
	public void run()
	{
		try
		{
			this.sleep(2000);
		}
		catch(Exception e)
		{
			
		}
		
		do
		{
			label.setIcon(new ImageIcon("C:\\Users\\Charchit\\Documents\\EGDownloads\\Graph1\\Graph1\\"+image[i]));
			i++;
			try
			{
				this.sleep(1500);
			}
			catch(Exception e)
			{
				
			}
			
		}while(i!=12);
		MaxFlow obj=new MaxFlow();
		int x=obj.initialize();
		textField.setText(String.valueOf(x));
		
	}
	
	
}

