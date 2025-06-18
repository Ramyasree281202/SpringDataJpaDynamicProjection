package com.java.SpringDataJPAProject;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.java.SpringDataJPAProject.dao.IVaccineRepo;

import com.java.SpringDataJPAProject.model.Vaccine;
import com.java.SpringDataJPAProject.service.VaccineServiceImp;
import com.java.SpringDataJPAProject.view.ResultView1;
import com.java.SpringDataJPAProject.view.ResultView2;
import com.java.SpringDataJPAProject.view.ResultView3;

@SpringBootApplication
public class SpringDataJpaProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpaProjectApplication.class, args);
		VaccineServiceImp service = container.getBean(VaccineServiceImp.class);
		service.fetchByCostLessThan(1000, ResultView1.class).forEach(v->System.out.println(v.getVaccineName()+" "+v.getVaccineCompany()));
		service.fetchByvaccineCompany("USA", ResultView3.class).forEach(v->System.out.println(v.getvaccineName()+" "+v.getCost()));
		service.fetchByvaccineName("CovidShield", ResultView2.class).forEach(v->System.out.println(v.getvaccineCompany()+" "+v.getCost()));
	} 
		

}
