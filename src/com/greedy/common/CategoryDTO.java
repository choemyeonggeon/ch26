package com.greedy.common;

public class CategoryDTO implements java.io.Serializable {
	
	private int code;
	private String name;
	private Integer refCategoryCode;
	
	public CategoryDTO() {}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public Integer getRefCategoryCode() {
		return refCategoryCode;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRefCategoryCode(Integer refCategoryCode) {
		this.refCategoryCode = refCategoryCode;
	}

	public CategoryDTO(int code, String name, Integer refCategoryCode) {
		super();
		this.code = code;
		this.name = name;
		this.refCategoryCode = refCategoryCode;
	}

	@Override
	public String toString() {
		return "CategoryDTO [code=" + code + ", name=" + name + ", refCategoryCode=" + refCategoryCode + "]";
	}
	

}
