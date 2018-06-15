import java.util.Scanner;

 

public class Prog8{


    //ÇóºÍ

    private static long add(int a,int n){

        long sum = 0;

        long subSUM = 0;

        for(int i=1;i<n+1;i++){

            subSUM = subSUM*10+a;

            sum = sum+subSUM;

        }

        return sum;

    }

}