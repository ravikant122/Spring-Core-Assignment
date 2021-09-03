package com.TraineeMgt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.TraineeMgt.dao.factory.DBConnectionFactory;
import com.TraineeMgt.exceptions.DataAccessException;
import com.TraineeMgt.model.Trainee;

public class TraineeDaoImpl implements TraineeDao{

	private Connection connection=null;
	
	public TraineeDaoImpl(){
		this.connection=DBConnectionFactory.getConnection();
	}
	
	@Override
	public void addTrainee(Trainee trainee) {
		try {
			
			PreparedStatement pstmt=connection.prepareStatement("insert into trainee(trainee_name,branch,percentage) values(?,?,?)");
			pstmt.setString(1, trainee.getTrainee_name());
			pstmt.setString(2, trainee.getBranch());
			pstmt.setDouble(3, trainee.getPercentage());

			pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new DataAccessException(e.toString());
		}
	}

	@Override
	public List<Trainee> getAllTrainees() {
		List<Trainee> trainees=new ArrayList<Trainee>();
		try {
			PreparedStatement pstmt=connection.prepareStatement("select * from trainee");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
				trainees.add(new Trainee(rs.getString("trainee_name"),
						rs.getString("branch"),
						rs.getDouble("percentage")));
		} catch(SQLException e) {
			throw new DataAccessException(e.toString());
		}
		
		return trainees;
	}

}
