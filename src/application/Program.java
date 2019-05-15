package src.application;

import src.entities.Seller;
import src.model.dao.DAOFactory;
import src.model.dao.SellerDAO;

public class Program {

	public static void main(String[] args) {
		SellerDAO dao = DAOFactory.createSellerDAO();
		
		Seller seller = dao.findById(2);
		
		System.out.println(seller);
	}

}
