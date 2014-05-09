import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JLabel;



public class MainClassWindow {

	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args){
		final Console console = new Console();
		
		JFrame myWindow = new JFrame();
		myWindow.setSize(600, 300);
		myWindow.setTitle("ReadIsWrite");
		myWindow.setVisible(true);
		myWindow.getContentPane().setLayout(null);
		
		final JLabel label = new JLabel("");
		final JTextField imputText = new JTextField();
		JButton btnPressForText = new JButton("Press for Text Copy");

		imputText.setBounds(10, 11, 180, 100);
		myWindow.getContentPane().add(imputText);
		imputText.setColumns(10);
		
		
		btnPressForText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(imputText.getText() );
			}
		});
		btnPressForText.setBounds(10, 122, 180, 23);
		myWindow.getContentPane().add(btnPressForText);
		
		
		label.setBounds(210, 11, 200, 100);
		myWindow.getContentPane().add(label);
		label.setText(imputText.getText() );
		
		
		
	}
}
