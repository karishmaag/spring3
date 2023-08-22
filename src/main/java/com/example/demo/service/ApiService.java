package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.ApiRepository;

@Service
public class ApiService {
    @Autowired
     ApiRepository a;
    public Employee saveinfo(Employee e)
	{
		return a.save(e);
	}
    public List<Employee>showinfo()
    {
    	return a.findAll();
    }
}
