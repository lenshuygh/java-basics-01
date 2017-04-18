package objectref;


public class ObjectRef {

    public static void main(String[] args) {

        Object[] stuff = new Object[3];
        stuff[0] = new Flight();
        stuff[1] = new Passenger(0,2);
        stuff[2] = new CargoFlight();
        
        Object o = new Passenger();
        System.out.println("class = " + o.getClass());
        o = new Flight[5];
        System.out.println("class = " + o.getClass());
        o = new CargoFlight();
        System.out.println("class = " + o.getClass());
        
        if(o instanceof CargoFlight){
            CargoFlight cf = (CargoFlight) o;
            System.out.println("check if cargoflight : " + cf.getIsCargoFlight());
        }
        System.out.println();
        System.out.println();
        System.out.println("--------------");
        System.out.println();

        Flight f1 = new Flight(175);
        Flight f2 = new Flight(175);
        
        System.out.println("equals? : " + (f1.equals(f2)));
        
        f2.setFlightNumber(174);
        System.out.println("equals? : " + (f1.equals(f2)));
        Passenger p = new Passenger();
        System.out.println("equals? passenger: " + (f1.equals(p)));
        
        System.out.println("inheritance and constructors");
        
        Flight f175 = new Flight(175);
        CargoFlight cf = new CargoFlight();
        CargoFlight cf294 = new CargoFlight(294);
        CargoFlight cf85 = new CargoFlight(85,2000.0f);
        CargoFlight cfCargoSpaceOnly = new CargoFlight(50.0f);
        System.out.println("is flicght : " + cfCargoSpaceOnly.getIsFlight());
        System.out.println("is cargoflight : " + cfCargoSpaceOnly.getIsCargoFlight());
        
        
        System.out.println("");
        System.out.println("string stuff");
        System.out.println("");
        
        Flight ff = new Flight(175);
        System.out.println("flight.toString : " + ff.toString());
    }
    
}
