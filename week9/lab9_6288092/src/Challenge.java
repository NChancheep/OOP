	//Name: Chancheep Mahacharoensuk
	//Id: 6288092
	//Section 1
	import java.awt.*;
	import javax.swing.JFrame;

	public class Challenge
	{
		
		 public static void main(String[] args) 
		 {
			 JFrame frame = new JFrame()
				{
					public void paint(Graphics ui) 
					{
					 	ui.setColor(Color.magenta);
					 	ui.fillRect(200, 225, 100, 100);
					 	ui.setColor(Color.blue);
					 	ui.fillOval(100, 120, 100, 100);
					 	ui.setColor(Color.black);
					 	ui.drawPolygon(new int[] {300, 300, 400}, new int[] {100, 200, 200}, 3);
					}
				};
		        frame.setSize(500, 400);
		        frame.setTitle("Challenge");
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setVisible(true);
		 }
	}


