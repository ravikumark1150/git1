package enum1;

public enum Books {

	Corejava(45.33F), AdvJava(66.77F), spring(999.33F);

	public float price;

	private Books(float price) {

		System.out.println("-----constractor-----");
		this.price = price;
	}

	public float getprice() {
		return price;
	}
}