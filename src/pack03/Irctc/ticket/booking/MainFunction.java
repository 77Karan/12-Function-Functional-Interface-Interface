package pack03.Irctc.ticket.booking;

import java.util.function.Function;

public class MainFunction 
{
	public static void main(String[] args) 
	{
		Passanger p = new Passanger("karan",123);
		Function<Passanger, Ticket> fin = (p2) -> {
			System.out.println(p2.getName());
			System.out.println(p2.getPhno());
			return new Ticket("PNR123","08-OCT-21","MALNADU","BANG");
			
		};	
		
		System.out.println(fin.apply(p));
	}

}
