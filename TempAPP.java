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
public class TempAPP {
    public static void main(String[] args) {
        TempSensor ts = new TempSensor("TM01");
        HumSensor hs = new HumSensor("HUM01");
        TempDisplay td = new TempDisplay();
        HumDisplay hd = new HumDisplay();
        StatsDisplay sd = new StatsDisplay();
        
        hs.attach(hd);
        hs.setState(80);
        ts.attach(td);
        ts.attach(sd);        
        ts.setState(21.12);
        ts.setState(40.0);
        ts.setState(12.42);
        
        
    }
    
}
