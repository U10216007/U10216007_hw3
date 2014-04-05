import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UseBMIClass extends JFrame{

	
	private JTextField jheight = new JTextField(8);
	private JTextField jweight = new JTextField(8);
	private JButton jbt = new JButton("calculate");
	private JTextField jbmi = new JTextField(8);
	private JTextField jstatus = new JTextField(8);
	
	
	public UseBMIClass(){
		
		setLayout(new GridLayout(0,2,0,0));
		
		add(new JLabel("name"));
		add(new JTextField(8));
		add(new JLabel("age"));
		add(new JTextField(8));
		add(new JLabel("height(cm)"));
		add(jheight);
		add(new JLabel("weight(kg)"));
		add(jweight);
		add(new JLabel("BMI"));
		add(jbmi);
		add(new JLabel("status"));
		add(jstatus);
		add(jbt);

		
		
	    jbt.addActionListener(new  ButtonListner());
	
	}
	
	class ButtonListner implements ActionListener{
		public void actionPerformed(ActionEvent e){
			 double height = Double.parseDouble(jheight.getText());
			 double weight = Double.parseDouble(jweight.getText());
			 jbmi.setText(String.format("%.2f",getBMI(weight,height)));
			 jstatus.setText(String.format(getStatus(weight,height)));
			}

		public double getBMI(double weight,double height){
			double bmi = weight / ((height/100)*(height/100));
			return bmi;
		}
		
		public String getStatus(double weight,double height){
			double bmi = weight / ((height/100)*(height/100));
			if(bmi < 18.5)
				return "underweight";
			else if (bmi < 25)
				return "Normal";
			else if(bmi < 30)
				return "overweight";
			else
				return "Obese";
			
		}
		
		
		
	}
	
	
	
	public static void main(String[] args){
		
		UseBMIClass frame = new UseBMIClass();
		frame.setTitle("BMI");
		frame.setSize(300,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
	}
	

}


