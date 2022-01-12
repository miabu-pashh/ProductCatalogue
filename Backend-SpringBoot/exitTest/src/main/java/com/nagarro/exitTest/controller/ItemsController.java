package com.nagarro.exitTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.exitTest.model.Items;
import com.nagarro.exitTest.repository.ItemsRepository;

//@RestController
//@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping("/api/v1/")
//public class ItemsController {
//	
////	@Autowired
////	private ItemsRepository itemsrepo;
////	
////	//get all items
////	@GetMapping("/items")
////	public List<Items> getAllItems(){
////		return itemsrepo.findAll();
////	}
//	
//
//}
