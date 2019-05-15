package src.model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import src.db.DB;
import src.db.DbException;
import src.entities.Department;
import src.entities.Seller;
import src.model.dao.SellerDAO;

public class SellerDaoJDBC implements SellerDAO {

	private Connection conn;
	
	public SellerDaoJDBC(Connection conn) {
		this.conn  = conn;
	}
	
	@Override
	public void insert(Seller obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Seller obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Seller findById(Integer id) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement("SELECT SELLER.*, DEPARTMENT.NAME AS DepName "
				+ "FROM SELLER INNER JOIN DEPARTMENT "
				+ "ON SELLER.DEPARTMENTID = DEPARTMENT.ID "
				+ "WHERE SELLER.ID = ?" 
			);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				Department dept = new Department();
				dept.setId(rs.getInt("DepartmentId"));
				dept.setName(rs.getString("DepName"));
				Seller se = new Seller();
				se.setId(rs.getInt("Id"));
				se.setName(rs.getString("Name"));
				se.setEmail(rs.getString("Email"));
				se.setBaseSalary(rs.getDouble("BaseSalary"));
				se.setBirthDate(rs.getDate("BirthDate"));
				se.setDepartment(dept);
				return se;
			}
			return null;
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(ps);
			DB.closeResultSet(rs);
			
		}
	}

	@Override
	public List<Seller> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
