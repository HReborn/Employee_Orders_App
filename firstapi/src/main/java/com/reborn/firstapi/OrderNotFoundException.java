package com.reborn.firstapi;

public class OrderNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	OrderNotFoundException(Long id) {
		super("Could not find order " + id);
	}
}
