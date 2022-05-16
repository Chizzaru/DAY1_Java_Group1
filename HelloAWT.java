import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class HelloAWT
{
    public static void main(String[] args)
    {
        Frame f = new Frame("Hello World AWT");
        Label label1 = new Label("Hello World", Label.CENTER);
        f.add(label1);
        f.setSize(400, 400);
        f.setVisible(true);
        f.addWindowListener (new WindowAdapter()
        {
            public void windowClosing(WindowEvent event)
            {
                System.exit(0);
            }
        });
    }
}