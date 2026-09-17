public class if_kth_bit_signed_or_unsigned{
    public static void main(String[] args) {
        int num = 0b1000100;
        int k = 3;

        int zero_num = 1; // already 0000001 or wahtever
        zero_num = zero_num << (k-1);
        // System.out.println(zero_num);
        
        if((num & zero_num) != 0){
            System.out.println("Signed");
        }
        else{
            System.out.println("Unsigned");
        }
    }   
}