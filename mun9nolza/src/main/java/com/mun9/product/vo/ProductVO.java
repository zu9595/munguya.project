package com.mun9.product.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ProductVO {

	private int proCode;
	private String proName;
	private String proDesc;
	private String proImage;
	private int proPrice;
	private int proDiscount;
	private int proSell;
	private int proStock;
	private String category;
	private int page;
	private String search;
	
}
