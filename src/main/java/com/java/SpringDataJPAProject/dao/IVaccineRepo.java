package com.java.SpringDataJPAProject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.java.SpringDataJPAProject.model.Vaccine;
import com.java.SpringDataJPAProject.view.ResultView1;
import com.java.SpringDataJPAProject.view.View;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer>{
	public <T extends View>List<T> findByCostLessThan(Integer cost,Class<T> cls);
	public <T extends View>List<T> findByvaccineCompany(String company,Class<T> cls);
	public <T extends View>List<T> findByvaccineName(String name,Class<T> cls);
	
}
