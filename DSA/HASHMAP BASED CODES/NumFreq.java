// print frequency of numbers 
// Input :4 12424     output:{1=1, 2=2, 4=2}

import java.util.*;
class NumFreq {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        
        for(int i= 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int a : arr){
           map.put(a,map.getOrDefault(a,0)+1);
                
            }
               System.out.println(map);

        }
        
    }
