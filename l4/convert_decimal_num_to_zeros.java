class convert_decimal_num_to_zeros{
    public static void main(String[] args) {
        int decimal = 100;
        String rem = "";


        while(decimal!= 0){
            rem += decimal % 2;
            decimal= decimal / 2;

        }

        int count_zeros = 0;
        for(int i = rem.length() - 1 ; i >=0 ; i--){

            if(rem.charAt(i) == '0'){
                count_zeros++;
            }
            System.out.print(rem.charAt(i));
        }
        System.out.println();
        System.out.println(count_zeros);

    }
}