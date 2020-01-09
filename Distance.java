package FunctionalProgram;
import java.util.Scanner;
public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  int x1=sc.nextInt();
		  int x2=sc.nextInt();
		  int y1=sc.nextInt();
		  int y2=sc.nextInt();
		  double dis;
          dis=(double)Math.sqrt(Math.pow(x2-x1,2)+Math.pow((y2-y1),2));
        System.out.println(dis);
	}
  

}


