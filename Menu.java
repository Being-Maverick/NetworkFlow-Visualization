import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;
import javax.swing.JTextArea;

public class Menu extends JFrame {

	private JPanel contentPane;
	FordFalk ff = new FordFalk();
	Push pp = new Push();
	public static void main(String[] args) 
	{
		new Menu();
	}

	/**
	 * Create the frame.
	 */
	public Menu() 
	{
		this.setTitle("Maximum Flow Problem Algorithms");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1326, 572);
		setLocationRelativeTo(null);
		//setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnFordFalkersonAlgorithm = new JButton("Ford Fulkerson Algorithm");
		
		btnFordFalkersonAlgorithm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				ff.v();
			}
		});
		
		btnFordFalkersonAlgorithm.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		
		btnFordFalkersonAlgorithm.setBounds(1001, 462, 260, 63);
		contentPane.add(btnFordFalkersonAlgorithm);
		
		JButton btnPushrelableAlgorithm = new JButton("Push-Relable Algorithm");
		
		btnPushrelableAlgorithm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				pp.v();
			}
		});
		
		btnPushrelableAlgorithm.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		btnPushrelableAlgorithm.setBounds(31, 462, 260, 63);
		
		contentPane.add(btnPushrelableAlgorithm);
		
		JTextArea txtrInGraphTheory = new JTextArea();
		txtrInGraphTheory.setEditable(false);
		txtrInGraphTheory.setFont(new Font("Times New Roman", Font.BOLD, 24));
		txtrInGraphTheory.setText("In graph theory, a flow network is defined as a directed graph involving a source(S) and a sink(T) and several other nodes connected with edges. Each edge has an individual capacity which is the maximum limit of flow that edge could allow.\r\nFlow in the network should follow the following conditions:\r\n\u2022\tFor any non-source and non-sink node, the input flow is equal to output flow.\r\n\u2022\tFor any edge(Ei) in the network, 0\u2264flow(Ei)\u2264Capacity(Ei).\r\n\u2022\tTotal flow out of the source node is equal total to flow in to the sink node.\r\n\u2022\tNet flow in the edges follows skew symmetry i.e. F(u,v)=\u2212F(v,u) where F(u,v) is flow from node u to node v. This leads to a conclusion where you have to sum up all the flows between two nodes(either directions) to find net flow between the nodes initially.\r\nMaximum Flow:\r\nIt is defined as the maximum amount of flow that the network would allow to flow from source to sink. Multiple algorithms exist in solving the maximum flow problem. Two major algorithms to solve these kind of problems are Ford-Fulkerson algorithm and Push Relable Algorithm. \r\n");
		txtrInGraphTheory.setBounds(31, 59, 1232, 393);
		txtrInGraphTheory.setLineWrap(true);
		txtrInGraphTheory.setWrapStyleWord(true);
		contentPane.add(txtrInGraphTheory);
		
		JLabel lblMaximumFlowIn = new JLabel("Maximum Flow In a Network");
		lblMaximumFlowIn.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblMaximumFlowIn.setBounds(497, 10, 276, 40);
		contentPane.add(lblMaximumFlowIn);
		setVisible(true);
	}
}