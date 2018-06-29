import java.util.Scanner;

 

public class Prog8{

    public static void main(String[] args){

        System.out.print("求s=a+aa+aaa+aaaa+...的值，请输入a的值：");

        Scanner scan = new Scanner(System.in).useDelimiter("\\s*");//以空格作为分隔符

        int a = scan.nextInt();

        int n = scan.nextInt();

        scan.close();//关闭扫描器

        System.out.println(expressed(2,5)+add(2,5));

    }


}
