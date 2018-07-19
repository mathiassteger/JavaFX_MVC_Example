package model.utilities;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class RadioInteger {
    int value;
    private final PropertyChangeSupport valuePCS = new PropertyChangeSupport(this);

    public synchronized void setValue(int value) {
        int oldValue = value;
        this.value = value;
        valuePCS.firePropertyChange("value", oldValue, value);
    }

    public synchronized void increase() {
        int oldValue = value;
        this.value++;
        valuePCS.firePropertyChange("value", oldValue, value);
    }

    public void subscribeToValue(PropertyChangeListener l){
        valuePCS.addPropertyChangeListener(l);
    }
}
