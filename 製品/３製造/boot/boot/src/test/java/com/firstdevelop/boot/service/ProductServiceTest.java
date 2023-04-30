package com.firstdevelop.boot.service;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import com.firstdevelop.boot.entity.Product;
import com.firstdevelop.boot.form.ProductForm;

/*
 * junit単体テスト
 */
@SpringBootTest
public class ProductServiceTest {
	
	@Autowired
	private ProductService productService;
	
	@DisplayName("製品一覧取得確認")
	@Test
	@Sql("ProductInsert001.sql")
	void test001() {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime datetime=LocalDateTime.parse("2022/11/06 14:59:19",dtf);

		//実際の製品リスト
		List <Product> actProducts = productService.searchAll();
		//期待の製品リスト
		List <Product> expProducts = new ArrayList<Product>();
		Product product = new Product();
		product.setProductId(1);
		product.setProductName("product_name001");
		product.setProductPrice(null);
		product.setProductAccount(null);
		product.setProductDate(datetime);
		product.setClassProductId(1);
		product.setAddress("address001");
		product.setCreateTime(datetime);
		product.setUpdateTime(datetime);
		product.setCreateUser("fristdevelop");
		product.setUpdateUser("fristdevelop");
		product.setDeleteFlag("0");
		expProducts.add(product);
		assertEquals(product.getProductName(),actProducts.get(0).getProductName());
	}
	
//	@DisplayName("製品登録確認001")
//	@Test
//	void test002() {
//		ProductForm form = new ProductForm();
//		//formに値を設定する
//		form.setProductName("p");
//		productService.regist(form);
//	}
//	@DisplayName("製品登録確認002")
//	@Test
//	void test003() {
//		ProductForm form = new ProductForm();
//		//formに値を設定する
//		form.setProductName("a");
//		productService.regist(form);
//	}
}
