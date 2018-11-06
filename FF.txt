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

public class FordFalk 
{

	 JPanel contentPane;
	 JFrame w1 = new JFrame();
	 Algo a = new Algo();
	/**
	 * Launch the application.
	 */
	
	

	/**
	 * Create the frame.
	 * @wbp.parser.entryPoint
	 */
	public FordFalk()
	{
		w1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		w1.setBounds(100, 100, 1070, 610);
		w1.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		w1.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFordFalkerson = new JLabel("Ford Fulkerson");
		lblFordFalkerson.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblFordFalkerson.setBounds(188, 10, 426, 32);
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
		btnVisualize.setBounds(931, 532, 115, 31);
		contentPane.add(btnVisualize);
		
		JTextArea txt = new JTextArea();
		txt.setEditable(false);
		txt.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txt.setText("\r\nInputs required are network graph , source node  and sink node .\r\n\r\nfunction: \r\nFordFulkerson(Graph G,Node S,Node T):\r\n    Initialise flow in all edges to 0\r\n    while (there exists an augmenting path(P) between S and T in residual network graph):\r\n        Augment flow between S to T along the path P\r\n        Update residual network graph\r\n    return\r\n\r\nAn augmenting path is a simple path from source to sink which do not include any cycles and that pass only through positive weighted edges. A residual network graph indicates how much more flow is allowed in each edge in the network graph. If there are no augmenting paths possible from  to , then the flow is maximum. The result i.e. the maximum flow will be the total flow out of source node which is also equal to total flow in to the sink node.\r\n\r\nAn augmenting path in residual graph can be found using DFS or BFS.\r\nUpdating residual graph includes following steps: (refer the diagrams for better understanding)\r\nFor every edge in the augmenting path, a value of minimum capacity in the path is subtracted from all the edges of that path.\r\nAn edge of equal amount is added to edges in reverse direction for every successive nodes in the augmenting path.\r\nThe complexity of Ford-Fulkerson algorithm cannot be accurately computed as it all depends on the path from source to sink.\r\nAn augmenting path in residual graph can be found using DFS or BFS.\r\nUpdating residual graph includes following steps: (refer the diagrams for better understanding)\r\nFor every edge in the augmenting path, a value of minimum capacity in the path is subtracted from all the edges of that path.\r\nAn edge of equal amount is added to edges in reverse direction for every successive nodes in the augmenting path.\r\nThe complexity of Ford-Fulkerson algorithm cannot be accurately computed as it all depends on the path from source to sink.");
		txt.setBounds(10, 42, 1036, 483);
		txt.setLineWrap(true);
		txt.setWrapStyleWord(true);
		contentPane.add(txt);
		
	}
	void v()
	{
		w1.setVisible(true);
	}
}