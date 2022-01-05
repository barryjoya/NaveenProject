package MyProject;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
		
		
		String fire = scan.next();
		int M4 = 79;
		int mag30 = 30;
		int mag50 = 50;
		int mag =mag30;
		int sum = M4+mag;//---Actual ammo
		System.out.println("You have "+sum+" bullets left");
		
		while(sum!=0) {
			
	     if(fire.equalsIgnoreCase("f")) {
	    	System.out.println( mag--);
	    	Thread.sleep(50);
	    	sum--;
	    	M4--;
	    	 while(mag==0) {
	    		 System.out.println("You have "+sum+" bullets left");
	    		 scan.next();
	    		 if(M4>0) {
	    			 mag = sum-M4;
	    		 }else{
	    			 mag = sum;
	    			 break;
	    		 }
	    	 }
	     }
			
		}
		System.out.println("Out of ammo");
		

	}

}
