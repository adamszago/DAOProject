package src.model.dao;

import src.db.DB;
import src.model.dao.impl.SellerDaoJDBC;

public class DAOFactory {

	public static SellerDAO createSellerDAO() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
}
