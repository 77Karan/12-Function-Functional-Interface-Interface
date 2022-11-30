package pack04.Iogin.form;

import java.util.function.Function;

public class MainFunction 
{
	public static void main(String[] args)
	{
		UserLogin u = new UserLogin("karanku","Mypassword");
		
		Function<UserLogin, String> fin =(u1) -> {
			System.out.println(u1.getUsername());
			System.out.println(u1.getPassword());
			return "Login is Successfull";
		};
		
		System.out.println(fin.apply(u));
	}

}
