import javax.swing.*;
import java.awt.*;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Listener
{
    public Listener()
    {
        drawOverlay();
    }

    public static void drawOverlay()
    {
        Settings settings = new Settings();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                javax.swing.JFrame frame = new JFrame();
                frame.setUndecorated(true);
                frame.setOpacity(0f);
                frame.setBounds(0,0,1920,1080);
                frame.addKeyListener(new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                    }

                    @Override
                    public void keyPressed(KeyEvent e) {
                        //System.out.println("KeyPressed: " + e.getKeyCode());
                        if(e.getKeyCode() == Settings.getHotkey())
                        {
                            settings.isActive = !settings.isActive;
                            System.out.println("Keybind pressed, setting isActive to " + settings.isActive);
                        }
                    }

                    @Override
                    public void keyReleased(KeyEvent e) {

                    }
                });
                //frame.add(button);
                frame.setVisible(true);
            }
        });
    }
}