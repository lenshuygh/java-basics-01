/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectref;

/**
 *
 * @author lens
 */
class Flight {
    private boolean isFlight = true;
    private int flightNumber,passengers;
    private char flightClass;
    
    public Flight() {
    }
    public Flight(int flightNumber){
        this.flightNumber = flightNumber;
    }
    
    public boolean getIsFlight(){
        return isFlight;
    }
    
    public void setFlightNumber(int flightNumber){
        this.flightNumber = flightNumber;
    }
    
    @Override
    public boolean equals(Object o){
        if(super.equals(o)){
            return true;
        }
        
        
        if(!( o instanceof Flight)){
            return false;
        }
        Flight otherVar = (Flight) o;
        
        return flightNumber == otherVar.flightNumber && flightClass == otherVar.flightClass;
        
    }
    @Override
    public String toString(){
        if(flightNumber > 0)
            return "Flight #" + flightNumber;
        else
            return "Flight Class " + flightClass;
    }
    
    int getPassengers() {
        return passengers;
    }
}
