public class Settings {
    public static int getHotkey() {
        return hotkey;
    }

    public void setHotkey(int hotkey) {
        this.hotkey = hotkey;
    }


    public static int getMinDelay() {
        return minDelay;
    }

    public static void setMinDelay(int minDelay) {
        Settings.minDelay = minDelay;
    }

    public static int getMaxDelay() {
        return maxDelay;
    }

    public static void setMaxDelay(int maxDelay) {
        Settings.maxDelay = maxDelay;
    }

    private static int minDelay = 100, maxDelay = 300;
    private static int hotkey = 47;

    public boolean isActive = false;
}
