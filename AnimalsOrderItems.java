package Class;

public class AnimalsOrderItems {
	private int itemId;
	private int orderId;
	private int animalId;
	private int qty;
	private int unitPrice;
	private int totalPrice;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getAnimalId() {
		return animalId;
	}

	public void setAnimalId(int animalId) {
		this.animalId = animalId;
	}

	public AnimalsOrderItems(int itemId, int orderId, int animalId, int qty, int unitPrice, int totalPrice) {
		super();
		this.itemId = itemId;
		this.orderId = orderId;
		this.animalId = animalId;
		this.qty = qty;
		this.unitPrice = unitPrice;
		this.totalPrice = totalPrice;
	}

	public AnimalsOrderItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public AnimalsOrderItems(int itemId, int qty) {
		super();
		this.itemId = itemId;
		this.qty = qty;
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
}
