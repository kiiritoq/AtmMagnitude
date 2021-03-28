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
abstract class Sensor {
    
    //Atributes
    
    private SensorObserver observerList[] = new SensorObserver[5];
    private String id; //ID do sensor -> name
    
    //Builder
    
    public Sensor(String id){
        this.id = id;
    }
    
    //Methods
    public String getID(){ return this.id;}
    abstract Object getState();
    abstract void setState(Object state);
    protected void notifyObservers(){
        for(int i =0; i<observerList.length; i++){
            if(observerList[i] != null){
                observerList[i].update(this);
            }            
        }

    }
    public void attach(SensorObserver o){
     for(int i =0; i<observerList.length; i++){
         if(observerList[i] == null){
             observerList[i] = o;
             break;
         }
     }   
    }
    
    public void deatch(SensorObserver o){
        for(int i =0; i<observerList.length; i++){
            if(observerList[i] == o){
                observerList[i] = null;
                break;
            }
        }
    }
    
}
