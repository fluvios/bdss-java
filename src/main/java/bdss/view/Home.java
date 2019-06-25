package bdss.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import java.awt.CardLayout;


public class Home {

	private JFrame frmCloudTrajectory;
	private JTextField textField;

	JPanel filePanel;
	JPanel mapPanel;
	JPanel pathPanel;
	JPanel stPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frmCloudTrajectory.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCloudTrajectory = new JFrame();
		frmCloudTrajectory.setTitle("Cloud Trajectory");
		frmCloudTrajectory.setBounds(100, 100, 843, 616);
		frmCloudTrajectory.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCloudTrajectory.getContentPane().setLayout(null);

		filePanel = new JPanel();
		filePanel.setLayout(null);
		filePanel.setAlignmentX(0.0f);
		filePanel.setBounds(0, 0, 817, 51);
		frmCloudTrajectory.getContentPane().add(filePanel);

		JLabel label = new JLabel("GPS Record");
		label.setFont(new Font("Dialog", Font.PLAIN, 20));
		label.setBounds(10, 11, 123, 34);
		filePanel.add(label);

		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBounds(143, 11, 289, 34);
		filePanel.add(textField);

		JButton button = new JButton("Load");
		button.setFont(new Font("Dialog", Font.PLAIN, 20));
		button.setBounds(541, 11, 89, 35);
		filePanel.add(button);

		JButton button_1 = new JButton("Clear");
		button_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_1.setAlignmentX(1.0f);
		button_1.setBounds(442, 11, 89, 35);
		filePanel.add(button_1);

		mapPanel = new JPanel();
		mapPanel.setBackground(Color.LIGHT_GRAY);
		mapPanel.setBounds(10, 62, 548, 504);
		frmCloudTrajectory.getContentPane().add(mapPanel);

		MapView maps = new MapView();
		maps.init();	
		mapPanel.add(maps);
		mapPanel.setLayout(new CardLayout(0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Dialog", Font.PLAIN, 12));
		tabbedPane.setBounds(564, 62, 253, 504);
		frmCloudTrajectory.getContentPane().add(tabbedPane);

		pathPanel = new JPanel();
		tabbedPane.addTab("Path Query", null, pathPanel, null);

		stPanel = new JPanel();
		tabbedPane.addTab("Spatio-Temporal Query", null, stPanel, null);
	}
}
