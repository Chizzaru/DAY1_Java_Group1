import javax.swing.*;

public class HelloSwing
{
    public static void main(String[] args)
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame frame = new JFrame("Hello World Swing");
                JLabel label = new JLabel("Hello World");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(label);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}