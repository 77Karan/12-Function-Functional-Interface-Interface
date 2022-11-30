package pack02.square.of.number;

import java.util.function.Function;

public class FunctionMain 
{
	public static void main(String[] args)
	{
		Function<Integer, Integer> fin = (i) -> i*i;
		
		System.out.println(fin.apply(22));
		
	}

}
