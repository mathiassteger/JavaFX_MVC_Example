package model;

import java.util.Observable;

public class Model extends Observable{
    int number = 0;

    public void increase(){
        number++;
        setChanged();
        if(number % 2 == 0){
            notifyObservers(new Even());
        } else {
            notifyObservers(new Uneven());
        }
    }


}
