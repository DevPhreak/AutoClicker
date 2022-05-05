public class Settings {
    public String getHotkey() {
        return hotkey;
    }

    public void setHotkey(String hotkey) {
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
    private static String hotkey;
}
