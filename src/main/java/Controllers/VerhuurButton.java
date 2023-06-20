package Controllers;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.scene.control.Button;

public class VerhuurButton implements Observable {

    private Boolean status;
    public VerhuurButton(){

    }

    private void setStatusProduct(boolean verhuur){
        this.status = verhuur;

    }


    @Override
    public void addListener(InvalidationListener listener) {

    }

    @Override
    public void removeListener(InvalidationListener listener) {

    }
}
