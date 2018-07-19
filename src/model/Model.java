package model;

import model.utilities.RadioInteger;

public class Model {
    private static final Model INSTANCE = new Model();
    private RadioInteger radioInteger = new RadioInteger();

    private Model(){}

    public void increaseRadioInteger(){
        radioInteger.increase();
    }

    public static Model getInstance() {
        return INSTANCE;
    }

    public RadioInteger getRadioInteger(){
        return radioInteger;
    }
}
