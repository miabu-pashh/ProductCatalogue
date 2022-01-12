package com.nagarro.exitTest.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.token.Token;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.exitTest.exception.ResourceNotFoundException;
import com.nagarro.exitTest.login.helper.JwtUtil;
import com.nagarro.exitTest.login.model.JwtRequest;
import com.nagarro.exitTest.login.model.JwtResponse;
import com.nagarro.exitTest.login.model.User;
import com.nagarro.exitTest.login.repo.UserRepository;
import com.nagarro.exitTest.login.services.CustomUserDetailsService;
import com.nagarro.exitTest.login.services.ItemsService;
import com.nagarro.exitTest.model.Delivery;
import com.nagarro.exitTest.model.Items;
import com.nagarro.exitTest.repository.DeliveryRepository;
import com.nagarro.exitTest.repository.ItemsRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class JwtController {

	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private CustomUserDetailsService customUserDetailsService;
	@Autowired
	private JwtUtil jwtUtil;

	// to generate the token
	@RequestMapping(value = "/token", method = RequestMethod.POST)
	public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) throws Exception {
		System.out.println(jwtRequest);

		try {
			this.authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(), jwtRequest.getPassword()));

		} catch (UsernameNotFoundException e) {
			e.printStackTrace();
			throw new Exception("Bad Credentials");

		} catch (BadCredentialsException e) {
			e.printStackTrace();
			throw new Exception("Bad Credentials");
		}

		// fine area..
		UserDetails userDetails = this.customUserDetailsService.loadUserByUsername(jwtRequest.getUsername());
		String token = this.jwtUtil.generateToken(userDetails);

		System.out.println("JWT " + token);

		return ResponseEntity.ok(new JwtResponse(token));
	}

	@Autowired
	private ItemsRepository itemsrepo;

	// get all items
	@GetMapping("/items")
	public List<Items> getAllItems() {
		return itemsrepo.findAll();
	}

	// to create the items
	@PostMapping("/items")
	public Items createItems(@RequestBody Items items) {
		return itemsrepo.save(items);
	}

	@Autowired
	private UserRepository repo;

	/**
	 * Register user.
	 *
	 * @param user the user
	 * @return the response entity
	 */
	// method to register the user
	@PostMapping("/user")
	public ResponseEntity<User> registerUser(@RequestBody User user) {

		return ResponseEntity.ok(repo.save(user));

	}

	// method to find the item or product by id

	@GetMapping("/items/{id}")
	@CrossOrigin(origins = "http://localhost:4200")

	public ResponseEntity<Items> getItemById(@PathVariable Long id) {

		return service.getItemById(id);

	}

	@Autowired
	private ItemsService service;

	// method to search the item by its name
	@GetMapping("/search/{name}")
	@CrossOrigin
	public Items searchItems(@PathVariable String name) {
		return service.findByName(name);

	}

	@Autowired
	private DeliveryRepository deliveryRepository;

	// get the delivery of the product details
	@GetMapping("/delivery")
	public List<Delivery> getAllDelivery() {
		return deliveryRepository.findAll();
	}

	// method to get the servisibility by pincode
	@GetMapping("/delivery/{id}")
	@CrossOrigin
	public ResponseEntity<Delivery> getDeliveryById(@PathVariable Long id) {

		Delivery delivery = deliveryRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("items is not available or not found by id " + id));
		return ResponseEntity.ok(delivery);

	}

}
