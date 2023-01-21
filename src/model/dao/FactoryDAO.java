package model.dao;
import model.dao.impl.SellerDAOJDBC;

public class FactoryDAO {

	public static SellerDAO createSellerDAO() {
		return new SellerDAOJDBC();
	}
}
