import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;
// Push Relabel
public class Algo2 extends Thread
{
	
	 JFrame w = new JFrame("Push Relabel Algorithm Visualizer");
	 JPanel contentPane;
	 JLabel label = new JLabel("");
	 JTextField textField;

	public Algo2()
	{
	    w.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		w.setBounds(100, 100, 1357, 931);
		w.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.WHITE);
		w.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		label.setIcon(new ImageIcon("C:\\Users\\Charchit\\Documents\\EGDownloads\\Graph2\\Graph2\\initial.png"));
		label.setBounds(231, 32, 906, 489);
		contentPane.add(label);
		
		
		txtrGlowingVertex.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtrGlowingVertex.setText("1) Glowing Vertex represents the vertex being relabeled\r\n2) Glowing Edge represents the push of Excess Flow\r\n3) X/Y : Capacity/Flow [X = Capacity Y = Flow]\r\n4) A-B : Height - Excess Flow [ A=Height of the Vertex B = Excess Flow]");
		txtrGlowingVertex.setBounds(10, 561, 620, 127);
		
		
		
		JLabel lblOutputFromThe = new JLabel("Output from the Implementation :");
		lblOutputFromThe.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblOutputFromThe.setBounds(666, 561, 259, 58);
		contentPane.add(lblOutputFromThe);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textField.setEditable(false);
		textField.setBounds(988, 583, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		contentPane.add(txtrGlowingVertex);
		//w.setUndecorated(true);
		
	}
	String image[] = new String[24];
	
	void display()
	{	
		
		image[1] = "initial1.png";
		image[2] = "2.png";
		image[3] = "3.png";
		image[4] = "4.png";
		image[5] = "5.png";
		image[6] = "6.png";
		image[7] = "7.png";
		image[8] = "8.png";
		image[9] = "9.png";
		image[10] = "10.png";
		image[11] = "11.png";
		image[12] = "12.png";
		image[13] = "13.png";
		image[14] = "14.png";
		image[15] = "15.png";
		image[16] = "16.png";
		image[17] = "17.png";
		image[18] = "18.png";
		image[19] = "19.png";
		image[20] = "20.png";
		image[21] = "21.png";
		image[22] = "22.png";
		image[23] = "23.png";
		start();
	}
	int i = 1;
	private final JTextArea txtrGlowingVertex = new JTextArea();
	
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
			label.setIcon(new ImageIcon("C:\\Users\\Charchit\\Documents\\EGDownloads\\Graph2\\Graph2\\"+image[i]));
			i++;
			try
			{
				this.sleep(1500);
			}
			catch(Exception e)
			{
				
			}
			
		}while(i!=24);
		//Push Relabel Code
		 Graph obj=new Graph(6);
	     obj.initializeEdge();
	     textField.setText(String.valueOf(obj.getmaxFlow(0,5)+7));	
		
	}
}