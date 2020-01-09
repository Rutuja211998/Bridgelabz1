package FunctionalProgram;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Double t=Double.parseDouble(args [0]);
     Double v=Double.parseDouble(args [1]);
     Double w;
     if(t>50 || v>120 || v<3);
     {
    	 w=(35.74+0.6215*t + (0.4275*t - 35.75)*Math.pow(v,0.16));
     }
	System.out.println(w);
	}

}
