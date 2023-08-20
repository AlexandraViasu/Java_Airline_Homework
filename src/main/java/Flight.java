import java.util.ArrayList;
import java.util.HashMap;

public class Flight {
    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMemberArrayList;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String departureTime;

    public Flight(Plane plane, String flightNumber,  String departureTime){
        this.pilots = new ArrayList<Pilot>();
        this.crew = new ArrayList<CabinCrewMember>();
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
    }

    public int getPilots() {
        return pilots.size();
    }

    public int getCrew() {
        return crew.size();
    }

    public int getPassengers() {
        return passengers.size();
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }


    public String getDepartureTime() {
        return departureTime;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int remainingSeats(){
        return (this.plane.getCapacity() - this.getPassengers());
    }

    public void addPilot(Pilot pilot){
        this.pilots.add(pilot);
    }

    public void addCabinCrew(CabinCrewMember cabinCrew){
        this.crew.add(cabinCrew);
    }

    public void addPassenger(Passenger passenger){
        if (this.plane.getCapacity() > this.getPassengers()){
            this.passengers.add(passenger);
        }
    }

}
