package com.greedy.common;

public class MenuAndCategoryDTO implements java.io.Serializable {

	private int code;
	private String name;
	private int price;
	private CategoryDTO category;
	private String orderableStatus;
	
	public MenuAndCategoryDTO() {}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public CategoryDTO getCategory() {
		return category;
	}

	public String getOrderableStatus() {
		return orderableStatus;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setCategory(CategoryDTO category) {
		this.category = category;
	}

	public void setOrderableStatus(String orderableStatus) {
		this.orderableStatus = orderableStatus;
	}

	@Override
	public String toString() {
		return "MenuAndCategoryDTO [code=" + code + ", name=" + name + ", price=" + price + ", category=" + category
				+ ", orderableStatus=" + orderableStatus + "]";
	}

	public MenuAndCategoryDTO(int code, String name, int price, CategoryDTO category, String orderableStatus) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.category = category;
		this.orderableStatus = orderableStatus;
	}
	

	
}
