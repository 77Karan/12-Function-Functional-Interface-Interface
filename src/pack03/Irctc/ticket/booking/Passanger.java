package pack03.Irctc.ticket.booking;

public class Passanger 
{
	private String name;
	private int phno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public Passanger(String name, int phno) {
		super();
		this.name = name;
		this.phno = phno;
	}
	
	

}
