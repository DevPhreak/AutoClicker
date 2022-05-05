import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Actions {
    public Actions() {
    }

    public void click(int x, int y, int sleep){

        int keyPress = InputEvent.BUTTON1_DOWN_MASK;
        Robot bot = null;
        try {
            bot = new Robot();
        } catch (AWTException e) {
            System.out.println("Failed to initialize robot: \t" + e.toString());
            throw new RuntimeException(e);
        }
        //bot.mouseMove(x, y);
        bot.mousePress(keyPress);
        bot.mouseRelease(keyPress);
        System.out.printf("Sleeping for %d MS after clicking X:%d and Y:%d%n%n%n", sleep, x, y);
        bot.delay(sleep);
    }

    public int getRandomNumber(int min, int max)
    {
        Random r = new Random();
        return r.nextInt(max - min) + min;
    }
}
