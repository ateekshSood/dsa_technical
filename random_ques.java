/*

an array is given , it has either 0 or 1 , unsorted eg [ 0 1 0 0 1 0]. 
dynamic size. size elements inputs 
put all 0 toghether and put all 1 together

*/

import java.util.*;


public class random_ques{
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>(); 

        al.add(0);
        al.add(1);
        al.add(0);
        al.add(0);
        al.add(1);
        al.add(0);
        al.add(0);
        al.add(0);
        al.add(1);
        

        // two pointer approach ig 
        int l = 0;
        int r = al.size() - 1;

        System.out.println(al);

        while(l <= r){
//             if(al.get(l) == 0 && al.get(r) == 1){
//                 l+=1;
//                 r-=1;
//                 continue;
//             }
// 
//             else if(al.get(l) == 1 && al.get(r) == 0){
//                 Collections.swap(al , l  , r);
//                 l+=1;
//                 r-=1;
//             }
// 
//             else if(al.get(l) == 1 && al.get(r) == 1){
//                 r-=1;
//             }
// 
//             else if(al.get(l) == 0 && al.get(r) == 0){
//                 l+=1;
//             }

                if(al.get(l) == 0){

                    if(al.get(r) == 1){
                        r-=1;
                    }
                    
                        l+=1;
                    
                    
                }

                else{

                    if(al.get(r) == 0){
                        Collections.swap(al , l , r);
                        l+=1;
                    }

                    r-=1;
                    
                }
        }

        System.out.println(al);
        
    }
}