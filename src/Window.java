import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.WindowConstants;


public class Window extends JFrame {
	
	public Window() {
			
		super("Teste FlowLayout");
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		setPreferredSize(new Dimension(400,200));
		
		getContentPane().setLayout(new FlowLayout());
		
		for (int i=0; i<5; i++) {
			add(new JButton("Botão - " + i));
		}
		
		pack();

	}
}
	
