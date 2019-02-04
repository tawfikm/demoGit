/**
 * Created by MOURCHID Tawfik  on 2/4/2019,  at 02h04
 */
public class Swap {
    public static  void  main(String args[]){

        int x = 43;
        int y = 20;

        System.out.println("x is " + x);
        System.out.println("y is " + y);


        System.out.println("swapping...");

        // swapping

        int temp = x;
        x = y;
        y = temp;


        System.out.println("x is " + x);
        System.out.println("y is " + y);

    }
}
