
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


public class listener2 implements PropertyChangeListener{

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        int[] s = (int[]) evt.getNewValue();
        System.out.println("live result: Thai "+ s[0] +"-" +s[1]+" UAE"); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
