package com.atguigu.gmall.pms;

import com.atguigu.gmall.pms.entity.Brand;
import com.atguigu.gmall.pms.entity.Product;
import com.atguigu.gmall.pms.service.BrandService;
import com.atguigu.gmall.pms.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallPmsApplicationTests {

	@Autowired
	ProductService productService;

	@Autowired
	BrandService brandService;

	@Test
	public void contextLoads() {
//		Product product = productService.getById("8");
//		System.out.println(product);
		Brand brand = new Brand();
		brand.setName("的数据卡机扩散");
		boolean res = brandService.save(brand);

		System.out.println(res);


	}


	@Test
	public void contextLoads2() {
		Brand brand = brandService.getById("53");
		System.out.println(brand);


	}
}
