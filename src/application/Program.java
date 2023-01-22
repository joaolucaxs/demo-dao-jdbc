package application;

import model.dao.FactoryDAO;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDAO sellerDAO = FactoryDAO.createSellerDAO();
		
		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
		Seller seller = sellerDAO.findById(3);
		System.out.println(seller);

	}

}
