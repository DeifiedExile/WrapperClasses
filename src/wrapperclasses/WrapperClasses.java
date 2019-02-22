
package wrapperclasses;

import java.util.Scanner;


public class WrapperClasses {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        byte bValue;
        short sValue;
        int intValue;
        long lValue;
        String minType = "";
        String minSize = "";
        System.out.println("Enter a number: ");
        lValue = Long.parseLong(input.nextLine());
        
        
        if(!(lValue > Byte.MAX_VALUE || lValue < Byte.MIN_VALUE))
        {
            minType = Byte.TYPE.toString();
            minSize = "" + Byte.SIZE;
        }
        else if(!(lValue > Short.MAX_VALUE || lValue < Short.MIN_VALUE))
        {
            minType = Short.TYPE.toString();
            minSize = "" + Short.SIZE;
        }
        else if(!(lValue > Integer.MAX_VALUE || lValue < Integer.MIN_VALUE))
        {
            minType = Integer.TYPE.toString();
            minSize = "" + Integer.SIZE;
        }
        else
        {
            minType = Long.TYPE.toString();
            minSize = "" + Long.SIZE;
        }
        System.out.println("The smallest data type that " + lValue + " fits in is a\n"
                + minType + " which is " +  minSize + " bytes.");
        
    }
    
}
