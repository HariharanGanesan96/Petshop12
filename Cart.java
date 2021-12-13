package Class;

public class Cart {
	private int cartId;
	private int cusId;

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public Cart(int cartId, int cusId) {
		super();
		this.cartId = cartId;
		this.cusId = cusId;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
}
