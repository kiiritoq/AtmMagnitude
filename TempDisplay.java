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
public class TempDisplay implements Display,SensorObserver{

    //Atributes 
    String sensorID;
    double temp;
    
    @Override
    public void display() {
        System.out.printf("[%s] T: %.1f ºC%n",sensorID,temp);
    }

    @Override
    public void update(Sensor s) {
        this.sensorID = s.getID();
        this.temp = (double) s.getState();
        this.display();
    }
   
}
