package com.bridgelabz.user.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.user.model.PayrollModel;

@Repository
public interface IpayrollRepository extends JpaRepository<PayrollModel, Integer> {

	//public Optional<PayrollModel> findByemail(String useremail);

	//public void deleteByemail(String email);
	 Optional<PayrollModel> findByName(String name);

	void deleteByName(String name);

}
