package com.bridgelabz.user.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.bridgelabz.user.Response;
import com.bridgelabz.user.dto.RegisterDto;
import com.bridgelabz.user.model.PayrollModel;
import com.bridgelabz.user.service.IPayrollService;

@CrossOrigin("*")
@RestController
@RequestMapping("/Payroll")
public class PayrollController {

	@Autowired
	IPayrollService payrollService;

	@GetMapping("/Hello")
	public String PayrollInfo() {
		return "Hello Employees";

	}

	@PostMapping("/Register_employee")
	public ResponseEntity<Response> registerEmp(@RequestBody RegisterDto registerdto) {
		PayrollModel payrollModel = payrollService.addEmp(registerdto);
		Response response = new Response("Employee Registered Successfull", registerdto);
		return new ResponseEntity<>(response, HttpStatus.OK);

	}

	@PutMapping("/Update_Emp_Data")
	public ResponseEntity<Response> updateData(@RequestParam int id, @RequestBody RegisterDto registerdto) {
		PayrollModel update = payrollService.updateData(id, registerdto);
		Response response = new Response("Employee Data Updated Successfully", update);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@DeleteMapping("/Delete_Emp_Data")
	public ResponseEntity<Response> deleteEmpData(@RequestParam int id) {
		PayrollModel payrollmodel = payrollService.deleteById(id);
		Response response = new Response("Deleted Successfully", payrollmodel);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@GetMapping("/fetchEmployee")
	public List<RegisterDto> getAllEmployee() {
		List<RegisterDto> userdata = payrollService.getAllEmployee();
		Response response = new Response("user fetch successfully ");
		return userdata;
	}

	@GetMapping("/Search_Employee_Data")
	public ResponseEntity<Response> getEmpData(@RequestParam int id) {
		PayrollModel payrollModel = payrollService.getEmpData(id);
		Response response = new Response("Emplyoee Data", payrollModel);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}