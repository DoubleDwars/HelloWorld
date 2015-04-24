import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class ButtonPanel extends JPanel {

	public ButtonPanel(){
		//this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.setPreferredSize(new Dimension(150, 50));
		JTextField textField = new JTextField();
		JButton searchButton = new JButton("Search");
		textField.setPreferredSize(new Dimension(150, 20));
		this.add(textField);
		this.add(searchButton);
		searchButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				InfoPanel.summonerName = textField.getText();
				InfoPanel.changeTextArea();
			}
		});
	}
	
}
