import java.awt.*;
import java.awt.event.KeyListener;

public class main {
    //Autoclicker
    //Custom delay (min-max)
    //keylistener voor start stop
    //configuratie via cli of bij start


    public static void main(String [] args)
    {
        Listener listener = new Listener();
        Actions Action = new Actions();
        Settings settings = new Settings();
        Menu menu = new Menu();

        while (settings.isActive) {
        Action.click(500,500, Action.getRandomNumber(Settings.getMinDelay(), Settings.getMaxDelay()));
    }

        while(!settings.isActive) {
            menu.printMenu();
            int choice = menu.getInput();
            switch (choice) {
                case 0:
                    menu.setDelay();
                    break;
                case 1:
                    menu.setHotkey();
                    break;
                case 2:
                    Point b = MouseInfo.getPointerInfo().getLocation();
                    Action.click((int) b.getX(), (int) b.getY(), Action.getRandomNumber(Settings.getMinDelay(), Settings.getMaxDelay()));
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Thats not an option");
            }
        }
    //    Hotkey -> Active = !Active

    }
}
