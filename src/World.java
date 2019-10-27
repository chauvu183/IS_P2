import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.concurrent.atomic.AtomicInteger;

/*
 This World is the platform to generate the Genetic Algo (which is applied to travelling salesman problem)


 */
public class World extends JPanel {
    private final AtomicInteger generation;

    static final int Width = 800;
    static final int Height = 600;

    private World(){
        // set up the GUI
        setPreferredSize(new Dimension(Width,Height));
        setBackground(Color.BLACK);
        this.generation = new AtomicInteger(0);

        //set up the time to repaint the canvas (takes 5ms to call the new world)
        final Timer timer = new Timer(5,(ActionEvent e)->{
            repaint();
        });
        timer.start();
    }

    @Override
    public void paintComponent(final Graphics graphics){
        super.paintComponent(graphics);

        final Graphics2D g = (Graphics2D) graphics;
        g.setColor(Color.CYAN);

        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);

        g.drawString("gen: " + this.generation.incrementAndGet(),350,15);
    }


    public static void main(String[] args) {
        // skeleton for the visualization of the Word
        SwingUtilities.invokeLater(()->{
            final JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setTitle("Genetic Algorithm");
            frame.setResizable(false);
            frame.add(new World(),BorderLayout.CENTER);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

}
