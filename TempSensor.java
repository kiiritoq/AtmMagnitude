/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtmMagnitude;

/**
 *
 * @author kirito
 */
public class TempSensor extends Sensor{
    //Atribute
    double state;
    
    //Builder
    public TempSensor(String id){
        super(id);
        
    }

    @Override
    Object getState() {
        return state;
    }

    @Override
    void setState(Object state) {
        this.state = (double) state;
        notifyObservers();
        
    }
    
}
