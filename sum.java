import java.util.Scanner;

 

public class Prog8{

    public static void main(String[] args){

        System.out.print("��s=a+aa+aaa+aaaa+...��ֵ��������a��ֵ��");

        Scanner scan = new Scanner(System.in).useDelimiter("\\s*");//�Կո���Ϊ�ָ���

        int a = scan.nextInt();

        int n = scan.nextInt();

        scan.close();//�ر�ɨ����

        System.out.println(expressed(2,5)+add(2,5));

    }


}