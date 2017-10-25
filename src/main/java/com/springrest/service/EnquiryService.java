package com.springrest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.dao.EnquiryDao;
import com.springrest.model.Enquiry;

@Service
public class EnquiryService {

	EnquiryDao enquiryDao = new EnquiryDao();

	public void addEnquiry(Enquiry enquiry) {
		enquiryDao.addEnquiry(enquiry);
	}

	public List<Enquiry> getAllEnquiries() {

		List<Enquiry> listEnquiry = EnquiryDao.getAllEnquiries();
		return listEnquiry;
	}

	public Enquiry updateEnquiry(Enquiry enquiry, int id) {
		return enquiryDao.updateEnquiry(enquiry, id);
	}

	public void deleteEnquiry(int enquiryId) {
		enquiryDao.deleteEnquiry(enquiryId);
	}

	public Enquiry getEnquiryById(int id) {
		return enquiryDao.getEnquiryById(id);
	}

	public Enquiry getEnquiryByName(String enquiryname) {
		return enquiryDao.getEnquiryByName(enquiryname);
	}

}
