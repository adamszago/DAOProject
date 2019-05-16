package src.application;

import java.util.Date;
import java.util.List;

import src.entities.Department;
import src.entities.Seller;
import src.model.dao.DAOFactory;
import src.model.dao.SellerDAO;

public class Program {

	public static void main(String[] args) {
		SellerDAO dao = DAOFactory.createSellerDAO();
		System.out.println("==================== TEST ONE FINDBYID ====================");
		Seller seller = dao.findById(2);
		System.out.println(seller);
		System.out.println("==================== TEST TWO FINDBYDEPARTMENT ====================");
		List<Seller> sellers = dao.findByDepartment(new Department(2, null));
		System.out.println("==================== TEST THREE FINDALL ====================");
		sellers = dao.findAll();
		for (Seller seller2 : sellers) {
			System.out.println(seller2);
		}
		System.out.println("==================== TEST FOUR INSERT ====================");
		Seller sel = new Seller(null, "Greg", "grege@gmail.com", new Date(), 4000.0, new Department(2,null));
		dao.insert(sel);
		System.out.println("Seller inserted: " + sel.getId());
		System.out.println("==================== TEST FIVE UPDATE ====================");
		sel.setName("Adams");
		dao.update(sel);
	}

}
