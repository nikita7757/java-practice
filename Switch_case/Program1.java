/*Write a pogram in which students should enter marks of 5 different subjects.If
all 5 subject having passing marks add them and provide to switch case to print grades
and clsses if student get fail in any subsect program should print "You tailed in exam 
*/

package Switch_case;

  
import java.io.*;
class Program1 {
   public static void main(String[]args)throws IOException{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int CnMarks;
         System.out.println("enter marks of computer network  = ");
         CnMarks=Integer.parseInt(br.readLine());

          int tocMarks;
         System.out.println("enter marks of Theory of computation = ");
         tocMarks=Integer.parseInt(br.readLine());

          int dbmsMarks;
         System.out.println("enter marks of  Dbms = ");
         dbmsMarks=Integer.parseInt(br.readLine());

          int osMarks;
         System.out.println("enter marks of operating system = ");
         osMarks=Integer.parseInt(br.readLine());

         int cgMarks;
         System.out.println("enter marks of computer graphics = ");
         cgMarks=Integer.parseInt(br.readLine());
         if(CnMarks<35||tocMarks<35||osMarks<35||dbmsMarks<35||cgMarks<35){
           System.out.println("student is failed in exam");
         }
         else{
          double avg = (cgMarks+tocMarks+osMarks+dbmsMarks+CnMarks)/5;
          char ch ;
          if(avg>75)
          ch='A';
          else if(avg>60)
          ch='B';
          else if(avg>50)
          ch='C';
          else if(avg>40)
          ch='C';
          else if(avg>30)
          ch='D';
          else if(avg>=35)
          ch='E';
          else
          ch='F';
          switch (ch){
           case 'A':
           System.out.println("firstclass with distinction");
           break;
            case 'B':
           System.out.println("firstclass");
           break;
            case 'C':
           System.out.println("second class");
           break;
            case 'D':
           System.out.println("Thirdclass");
           break;
            case 'E':
           System.out.println("pass");
           break;
            case 'F':
           System.out.println(" sorry you are Failed !!");
           break;
          }
            }
           }
   }


