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
public class StatsDisplay implements Display, SensorObserver{
   
    //Atributes
    String sensorID;
    double tempMax = 0.0,tempMin=0.0;

    @Override
    public void display() {
        System.out.printf("[%s] T min: %.1f - T max: %.1f%n",sensorID,tempMin,tempMax);
    }

    @Override
    public void update(Sensor s) {
        this.sensorID = s.getID();
        if(tempMax == 0.0 && tempMin == 0.0){
            tempMax = (double) s.getState();
            tempMin = (double) s.getState();
        }else if((double) s.getState() < tempMin){
            tempMin = (double) s.getState();
        }else if( (double) s.getState() > tempMax){
            tempMax = (double) s.getState();
        }
        display();
        
        
    }
    
}
