package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	ArrayList<String> list = new ArrayList<String>();
	
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	
	public static void main(String[] args) {
		GuestBook guest = new GuestBook();
		guest.SetUp();
		
	}
	void SetUp() {
		list.add("Bob Banders");
		list.add("Sandy Summers");
		list.add("Greg Fanders");
		list.add("Donnr Doners");
		
		frame.add(panel);
		panel.add(b1);
		panel.add(b2);
		frame.setSize(200,100);
		frame.setTitle("GuestBook");
		b1.setText("Add Name");
		b2.setText("View Names");
		frame.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			 list.add(JOptionPane.showInputDialog("Enter Name"));
		}
		if(e.getSource() == b2) {
			
			for(int GN = 0; GN < list.size(); GN++) {
			JOptionPane.showMessageDialog(null, "Guest #" + GN + ": " + list.get(GN) + "\n");
			}
		}
	}
}
