import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JEditorPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.RootPaneContainer;
import junit.framework.Test;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JTextArea;
import javax.swing.JTabbedPane;
import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;



@SuppressWarnings("serial")
public class Algorithms_Dijsktra_Floyd_Ford_Topological extends JFrame {

	//private Create_Circle temp_node = new Create_Circle();
	private static final int length = 100;
	private static int cnt = 0;
	private static int brand_new_cnt = 0;
	private static int new_cnt = 0;
	private static int cnt_delete_edges = 0;
	private static int other_cnt = 0;
	private SLEEP sleep;
	private Create_Circle new_circles = new Create_Circle();
	private Create_Edge new_edge = new Create_Edge();
	private Create_Circle [] node = new Create_Circle[length];
	
	private Click click = new Click();
	private Click_delete click_delete = new Click_delete();
	private Click_for_edges click_edges = new Click_for_edges();
	private Click_delete_edges click_delete_edges = new Click_delete_edges();
	private Modify_edges click_modify_edge = new Modify_edges();
	private Display_adjacency_matrix click_to_display = new Display_adjacency_matrix();
	private Add_all_edges_and_weights click_add_all_edges_and_weights = new Add_all_edges_and_weights();
	private Delete_all_edges_and_weights delete_all_edges_and_weights = new Delete_all_edges_and_weights();
	private Dijkstra dijkstra = new Dijkstra();
	
	private static int count = 0;
	private static int count_matrix_edges = 0;
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private DotList <Create_Circle> dotList = new DotList();
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private EdgeList <Create_Edge> edgeList = new EdgeList();
	private static int [] array_vertices  = new int [length];
	private static int [][] matrix_edges = new int [length][length];
	private static String [] array_visited = new String [length];
	private static boolean [] array_checked = new boolean [length];
	private static boolean function_check = true;
	private static boolean [] if_painted = new boolean [length];
	private static int [] distincte_weigths_array = new int [length];
	private static int distincte_count = 0;
	private static int distincte_countng = 1;
	private static int vertexA = -404, vertexB = -404;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static HashMap <Integer, String> map_for_X = new HashMap();
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static HashMap <Integer, String> map_for_Y = new HashMap();
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static HashMap <Integer, String> map_for_2X = new HashMap();
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static HashMap <Integer, String> map_for_2Y = new HashMap();
	private static int count_map_X = 1;
	private static int [] hold_deleted_edges = new int [length];
	private static int count_delete_edges = 0;
	
	private int [] array_x1 = new int [length];
	private int [] array_y1 = new int [length];
	private int [] array_x2 = new int [length];
	private int [] array_y2 = new int [length];
	private static int count_x1 = 0;
	private static int count_y1 = 0;
	private static int count_x2 = 0;
	private static int count_y2 = 0;
	
	private static boolean [] check_visited_x1 = new boolean [length];
	private static boolean [] check_visited_y1 = new boolean [length];
	private static boolean [] check_visited_x2 = new boolean [length];
	private static boolean [] check_visited_y2 = new boolean [length];
	private static int check_pair_count = 0;
	
	
	private static boolean found_weight = false;
	private int [] array_values  = new int [length];
	private static int iterate = 0;
	private int [] position_columns = new int [length];
	private static boolean check_function = false;
	private static String [] pair_coordinates_num1 = new String [length];
	private static String [] pair_coordinates_num2 = new String [length];
	private static int go_num1;
	private static int go_num2;
	String [] split_num1;
	String [] split_num2;
	private static int only_once_display_frame = 0;
	
	
	private JRadioButton button_insert_vertex = new JRadioButton("Insert vertex");
	private JRadioButton button_insert_edge = new JRadioButton("Insert edge");
	private JRadioButton button_delete_vertex = new JRadioButton("Delete vertex");
	private JRadioButton button_deleted_edge = new JRadioButton("Delete edge");
	private JRadioButton button_modify_weight = new JRadioButton("Modify weight");
	private JRadioButton button_display_graph = new JRadioButton("Display graph");
	private JRadioButton button_add_all_edges_and_weights = new JRadioButton("Add all edges");
	private JRadioButton button_delete_all_edges_with_weights = new JRadioButton("Del all edges");
	
	private JLabel label = new JLabel();
	private ButtonGroup button_group = new ButtonGroup();
	private Panel_for_dots panel_for_dots = new Panel_for_dots();
	private JTextField read_insert_vertex;
	private JTextField read_delete_vertex;
	private JTextField read_weight_to_modify;
	private JFrame frame;
	private JTextField read_edge;
	private JTextField display_graph;
	private JTextField delete_edge;
	private JTextField read_all_edges;
	private JTextField delete_all_edges_with_weights;
	
	
	private JFrame frame_display_matrix;
	private static int global_x = 0;
	private static int global_y = 0;
	private static int counter1 = 0;
	private static int counter2 = 0;
	private static int next_line = 0;
	private static int next_line_row = 0;
	private static int static_var = 0;
	
	private JFrame help_frame;
	private JTextArea help_label;
	private JLabel help_top_left;
	private JLabel help_Darie_creator_label;
	
	private JPanel panel;
	
	private JButton press_dijkstra;
	private JButton press_floyd;
	private JButton press_topological;
	private JButton press_ford;
	private JButton press_help;
	
