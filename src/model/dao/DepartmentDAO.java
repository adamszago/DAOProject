package src.model.dao;

import java.util.List;

import src.entities.Department;

public interface DepartmentDAO {

	void insert(Department obj);

	void update(Department obj);

	void deletById(Integer id);

	Department findById(Integer id);

	List<Department> findAll();
}
