import java.util.*;

public class matrix_1_count{
    public static void main(String [] args){
        
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        matrix.add(new ArrayList<Integer>(List.of(0 , 0  , 1 , 1 , 1 ,1)));
        matrix.add(new ArrayList<Integer>(List.of(0 , 0  , 1 , 1 , 1 ,1)));
        matrix.add(new ArrayList<Integer>(List.of(0 , 0  , 1 , 1 , 1 ,1)));
        matrix.add(new ArrayList<Integer>(List.of(0 , 0  , 1 , 1 , 1 ,1)));

   
        int max_count = 0 , count = 0 ;
        
        for(int i = 0  ; i< matrix.size() ; i++){
            for(int j = 0 ; j < matrix.get(0).size() ; j++){
                if(matrix.get(i).get(j) == 1){
                    count = matrix.get(0).size() - j;
                    break;
                }

                
            }

            max_count = Math.max(max_count , count);
        }

        System.out.println(max_count);
        
        
    }
}