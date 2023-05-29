package q4_user_login;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Market implements ActionListener {

	 
	
	JLabel jl1 = new JLabel("Customer Phone: ");
	JTextField jt1 = new JTextField(10);
	JLabel jl2 = new JLabel("Customer id: ");
	JTextField jt2 = new JTextField(10);
	JButton check = new JButton("Check Id");
	
	JLabel jl3 = new JLabel("1.Chocolate - rupees 100 \n 2.Biscuits - rupees 20");
	JLabel jl4 = new JLabel("Enter Item Number to Buy: ");
	JTextField jt3 = new JTextField(5);
	JLabel jl5 = new JLabel("Enter Item Quantity to Buy: ");
	JTextField jt4 = new JTextField(5);
	
	JRadioButton r1 = new JRadioButton("Discount 30%");

	
	JButton bill = new JButton("Bill");
	
	JTextField am = new JTextField(10);
	
	HashMap<String,Integer> customers = new HashMap<>();
	HashMap<Integer,Double> items = new HashMap<>();
	
	     Market(){
	    	 		JFrame jf = new JFrame("Customer Information");
	    	 		
	    	 		String uname = JOptionPane.showInputDialog(null,"Enter your Username");
	    	 		String pswd = JOptionPane.showInputDialog(null,"Enter your password");
	    	 		
	    	 		if(uname.equals("msrit") && pswd.equals("12345"))
	    	 		{
	    	 			JOptionPane.showMessageDialog(null,"Login Valid");
	    	 			jf.setSize(200,200);
	    	 			jf.setVisible(true);
	    	 			jf.setLayout(new FlowLayout());
	    	 			jf.add(jl1);
	    	 			jf.add(jt1);
	    	 			jf.add(jl2);
	    	 			jf.add(jt2);
	    	 			jf.add(check);
	    	 			
	    	 			jf.add(jl3);
	    	 			jf.add(jl4);
	    	 			jf.add(jt3);
	    	 			jf.add(jl5);
	    	 			jf.add(jt4);
	    	 			jf.add(r1);
	    	 			jf.add(bill);
	    	 			
	    	 			bill.addActionListener(this);
	    	 			check.addActionListener(this);
	    	 			
	    	 			jf.add(am);
	    	 		}
	    	 		else
	    	 		{
	    	 			JOptionPane.showMessageDialog(null,"Invalid Login");
	    	 			
	    	 		}
		
	     		}
	
	
	public static void main(String args[])
	{
		Market mkt = new Market();
	}
	     
	     
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == check)
		{   
			String p1 = jt1.getText();
			
			if(customers.containsKey(p1))
			{
				JOptionPane.showMessageDialog(null, "Your Old Customer Id : "+customers.get(p1));
				jt2.setText(Integer.toString(customers.get(p1)));
			}
			else
			{
				customers.put(p1,125);
				JOptionPane.showMessageDialog(null, "Your New Customer Id : "+customers.get(p1));
				jt2.setText(Integer.toString(customers.get(p1)));
				
			}
		}
		else
		{
			double total = 0;
			if(jt3.getText().equals("1"))
				total += 100*Integer.parseInt(jt4.getText());
			if(jt3.getText().equals("2"))
				total += 20*Integer.parseInt(jt4.getText());
			if(r1.isSelected())
				total -= (total*0.3);
		
			am.setText("Amount to Pay is: "+total);
		}
		
	}
  
	
	
	
	
	
	
	
}
