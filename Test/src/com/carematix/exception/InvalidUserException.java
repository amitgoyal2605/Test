package com.carematix.exception;

public class InvalidUserException extends CarematixException
{
	private static final long serialVersionUID = 1L;
	private final static String  NAME = "InvalidUserException";
	
	public InvalidUserException()
	{
		super();
	}
	
	public InvalidUserException(int errorCode, String message)
	{
		super(errorCode, message);
	}
	
	
	

	public InvalidUserException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public InvalidUserException(String detail)
	{
		super(detail);
	}

	public InvalidUserException(Throwable cause)
	{
		super(cause);
	}
	
	/**
     * Retrives the Name of this exception
     * 
     * @return name of exception.
     */
    protected String getName()
    {
          return InvalidUserException.NAME;
    }
}
