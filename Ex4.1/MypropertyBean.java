
import java.beans.*;
import java.io.Serializable;


public class MypropertyBean implements Serializable {
    
    public static final String VALUE_PROPERTY = "value";
    
    private int[] value = new int[2];
    
    private PropertyChangeSupport propertySupport;
    
    public MypropertyBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public int[] getValue() {
        return value;
    }
    
    public void setValue(int[] value) {
        int[] oldValue = this.value;
        this.value = value;
        propertySupport.firePropertyChange(VALUE_PROPERTY, oldValue, this.value);
    }
    
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }


    
}
