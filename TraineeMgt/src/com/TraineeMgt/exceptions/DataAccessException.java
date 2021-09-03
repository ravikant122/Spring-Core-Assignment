package com.TraineeMgt.exceptions;

public class DataAccessException extends RuntimeException{
	private static final long serialVersionUID = -1746320967120273854L;

	public DataAccessException(String msg) {
		super(msg);
	}
	
}
