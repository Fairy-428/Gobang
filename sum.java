import java.util.Scanner;

 

public class Prog8{

   
    //求和表达式

    private static String expressed(int a,int n){

        StringBuffer sb = new StringBuffer();

        StringBuffer subSB = new StringBuffer();

        for(int i=1;i<n+1;i++){

          subSB = subSB.append(a);

          sb = sb.append(subSB);

          if(i<n)

            sb = sb.append("+");

        }

        sb.append("=");

        return sb.toString();

    }


}