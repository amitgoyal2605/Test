package com.carematix.exception;

public class InvalidConsumerException  extends CarematixException
{

	private static final long serialVersionUID = 1L;
	private final static String  NAME = "InvalidConsumerException";
	
	public InvalidConsumerException()
	{
		super();
	}
	
	public InvalidConsumerException(int errorCode, String message)
	{
		super(errorCode, message);
	}
	
	
	

	public InvalidConsumerException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public InvalidConsumerException(String detail)
	{
		super(detail);
	}

	public InvalidConsumerException(Throwable cause)
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
          return InvalidConsumerException.NAME;
    }

}
