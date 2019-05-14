package src.application;

import java.util.Date;

import src.entities.Department;
import src.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department dpt = new Department(1, "book");
		System.out.println(dpt);
		
		Seller seller = new Seller(1, "Bob", "teste@gmail.com", new Date(), 1245.00, dpt);
		System.out.println(seller);
	}

}
