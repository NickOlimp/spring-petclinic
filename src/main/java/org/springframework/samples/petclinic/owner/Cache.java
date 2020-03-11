package org.springframework.samples.petclinic.owner;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class Cache {

	@Autowired
	static OwnerRepository owners;
	static Collection<Owner> allOwnersCache;

	static {
		allOwnersCache = owners.findByLastName("");
	}

}
