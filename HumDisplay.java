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
public class HumDisplay implements Display,SensorObserver{
    
    //Atributes
    String sensorID;
    int humidity;
    
    
    @Override
    public void display() {
        System.out.printf("[%s] H: %d %%%n",sensorID,humidity);
    }

    @Override
    public void update(Sensor s) {
        this.sensorID = s.getID();
        this.humidity = (int) s.getState();
        display();
    }
    
}
