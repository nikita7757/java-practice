import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What you want");
        System.out.println("1. Veg food");
        System.out.println("2. Non-veg food");
        System.out.println("Enter your choice (1 or 2):");

        int choice = sc.nextInt();
       
      
    if(choice==1){
            
        System.out.println("Veg menu:");
        System.out.println("1. Paneer masala");
        System.out.println("2. Palak paratha");
        System.out.println("3. Aaloo paratha");
        System.out.println("4. Palak paneer");
        System.out.println("5. Dal tadka");
        System.out.println("6. Paneer kabab");
        System.out.println("7. Aamras");
        System.out.print("Enter your choice (1-7): ");

        int Vegmenu = sc.nextInt();
        switch (Vegmenu) {
            case 1:
                System.out.println("1. Paneer masala");
                break;
            case 2:
                System.out.println("2. Palak paratha");
                break;
            case 3:
                System.out.println("3.Aaloo Paratha");
                break;
            case 4:
                System.out.println("4. Dal tadka");
                break;
            case 5:
                System.out.println("5. Paneer kabab");
                break;
            case 6:
                System.out.println("6. Wall-E");
                break;
            case 7:
                System.out.println("7. Amaras");
                break;
                
            default:
                System.out.println("Please enter a valid choice:");
                break;
        }
    }
    else if(choice ==2){
       
        System.out.println("Non-veg menu:");
        System.out.println("1.chicken masala");
        System.out.println("2.chiken kabab");
        System.out.println("3. chicken murg tikka");
        System.out.println("4. Butter chicken ");
        int Non_vegmenu = sc.nextInt();

        switch (Non_vegmenu) {
            case 1:
                System.out.println("1. chicken masala");
                break;
            case 2:
                System.out.println("2.chiken kabab");
                break;
            case 3:
                System.out.println("3.chicken murg tikka");
                break;
            case 4:
                System.out.println("4. Butter chicken");
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
