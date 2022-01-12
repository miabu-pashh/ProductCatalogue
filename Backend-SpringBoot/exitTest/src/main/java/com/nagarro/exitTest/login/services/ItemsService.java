package com.nagarro.exitTest.login.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.nagarro.exitTest.exception.ResourceNotFoundException;
import com.nagarro.exitTest.model.Items;
import com.nagarro.exitTest.repository.ItemsRepository;

/**
 * The Class ItemsService.
 */
@Service
public class ItemsService {

	/** The repo. */
	@Autowired
	private ItemsRepository repo;

	/**
	 * Instantiates a new items service.
	 */
	public ItemsService() {
	}

	/**
	 * Instantiates a new items service.
	 *
	 * @param repo the repo
	 */
	public ItemsService(ItemsRepository repo) {
		super();
		this.repo = repo;
	}

	/**
	 * Gets the item by id.
	 *
	 * @param id the id
	 * @return the item by id
	 */
	public ResponseEntity<Items> getItemById(@PathVariable Long id) {

		Items items = repo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("items is not available or not found by id " + id));

		return ResponseEntity.ok(items);

	}

	/**
	 * Find by name.
	 *
	 * @param name the name
	 * @return the items
	 */
//@Override
	public Items findByName(String name) {
		return repo.findByName(name);

	}

}
