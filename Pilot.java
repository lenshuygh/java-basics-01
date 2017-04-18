
package objectref;

//because a method is marked as abstract the class needs to be marked as abstract aswel
public abstract class Pilot {
    private Flight currentFlight;
    
    public void fly(Flight f){
        if(canAccept(f))
            currentFlight = f;
        else
            handleCantAccept();
    }
    //abstract method: this method needs to be overwritten in the class that inherits from the Pilot class
    public abstract boolean canAccept(Flight f);
    
    private void handleCantAccept(){
        System.out.println("pilot cannnot accept this flight");
    }
}
