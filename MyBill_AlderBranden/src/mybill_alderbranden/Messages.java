/*
 * Messages class
 */
package mybill_alderbranden;

import javax.swing.JOptionPane;

public class Messages {
    
    //<editor-fold defaultstate="collapsed" desc="Welcome/Goodbye Messages">
    public static void welcomeMessage()
    {
        JOptionPane.showMessageDialog(null, "Welcome, please enter your information to calculate your tuition bill.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Input Messages">
    public static String enterName()
    { 
        String name;
        
        name = JOptionPane.showInputDialog("What is your name?");
        
        return name;
    }
    
    public static int getHours()
    {
        int hours;
        String temp;
        
        temp = JOptionPane.showInputDialog("How many credit hours are you taking?");
        hours = Integer.parseInt(temp);
        
        return hours;
    }
    
    public static int getStateStatus()
    {
        int state;
        
        state = JOptionPane.showConfirmDialog(null, "Are you using in state tution "
                + "rates?", "In state or out of state", JOptionPane.YES_NO_OPTION);
        
        return state;
    }
    
    public static boolean runAgain()
    {
     boolean flag;
     int n;
     
     n = JOptionPane.showConfirmDialog(null, "Do you want to run the program again?", "Run again?", JOptionPane.YES_NO_OPTION);
     flag = n == 0;
     
     return flag;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Output Messages">
    public static void showInformation(String name, int creditHours, double bill)
    {
        JOptionPane.showMessageDialog(null, "Name: " + name + "\n"
                                       + "Credit hours: " + creditHours + "\n"
                                       + "Bill: $" + bill);
    }
//</editor-fold>
}
