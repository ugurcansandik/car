import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner scanner = new Scanner(System.in);
	    int choice = -1, choice1;
	    int index = -1;
	    int totalSpeed = 0;
		String menu = "0. Exit\n1. Create Car\n2. Step on the Gas\n3. Step on the Brake\n4. Check Cars\nEnter your selection => ";
		Car cars [] = new Car[5];
		
		while(choice != 0)
		{
		    System.out.print(menu);
		    choice = scanner.nextInt();
		    
		    switch (choice)
		    {
		        case 1:
		            index += 1;
		            Car car = new Car();
		            cars[index] = car;
		            System.out.print("Car[" + index + "] is created.\nCars {");
		            for (int i = 0 ; i <= index ; i++ )
		            {
		                if (i == 0)
		                {
		                    System.out.print(i);
		                }
		                else
		                {
		                    System.out.print("," + i);
		                }
		            }
		            System.out.println("} currently exist.");
		            break;
	            
	            case 2:
	                System.out.print("Enter Car to Accelerate among {");
	                for (int i = 0 ; i <= index ; i++ )
		            {
		                if (i == 0)
		                {
		                    System.out.print(i);
		                }
		                else
		                {
		                    System.out.print("," + i);
		                }
		            }
		            System.out.print("} => ");
		            choice1 = scanner.nextInt();
		            cars[choice1].setSpeed(cars[choice1].getSpeed() + 1);
		            System.out.println("Car[" + choice1 + "] is accelerated. It's speed is " + cars[choice1].getSpeed() + ".");
		            break;
	            
	            case 3:
	                System.out.print("Enter Car to Decelerate among {");
	                for (int i = 0 ; i <= index ; i++ )
		            {
		                if (i == 0)
		                {
		                    System.out.print(i);
		                }
		                else
		                {
		                    System.out.print("," + i);
		                }
		            }
		            System.out.print("} => ");
		            choice = scanner.nextInt();
		            cars[choice].setSpeed(cars[choice].getSpeed() - 1);
		            System.out.println("Car[" + choice + "] is decelerated. It's speed is " + cars[choice].getSpeed() + ".");
		            break;
		            
	            case 4:
	                totalSpeed = 0;
	                int speed = 0;
	                for (int i = 0 ; i <= index ; i++ )
	                {
	                    speed = cars[i].getSpeed();
	                    System.out.println("Car" + i + " speed = " + speed);
	                    totalSpeed = totalSpeed + speed;
	                }
	                System.out.println("Total speed of all cars are " + totalSpeed);
	                break;
		    }
		}
	}
}
