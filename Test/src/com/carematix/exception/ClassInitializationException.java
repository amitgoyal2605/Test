package com.carematix.exception;

/**
 * <code>ClassInitializationException</code> class indicate the conditions that
 * creating objects of class part might want to catch.
 *
 * @author RChaudhary
 */
public class ClassInitializationException extends CarematixRuntimeException
{
	private static final long serialVersionUID = 1L;
	private final static String  NAME = "ClassInitializationException";

	public ClassInitializationException()
	{
		super();
	}

	public ClassInitializationException(String message)
	{
		super(message);
	}

	public ClassInitializationException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public ClassInitializationException(Throwable cause)
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
          return ClassInitializationException.NAME;
    }
}
