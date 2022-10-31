package Activities;
import java.util.*;

public class Activity6 {
    public static void main(String args[]) throws InterruptedException {
        //There is a plane with max 10 passengers
        plane Plane = new plane(10);
        //Add passengers on the list
        Plane.onboard("John");
        Plane.onboard("Steve");
        Plane.onboard("Anna");
        //Plane takes off
        System.out.println("Plane took off at: " + Plane.takeOff());
        //Print list of people on board
        System.out.println("People on the plane: " + Plane.getPassengers());
        //Flying.....

        Thread.sleep(5000);
        //Plane has landed
        Plane.land();
        //Plane lands
        System.out.println("Plane landed at: " + Plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + Plane.getPassengers());
    }
}

class plane
{
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;
public plane(int maxPassengers)//local variable: local variable always shadows instance variable and we have to use this keyword to indicate instance of class
{
    this.maxPassengers=maxPassengers;
    this.passengers=new ArrayList<>();

}
    public void onboard(String passenger)
    {
        passengers.add(passenger);

    }
    public Date takeOff() {
        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }
    public void land() {
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }
    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }
    public List<String> getPassengers() {
        return passengers;
    }
}