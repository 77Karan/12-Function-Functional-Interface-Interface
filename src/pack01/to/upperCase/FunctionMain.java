package pack01.to.upperCase;

import java.util.function.Function;

public class FunctionMain 
{
	public static void main(String[] args)
	{
		Function<String, String> fin = (s1) -> s1.toUpperCase();
		
		System.out.println(fin.apply("karan kumar gm"));
		
	}

}
