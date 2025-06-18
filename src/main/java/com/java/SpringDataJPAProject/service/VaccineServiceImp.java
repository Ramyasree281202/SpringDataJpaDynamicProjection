package com.java.SpringDataJPAProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.java.SpringDataJPAProject.dao.IVaccineRepo;
import com.java.SpringDataJPAProject.model.Vaccine;
import com.java.SpringDataJPAProject.view.ResultView1;
import com.java.SpringDataJPAProject.view.ResultView2;
import com.java.SpringDataJPAProject.view.ResultView3;
import com.java.SpringDataJPAProject.view.View;
@Service
public class VaccineServiceImp implements IVaccineService{
	@Autowired
	private IVaccineRepo repo;
	
	

	

	@Override
	public <T extends View>List<T> fetchByCostLessThan(Integer cost,Class<T> cls) {
		
		return repo.findByCostLessThan(cost,cls);
	}



	@Override
	public <T extends View>List<T> fetchByvaccineCompany(String company, Class<T> cls) {
		
		return repo.findByvaccineCompany(company,cls);
	}



	@Override
	public <T extends View>List<T> fetchByvaccineName(String name, Class<T> cls) {
		
		return repo.findByvaccineName(name,cls);
	}
	
	

}
