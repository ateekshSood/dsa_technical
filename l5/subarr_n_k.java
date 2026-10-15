import java.util.*;

public class subarr_n_k{

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(7);
        al.add(9);
        al.add(2);
        al.add(0);
        al.add(9);
        al.add(2);


        int l = 0;
        int r = 2;

        int sum_sub_arr = 0;

        for(int i = l ; i<=r ; i++){
            sum_sub_arr += al.get(i);
        }

        while(r <= al.size() - 1){

            if(sum_sub_arr == 11){
                System.out.println("Foudn the sub arry");
                System.out.println(l);
                System.out.println(r);
                break;

            }

            else{
                sum_sub_arr -= al.get(l);
                l+=1;
                r+=1;
                sum_sub_arr += al.get(r);
            }


        }

    }
}
