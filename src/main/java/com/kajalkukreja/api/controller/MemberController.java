package com.kajalkukreja.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kajalkukreja.api.db.MemberRepository;
import com.kajalkukreja.api.model.Member;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/member")
public class MemberController {

	@Autowired
	MemberRepository repository;
	
	List<String> emailList = new ArrayList<>();
	List<String> mobileNoList = new ArrayList<>();
	
	@PostMapping(path = "/mobileno", consumes = "text/plain", produces = "application/json")
	public boolean addMobileNo(@RequestBody String mobileNo) {
		repository.save(new Member(null, mobileNo, 0, 0));
		return mobileNoList.add(mobileNo);
	}
	
	@PostMapping(path = "/email", consumes = "text/plain", produces = "application/json")
	public boolean addEmail(@RequestBody String email) {
		return emailList.add(email);
	}
	
	@GetMapping(path = "/mobilenos", produces = "application/json")
	public String getMobileNos() {
		return mobileNoList.toString();
	}

	@GetMapping(path = "/emails", produces = "application/json")
	public String getEmails() {
		return emailList.toString();
	}
	
	@DeleteMapping(path = "/mobileno", consumes = "text/plain", produces = "application/json")
	public boolean deleteMobileNo(@RequestBody String mobileNo) {
		return mobileNoList.remove(mobileNo);
	}

	@DeleteMapping(path = "/email", consumes = "text/plain", produces = "application/json")
	public boolean deleteEmail(@RequestBody String email) {
		return emailList.remove(email);
	}
}
