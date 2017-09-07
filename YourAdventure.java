import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class YourAdventure extends JComponent implements MouseListener {

	public static String nameOfApp = "Johnny's adventure in climbing";

	int state = 0;

	public YourAdventure() {
		addMouseListener(this);
	}

	public void paint(Graphics g) {

		Font font = new Font("Comic Sans MS", Font.BOLD, 20);
		g.setFont(font);

		if (state == 0) {
			g.setColor(Color.ORANGE);
			g.drawString("Welcome to Johnny's climbing adventure!", 5, 25);
			g.setColor(Color.BLUE);
			g.drawString("Start!", 5, 55);
		} else if (state == 1) {
			g.setColor(Color.ORANGE);
			g.drawString("TEST", 5, 25);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("X:" + e.getX() + ", Y:" + e.getY());
		if (e.getX() >= 5 && e.getX() <= 65 && e.getY() >= 38 && e.getY() <= 55) {
			state++;
			System.out.println("State: " + state);
		}
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	public static void main(String[] args) {
		int width = 1080;
		int height = width / 12 * 9;
		JFrame frame = new JFrame(nameOfApp);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new YourAdventure());
		frame.setSize(width, height);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.decode("#00FFFF"));
	}

}