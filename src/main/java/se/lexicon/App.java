package se.lexicon;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    }

    public static String isAdult(int age){

        String result = "Don't Know The Age";
        int adultAge = 21;

        if (age >= adultAge){
            result = "You are an adult";
        } else if(age >= 18){
            result = "You are an young adult";
        } else{
            result = "You're a Baby";
        }

        return result;
    }







//    public static boolean isAdult(int age){
//
//        boolean result = false;
//        int adultAge = 18;
//
//        if (age >= adultAge){
//            result = true;
//        }else{
//            result = false;
//        }
//
//        return result;
//    }

}
