import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What's your interest?");
        System.out.println("1. Movies");
        System.out.println("2. Series");
        System.out.println("Enter your choice (1 or 2):");

        int choice = sc.nextInt();
       
      
    if(choice==1){
            
        System.out.println("Movies you want to watch today:");
        System.out.println("Movie you wish to watch today:");
        System.out.println("1. Founder");
        System.out.println("2. Snowden");
        System.out.println("3. Jobs");
        System.out.println("4. Her");
        System.out.println("5. Social Network");
        System.out.println("6. Wall-E");
        System.out.println("7. Al");
        System.out.print("Enter your choice (1-7): ");

        int moviechoice = sc.nextInt();
        switch (moviechoice) {
            case 1:
                System.out.println("1. Founder");
                break;
            case 2:
                System.out.println("2. Snowden");
                break;
            case 3:
                System.out.println("3. Jobs");
                break;
            case 4:
                System.out.println("4. Her");
                break;
            case 5:
                System.out.println("5. Social Network");
                break;
            case 6:
                System.out.println("6. Wall-E");
                break;
            case 7:
                System.out.println("7. AI");
                break;
                
            default:
                System.out.println("Please enter a valid choice:");
                break;
        }
    }
    else if(choice ==2){
       
        System.out.println("Best series to watch:");
        System.out.println("1. Silicon Valley");
        System.out.println("2.  Devs");
        System.out.println("3. The IT Crowd");
        System.out.println("4. Mr. Robot");
        int serieschoice = sc.nextInt();

        switch (serieschoice) {
            case 1:
                System.out.println("1. Silicon Valley");
                break;
            case 2:
                System.out.println("2. Devs");
                break;
            case 3:
                System.out.println("3. The IT Crowd");
                break;
            case 4:
                System.out.println("4. Mr. Robot");
                break;
                     
            default:
                System.out.println("Please enter a valid choice .");
                break;

        }
    } 
    else{
        System.out.println("Please enter a valid choice(1 or 2) :");
        choice = sc.nextInt();
    } 
      
        sc.close();
    }
}
