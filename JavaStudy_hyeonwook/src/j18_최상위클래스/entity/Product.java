package j18_최상위클래스.entity;

import java.time.LocalDate;
import java.util.Objects;

/*
 * 상품 정보 클래스(Entity Class) -> 기본셋팅
 * 
 * 변수
 * productCode		int
 * productName		String
 * category			int
 * productingDate	LocalDate
 * 
 * 기본 생성자
 * 
 * 전체 생성자
 * 
 * getter, setter
 * 
 * hashCode()
 * 
 * equals()
 * 
 * toString()
 */
public class Product {
	private int productCode;
	private String productName;
	private int category;
	private LocalDate productingDate;
	
	public Product() {	// 기본 생성자
		
	}
	
	public Product(int productCode, String productName, int category, LocalDate productingDate) {	// 전체 생성자
		super();	// 상위클래스 생성자
		this.productCode = productCode;
		this.productName = productName;
		this.category = category;
		this.productingDate = productingDate;
	}

	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public LocalDate getProductingDate() {
		return productingDate;
	}

	public void setProductingDate(LocalDate productingDate) {
		this.productingDate = productingDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(category, productCode, productName, productingDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return category == other.category && productCode == other.productCode
				&& Objects.equals(productName, other.productName)
				&& Objects.equals(productingDate, other.productingDate);
	}

	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", productName=" + productName + ", category=" + category
				+ ", productingDate=" + productingDate + "]";
	}
	
	
	
	
}

