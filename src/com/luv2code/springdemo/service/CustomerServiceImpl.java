package com.luv2code.springdemo.service;

import java.util.List;
import java.util.function.Consumer;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.codec.Decoder;
import org.springframework.core.codec.Encoder;
import org.springframework.http.codec.CodecConfigurer.CustomCodecs;
import org.springframework.http.codec.CodecConfigurer.DefaultCodecConfig;
import org.springframework.http.codec.HttpMessageReader;
import org.springframework.http.codec.HttpMessageWriter;
import org.springframework.stereotype.Service;

import com.luv2code.springdemo.doa.CustomerDoa;
import com.luv2code.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	//injet the customer dao
	@Autowired
	private CustomerDoa custdao;

	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return custdao.getCustomers();
	}

	



}