	private String [] array_coordx = new String[length];
	private String [] array_coordy = new String[length];
	private static int [] array_weights = new int [length];
	private static int pair = 0;
	private static int v = 0;
	private static int [] array_pair = new int [length];
	private static int [] array_not_pair = new int [length];
	private static int iter1 = 0;
	private static int iter2 = 0;
	private static int count_edges_arr1 = 0;
	private static int count_edges_arr2 = 0;
	private static int count_Arr1AndArr2 = 0;
	private static int starting_vertex = -404;
	private static final int num_algorithms = 4;
	private int [] time_array = new int [num_algorithms];
	private static int next_time = 0;
	private static int clicked = 0;
	
	 
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Algorithms_Dijsktra_Floyd_Ford_Topological window = new Algorithms_Dijsktra_Floyd_Ford_Topological();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Algorithms_Dijsktra_Floyd_Ford_Topological () {
		initialize();
	}
	
	
	void Function_init_arrays() {	
		for(int i=0;i<length;i++) {
			array_pair[i] = -1;
			array_not_pair[i] = -1;
			array_weights[i] = -1;
			array_coordx[i] = "";
			array_coordy[i] = "";
			array_values[i] = -1;
			position_columns[i] = -1;
			distincte_weigths_array[i] = 0;
			array_visited[i] = "F";
			array_checked[i] = false;
			if_painted[i] = false;
			array_vertices[i] = -1;
			hold_deleted_edges[i] = -1;
			array_x1[i] = -1;
			array_x2[i] = -1;
			array_y1[i] = -1;
			array_y2[i] = -1;
			check_visited_x1[i] = false;
			check_visited_x2[i] = false;
			check_visited_y1[i] = false;
			check_visited_y2[i] = false;
		}
		
		for(int i=0;i<length;i++) {
			for(int j=0;j<length;j++) {
				matrix_edges[i][j] = -1;
			}
		}
	}
	
	
	private void initialize() {
		
		if(function_check == true) {
			Function_init_arrays();
			function_check = false;
		}

		frame = new JFrame("Glanda Darie Teofil PS1");
		frame.setBounds(100, 100, 716, 767);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	
		frame.getContentPane().add(panel_for_dots);
		
		
		press_dijkstra = new JButton("Dijkstra");
		press_dijkstra.setForeground(Color.BLACK);
		press_dijkstra.setFont(new Font("Tahoma", Font.PLAIN, 14));
		press_dijkstra.setBackground(Color.LIGHT_GRAY);
		press_dijkstra.setBounds(27, 450, 179, 50);
		press_dijkstra.setFocusable(false);
		frame.getContentPane().add(press_dijkstra);
		
		press_floyd = new JButton("Floyd Warshall");
		press_floyd.setForeground(Color.BLACK);
		press_floyd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		press_floyd.setBackground(Color.LIGHT_GRAY);
		press_floyd.setBounds(27, 499, 179, 50);
		press_floyd.setFocusable(false);
		frame.getContentPane().add(press_floyd);
		
		press_topological = new JButton("Topological Search");
		press_topological.setForeground(Color.BLACK);
		press_topological.setFont(new Font("Tahoma", Font.PLAIN, 14));
		press_topological.setBackground(Color.LIGHT_GRAY);
		press_topological.setBounds(27, 547, 179, 50);
		press_topological.setFocusable(false);
		frame.getContentPane().add(press_topological);
		
		press_ford = new JButton("Bellman Ford");
		press_ford.setForeground(Color.BLACK);
		press_ford.setFont(new Font("Tahoma", Font.PLAIN, 14));
		press_ford.setBackground(Color.LIGHT_GRAY);
		press_ford.setBounds(27, 596, 179, 50);
		press_ford.setFocusable(false);
		frame.getContentPane().add(press_ford);
		
		
		
		//INSERT VERTEX WHEN CLICKED
		button_insert_vertex.addActionListener(new ActionListener() {
			 @Override	
			 public void actionPerformed(ActionEvent e) {
				    setLabel_insert_vertex(Color.blue,"Click inside the panel to create vertices!");
				    panel_for_dots.removeMouseListener(click_delete);
					panel_for_dots.removeMouseListener(click_delete_edges);
					panel_for_dots.removeMouseListener(click_edges);
					panel_for_dots.removeMouseListener(click_modify_edge);
					panel_for_dots.removeMouseListener(click_to_display);
					panel_for_dots.removeMouseListener(click_add_all_edges_and_weights);
					panel_for_dots.removeMouseListener(delete_all_edges_and_weights);
					panel_for_dots.removeMouseListener(dijkstra);
				    panel_for_dots.addMouseListener(click);
				}
			 });
		
		//DELETE VERTEX WHEN CLICKED
		button_delete_vertex.addActionListener(new ActionListener() {
			@Override	
			public void actionPerformed(ActionEvent e) {
				setLabel_delete_vertex(Color.blue,"Click inside the panel to delete vertices!");
				panel_for_dots.removeMouseListener(click);
				panel_for_dots.removeMouseListener(click_delete_edges);
				panel_for_dots.removeMouseListener(click_edges);
				panel_for_dots.removeMouseListener(click_modify_edge);
				panel_for_dots.removeMouseListener(click_to_display);
				panel_for_dots.removeMouseListener(click_add_all_edges_and_weights);
				panel_for_dots.removeMouseListener(delete_all_edges_and_weights);
				panel_for_dots.removeMouseListener(dijkstra);
				panel_for_dots.addMouseListener(click_delete);
			}
		});
		
		//INSERT EDGE WHEN CLICKED 
		button_insert_edge.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setLabel_insert_edge(Color.blue,"Click inside the panel on vertexA to insert edge!");
				panel_for_dots.removeMouseListener(click);
				panel_for_dots.removeMouseListener(click_delete);
				panel_for_dots.removeMouseListener(click_delete_edges);
				panel_for_dots.removeMouseListener(click_modify_edge);
				panel_for_dots.removeMouseListener(click_to_display);
				panel_for_dots.removeMouseListener(click_add_all_edges_and_weights);
				panel_for_dots.removeMouseListener(delete_all_edges_and_weights);
				panel_for_dots.removeMouseListener(dijkstra);
				panel_for_dots.addMouseListener(click_edges);
			}
		});
		
		
		//DELETE EDGE WHEN CLICKED
		button_deleted_edge.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setLabel_delete_edge(Color.blue,"Click on vertexA to delete edge!");
				panel_for_dots.removeMouseListener(click);
				panel_for_dots.removeMouseListener(click_delete);
				panel_for_dots.removeMouseListener(click_edges);
				panel_for_dots.removeMouseListener(click_modify_edge);
				panel_for_dots.removeMouseListener(click_to_display);
				panel_for_dots.removeMouseListener(click_add_all_edges_and_weights);
				panel_for_dots.removeMouseListener(delete_all_edges_and_weights);
				panel_for_dots.removeMouseListener(dijkstra);
				panel_for_dots.addMouseListener(click_delete_edges);
			}
		});
		
		//MODIFY WEIGHT WHEN CLICKED
		button_modify_weight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setLabel_delete_edge(Color.blue,"Click to modify weight!");
				panel_for_dots.removeMouseListener(click);
				panel_for_dots.removeMouseListener(click_delete);
				panel_for_dots.removeMouseListener(click_edges);
				panel_for_dots.removeMouseListener(click_delete_edges);
				panel_for_dots.removeMouseListener(click_to_display);
				panel_for_dots.removeMouseListener(click_add_all_edges_and_weights);
				panel_for_dots.removeMouseListener(delete_all_edges_and_weights);
				panel_for_dots.removeMouseListener(dijkstra);
				panel_for_dots.addMouseListener(click_modify_edge);
			}
		});
		
		//DISPLAY GRAPH WHEN CLICKED
		button_display_graph.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				setLabel_display_graph(Color.blue,"Click yes if you want to display the matrix!");
				panel_for_dots.removeMouseListener(click);
				panel_for_dots.removeMouseListener(click_delete);
				panel_for_dots.removeMouseListener(click_edges);
				panel_for_dots.removeMouseListener(click_delete_edges);
				panel_for_dots.removeMouseListener(click_modify_edge);
				panel_for_dots.removeMouseListener(click_add_all_edges_and_weights);
				panel_for_dots.removeMouseListener(delete_all_edges_and_weights);
				panel_for_dots.removeMouseListener(dijkstra);
				panel_for_dots.addMouseListener(click_to_display);
			}
		});
		
		//ADD ALL EDGES AND WEIGHTS WHEN CLICKED
		button_add_all_edges_and_weights.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setLabel_add_all_weights(Color.blue,"Click yes if you want to add all the edges and weights!");
				panel_for_dots.removeMouseListener(click);
				panel_for_dots.removeMouseListener(click_delete);
				panel_for_dots.removeMouseListener(click_edges);
				panel_for_dots.removeMouseListener(click_delete_edges);
				panel_for_dots.removeMouseListener(click_modify_edge);
				panel_for_dots.removeMouseListener(click_to_display);
				panel_for_dots.removeMouseListener(delete_all_edges_and_weights);
				panel_for_dots.removeMouseListener(dijkstra);
				panel_for_dots.addMouseListener(click_add_all_edges_and_weights);
			}
		});
		
		//DELETE ALL EDGES AND WEIGHTS WHEN CLICKED
		button_delete_all_edges_with_weights.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setLabel_delete_all_edges_and_weights(Color.blue, "Click yes if you want to delete all the edges and weights!");
				panel_for_dots.removeMouseListener(click);
				panel_for_dots.removeMouseListener(click_delete);
				panel_for_dots.removeMouseListener(click_edges);
				panel_for_dots.removeMouseListener(click_delete_edges);
				panel_for_dots.removeMouseListener(click_modify_edge);
				panel_for_dots.removeMouseListener(click_to_display);
				panel_for_dots.removeMouseListener(click_add_all_edges_and_weights);
				panel_for_dots.removeMouseListener(dijkstra);
				panel_for_dots.addMouseListener(delete_all_edges_and_weights);
			}
		});
		
		
		press_dijkstra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setLabel_dijkstra(Color.blue, "Give us the vertex you want to perform Dijkstra's algorithm with!");
				panel_for_dots.removeMouseListener(click);
				panel_for_dots.removeMouseListener(click_delete);
				panel_for_dots.removeMouseListener(click_edges);
				panel_for_dots.removeMouseListener(click_delete_edges);
				panel_for_dots.removeMouseListener(click_modify_edge);
				panel_for_dots.removeMouseListener(click_to_display);
				panel_for_dots.removeMouseListener(click_add_all_edges_and_weights);
				panel_for_dots.removeMouseListener(delete_all_edges_and_weights);
				panel_for_dots.addMouseListener(dijkstra);
			}
		});
		

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(244, 57, 412, 589);
		frame.getContentPane().add(panel);
		
		
		button_insert_vertex.setForeground(Color.BLACK);
		button_insert_vertex.setFont(new Font("Tahoma", Font.ITALIC, 16));
		button_insert_vertex.setBounds(6, 34, 118, 21);
		frame.getContentPane().add(button_insert_vertex);
		
		
		button_insert_edge.setForeground(Color.BLACK);
		button_insert_edge.setFont(new Font("Tahoma", Font.ITALIC, 16));
		button_insert_edge.setBounds(6, 111, 107, 21);
		frame.getContentPane().add(button_insert_edge);
		
		
		button_delete_vertex.setFont(new Font("Tahoma", Font.ITALIC, 16));
		button_delete_vertex.setBounds(6, 71, 124, 21);
		frame.getContentPane().add(button_delete_vertex);
		
		
		button_deleted_edge.setFont(new Font("Tahoma", Font.ITALIC, 16));
		button_deleted_edge.setBounds(6, 156, 118, 21);
		frame.getContentPane().add(button_deleted_edge);
		

		button_modify_weight.setFont(new Font("Tahoma", Font.ITALIC, 16));
		button_modify_weight.setBounds(6, 202, 130, 21);
		frame.getContentPane().add(button_modify_weight);
		
		button_add_all_edges_and_weights.setFont(new Font("Tahoma", Font.ITALIC, 16));
		button_add_all_edges_and_weights.setBounds(6,248, 124, 21);
		frame.getContentPane().add(button_add_all_edges_and_weights);
		
		button_delete_all_edges_with_weights.setFont(new Font("Tahoma", Font.ITALIC, 16));
		button_delete_all_edges_with_weights.setBounds(6, 292, 124, 21);
		frame.getContentPane().add(button_delete_all_edges_with_weights);
		
		button_display_graph.setFont(new Font("Tahoma", Font.ITALIC, 16));
		button_display_graph.setBounds(6, (296+42), 124, 21);
		frame.getContentPane().add(button_display_graph);
		
		//button group pentru a nu putea pune de 2 ori same thing in RadioBox
		button_group.add(button_insert_vertex);
		button_group.add(button_insert_edge);
		button_group.add(button_delete_vertex);
		button_group.add(button_deleted_edge);
		button_group.add(button_modify_weight);
		button_group.add(button_display_graph);
		button_group.add(button_add_all_edges_and_weights);
		button_group.add(button_delete_all_edges_with_weights);
		button_group.add(press_dijkstra);
		
		//ca sa nu apara liniia aia jos cand alegem in RadioBox
		button_insert_vertex.setFocusable(false);
		button_insert_edge.setFocusable(false);
		button_delete_vertex.setFocusable(false);
		button_deleted_edge.setFocusable(false);
		button_modify_weight.setFocusable(false);
		button_display_graph.setFocusable(false);
		button_add_all_edges_and_weights.setFocusable(false);
		button_delete_all_edges_with_weights.setFocusable(false);
		
		
		press_help = new JButton("Help");
		press_help.setBackground(Color.LIGHT_GRAY);
		press_help.setFont(new Font("Tahoma", Font.PLAIN, 14));
		press_help.setForeground(Color.BLACK);
		press_help.setBounds(574, 675, 118, 45);
		press_help.setFocusable(false);
		frame.getContentPane().add(press_help);
		
		JLabel screen_for_displaying_label = new JLabel("Screen for displaying");
		screen_for_displaying_label.setFont(new Font("Tahoma", Font.BOLD, 20));
		screen_for_displaying_label.setBounds(358, 16, 221, 21);
		frame.getContentPane().add(screen_for_displaying_label);
		
		read_insert_vertex = new JTextField();
		read_insert_vertex.setBackground(new Color(255, 255, 255));
		read_insert_vertex.setBounds(136, 37, 37, 19);
		frame.getContentPane().add(read_insert_vertex);
		read_insert_vertex.setColumns(10);
		
		read_delete_vertex = new JTextField();
		read_delete_vertex.setColumns(10);
		read_delete_vertex.setBounds(136, 74, 37, 19);
		frame.getContentPane().add(read_delete_vertex);
		
		read_weight_to_modify = new JTextField();
		read_weight_to_modify.setColumns(10);
		read_weight_to_modify.setBounds(136, 205, 37, 19);
		frame.getContentPane().add(read_weight_to_modify);
		
		read_edge = new JTextField();
		read_edge.setColumns(10);
		read_edge.setBounds(136, 114, 37, 19);
		frame.getContentPane().add(read_edge);
		
		delete_edge = new JTextField();
		delete_edge.setColumns(10);
		delete_edge.setBounds(136, 159, 37, 19);
		frame.getContentPane().add(delete_edge);
		
		read_all_edges = new JTextField();
		read_all_edges.setColumns(10);
		read_all_edges.setBounds(136, 251, 37, 19);
		frame.getContentPane().add(read_all_edges);
		
		delete_all_edges_with_weights = new JTextField();
		delete_all_edges_with_weights.setColumns(10);
		delete_all_edges_with_weights.setBounds(136, 295, 37, 19);
		frame.getContentPane().add(delete_all_edges_with_weights);
		
		display_graph = new JTextField();
		display_graph.setBounds(136, (299+42), 37, 19);
		frame.getContentPane().add(display_graph);
		display_graph.setColumns(10);
		
		
		press_help.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SLEEP new_sleep = new SLEEP(1000);
				new_sleep.method_sleep();
				help_frame = new JFrame("HELP");
				help_frame.setVisible(true);
				help_frame.setSize(720,830);
				help_frame.getContentPane().setLayout(null);
				help_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				help_frame.getContentPane().setBackground(Color.white);
				
				int num_of_lines = 34;
				JLabel [] decor_label = new JLabel[num_of_lines];
				
				int veclocity_x = 0;
				
				for(int i=0;i<num_of_lines;++i) {
					decor_label[i] =  new JLabel("-");
					decor_label[i].setBounds(veclocity_x+10, 0, 550, 21);
					decor_label[i].setForeground(Color.red);
					veclocity_x += 4;
					help_frame.add(decor_label[i]);
				}
				help_top_left = new JLabel("Information!");
				help_top_left.setFont(new Font("Tahoma", Font.TYPE1_FONT, 20));
				help_top_left.setBounds(10, 20, 550, 21);
				help_top_left.setForeground(Color.red);
				help_frame.add(help_top_left);
				
				veclocity_x = 0;
				
				for(int i=0;i<num_of_lines;++i) {
					decor_label[i] =  new JLabel("-");
					decor_label[i].setBounds(veclocity_x+10, 40, 550, 21);
					decor_label[i].setForeground(Color.red);
					veclocity_x += 4;
					help_frame.add(decor_label[i]);
				}
				
				Panel help_panel = new Panel();
				help_panel.setSize(frame.getSize());
				help_panel.setBackground(Color.WHITE);
				
				help_label = new JTextArea();
				help_label.setEditable(false);
				help_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
				help_label.setForeground(Color.gray);
				help_label.setBounds(10, 300, 550, 21);
				
				ImageIcon imageIcon = new ImageIcon("C:\\Users\\darie\\eclipse-workspace\\Glanda_Darie_Teofil_proiect_PS1_JAVA\\src\\gif_for_aniamtion.gif");
				help_Darie_creator_label = new JLabel(imageIcon);
				help_Darie_creator_label.setBounds(410, 20, 150, 40);
				
				help_panel.add(help_Darie_creator_label);
				help_panel.add(help_label);
				
				
				help_label.setText("\n\n\n\n"
						+"<><><><><><><><><><><><><><><><><><><><><><><><><><><><>\n\n"
						+ "1)  Insert vertex - put a numerical value inside the TextFeild and click on the panel \n"
						+ "     to add vertices.\n\n"
						+ "2)  Delete vertex - put the value in the TextField that you want to delete and after \n"
						+ "     click on the panel to delete the vertex.\n\n"
						+ "3)  Insert edge - add the weight in the textField, then click on node A and node B inside \n"
						+ "     the panel to display an edge and his weight.\n\n"
						+ "4)  Delete edge - add weight you want to delete in the textField, afterwards click on node \n"
						+ "     A and node B inside the panel to delete the respective weight.\n\n"
						+ "5)  Modify weight - add the weight in the textField that you want to change it with and then \n"
						+ "     after click on the weight value inside the panel to make the change of the edge happen.\n\n"
						+ "6)  Display graph - in the textField type yes/YES and afterwards click on the panel to display \n"
						+ "     the adjacency matrix.\n\n"
						+ "7)  Add all edges - in the textField type yes/YES and afterwards click on the panel to display \n"
						+ "     the new edges with new weights (weights are from 1,2,3,...n). \n\n"
						+ "8)  Delete all edges - in the textField type yes/YES and afterwards click on the panel to display \n"
						+ "     all the nodes after the deletation.\n\n"
						+ "<><><><><><><><><><><><><><><><><><><><><><><><><><><><>\n\n"
						+ "A.  Dijkstra's algorithm - press the button 'Dijkstra' to display the shortest path inside the\n"
						+ "     panel and the value array/matrix.\n\n"
						+ "B.  FLoyd Warshall's algorithm - press the button 'Floyd Warshall' to display the shortest\n"
						+ "     path with self loop.\n\n"
						+ "C.  Topological Search - press the button 'Topological Search' to display the shortest path\n"
						+ "     inside the panel and the value array/matrix.\n\n"
						+ "D.  Bellman Ford's algorithm - press the button 'Bellman Ford' to display the shortest path\n"
						+ "     inside the panel and the value array/matrix.\n\n"
						+ "<><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
				
				help_frame.add(help_panel);
				help_frame.add(help_Darie_creator_label);
		}
	});
}
	
