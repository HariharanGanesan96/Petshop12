package Class;

public class CartItems {
	private int itemId;
	private int animalId;
	private int cusId;
	private int qty;
	private int unitPrice;
	private int totalPrice;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getAnimalId() {
		return animalId;
	}

	public void setAnimalId(int animalId) {
		this.animalId = animalId;
	}

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public CartItems(int itemId, int animalId, int cusId, int qty, int unitPrice, int totalPrice) {
		super();
		this.itemId = itemId;
		this.animalId = animalId;
		this.cusId = cusId;
		this.qty = qty;
		this.unitPrice = unitPrice;
		this.totalPrice = totalPrice;
	}

	public CartItems() {
		super();
		// TODO Auto-generated constructor stub
	}

}
