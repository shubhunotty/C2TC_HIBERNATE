package com.cg.shoppingmallmanagement.client;

import com.cg.shoppingmallmanagement.entity.Customer;
import com.cg.shoppingmallmanagement.entity.Employee;
import com.cg.shoppingmallmanagement.entity.Mall;
import com.cg.shoppingmallmanagement.entity.MallAdmin;
import com.cg.shoppingmallmanagement.entity.OrderDetails;
import com.cg.shoppingmallmanagement.entity.Shop;
import com.cg.shoppingmallmanagement.service.IAdminService;
import com.cg.shoppingmallmanagement.service.IAdminServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		MallAdmin mallAdmin = new MallAdmin();
		IAdminService service = new IAdminServiceImpl();
		
		//create operation
		//MallAdmin Class
		mallAdmin.setId(0001);
		mallAdmin.setName("Shubham");
		mallAdmin.setPassword("shubham");
		mallAdmin.setPhone("1234567890");
		
		//Mall Class
		Mall mall = new Mall();
		mall.setId(01);
		mall.setMallName("Phoenix");
		mall.setLocation("Pune");
		mall.setCategories("REGIONAL");
		
		//Shop Class
		Shop shop = new Shop();
		shop.setId(1);
		shop.setShopCategory("Regional");
		shop.setShopName("SD");
		shop.setCustomers("All");
		shop.setShopStatus("OPEN ");
		shop.setShopOwner("Shubhu");
		shop.setLeaseStatus("Not For Sale");
		
		//Employee Class
		Employee employee = new Employee();
		employee.setId(100);
		employee.setName("Omkar");
		employee.setDob("14 April 1999");
		employee.setSalary(10000);
		employee.setAddress("Pune");
		employee.setDesignation("Receptionist");
		
		//Customer Class
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("Jayshree");
		customer.setPhone("1234567890");
		customer.setEmail("abc@gmail.com");
		
		//OrderDetails Class
		OrderDetails orderdetails = new OrderDetails();
		orderdetails.setId(10);
		orderdetails.setDateOfPurchase("20 April 2020");
		orderdetails.setTotal(2);
		orderdetails.setPaymentMode("Card");
		
		
			//OneToOne Mapping
			//malladmin and mall
			mallAdmin.setMall(mall);
			mall.setMalladmin(mallAdmin);
			
			//mall and shop
			mall.setShop(shop);
			shop.setMall(mall);
			
			//shop and employee
			employee.setShop(shop);
			shop.setEmployee(employee);
			
			//orderDetails and customer and shop
			orderdetails.setCustomer(customer);
			orderdetails.setShop(shop);
			shop.setOrderdetails(orderdetails);
			customer.setOrderdetails(orderdetails);
			
		
			
			service.addMallAdmin(mallAdmin);
		
		System.out.println("Added Successfully");
		
		/*
		 * //Customer Class Customer customer = new Customer(); customer.setId(20);
		 * customer.setName("Mayuri"); customer.setOrderid(50);
		 * customer.setPhone("1234567890"); customer.setEmail("xyz@email.com");
		 */
		
		/*
		 * //retrive operation mallAdmin = service.searchMallAdmin(0001);
		 * System.out.println(mallAdmin.getId());
		 * System.out.println(mallAdmin.getName());
		 * System.out.println(mallAdmin.getMall());
		 * 
		 * //update operation mallAdmin = service.searchMallAdmin(0001);
		 * mallAdmin.setMall("Inorbit"); service.updateMallAdmin(mallAdmin);
		 * System.out.println("Update is performed");
		 * 
		 * //delete operation mallAdmin = service.searchMallAdmin(0001);
		 * service.deleteMallAdmin(mallAdmin);
		 * System.out.println("Delete is performed");
		 */
	}

}
