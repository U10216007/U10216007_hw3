import javax.swing.*;
import java.awt.*;

public class UseBMIClass extends JFrame{
	
	public UseBMIClass(){
		

		setLayout(new GridLayout(0,2,0,0));
		
		add(new JLabel("name"));
		add(new JTextField(8));
		add(new JLabel("age"));
		add(new JTextField(3));
		add(new JLabel("height(cm)"));
		add(new JTextField(8));
		add(new JLabel("weight(kg)"));
		add(new JTextField(8));
		add(new JButton("calculate"));
	}
	
	public static void main(String[] args){
		
		UseBMIClass frame = new UseBMIClass();
		frame.setTitle("BMI");
		frame.setSize(200,150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
	}
	

}
