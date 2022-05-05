import java.util.Scanner;

public class Menu {
    private String[] options = {"0)\tSet delay", "1)\tSet hotkey","2)\tStart clicking" ,"3)\tExit"};
    Settings s = new Settings();
    public void printMenu()
    {
        for (String s : options)
        {
            System.out.println(s);
        }
    }

    public void setDelay()
    {
        System.out.println("Enter 2 values");
        int min, max;
        min = Integer.parseInt(getInput("Enter a minimum delay:\t"));
        max = Integer.parseInt(getInput("Enter a maximum delay:\t"));
        s.setMinDelay(min);
        s.setMaxDelay(max);
    }

    public void setHotkey()
    {
        String hotkey = String.valueOf(getInput("What hotkey would you like to use to start/stop the program?:\t"));
        s.setHotkey(hotkey);
    }

    /*Zonder newline*/
    public String getInput(String prompt)
    {
        System.out.print(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public int getInput()
    {
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

}
