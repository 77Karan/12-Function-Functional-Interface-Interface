package pack03.Irctc.ticket.booking;

public class Ticket 
{
	private String pnr;
	private String doj;
	private String destination;
	private String origin;
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public Ticket(String pnr, String doj, String destination, String origin) {
		super();
		this.pnr = pnr;
		this.doj = doj;
		this.destination = destination;
		this.origin = origin;
	}
	@Override
	public String toString() {
		return "Ticket [pnr=" + pnr + ", doj=" + doj + ", destination=" + destination + ", origin=" + origin + "]";
	}
	
	

}
