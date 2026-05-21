// reverse the string 
// nikita ------to-----atikin

import java.util.*;
class RevereString {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();
    System.out.println("Length: " + str.length());
     String rev = "";
    for (int i = str.length()-1; i>=0; i--){
        rev = rev + str.charAt(i);
    }
    
    System.out.println(rev);
    }
}
