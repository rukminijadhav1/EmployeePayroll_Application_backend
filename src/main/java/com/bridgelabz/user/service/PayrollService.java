package com.bridgelabz.user.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.user.Repository.IpayrollRepository;

import com.bridgelabz.user.dto.RegisterDto;
import com.bridgelabz.user.exception.EmpException;
import com.bridgelabz.user.model.PayrollModel;


import jakarta.transaction.Transactional;

@Service
@Transactional
public class PayrollService implements IPayrollService {

	@Autowired
	IpayrollRepository payrollRepo;

	@Autowired
	ModelMapper modelMapper;

	@Override
	public PayrollModel addEmp(RegisterDto registerdto) {
		if (payrollRepo.findByName(registerdto.getName()).isPresent()) {
			throw new EmpException("Name is present");

		} else {
			PayrollModel payrollModel = modelMapper.map(registerdto, PayrollModel.class);
			payrollRepo.save(payrollModel);
			// emailService.sendMail(registerdto.getEmail(), "Congratulations",
			// "hello user welcome to our application");
		}
		return null;

	}

	@Override
	public PayrollModel updateData(int id, RegisterDto registerdto) {
	
		PayrollModel payrollModel = modelMapper.map(registerdto, PayrollModel.class);

		if (payrollRepo.findById(id).isPresent()) {
			PayrollModel Payrollmodel = payrollRepo.findById(id).get();
			payrollModel.setId(id);
			// PayrollModel user1 = modelMapper.map(registerdto, PayrollModel.class);

			if (payrollModel.getName() == null) {
				payrollModel.setName(Payrollmodel.getName());
			}
			if (payrollModel.getGender() == null) {
				payrollModel.setGender(Payrollmodel.getGender());
			}
			if (payrollModel.getDepartment() == null) {
				payrollModel.setDepartment(Payrollmodel.getDepartment());
			}
			if (payrollModel.getSalary() == 0) {
				payrollModel.setSalary(Payrollmodel.getSalary());
			}
			if (payrollModel.getAction() == null) {
				payrollModel.setAction(Payrollmodel.getAction());
			}
			if (payrollModel.getNotes() == null) {
				payrollModel.setNotes(Payrollmodel.getNotes());
			}
			if (payrollModel.getImage() == null) {
				payrollModel.setImage(Payrollmodel.getImage());
			}
			return payrollRepo.save(payrollModel);
		}

		throw new EmpException("Id is invalid");

	}

	@Override
	public PayrollModel deleteById(int id) {
		if (payrollRepo.findById(id).isPresent()) {
			payrollRepo.deleteById(id);
			// return "Deleted successful";
			return null;
		} else
			throw new EmpException("invalid id");

	}

	@Override
	public List<RegisterDto> getAllEmployee() {
		if (payrollRepo.count() == 0) {
			throw new EmpException("you dont have any data");
		}
		List<PayrollModel> payrollModel = this.payrollRepo.findAll();
		List<RegisterDto> empPayrollDto = payrollModel.stream().map(payroll -> empPayrolltoDto(payroll))
				.collect(Collectors.toList());
		return empPayrollDto;
	}

	public RegisterDto empPayrolltoDto(PayrollModel payrollmodel) {
		RegisterDto registerdto = this.modelMapper.map(payrollmodel, RegisterDto.class);
		return registerdto;
	}

	@Override
	public PayrollModel getEmpData(int id) {
		if (payrollRepo.findById(id).isPresent()) {
			return payrollRepo.findById(id).get();
		}
		throw new EmpException("Employee Not Found " + "\nInvalid Id ");
	}

}
