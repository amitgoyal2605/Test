package com.carematix.exception;

/** This class is an Exception class for conditions where the flags cannot be calculated
 *
 * @author Amit Goyal
 */
public class InsufficientDataException extends CarematixException
{
	private static final long serialVersionUID = 1L;
	private final static String  NAME = "InsufficientDataException";

	public InsufficientDataException()
	{
		super();
	}

	public InsufficientDataException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public InsufficientDataException(String message)
	{
		super(message);
	}

	public InsufficientDataException(Throwable cause)
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
          return InsufficientDataException.NAME;
    }

}
