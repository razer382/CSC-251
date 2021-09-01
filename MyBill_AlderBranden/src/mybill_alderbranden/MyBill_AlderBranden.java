//<editor-fold defaultstate="collapsed" desc="Block Comment">
/*
* Branden Alder
* CSC-251
* Date Created: 8/16/2021
* Date Updated: 8/23/2021
* My bill assignment displaying name, credit hours and bill
*/
//</editor-fold>

package mybill_alderbranden;

import javax.swing.JOptionPane;


public class MyBill_AlderBranden {

        public static final double SUPPORT_FEE = 25.00;
        public static final double TECH_FEE = 16.00;
        public static final double CAPS = 15.00;
    
    public static void main(String[] args) 
    {
        String name;
        int creditHours;
        double bill;
        int state;
        
        
        // Welcome message
        Messages.welcomeMessage();
        
        do{
        
        // Gets information
        name = Messages.enterName();
        creditHours = Messages.getHours(); // TODO - Fix
        state = Messages.getStateStatus();
        
        if(state == 0)
        {
            bill = calculateInState(creditHours);
        }
        else
        {
            bill = calculateOutOfState(creditHours);
        }
        
        // Displays information
        Messages.showInformation(name, creditHours, bill);
        
        }while(Messages.runAgain());
        
    }
 
    public static double calculateInState(int creditHours)
    {
        return creditHours * 76.00 + SUPPORT_FEE + TECH_FEE + CAPS;
    }
    
    public static double calculateOutOfState(int creditHours)
    {
        return creditHours * 268.00 + SUPPORT_FEE + TECH_FEE + CAPS;
    }
    
}