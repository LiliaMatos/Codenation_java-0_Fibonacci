package br.com.codenation.desafioexe;
import java.util.ArrayList;// import the ArrayList class
import java.util.List; 

public class DesafioApplication {

	public static List<Integer> fibonacci() {
	    List<Integer> fibonacciList = new ArrayList<Integer>();
	    Integer i = 0;		
		Integer j= 1;		
		Integer t;
		fibonacciList.add(i);
		fibonacciList.add(j);

		while (j<350){
			t=i+j;
			fibonacciList.add(t);	
			i=j;
			j=t;				
		}
		return (fibonacciList);
	}



	public static Boolean isFibonacci(Integer a) {
		return Boolean.valueOf(fibonacci().contains(a));
	}
}