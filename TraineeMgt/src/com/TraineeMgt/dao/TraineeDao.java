package com.TraineeMgt.dao;

import java.util.List;

import com.TraineeMgt.model.Trainee;

public interface TraineeDao {
	public void addTrainee(Trainee trainee);
	public List<Trainee> getAllTrainees();
}
