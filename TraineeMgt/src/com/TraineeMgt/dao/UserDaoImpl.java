package com.TraineeMgt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.TraineeMgt.dao.factory.DBConnectionFactory;
import com.TraineeMgt.exceptions.DataAccessException;
import com.TraineeMgt.model.User;

public class UserDaoImpl implements UserDao {

	private Connection connection;
	
	public UserDaoImpl() {
		this.connection=DBConnectionFactory.getConnection();
	}
	
	@Override
	public List<User> getAllUsers() {
		
		List<User> users=new ArrayList<User>();
		try {
			PreparedStatement pstmt=connection.prepareStatement("select * from user");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
				users.add(new User(rs.getString("username"),
						rs.getString("password")));
		} catch(SQLException e) {
			throw new DataAccessException(e.toString());
		}
		
		return users;
	}

}
