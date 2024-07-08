package model.exception;

public class Erros extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public Erros(String msg) {
		super(msg);
	}
}
