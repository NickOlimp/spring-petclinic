package org.springframework.samples.petclinic.owner;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.Collection;

public class Cache {

	@Autowired
	static OwnerRepository owners;
	static Collection<Owner> allOwnersCache;

	@PostConstruct
	private void init() {
		allOwnersCache = owners.findByLastName("");
	}

}
