package com.nagarro.exitTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.nagarro.exitTest.model.Items;

/**
 * The Interface ItemsRepository.
 */
@Repository
public interface ItemsRepository extends JpaRepository<Items, Long> {

	/**
	 * Find by name.
	 *
	 * @param name the name
	 * @return the items
	 */
	public Items findByName(String name);

//	public ResponseEntity<Items> getItemById(@PathVariable Long id);

}
