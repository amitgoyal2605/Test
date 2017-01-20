package com.carematix.exception;

/** This class is an Exception class for conditions where the flags cannot be calculated
 *
 * @author Amit Goyal
 */
public class FlagProcessingException extends CarematixException
{
	private static final long serialVersionUID = 1L;
	private final static String  NAME = "FlagProcessingException";

	public FlagProcessingException()
	{
		super();
	}

	public FlagProcessingException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public FlagProcessingException(String message)
	{
		super(message);
	}

	public FlagProcessingException(Throwable cause)
	{
		super(cause);
	}

	/**
     * Retrives the Name of this exception
     *
     * @return String - name of exception.
     */
    protected String getName()
    {
          return FlagProcessingException.NAME;
    }

}
