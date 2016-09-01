
/**
 * Write a description of class Lift here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lift
{
    // instance variables - replace the example below with your own
    private int maxFloor, minFloor, numberOfPeople, maxPeople, liftLocation;

    /**
     * Constructor for objects of class Lift
     */
    public Lift()
    {
        maxFloor = 10;
        minFloor = -2;
        numberOfPeople = 0;
        maxPeople = 0;
        liftLocation = 0;
    }

    public void ascend()
    {
        if (liftLocation < maxFloor)
        {
            liftLocation = liftLocation+1;
        }
        else
        {
            System.out.println ("You are unable to go up, please go down");
        }
    }
    
    public void descend()
    {
        if (liftLocation == minFloor){
            System.out.println ("");
        }
        else{
            liftLocation=liftLocation-1;
        }
    }
}
