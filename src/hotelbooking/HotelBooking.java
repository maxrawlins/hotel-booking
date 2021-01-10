

package hotelbooking;

import java.awt.Toolkit;
import java.util.*;
import java.io.*;

public class HotelBooking {

  
    public static void main(String[] args) {
             hotelBookGui start = new hotelBookGui(); 
        Toolkit tk = Toolkit.getDefaultToolkit();
        int width =(int) tk.getScreenSize().getWidth();
         int height =(int) tk.getScreenSize().getHeight();

        start.setSize(width,height);
        start.setVisible(true);
    }
    
}
