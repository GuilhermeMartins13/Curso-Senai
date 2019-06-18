package com.GuilhermeMartins.Services;

public class ObjectNotFoundExcetption extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundExcetption(String msg) {
		super(msg);
		
	}
	
	public ObjectNotFoundExcetption(String msg, Throwable cause) {
	super(msg, cause);

}
}
