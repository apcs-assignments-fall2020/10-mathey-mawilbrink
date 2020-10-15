public class Mathey {


    public static int max(int x, int y){
        if(x > y){
            return x;
        }
        else{
            return y;
        }
    }
    public static double max(double x, double y){
        if(x > y){
            return x;
        }
        else{
            return y;
        }

    }
    public static int max(int x, int y, int z){
        if (x > y && x > z){
            return x;
        }
        if( y > x && y > z){
            return y;
        }
        else{
            return z;
        }
    }
    public static double max(double x, double y, double z){
        if (x > y && x > z){
            return x;
        }
        if( y > x && y > z){
            return y;
        }
        else{
            return z;
        }
    }
    public static int min(int x, int y){
        if(x > y){
            return y;
        }
        else{
            return x;
        }
    }
    public static double min(double x, double y){
        if(x > y){
            return y;
        }
        else{
            return x;
        }

    }
    public static int min(int x, int y, int z){
        if (x < y && x < z){
            return x;
        }
        if( y < x && y < z){
            return y;
        }
        else{
            return z;
        }
    }
    public static double min(double x, double y, double z){
        if (x < y && x < z){
            return x;
        }
        if( y < x && y < z){
            return y;
        }
        else{
            return z;
        }
    }
    public static int randomInteger(int a, int b) { 
        return (int) Math.random()*(b-a+1)+a;
    }
    
    public static int randomInteger(int b) { 
        return (int) Math.random()*(b+1);
    }
}