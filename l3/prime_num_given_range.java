import java.util.Arrays;

public class prime_num_given_range{

    static boolean is_prime(int n){
        if( n == 2){
            return true;
        }

        for(int i = 2 ; i <n ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {

        int n = 23;
        int [] arr = new int[n + 1]; // init to zero
        Arrays.fill(arr , 1);

        // now prime numbers upto root n will divide all the composite num upto n 

        // 0 index and 1 index are not prime 
        // rest init all to 1 
        arr[0] = 0;
        arr[1] = 0;

        //iterate from 2 to root n 

        for(int i = 2 ; i<= Math.pow(n , 0.5) ; i ++){
            if(is_prime(i)){
                //filter out multiples 
                for(int j = i * i ; j<=n ; j+=i){
                    arr[j] = 0;
                }
            }
        }

        // print prime
        for(int i = 0 ; i<n ; i++){
            if(arr[i] == 1){
                System.out.print(i + " ");
            }
        }

        
    }
}