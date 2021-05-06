public class Car
{
    int speed;
	
	public Car(){}
	
	public void setSpeed(int speed)
	{
	    if (speed >= 0 && speed <= 10)
	    {
	        this.speed = speed;
	    }
	    else
	    {
	        System.out.print("Speed out of range.");
	    }
	}
	
	public int getSpeed()
	{
	    return this.speed;
	}
}
