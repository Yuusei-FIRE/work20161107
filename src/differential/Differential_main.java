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
	    		System.out.println("f(x)=x^2のx="+a+"における微分係数は"+dlib.getRx());
		         System.out.println("f(x)=x^2のx="+a+"における数値微分は"+dlib.getDx());
	              System.out.println("f(x)=x^2のx="+a+"における相対誤差は"+dlib.getLx());
	}

}
//h=0.0000001の時　　2.0000001010878066
//h=0.00000001の時　1.999999987845058でで最も2に近く、よさそうである。