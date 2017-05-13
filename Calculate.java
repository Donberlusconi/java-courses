/**
 * Created by Administrator on 13.05.2017.
 */
public class Calculate {
    public static void main(String[] arg){

        int first = Integer.valueOf(arg[0]);
        int second = Integer.valueOf(arg[1]);
        double result;
        String delimiter = "";
        delimiter = String.valueOf(arg[2]) ;

        if (delimiter.equals("+")) {
            result = first + second;
        }

        else if (delimiter.equals("-")){
            result = first - second;
        }

        else if (delimiter.equals("/")){
            result = first/second;
        }

        else
        {
            result = first*second;
        }

        System.out.println("Result is: " + result + " Delimiter is: " + delimiter);
    }
}
