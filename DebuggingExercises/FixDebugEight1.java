// Application prompts user showing valid shipping codes
// accepts a shipping code
// and determines if it is valid

//import statement for option pane
import javax.swing.*;
public class FixDebugEight1
{
   public static void main(String args[])
   {
      //variable declaration
      char userCode;
      String entry, message;
      boolean found = false;

      //Array of char values in a list
      char[] okayCodes = {'A','C','T','H'};
      StringBuffer prompt = new
          StringBuffer("Enter shipping code for this delivery\nValid codes are: ");

      //For loop
      for(int x = 0; x < okayCodes.length; ++x)
      {
          prompt.append(okayCodes[x]);
          if(x == (okayCodes.length - 1))
             prompt.append(", ");
      }
      // Receives input for the entry to check whether it's a good code
      entry = JOptionPane.showInputDialog(null,
         prompt);

      //variable assigned to user input and is converted to uppercase
      userCode = entry.toUpperCase().charAt(0);
      for(int i = 0; i < okayCodes.length; ++i)
      {
         if(userCode == okayCodes[i])
         {
            found = true;
         }
      }
      if(found)
         message = "Good code";
      else
         message = "Sorry, code not found.";
      JOptionPane.showMessageDialog(null, message);
   }
}