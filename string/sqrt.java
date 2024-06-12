package string;

public class sqrt {
    public static void main(String[] args) {
        int number=18;
        int low=0,high=8;
        int result =0;

        while (low<=high) {
            int m = low+(high-low)/2;                                   //  m=8   64>18     h=7    
            if(m*m < number){                                          //  m=3   9<18      l=4
                low=m+1;                                              //  m=5   25>18     h=4
                result=m;                                            //  m=4   return    m=4                                 
            }
            else if(m*m>number){
                high=m-1;

            }
            else{
                result = m;
                break;
            }
        }
        System.out.println(result);
    }
}
