package com.carematix.exception;

public class InvalidRequestException extends CarematixException
{
	
	private static final long serialVersionUID = 1L;
	private final static String  NAME = "InvalidRequestException";
	
	public InvalidRequestException()
	{
		super();
	}
	
	public InvalidRequestException(int errorCode, String message)
	{
		super(errorCode, message);
	}
	
	
	

	public InvalidRequestException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public InvalidRequestException(String detail)
	{
		super(detail);
	}

	public InvalidRequestException(Throwable cause)
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
          return InvalidRequestException.NAME;
    }
}
