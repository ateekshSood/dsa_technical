public class two_missing_num_array{
    public static void main(String[] args) {
        int [] arr = {1 ,2 ,4 , 5 , 6 , 8};
        int n = 8;

        // first do normal xor 
        int arr_xor = 0;
        int num_xor = 0;

        for(int i = 0 ; i<arr.length ; i++){
            arr_xor = arr_xor ^ arr[i];
        }

        for(int i =0 ; i<=n ; i++){
            num_xor = num_xor ^ i;
        }


        // now do both xor 
        int x3 = 0;
        x3 = arr_xor ^ num_xor; // it will be 3 ^ 7 which is 4 and 3 is 0011 and 7 is 0111 whihc means only the 
        // 3 rd from right is diff.

        //now we gotta find which right most bit is different 
        // formula is x3 = x3 & ~(x3 - 1);

        x3 = x3 & ~(x3 -1); // now it will be 0100 which means the 3rd bit from right is different

        //now we gotta divide the nums upto n into two groups
        int x4 = 0; //if 3rd bit is 0
        int x5 = 0; // if 3rd bit is 1
        for(int i = 0 ; i<=n ; i++){

            if( (i & x3) !=0){
                x5 = x5 ^ i; // 4^ 5 ^ 6 ^ 7
            }
            else{
                x4 = x4 ^ i; // 1 ^ 2 ^ 3 ^ 8
            }

        }

        // now do for the array  

        for(int i =0 ; i<arr.length ; i++){
            if((arr[i] & x3) != 0){
                x5 = x5 ^ arr[i]; // 4 ^ 5 ^ 6 ^ 4 ^ 5 ^ 6 ^ 7
            }
            else{
                x4 = x4 ^ arr[i]; // 1 ^ 2 ^ 8 ^1 ^ 2 ^ 3 ^ 8
            }
        }

        // now x5 and x4 will cancel so thats our output

        System.out.println(x4);
        System.out.println(x5);
        
        
    }
}