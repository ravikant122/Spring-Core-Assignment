package com.TraineeMgt.service;

import java.util.List;

import com.TraineeMgt.dao.TraineeDao;
import com.TraineeMgt.dao.TraineeDaoImpl;
import com.TraineeMgt.model.Trainee;

public class TraineeServiceImpl implements TraineeService{

	private TraineeDao traineeDao=new TraineeDaoImpl();
	
	@Override
	public void addTrainee(Trainee trainee) {
		traineeDao.addTrainee(trainee);
	}

	@Override
	public List<Trainee> getAllTrainees() {
		return traineeDao.getAllTrainees();
	}

}
