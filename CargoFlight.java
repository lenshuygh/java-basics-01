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
class CargoFlight extends Flight{
private boolean isCargoflight = true;
private float usedCargoSpace,maxCargoSpace;


    public CargoFlight() {
    
    }
    
    public CargoFlight(int flightNumber) {
        //this calls the constructor in the base class
        super(flightNumber);
    }
    
    public CargoFlight(float maxCargoSpace){
        this.maxCargoSpace = maxCargoSpace;
    }
    
    public CargoFlight(int flightNumber,float maxCargoSpace){
        //this(flightNumber) calls constructor above, can be super(flightNumber) in here also
        this(flightNumber);
        this.maxCargoSpace = maxCargoSpace;
    }
    
    public boolean getIsCargoFlight(){
        return isCargoflight;
    }
    //final : add1Package cannot be overridden !!!!!
    public final void add1Package(float h,float w,float d){
        double size = h * w * d;
        if(hasCargoSpace(size))
            usedCargoSpace += size;
        else
            handleNoSpace();
    }

    private boolean hasCargoSpace(double size) {
        return usedCargoSpace + size <= maxCargoSpace;
    }

    private void handleNoSpace() {
        System.out.println("Not enough space");
    }
}
