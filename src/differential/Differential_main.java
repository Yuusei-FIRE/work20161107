package differential;

import java.util.Scanner;

public class Differential_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input value a> ");
	    double a = Double.parseDouble(scan.next());
	    System.out.print("Input value h> ");
	    double h = Double.parseDouble(scan.next());
	    
	    Differential_lib dlib = new Differential_lib(a,h);
	    		System.out.println("f(x)=x^2��x="+a+"�ɂ���������W����"+dlib.getRx());
		         System.out.println("f(x)=x^2��x="+a+"�ɂ����鐔�l������"+dlib.getDx());
	              System.out.println("f(x)=x^2��x="+a+"�ɂ����鑊�Ό덷��"+dlib.getLx());
	}

}
//h=0.0000001�̎��@�@2.0000001010878066
//h=0.00000001�̎��@1.999999987845058�łōł�2�ɋ߂��A�悳�����ł���B