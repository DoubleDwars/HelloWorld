import javax.swing.JFrame;


public class MyGui extends JFrame {

	public MyGui(){
		MyContentPane myContentPane = new MyContentPane();
		this.setName("League summoner searcher");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(myContentPane);
		this.pack();
		this.setVisible(true);
	}
	
}
