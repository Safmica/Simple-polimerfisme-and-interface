package tugas1

interface Printable {
	void printed ();
	void buyed ();
}

public class Paper implements Printable {
	protected float price;
	protected int stock;
	protected String name;

	public void print() {
		System.out.println("print"+name);
	}

	public void buyed() {
		Systen.out.println(name+"has been buyed");
	}
}
