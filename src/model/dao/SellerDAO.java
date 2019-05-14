package src.model.dao;

import java.util.List;

import src.entities.Seller;

public interface SellerDAO {

	void insert(Seller obj);

	void update(Seller obj);

	void deletById(Integer id);

	Seller findById(Integer id);

	List<Seller> findAll();
}
