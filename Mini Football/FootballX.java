import java.awt.EventQueue;
import javax.swing.JFrame;
public class FootballX extends JFrame{
	public FootballX(String char1,String char2) {
        initUI(char1,char2);
    }
	private void initUI(String char1,String char2) {	    
	    add(new Board(char1,char2));	    
	    setResizable(false);
	    pack();	    
	    setTitle("Mini Football");
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

