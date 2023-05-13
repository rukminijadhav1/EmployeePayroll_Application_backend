package com.bridgelabz.user.service;

import java.util.List;

import com.bridgelabz.user.dto.RegisterDto;
import com.bridgelabz.user.model.PayrollModel;

public interface IPayrollService {

	PayrollModel addEmp(RegisterDto registerdto);

	PayrollModel updateData(int id, RegisterDto registerDTO);

	

	List<RegisterDto> getAllEmployee();

	PayrollModel getEmpData(int id);

	PayrollModel deleteById(int id);

}