public void Color_Default() {
	for(int i=0;i<dotList.size();i++) {
		dotList.get(i).setColor(Color.black);
	}
}

public void Edge_Default() {
	for(int i=0;i<edgeList.size();i++) {
		edgeList.get(i).setColor(Color.black);
	}
}
	
		
protected class ClickListener1 extends MouseAdapter {
	ClickListener1() {
		super();
	}
	public void mouseClicked(MouseEvent e) {
		int x = e.getX()+15/2;
		int y = e.getY()+15/2;
		node[other_cnt] = new Create_Circle();
		node[other_cnt].setColor(Color.black);
		node[other_cnt].setX(x);
		node[other_cnt].setY(y);
		dotList.add(node[other_cnt]);
		other_cnt++;
		repaint();
	}
}
	
	
protected class DotList <Create_circle> {
	@SuppressWarnings("unused")
	private ArrayList<Create_circle> dotList;
	public DotList() {
		dotList = new ArrayList<>();
	}
	public void add(Create_circle dot) {
		dotList.add(dot);
	}
	
	public void delete(int index) {
		dotList.remove(index);
	}
	
	public int size() {
		return dotList.size();
	}
	
	public Create_circle get(int i) {
		return dotList.get(i);
	}
	
	public ArrayList <Create_circle> getList() {
		return dotList;
	}
	public Iterator<Create_circle> iterator() {
		ArrayList <Create_circle> list = new ArrayList<>();
		for(int i=0;i<dotList.size();i++) {
			list.add(dotList.get(i));
		}
		return list.iterator();
	}
}
	

protected class Create_Circle {
	private int x;
	private int y;
	private int diameter;
	private Color color;
	private String vertex;
	
	public Create_Circle() {
		this.x = 0;
		this.y = 0;
	}
	
	public Create_Circle(int x, int y, int diameter, Color color, String vertex) {
		this.x = x;
		this.y = y;
		this.diameter = diameter;
		this.color = color;
		this.vertex = vertex;
	}
	
	
	public String getVertex() {
		return vertex;
	}
	
	public int getVertexInt() {
		int vertex_int = Integer.parseInt(vertex);
		return vertex_int;
	}
	
	public int getDiameter() {
		return diameter;
	}
	
	public void setVertex(String new_vertex) {
		vertex = new_vertex;
	}
	
