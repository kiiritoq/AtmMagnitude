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
public class HumSensor extends Sensor{
    //Atribute
    int state;
    
    //Builder
    public HumSensor(String id){
        super(id);
    }

    @Override
    Object getState() {
        return state;
    }

    @Override
    void setState(Object state) {
        this.state = (int) state;
        notifyObservers();
    }
    
}
