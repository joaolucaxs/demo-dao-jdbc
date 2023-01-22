package application;

import model.dao.FactoryDAO;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDAO sellerDAO = FactoryDAO.createSellerDAO();
		
		System.out.println("==== TEST 1: seller findById ====");
		Seller seller = sellerDAO.findById(2);
		System.out.println(seller);

	}

}
