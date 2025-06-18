package com.java.SpringDataJPAProject.service;

import java.util.List;

import java.util.Optional;

import com.java.SpringDataJPAProject.model.Vaccine;
import com.java.SpringDataJPAProject.view.ResultView1;
import com.java.SpringDataJPAProject.view.View;

public interface IVaccineService {
	public <T extends View>List<T> fetchByCostLessThan(Integer cost, Class<T> cls);
	public <T extends View>List<T> fetchByvaccineCompany(String company,Class<T> cls);
	public <T extends View>List<T> fetchByvaccineName(String name,Class<T> cls);
	}
