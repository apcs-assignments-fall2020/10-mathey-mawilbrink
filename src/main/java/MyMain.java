import java.util.Scanner;

public class MyMain {

    public static int someMethod() {
        double randInt = Math.random()*(11.0);
        int randInt2 = (int) randInt+10;
    
        return randInt2;
    }

    public static void main(String[] args) {
        int int1 = someMethod();
        int int2 = someMethod();
        int int3 = someMethod();

        System.out.println("Three random numbers are "+int1+ ", "+int2+" and "+int3+".");

        for(int i = 0; i < 2; i++){
            if (int1 > int2){
                int placeholder1 = int1;
                int1 = int2;
                int2 = placeholder1;
            }
            if (int2 > int3){
                int placeholder2 = int2;
                int2 = int3;
                int3 = placeholder2;
            }
        }

        System.out.println("The largest number is "+int3);        
        System.out.println("The smallest number is "+int1);  

        
    }

}


