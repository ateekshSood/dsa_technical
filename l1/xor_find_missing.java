
public class xor_find_missing {
    public static void main(String[] args) {
        int [] arr = {1 , 2 , 3 , 4 , 5 , 7};
        int arr_xor = 0;
        int num_xor = 0;
        
        for(int i = 0 ; i<arr.length ; i++){
            arr_xor = arr_xor ^ arr[i];
            num_xor = num_xor ^ (i+1);
        }

        num_xor = num_xor ^ (arr.length + 1);
        int missing_num = arr_xor ^ num_xor;

        System.err.println(missing_num);
        

        
    }
}