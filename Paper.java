package tugas1;

interface Printable {
	void printed ();
	void buyed ();
}

public class Paper implements Printable {
	protected float price;
	protected int stock;
	protected String name;
	protected String product;

	@Override
	public void printed() {
		System.out.println("print"+product);
	}

	@Override
	public void buyed() {
		stock--;
		System.out.println(name+"has been buyed");
	}
}
