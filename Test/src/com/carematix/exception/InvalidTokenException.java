package com.carematix.exception;

public class InvalidTokenException  extends CarematixException
{
	private static final long serialVersionUID = 1L;
	private final static String  NAME = "InvalidTokenException";
	
	public InvalidTokenException()
	{
		super();
	}
	
	public InvalidTokenException(int errorCode, String message)
	{
		super(errorCode, message);
	}
	
	
	

	public InvalidTokenException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public InvalidTokenException(String detail)
	{
		super(detail);
	}

	public InvalidTokenException(Throwable cause)
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
          return InvalidTokenException.NAME;
    }


}