	public void setColor(Color c) {
		this.color = c;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public String getColor() {
		return color.toString();
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void DRAW(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(color);
		//GradientPaint grad_paint = new GradientPaint(300, 400, Color.black, 300, 200, Color.black);
		//g2.setPaint(grad_paint);
		g2.fillOval(x, y, diameter, diameter);
		g2.drawString(this.getVertex(), x-4, y);
	}
}



@SuppressWarnings("hiding")
protected class EdgeList <Create_Edge> {
	@SuppressWarnings("unused")
	private ArrayList <Create_Edge> edgeList;
	
	public EdgeList() {
		edgeList = new ArrayList<>();
	}
	
	public void add(Create_Edge add_edge) {
		edgeList.add(add_edge);
	}
	
	public void add_new(int position, Create_Edge add_edge) {
		edgeList.add(position, add_edge);
	}
	
	public void delete(int index) {
		edgeList.remove(index);
	}
	
	public Create_Edge get(int i) {
		return edgeList.get(i);
	}
	
	public ArrayList <Create_Edge> getList() {
		return edgeList;
	}
	
	public int index(int position_vertex) {
		return edgeList.indexOf(position_vertex);
	}
	
	public int position(Create_Edge add_edge) {
		return edgeList.indexOf(add_edge);
	}
	
	public int size() {
		return edgeList.size();
	}
}



protected class Create_Edge {
	private int x1, x2, y1, y2;
	private int weight;
	Create_Circle vertexA;
	Create_Circle vertexB;
	Color color;
	Create_Circle some_new_circles;
	int int_vertexA, int_vertexB;
	
	public Create_Edge() {
		x1 = 0; x2 = 0; y1 = 0; y2 = 0;
		some_new_circles = new Create_Circle();
	}
	
	public Create_Edge(int int_vertexA, int int_vertexB, int weight, Color color) { 
		this.int_vertexA = int_vertexA;
		this.int_vertexB = int_vertexB;
		this.weight = weight;
		this.color = color;
	}
	
	public Create_Edge(Create_Circle vertexA_, Create_Circle vertexB_, int int_vertexA, int int_vertexB, int weight, Color color) {
		this.int_vertexA = int_vertexA;
		this.int_vertexB = int_vertexB;
		this.weight = weight;
		this.color = color;
		x1 = vertexA_.getX() + (15-11);
		x2 = vertexB_.getX() + (15-11);
		y1 = vertexA_.getY() + (15-11);
		y2 = vertexB_.getY() + (15-11);
	}
	
	public Create_Edge(Create_Circle vertexA_, Create_Circle vertexB_, int weight) {
		x1 = vertexA_.getX() + (15-11);
		x2 = vertexB_.getX() + (15-11);
		y1 = vertexA_.getY() + (15-11);
		y2 = vertexB_.getY() + (15-11);
		this.weight = weight;
	}
	
	public int getVertexA() {
		return int_vertexA;
	}
	
	public int getVertexB() {
		return int_vertexB; 
	}
	
	public void setVertexA(int int_vertexA) {
		this.int_vertexA = int_vertexA;
	}
	
	public void setVertexB(int int_vertexB) {
		this.int_vertexB = int_vertexB;
	}
	
	public int getX() {
		return vertexA.getX();
	}
	
	public int getY() {
		return vertexB.getY();
	}
	
	public void setEdge(Create_Circle vertexA, Create_Circle vertexB) {
		x1 = vertexA.getX() + (15-11);
		x2 = vertexB.getX() + (15-11);
		y1 = vertexA.getY() + (15-11);
		y2 = vertexB.getY() + (15-11);
	}
	
	public void setA(Create_Circle vertexA) {
		x1 = vertexA.getX() + (15-11);
		y1 = vertexA.getY() + (15-11);
	}
	
	public void setB(Create_Circle vertexB) {
		x2 = vertexB.getX() + (15-11);
		y2 = vertexB.getY() + (15-11);
	}
	
	public boolean distincte_weights(int new_weight) {
		for(int i=0;i<distincte_countng;i++) {
			if(distincte_weigths_array[i] == new_weight && (i % 2 == 0) && array_checked[i] == false) {
				return false;
			}
			array_checked[i] = true;
		}
		
		if(brand_new_cnt % 2 == 0) {
			distincte_weigths_array[distincte_count] = new_weight;
			distincte_count += 2;
		}
		distincte_countng += 1;
		brand_new_cnt += 1;
		return true;
	}
	
	public void numbers_added(int weight) {
		array_values[iterate] = weight;
		iterate += 1;
	}
	
	public void setColor(Color c) {
		this.color = c;
	}
	
	public int getWeight(int new_weight) {
		this.weight = new_weight;
		return weight;
	}
	
	public int getWeight2() {
		return weight;
	}
	
	public void setWeight(int new_weight) {
		weight = new_weight;
	}
	
	//CHECK DACA EXISTA PE PANEL VERTEX_A SI VERTEX_B
	public boolean existsA() {
		return (x1 > 0 && y1 > 0);
	}
	
	public boolean existsB() {
		return (x2 > 0 && y2 > 0);
	}
	
	public int returnMiddle_x() {
		int middle_x = (int) ((x1+x2)/2);
		return middle_x;
	}
	
	public int returnMiddle_y() {
		int middle_y = (int) ((y1+y2)/2);
		return middle_y;
	}
	
	public int return_x1() {
		return x1;
	}
	
	public int return_x2() {
		return x2;
	}
	
	public int return_y1() {
		return y1;
	}
	
	public int return_y2() {
		return y2;
	}
	
	public void remove(int position) {
		edgeList.delete(position);
	}
	
	public int getPosition(int element_weight) {
		for(int i=0;i<edgeList.size();++i) {
			if(element_weight == edgeList.get(i).getWeight2()) {
				return i;
			}
		}
		return -404;
	}
	
	public boolean equal(int x,int y) {
		int c = ((y)-y1)*(x2-x1);
		int d = (y2-y1)*((x)-x1);
		if((c > d-20) && (c < d+20)) { 
			return true;
		} else { 
			return false;
		}
	}
	
	public boolean checkEdge(int x, int y) {
		int i,a,b;
		if(this.equal(x,y)) return true;
		for(i=1;i<=20;i++) {
			a = x; b= y+i;
			if(this.equal(a,b)) return true;
			a = x; b = y-i;
			if(this.equal(a,b)) return true;
			a = x-i;b = y;
			if(this.equal(a,b)) return true;
			a = x+i;b = y;
			if(this.equal(a,b)) return true;
			a = x+i;b = y+i;
			if(this.equal(a,b)) return true;
			a = x-i;b = y-i;
			if(this.equal(a,b)) return true;
			a = x+i;b = y-i;
			if(this.equal(a,b)) return true;
			a = x-i;b = y+i;
			if(this.equal(a,b)) return true;
		}
		if(i>=10) {
			return false;
		}
		else return true;	
	}
	
	public void DRAW(Graphics g) {
		int middle_x = (int) ((x1+x2)/2);
		int middle_y = (int) ((y1+y2)/2);
		g.setColor(Color.black);
		g.drawString(String.valueOf(weight), middle_x, middle_y);
		g.setColor(color);
		g.drawLine(x1, y1, x2, y2);
	}
}



public void setLabel_insert_vertex(Color c,String message) { 
	label.setBounds(350,670,300,30);
	label.setBackground(Color.blue);
	panel_for_dots.add(label);
	label.setForeground(c);
	label.setText(message);
}

public void setLabel_delete_vertex(Color c, String message) {
	label.setBounds(350,670,300,30);
	label.setBackground(Color.blue);
	panel_for_dots.add(label);
	label.setForeground(c);
	label.setText(message);
}

public void setLabel_delete_edge(Color c, String message) {
	label.setBounds(350,670,300,30);
	label.setBackground(Color.blue);
	panel_for_dots.add(label);
	label.setForeground(c);
	label.setText(message);
}

public void setLabel_insert_edge(Color c, String message) {
	label.setBounds(350,670,300,30);
	label.setBackground(Color.blue);
	panel_for_dots.add(label);
	label.setForeground(c);
	label.setText(message);
}

public void setLabel_display_graph(Color c, String message) {
	label.setBounds(350,670,300,30);
	label.setBackground(Color.blue);
	panel_for_dots.add(label);
	label.setForeground(c);
	label.setText(message);
}

public void setLabel_add_all_weights(Color c, String message) {
	label.setBounds(350,670,300,30);
	label.setBackground(Color.blue);
	panel_for_dots.add(label);
	label.setForeground(c);
	label.setText(message);
}

public void setLabel_delete_all_edges_and_weights(Color c, String message) {
	label.setBounds(350,670,300,30);
	label.setBackground(Color.blue);
	panel_for_dots.add(label);
	label.setForeground(c);
	label.setText(message);
}

public void setLabel_dijkstra(Color c, String message) {
	label.setBounds(350,670,300,30);
	label.setBackground(Color.blue);
	panel_for_dots.add(label);
	label.setForeground(c);
	label.setText(message);
}



//INSERT VERTICES
protected class Click extends MouseAdapter {
	public Click() {
		super();
	}

	public void mouseClicked(MouseEvent e) {
		String string_vertex = read_insert_vertex.getText();
		node[cnt] = new Create_Circle(e.getX()-15/2, e.getY()-15/2, 15, Color.black, string_vertex);
		int vertex = Integer.parseInt(string_vertex);
		panel_for_dots.SEE_IF_GRAPH_IS_FULL();
		panel_for_dots.INSERT_DOTS(node[cnt],vertex);
		if(check_function == false) {
			return;
		}
		cnt += 1;
		for(int i=0;i<count_map_X;i++) {
			map_for_X.put(vertex, String.valueOf(+e.getX()-15/2));
			map_for_Y.put(vertex, String.valueOf(+e.getY()-15/2));
			map_for_2X.put(vertex,String.valueOf(+e.getX()-15/2));
			map_for_2Y.put(vertex,String.valueOf(+e.getY()-15/2));
		}
		array_x1[count_x1] = e.getX();
		array_y1[count_y1] = e.getY();
		array_x2[count_x2] = e.getX();
		array_y2[count_y2] = e.getY();
		
		count_x1 += 1;
		count_y1 += 1;
		count_x2 += 1;
		count_y2 += 1;
		read_insert_vertex.setText("");
		repaint();
	}
}

//INSERT EDGES
protected class Click_for_edges extends MouseAdapter {
	private int i = 0;
	public Click_for_edges() {
		super();
	}
	
	@SuppressWarnings("rawtypes")
	public void mouseClicked(MouseEvent e) {
		int value_x1 = -404, value_y1 = -404;
		int value_x2 = -404, value_y2 = -404;
		
		String hold_weight = read_edge.getText();
		int new_int = Integer.parseInt(hold_weight);
		
		new_edge.setWeight(new_int);
		new_edge.numbers_added(new_int); //adds in the array the values that we use for deletation afterwards
		
		if(check_pair_count % 2 == 0) {
			for(int i=0;i<count_delete_edges+1;i++) {
				if(hold_deleted_edges[i] == -1) {
					hold_deleted_edges[i] = new_int;
					break;
				}
			}
			count_delete_edges += 1; 
		}
		check_pair_count += 1;
		
		//ARRAY-UL CARE TINE WEIGHTS
		//---------------------------
		if(pair % 2 == 0) {
			array_weights[v] = new_int; 
			v += 1;
		}
		pair += 1;
		//---------------------------
		
		int x = e.getX()+15/2;
		int y = e.getY()+15/2;
		
		try {
			if(String.valueOf(read_edge.getText()) == "" || String.valueOf(read_edge.getText()) == " ") {
				JOptionPane.showMessageDialog(null, "Can't add edges","ERROR 404", JOptionPane.ERROR_MESSAGE);
				return;
				} 	
			} catch (Exception NumberFormatException) {
				JOptionPane.showMessageDialog(null, "Edge does not exist!","ERROR 404", JOptionPane.ERROR_MESSAGE);
		}
		
		
		for(i=0;i<dotList.size();i++) {
			int some_x = dotList.get(i).getX() + 15/2;
			int some_y = dotList.get(i).getY() + 15/2;
			
			if(new_cnt == 0) {
				setLabel_insert_edge(Color.blue,"Click inside the panel on vertexA to insert edge!");
				new_cnt += 1;
			}
			
				if((( x <= some_x + 11) && (x >= some_x - 11)) && ((y <= some_y + 11) && (y >= some_y - 11))) { //verificam sa vedem daca am gasit cordonatele
					dotList.get(i).setColor(Color.blue);
					setLabel_insert_edge(Color.blue,"Click inside the panel on vertexB to insert edge!");
					repaint();
				
				if(new_edge.existsA() == true) {
					String string_value_x1 =  "-404";
					String string_value_y1 = "-404";
					
					new_circles.setX(some_x);
					new_circles.setY(some_y);
					for(Map.Entry new_map_x : map_for_X.entrySet()) {
						for(Map.Entry new_map_y : map_for_Y.entrySet()) {
							if((some_x - 15/2) == Integer.parseInt(new_map_x.getValue().toString())) {
								value_x1 = some_x - 15/2;
								}
							if((some_y - 15/2) == (Integer.parseInt(new_map_y.getValue().toString()))) {
								value_y1 = some_y - 15/2;
								}
								if((value_x1 == (Integer.parseInt(new_map_x.getValue().toString()))) && (value_y1 == (Integer.parseInt(new_map_y.getValue().toString())))) {
									string_value_x1 = String.valueOf(value_x1);
									string_value_y1 = String.valueOf(value_y1);
									pair_coordinates_num1[go_num1] = string_value_x1 +"."+ string_value_y1;
									go_num1 += 1;
								    vertexA = (int) new_map_y.getKey();
									break;
									}
								}
							}
					System.out.print(vertexA);
					array_pair[iter1] = vertexA;
					iter1 += 1;
					
					new_edge.setB(new_circles);
					break; //daca deja am dat click pe un circle iesim din dotList, adica am vazut ca A se gasteste pe panel, adica x >= 0 && y >= 0
				} 
				else {
					String string_value_x2 = "-404";
					String string_value_y2 = "-404";
					
					new_circles.setX(some_x);
					new_circles.setY(some_y);
					for(Map.Entry new_map_x2 : map_for_2X.entrySet()) {
						for(Map.Entry new_map_y2 : map_for_2Y.entrySet()) {
							if((some_x - 15/2) == Integer.parseInt(new_map_x2.getValue().toString())) {
								value_x2 = some_x - 15/2;
								}
							if((some_y - 15/2) == (Integer.parseInt(new_map_y2.getValue().toString()))) {
								value_y2 = some_y - 15/2;
								}
								if((value_x2 == (Integer.parseInt(new_map_x2.getValue().toString()))) && (value_y2 == (Integer.parseInt(new_map_y2.getValue().toString())))) {
									string_value_x2 = String.valueOf(value_x2);
									string_value_y2 = String.valueOf(value_y2);
									pair_coordinates_num2[go_num2] = string_value_x2 +"."+ string_value_y2;
									go_num2 += 1;
									vertexB = (int) new_map_y2.getKey();
									break;
									}
								}
							}
					System.out.print(vertexB);
					array_not_pair[iter2] = vertexB;
					iter2 += 1;
					
					new_edge.setA(new_circles);
					break; //daca deja am dat click pe un circle iesim din dotList, adica am vazut ca B se gasteste pe panel, adica x >= 0 && y >= 0
							}	
						}
					}
				if(new_edge.existsA() == true && new_edge.existsB() == true) { 
					edgeList.add(new_edge);
					
					new_edge = new Create_Edge(vertexA, vertexB, new_int, Color.black);
					panel_for_dots.INSERT_EDGE(vertexA, vertexB, new_int);
					Color_Default();
					if(new_cnt > 0) {
						setLabel_insert_edge(Color.blue,"Click inside the panel on vertexA to insert edge!");
					}
					read_edge.setText("");
					repaint();
		}
	}
}



//DELETE VERTICES FROM THE ARRAY
protected class Click_delete extends MouseAdapter {
	public Click_delete() {
		super();
	}
	
public void mouseClicked(MouseEvent e) {
	String string_vertex_delete = read_delete_vertex.getText();
	int vertex = Integer.parseInt(string_vertex_delete);
	panel_for_dots.DELETE_DOTS(vertex);
	read_delete_vertex.setText("");
	repaint();
	}
}


//DELETE EDGES FROM THE ARRAY
protected class Click_delete_edges extends MouseAdapter {
	private int i = 0;
	public Click_delete_edges() {
		super();
	}
	
	public void mouseClicked(MouseEvent e) {
		int value_x1 = -404, value_y1 = -404;
		int value_x2 = -404, value_y2 = -404;
		
		String hold_weight = delete_edge.getText();
		int new_int = Integer.parseInt(hold_weight);
		
		for(int i=0;i<edgeList.size();i++) {
			if(new_int == hold_deleted_edges[i] && new_int != -1) {
				found_weight = true;
				break;
			}
			continue;
		}
		if(found_weight == false) {
			JOptionPane.showMessageDialog(null, "Edge does not exist!","ERROR 404", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		int x = e.getX()+15/2;
		int y = e.getY()+15/2;
		
		
		for(i=0;i<dotList.size();i++) {
			int some_x = dotList.get(i).getX() + 15/2;
			int some_y = dotList.get(i).getY() + 15/2;
			if(cnt_delete_edges == 0) {
				setLabel_insert_edge(Color.blue,"Click inside the panel on vertexA to delete edge!");
				cnt_delete_edges += 1;
			}
			
				if((( x <= some_x + 11) && (x >= some_x - 11)) && ((y <= some_y + 11) && (y >= some_y - 11))) { //verificam sa vedem daca am gasit cordonatele
					dotList.get(i).setColor(Color.blue);
					setLabel_insert_edge(Color.blue,"Click inside the panel on vertexB to delete edge!");
					repaint();
					
				if(new_edge.existsA() == true) {
					new_circles.setX(some_x);
					new_circles.setY(some_y);
					
					for(@SuppressWarnings("rawtypes") Map.Entry new_map_x : map_for_X.entrySet()) {
						for(@SuppressWarnings("rawtypes") Map.Entry new_map_y : map_for_Y.entrySet()) {
							if((some_x - 15/2) == Integer.parseInt(new_map_x.getValue().toString())) {
								value_x1 = some_x - 15/2;
								}
							if((some_y - 15/2) == (Integer.parseInt(new_map_y.getValue().toString()))) {
								value_y1 = some_y - 15/2;
								}
								if((value_x1 == (Integer.parseInt(new_map_x.getValue().toString()))) && (value_y1 == (Integer.parseInt(new_map_y.getValue().toString())))) {
								    vertexA = (int) new_map_y.getKey();
									break;
									}
								}
							}
					new_edge.setB(new_circles);
					break; //daca deja am dat click pe un circle iesim din dotList, adica am vazut ca A se gasteste pe panel, adica x >= 0 && y >= 0
				} 
				else {
					new_circles.setX(some_x);
					new_circles.setY(some_y);
					for(@SuppressWarnings("rawtypes") Map.Entry new_map_x2 : map_for_2X.entrySet()) {
						for(@SuppressWarnings("rawtypes") Map.Entry new_map_y2 : map_for_2Y.entrySet()) {
							if((some_x - 15/2) == Integer.parseInt(new_map_x2.getValue().toString())) {
								value_x2 = some_x - 15/2;
								}
							if((some_y - 15/2) == (Integer.parseInt(new_map_y2.getValue().toString()))) {
								value_y2 = some_y - 15/2;
								}
								if((value_x2 == (Integer.parseInt(new_map_x2.getValue().toString()))) && (value_y2 == (Integer.parseInt(new_map_y2.getValue().toString())))) {
									vertexB = (int) new_map_y2.getKey();
									break;
									}
								}
							}
					new_edge.setA(new_circles);
					break; //daca deja am dat click pe un circle iesim din dotList, adica am vazut ca B se gasteste pe panel, adica x >= 0 && y >= 0
							}	
						}
					}
				if(new_edge.existsA() == true && new_edge.existsB() == true) {
					
					new_edge = new Create_Edge(vertexA, vertexB, new_int, Color.black);
					
					int len = edgeList.size();
					for(int i=0;i<len;i++) {
						if(new_int == edgeList.get(i).getWeight2()) {
							edgeList.delete(i);
							JOptionPane.showMessageDialog(null, "Successfully deleted the edge!");
							break;
						} 
					}
					panel_for_dots.DELETE_EDGE(vertexA, vertexB, new_int);
					if(cnt_delete_edges > 0) {
						setLabel_insert_edge(Color.blue,"Click inside the panel on vertexA to delete edge!");
					}
					Color_Default();
					delete_edge.setText("");
		}
	}
}	

protected class SLEEP {
	int count = 0;
	public SLEEP(int count) {
		super();
		this.count = count;
	}
	public void method_sleep() {
		try {
			Thread.sleep(count);
		} catch(InterruptedException new_exception) {
			JOptionPane.showMessageDialog(null, "Error 404 cause of exception " +new_exception+ ".");
		}
	}
}



protected class Modify_edges extends MouseAdapter {
	private int some_x, some_y, i = 0;
	public Modify_edges() {
		super();
	}
	
	public void mouseClicked(MouseEvent e) {
		sleep = new SLEEP(750);
		
		some_x = e.getX()+15/2;
		some_y = e.getY()+15/2;
		
		int new_weight = -404;
		int getWeight = -404;
		
		if(edgeList.size() > 0) {
			
			try {
				String hold_new_weight = read_weight_to_modify.getText();
				new_weight = Integer.parseInt(hold_new_weight);
			} catch(Exception new_exception) {
				setLabel_insert_edge(Color.RED,"ERROR 404");
			}
			
			for(i=0;i<edgeList.size();++i) {
				if(edgeList.get(i).checkEdge(some_x, some_y) && new_weight != -404) {
					getWeight = edgeList.get(i).getWeight2();
					sleep.method_sleep();
					edgeList.get(i).setWeight(new_weight);
					setLabel_insert_edge(Color.blue,"New Weight added with success.");
					panel_for_dots.CHANGE_WEIGHT(getWeight, new_weight);
					repaint();
					break;
				} else {
					setLabel_insert_edge(Color.blue,"Error adding the weight, please check the instructions.");
				}
			}	 
		}
		repaint();
		read_weight_to_modify.setText("");
	}
}



protected class Display_adjacency_matrix extends MouseAdapter {
	JPanel panel_adj_mat;
	JLabel [] list_labels;
	JLabel [] list_label_columns;
	JLabel [][] matrix_labels;
	
	JLabel label_line_rows;
	
	JLabel label_line_row [];
	JLabel label_line_column [];
	JLabel label_line_row_up [];
	JLabel label_line_column_up [];
	JLabel new_label;
	
	JLabel label_text;
	JLabel put_gif;
	
	
	public Display_adjacency_matrix() {
		super();
	}
	
	public void mouseClicked(MouseEvent e) {
		sleep = new SLEEP(750);
		
		if(only_once_display_frame < 30) {
			counter1 = 0;
			counter2 = 0;
			global_x = 0;
			global_y = 0;
			next_line_row = 0;
			next_line = 0;
			static_var = 0;
			do {
				String hold_value = display_graph.getText();
				if(e.getX() > 0 && e.getY() > 0 && (hold_value.equals("yes") || hold_value.equals("YES") || hold_value.equals("Yes"))) {
					sleep.method_sleep();
					frame_display_matrix = new JFrame("Display Adjancency Matrix");
					frame_display_matrix.setBounds(80, 80, 650, 650);
					frame_display_matrix.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame_display_matrix.getContentPane().setLayout(null);
					frame_display_matrix.getContentPane().setBackground(Color.white);
					frame_display_matrix.setVisible(true);
					list_labels = new JLabel [count];
					list_label_columns = new JLabel [count];
					matrix_labels = new JLabel[count][count];
					label_line_rows = new JLabel();
					
					label_line_row = new JLabel [155];
					label_line_row_up = new JLabel [155];
					
					label_line_column = new JLabel [33];
					label_line_column_up = new JLabel [33];
					
					
					label_text = new JLabel("Adjacency Matrix");
					label_text.setFont(new Font("Tahoma", Font.BOLD, 20));
					label_text.setBounds(200, 20, 221, 21);
					label_text.setForeground(Color.blue);
					
					
					int hold_value_of_first_global_x = 404;
					int hold_value_of_first_global_y = 404;
					
					
					//INSERT THE LABEL ROWS FROM THE ARRAY
					for(int i=0;i<count;++i) {
						global_x += 70;
						if(counter1 == 0) {
							hold_value_of_first_global_x = global_x;
							counter1 += 1;
						}
						list_labels[i] = new JLabel(String.valueOf(array_vertices[i]+"  "));
						list_labels[i].setFont(new Font("Tahoma", Font.PLAIN, 14));
						list_labels[i].setBounds(global_x+30, 70, 221,21);
						list_labels[i].setForeground(Color.black);
					}
					
					for(int i=0;i<155;++i) {
						label_line_row_up[i] = new JLabel("-");
						label_line_row_up[i].setFont(new Font("Tahoma", Font.PLAIN, 14));
						label_line_row_up[i].setBounds((hold_value_of_first_global_x-25+next_line_row), 70-15, 221, 21);
						label_line_row_up[i].setForeground(Color.blue);
						next_line_row += 3;
					}
					
					next_line_row = 0;
					
					for(int i=0;i<155;++i) {
						label_line_row[i] = new JLabel("-");
						label_line_row[i].setFont(new Font("Tahoma", Font.PLAIN, 14));
						label_line_row[i].setBounds((hold_value_of_first_global_x-25+next_line_row), 70+20, 221, 21);
						label_line_row[i].setForeground(Color.blue);
						next_line_row += 3;
					}
					
					//INSERT THE LABEL COLUMNS FROM THE ARRAY
					for(int i=0;i<count;++i) {
						global_y += 60;
						if(counter2 == 0) {
							counter2 += 1;
							hold_value_of_first_global_y = global_y;
						}
						list_label_columns[i] = new JLabel(String.valueOf(array_vertices[i]+"  "));
						list_label_columns[i].setFont(new Font("Tahoma", Font.PLAIN, 14));
						list_label_columns[i].setBounds(50+5, global_y+50,221,21);
						list_label_columns[i].setForeground(Color.black);
					}
					
					for(int i=0;i<33;++i) {
						label_line_column[i] = new JLabel("|");
						label_line_column[i].setFont(new Font("Tahoma", Font.PLAIN, 14));
						label_line_column[i].setBounds(75, hold_value_of_first_global_y+next_line+1, 221,21);
						label_line_column[i].setForeground(Color.blue);
						next_line += 12;
					}
					
					next_line = 0;
					
					for(int i=0;i<33;++i) {
						label_line_column_up[i] = new JLabel("|");
						label_line_column_up[i].setFont(new Font("Tahoma", Font.PLAIN, 14));
						label_line_column_up[i].setBounds(45, hold_value_of_first_global_y+next_line+1, 221,21);
						label_line_column_up[i].setForeground(Color.blue);
						next_line += 12;
					}
					
					global_y = 0;
					
					for(int i=0;i<count;++i) {
							global_x  = 0;
							matrix_labels[i][0] = new JLabel(String.valueOf(matrix_edges[i][0]+ "  "));
							matrix_labels[i][0].setFont(new Font("Tahoma", Font.PLAIN, 14));
							matrix_labels[i][0].setBounds(global_x+30,70+global_y, 221,21);
							if(static_var >= 1) {
								global_y += 60;
							}
							static_var += 1;
						for(int j=0;j<count;++j) {
							 global_x += 70;
							 matrix_labels[i][j] = new JLabel(String.valueOf(matrix_edges[i][j]+ "  "));
							 matrix_labels[i][j].setFont(new Font("Tahoma", Font.PLAIN, 14));
							 if(matrix_edges[i][j] == -1) {
								 matrix_labels[i][j].setBounds(global_x+30-6, 109+global_y, 221,21);
								 matrix_labels[i][j].setForeground(Color.red);
							 } else {
								 matrix_labels[i][j].setBounds(global_x+30, 109+global_y, 221,21);
								 matrix_labels[i][j].setForeground(Color.black);
							 }
						}
					}
					
					JPanel panel_graph = new JPanel();
					panel_graph.setBounds(48, 67, 30, 35);
					panel_graph.setBackground(Color.blue);
					frame_display_matrix.add(panel_graph);
					panel_graph.setLayout(null);
					
					
					JPanel one_more_panel = new JPanel();
					
					one_more_panel.setBounds(400, 400, 160, 60);
					
					JLabel display_graph_label = new JLabel();
					ImageIcon imageIcon = new ImageIcon("C:\\Users\\darie\\eclipse-workspace\\Glanda_Darie_Teofil_proiect_PS1_JAVA\\src\\bloggif_60843a321f4c0.gif");
					display_graph_label = new JLabel(imageIcon);
					display_graph_label.setBounds(475, 515, 160, 100);
					
					frame_display_matrix.add(display_graph_label);
					 
					frame_display_matrix.add(label_text);
					
					for(int i=0;i<count;++i) {
						frame_display_matrix.add(list_labels[i]);
					}
					
					for(int i=0;i<count;++i) {
						frame_display_matrix.add(list_label_columns[i]);
					}
					
					for(int i=0;i<155;++i) {
						frame_display_matrix.add(label_line_row[i]);
						frame_display_matrix.add(label_line_row_up[i]);
					}
					
					for(int i=0;i<33;++i) {
						frame_display_matrix.add(label_line_column[i]);
						frame_display_matrix.add(label_line_column_up[i]);
					}
					
					for(int i=0;i<count;++i) {
						for(int j=0;j<count;++j) {
							frame_display_matrix.add(matrix_labels[i][j]);
						}
					}
					only_once_display_frame += 1;
					display_graph.setText("");
					break;
			   } else if(((hold_value.equals("no")) || (hold_value.equals("NO"))) || (e.getX() < 0 && e.getY() < 0)) {
				    JOptionPane.showMessageDialog(null, "You don't want to create a new frame to display the graph!","ERROR 404", JOptionPane.ERROR_MESSAGE);
				    setLabel_display_graph(Color.blue,"Click on a new radio button then!");
				    display_graph.setText("");
				    break;
			   } else {
				   setLabel_display_graph(Color.red,"Error 404!");
				   display_graph.setText("");
				   break;
			   }
			}while(true);
		}
	}
}

protected class Add_all_edges_and_weights extends MouseAdapter {
	public Add_all_edges_and_weights() {
		super();
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void mouseClicked(MouseEvent event) {
		String text_field_value = read_all_edges.getText();
		if(event.getX() > 0 && event.getY() > 0 && (text_field_value.equals("yes") || text_field_value.equals("YES") || text_field_value.equals("Yes"))) {
			SLEEP new_sleep = new SLEEP(1000);
			new_sleep.method_sleep();
			if(edgeList.size() > 0) {
				edgeList = new EdgeList();
				panel_for_dots.matrix_Default();
			}
			int numb_of_vertices = dotList.size();
			int k = 0;
			for(int i=0;i<dotList.size();++i) {
				for(int j=i+1;j<numb_of_vertices;++j) {
					k += 1;
					new_edge = new Create_Edge(dotList.get(i), dotList.get(j), k);
					edgeList.add(new_edge);
					panel_for_dots.ADD_ALL_EDGES_AND_WEIGHTS(array_vertices[i], array_vertices[j], k);
					repaint(); 
				 }
			 }
			 read_all_edges.setText("");
			 setLabel_add_all_weights(Color.blue,"All edges and weights added with success!");
		  } else {
			  read_all_edges.setText("");
			  JOptionPane.showMessageDialog(null, "You chose to go back","ERROR 404", JOptionPane.ERROR_MESSAGE);
			  setLabel_add_all_weights(Color.red,"Some error happened");
		}
 	}
}


protected class Delete_all_edges_and_weights extends MouseAdapter {
	public Delete_all_edges_and_weights() {
		super();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void mouseClicked(MouseEvent event) { 
		String text_field_value = delete_all_edges_with_weights.getText();
		if(event.getX() > 0 && event.getY() > 0 && (text_field_value.equals("yes") || text_field_value.equals("YES") || text_field_value.equals("Yes"))) {
			SLEEP new_sleep = new SLEEP(1000);
			new_sleep.method_sleep();
			edgeList = new EdgeList();
			panel_for_dots.matrix_Default(); //setam deja matricea sa fie iar pe deafult, adica tot randul si coloana fiu iar -1
			setLabel_delete_all_edges_and_weights(Color.blue,"All edges and weights are deleted with success!");
			delete_all_edges_with_weights.setText("");
		} else {
			JOptionPane.showMessageDialog(null, "You chose to go back","ERROR 404", JOptionPane.ERROR_MESSAGE);
			setLabel_delete_all_edges_and_weights(Color.red,"Some error happened");
			delete_all_edges_with_weights.setText("");
		}
	}
}

protected class Dijkstra extends MouseAdapter {
	private int i = 0;
	public Dijkstra() {
		super();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void mouseClicked(MouseEvent event) {
		
		if(clicked == 1) {
			Color_Default();
			repaint();
			Edge_Default();
			clicked += 1;
		}
		
		if(clicked == 0) {
		
			int sourceVertex_coordx = event.getX() + 15/2;
			int souceVertex_coordy = event.getY() + 15/2;
			
			
			for(i=0;i<dotList.size();i++) {
				int some_x = dotList.get(i).getX() + 15/2;
				int some_y = dotList.get(i).getY() + 15/2;
			
				
			if(((sourceVertex_coordx <= some_x + 11) && (sourceVertex_coordx >= some_x - 11)) && ((souceVertex_coordy <= some_y + 11) && (souceVertex_coordy >= some_y - 11))) {
				dotList.get(i).setColor(Color.blue);
				repaint();
				
				starting_vertex = (int) dotList.get(i).getVertexInt(); //getting the source node from the panel 
				break;
				}
			}
			
			if(starting_vertex == -404) {
				JOptionPane.showMessageDialog(null, "Could not find the normal starting vertex!","ERROR 404", JOptionPane.ERROR_MESSAGE);
				return;
			}
			
			int position = -404;
			
			for(int i=0;i<dotList.size();++i) {
				if(starting_vertex == array_vertices[i]) {
					position = i;
					break;
				}
				continue;
			}
			
			if(position == -404) {
				JOptionPane.showMessageDialog(null, "Could not find the normal starting vertex!","ERROR 404", JOptionPane.ERROR_MESSAGE);
				return;
			}
			
			long start = System.nanoTime();
			
			int parent_arr [] = new int [dotList.size()];
			int distance_arr [] = new int [dotList.size()];
			boolean visited_arr [] = new boolean [dotList.size()];
			int distincte_arr [] = new int [dotList.size()];
			
			Arrays.fill(parent_arr, -1);
			Arrays.fill(distance_arr, Integer.MAX_VALUE);
			Arrays.fill(visited_arr, false);
			Arrays.fill(distincte_arr, -1);
			
			parent_arr[position] = -1; //punem vertexul cu care incepem sa fie value la -1
			distance_arr[position] = 0; //starting vertex o sa fie in distance array 0, ca incepem de la el sa calculam shortest path 
			
			int len = dotList.size();
			
			for(int i=0;i<(len-1);++i) {
				int u = minVertex(distance_arr,visited_arr);
				visited_arr[u] = true;
			
				for(int j=0;j<len;++j) {
					if(matrix_edges[u][j] != -1 && visited_arr[j] == false && distance_arr[u] != Integer.MAX_VALUE && (distance_arr[u] + matrix_edges[u][j]) < distance_arr[j]) {
						distance_arr[j] = (distance_arr[u] + matrix_edges[u][j]);
						parent_arr[j] = u;
					}
				}
			}
		
			int new_len = parent_arr.length;
			
			for(int i=1;i<new_len;++i) {
				for(int j=1;j<new_len;++j) {
					if(parent_arr[i] == parent_arr[j] && i != j) {
						parent_arr[i+1] = -404;
					}
				}
			}
			
			int shortest_path_dijkstra = 0;
			int edgeListSize = edgeList.size();
			for(int v=0;v<edgeListSize;++v) {
				for(int k=1;k<parent_arr.length;++k) {
					if(parent_arr[k] != -404) {
						if(edgeList.get(v).getWeight2() == matrix_edges[parent_arr[k]][k]) {
							shortest_path_dijkstra += matrix_edges[parent_arr[k]][k];
							edgeList.get(v).setColor(Color.blue);
						}
					}
				}
			}
			
			long end = System.nanoTime();
			
			next_time = 0;
			time_array[next_time] = (int) (end-start);
			
			
			JLabel dijkstra_label = new JLabel("        Shortest Path is: "+ shortest_path_dijkstra+ "!");
			dijkstra_label.setForeground(Color.blue);
			panel_for_dots.add(dijkstra_label);
			
			setLabel_dijkstra(Color.blue, "Elapsed time for Dijkstra's algorithm : "+ time_array[next_time]+ " nanoseconds");
			
			clicked += 1;
			next_time += 1;
		}
	}
	
	public int minVertex(int distance_arr[], boolean visited_arr[]) {
		int min = Integer.MAX_VALUE;
		int index = -404;
		int len = dotList.size();
		for(int i=0;i<len;++i) {
			if(visited_arr[i] == false && distance_arr[i] <= min) {
				min = distance_arr[i];
				index = i;
				}
			}
		return index;
	}
}
	

protected class Panel_for_dots extends JPanel {
	
	public Panel_for_dots() {
		this.setBackground(Color.WHITE);
		this.setBounds(247, 55, 415, 597);
		this.setVisible(true);
	}
	
	public void matrix_Default() {
		for(int i=0;i<count;++i) {
			for(int j=0;j<count;j++) {
				matrix_edges[i][j] = -1;
			}
		}
	}

	public void array_vertices_Default() {
		for(int i=0;i<count;++i) {
			array_vertices[i] = -1;
		}
	}
	
	public boolean SEE_IF_GRAPH_IS_FULL() {
		if(count == length) {
			return true; 
		} if(count_matrix_edges == (length*length)) {
			return true;
		}
		return false;
	}
	
	
	public void INSERT_DOTS(Create_Circle node, int vertex) {
		if(SEE_IF_GRAPH_IS_FULL() == true) {
			JOptionPane.showMessageDialog(null, "Graph is full!\n","ERROR 404", JOptionPane.ERROR_MESSAGE);
			System.out.print("FULL GRAPH!");
			System.out.print("\n");
			check_function = false;
			read_insert_vertex.setText("");
			return;
		}
		
		
		for(int i=0;i<length;i++) {
			if(array_vertices[i] == vertex) {
				JOptionPane.showMessageDialog(null, "Found a duplicate in the array!","ERROR 404", JOptionPane.ERROR_MESSAGE);
				System.out.print("WE FOUND A DUPLICATE IN THE ARRAY!\n");
				check_function = false;
				read_insert_vertex.setText("");
				return;
			}
		}	
			if(count == dotList.size()) {
			
				array_vertices[count] = vertex;
				
				for(int i=count;i<count+1;++i) {
					for(int j=0;j<count;++j) {
						matrix_edges[i][j] = -1;
					}
				} 
				
				for(int i=count;i<count+1;++i) {
					for(int j=0;j<count;++j) {
						matrix_edges[j][i] = -1;
					}
				}
			
				count += 1;
			
				dotList.add(node);
				
				check_function = true;
				JOptionPane.showMessageDialog(null, "Vertex " +vertex+ " was inserted with success!");
				System.out.print("INSERTED VERTEX " +vertex+ " WITH SUCCESS!\n");
				}
			else {
				System.out.print("SOME ERROR OCCURED!\n");
				JOptionPane.showMessageDialog(null, "Error 404");
		}
	}
	
	@SuppressWarnings("unused")
	public void DELETE_DOTS(int vertex) {
		if(count != dotList.size()) {
			JOptionPane.showMessageDialog(null, "Error 404");
			return;
		}
		
		count_edges_arr1 = 0;
		count_edges_arr2 = 0;
		
		int position = -1;
		for(int i=0;i<array_vertices.length;i++) {
			if(array_vertices[i] == vertex) {
				position = i;
				break;
			}
		}
		
		if(position == -1) {
			JOptionPane.showMessageDialog(null, "Vertex does not exist!","ERROR 404", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		if(dotList.size() > 0) {
			
			int [] weights = new int [edgeList.size()];
			
			for(int j=0;j<edgeList.size();++j) {
				weights[j] = -1;
			}
			
			for(int j=0;j<edgeList.size();++j) {
				if(vertex == array_pair[j] && array_pair[j] != -1) {
					count_edges_arr1 += 1;
					weights[j] = edgeList.get(j).getWeight2();
				}
			}
			
			for(int j=0;j<edgeList.size();++j) {
				if(vertex == array_not_pair[j] && array_not_pair[j] != -1) {
					count_edges_arr2 += 1;
					weights[j] = edgeList.get(j).getWeight2();
				}
			}
			System.out.print("\n");
			for(int j=0;j<edgeList.size();++j) {
				System.out.print(weights[j]+ " ");
			}
			
			int new_len = edgeList.size();
			
			for(int j=0;j<edgeList.size() ;++j) {
				for(int k=0;k<new_len;++k) {
					if(weights[k] == edgeList.get(j).getWeight2() && weights[k] != -1) {
						edgeList.delete(j);
					}
				}
			}
			
			int add = 0;
			for(int j=0;j<new_len;++j) {
				if(weights[j] == -1 && weights[j] != vertex) {
					array_pair[add] = array_pair[j];
					add += 1;
				}
			}
			
			int add2 = 0;
			for(int j=0;j<new_len;++j) {
				if(weights[j] == -1 && weights[j] != vertex) {
					array_not_pair[add2] = array_not_pair[j];
					add2 += 1;
				}
			}
		}
		
		count_Arr1AndArr2 = count_edges_arr1+count_edges_arr2;
		iter1 -= count_Arr1AndArr2;
		iter2 -= count_Arr1AndArr2;
		System.out.print("\n");
		
		for(int j=0;j<edgeList.size();++j) {
			System.out.print(array_pair[j]+ " ");
		}
		
		System.out.print("\n");
		
		for(int j=0;j<edgeList.size();++j) {
			System.out.print(array_not_pair[j]+ " ");
		}
		
		System.out.print("\n");
		
			//delete din matrix liniia
			for(int i=position;i<count-1;++i) {
				for(int j=0;j<count;++j) {
					matrix_edges[i][j] = matrix_edges[i+1][j];
				}
			}
		
			//delete din matirx coloana
			for(int i=position;i<count-1;++i) {
				for(int j=0;j<count;++j) {
					matrix_edges[j][i] = matrix_edges[j][i+1];
				}
			}
			
			for(int i=position;i<count-1;i++) {
				array_vertices[i] = array_vertices[i+1];
				continue;
			}
			
		count -= 1;
		dotList.delete(position);
		count_matrix_edges -= 2;
		JOptionPane.showMessageDialog(null, "We deleted vertex " +vertex+ " with success!");
		System.out.print("SUCCESSFULLY DELETED " +vertex+ "!");
		System.out.print("\n");
	}
	
	public void INSERT_EDGE(int vertexA, int vertexB, int weight) {
		int positionA = -404, positionB = -404;
		
		//positionul pentru vertexA
		for(int i=0;i<count;i++) {
			if(vertexA == array_vertices[i]) {
				positionA = i;
				break;
			}
			continue;
		}
		
		//positionul pentru vertexB
		for(int i=0;i<count;i++) {
			if(vertexB == array_vertices[i]) {
				positionB = i;
				break;
			}
			continue;
		}
		
		try {
			if(positionA > length || positionB > length) {
				JOptionPane.showMessageDialog(null, "Out of bound exception!","ERROR 404", JOptionPane.ERROR_MESSAGE);
				return;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Exception " +e+ " made the error!","ERROR 404", JOptionPane.ERROR_MESSAGE);
			System.out.print("ERROR 404!");
		}
		
		
		if(positionA == -404 || positionB == -404 || (positionA == -404 && positionB == -404)) {
			JOptionPane.showMessageDialog(null, "One of the vertices is not found!","ERROR 404", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		if(positionA != 404 && positionB != 404) {
			
			if(matrix_edges[positionA][positionB] == -1 && matrix_edges[positionB][positionA] == -1) {
				//inseram in edge list numarul de edges 
				matrix_edges[positionA][positionB] = weight;
				matrix_edges[positionB][positionA] = weight;
				count_matrix_edges += 2;
				JOptionPane.showMessageDialog(null, "Vertex " +vertexB+ " and " +"vertex " +vertexA+ " have weight " +weight+ "!");
				System.out.print("SUCCESSFULLY INSERTED WEIGHT " +weight+ " FOR VERTEX A AND VERTEX B!");
		} else {
			JOptionPane.showMessageDialog(null, "Can't add edges!","ERROR 404", JOptionPane.ERROR_MESSAGE);
			return;
			}
		}
	}
	
	public void DELETE_EDGE(int vertexA, int vertexB, int weight) {
		int positionA = -404;
		int positionB = -404;
		
		boolean foundA = false;
		boolean foundB = false;
		
		for(int i=0;i<count;++i) {
			if(vertexA == array_vertices[i]) {
				positionA = i;
				foundA = true;
				break;
			}
			continue;
		}
		
		for(int j=0;j<count;++j) {
			if(vertexB == array_vertices[j]) {
				positionB = j;
				foundB = true;
				break;
			}
			continue;
		}
		
		if(foundA == true && foundB == true) {
		
		matrix_edges[positionA][positionB] = -1;
		matrix_edges[positionB][positionA] = -1;
		count_matrix_edges -= 2;
			
		} else {
			JOptionPane.showMessageDialog(null, "Position does not exist!","ERROR 404", JOptionPane.ERROR_MESSAGE);
			return;
		}
	}
	
	public void CHANGE_WEIGHT(int weight, int new_weight) {
		boolean found = false;
		int position_i = -404;
		int position_j = -404;
		
		for(int i=0;i<count;++i) {
			for(int j=0;j<count;++j) {
				if(weight == matrix_edges[i][j] || weight == matrix_edges[j][i]) {
					position_i = i;
					position_j = j;
					found = true;
					break;
				}
			}
		}
		
		if(found == true && (position_i != -404 && position_j != -404)) {
			matrix_edges[position_i][position_j] = new_weight;
			matrix_edges[position_j][position_i] = new_weight;
		} 
		else {
			JOptionPane.showMessageDialog(null, "Can't make changes!","ERROR 404", JOptionPane.ERROR_MESSAGE);
			return;
		}
	}
	
	public void ADD_ALL_EDGES_AND_WEIGHTS(int vertexA, int vertexB, int weight) {
		int positionA = -404;
		int positionB = -404;
		
 		for(int i=0;i<count;++i) {
			if(vertexA == array_vertices[i]) {
				positionA = i;
				break;
			}
			continue;
		}
 		
 		for(int i=0;i<count;++i) {
 			if(vertexB == array_vertices[i]) {
 				positionB = i;
 				break;
 			}
 			continue;
 		}
 		
 		if((positionA == -404 || positionB == -404) || (positionA == -404 && positionB == -404)) {
 			JOptionPane.showMessageDialog(null, "Some error occured","ERROR 404", JOptionPane.ERROR_MESSAGE);
			return;
 		}
 		
 		else {
 			matrix_edges[positionA][positionB] = weight;
 			matrix_edges[positionB][positionA] = weight;
 			count_matrix_edges += 2;
 		}
 		
	}
	
	
	public void paintComponent(Graphics g) { 
		super.paintComponent(g);
		
		 Graphics2D g2d = (Graphics2D) g;
		//ImageIcon image = new ImageIcon("C:\\Users\\darie\\OneDrive\\Desktop\\vertex_new_Glanda_Darie_Teofil.jpg");
		//image.paintIcon(this, g, temp_node.getDiameter(), temp_node.getDiameter());
		//image.setDescription(TOOL_TIP_TEXT_KEY);
		
		if(dotList.size() > 0) {
			for(int i=0;i<dotList.size();i++) {
				dotList.get(i).DRAW(g2d);
				}
			}
		if(edgeList.size() > 0) {
			for(int i=0;i<edgeList.size();i++) {
				edgeList.get(i).DRAW(g2d);
				}
			}
		repaint();
		}
	}
}

