package com.TraineeMgt.service;

import java.util.List;

import com.TraineeMgt.model.Trainee;

public interface TraineeService {
	public void addTrainee(Trainee trainee);
	public List<Trainee> getAllTrainees();
}
