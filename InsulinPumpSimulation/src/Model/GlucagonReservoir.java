/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Observable;

/**
 *
 * @author Monalisa
 */
public class GlucagonReservoir extends Observable{
    
    public double available_amount = 100;
    private static GlucagonReservoir glucagonReservoir = null;
    public void refill() 
    {
      available_amount = 100; 

     }
    public void setGlucagon(double glucagonAmount )
    {
       this.available_amount = glucagonAmount;
       setChanged();
       notifyObservers(glucagonReservoir);
    }
    public double availableamount()
    {
        return available_amount;
    }
    public static GlucagonReservoir getInstance(){
	if(glucagonReservoir !=null){
	return glucagonReservoir;
	}else{
	glucagonReservoir = new GlucagonReservoir();
	return glucagonReservoir;
	}
    }
}
