import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Push 
{

	 JPanel contentPane;
	 JFrame w1 = new JFrame();
	 Algo2 a = new Algo2();
	/**
	 * Launch the application.
	 */
	
	

	/**
	 * Create the frame.
	 * @wbp.parser.entryPoint
	 */
	public Push()
	{
		w1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		w1.setBounds(100, 100, 1070, 632);
		w1.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		w1.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFordFalkerson = new JLabel("Push Relabel");
		lblFordFalkerson.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblFordFalkerson.setBounds(432, 10, 426, 37);
		contentPane.add(lblFordFalkerson);
		
		JButton btnVisualize = new JButton("Visualize");
		
		btnVisualize.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				a.w.setVisible(true);
				
				a.display();
			}
		});
		btnVisualize.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVisualize.setBounds(931, 552, 115, 31);
		contentPane.add(btnVisualize);
		
		JTextArea txtrPushrelabelApproachIs = new JTextArea();
		txtrPushrelabelApproachIs.setWrapStyleWord(true);
		txtrPushrelabelApproachIs.setLineWrap(true);
		
		txtrPushrelabelApproachIs.setEditable(false);
		txtrPushrelabelApproachIs.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txtrPushrelabelApproachIs.setText("Push-Relabel approach is the more efficient than Ford-Fulkerson algorithm.\r\nThe intuition behind the push-relabel algorithm (considering a fluid flow problem) is that we consider edges as water pipes and nodes are joints. The source is considered to be at the highest level and it sends water to all adjacent nodes. Once a node has excess water, it pushes water to a smaller height node. If water gets locally trapped at a vertex, the vertex is Relabeled which means its height is increased.\r\nFollowing are some useful facts to consider before we proceed to algorithm.\r\n\r\nEach vertex has associated to it a height variable and a Excess Flow. Height is used to determine whether a vertex can push flow to an adjacent or not (A vertex can push flow only to a smaller height vertex). Excess flow is the difference of total flow coming into the vertex minus the total flow going out of the vertex.\r\n     Excess Flow of u = Total Inflow to u - \r\n                        Total Outflow from u\r\nLike Ford Fulkerson. each edge has associated to it a flow (which indicates current flow) and a capacity\r\nFollowing are abstract steps of complete algorithm.\r\n\r\nPush-Relabel Algorithm \r\n1) Initialize PreFlow : Initialize Flows and Heights \r\n\r\n2) While it is possible to perform a Push() or Relablel() on a vertex\r\n   // Or while there is a vertex that has excess flow\r\n           Do Push() or Relabel()\r\n\r\n// At this point all vertices have Excess Flow as 0 (Except source\r\n// and sink)\r\n3) Return flow.\r\n");
		txtrPushrelabelApproachIs.setBounds(10, 57, 1036, 487);
		contentPane.add(txtrPushrelabelApproachIs);
		
	}
	void v()
	{
		w1.setVisible(true);
	}

}