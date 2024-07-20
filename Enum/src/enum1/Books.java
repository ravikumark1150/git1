package enum1;

public enum Books {

	Corejava(45.33F), AdvJava(66.77F), spring(999.33F),oracle(588.55f),spring2(222.33f);

	public float price;

	private Books(float price) {

		System.out.println("-----constractor-----");
		this.price = price;
	}

	public float getprice() {
		return price;
	}
}