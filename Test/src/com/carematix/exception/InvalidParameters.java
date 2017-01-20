package com.carematix.exception;

/**
 *
 * @author RChaudhary
 */
public class InvalidParameters extends CarematixException
{
	private static final long serialVersionUID = 1L;
	private final static String  NAME = "InvalidParameters";

	public InvalidParameters()
	{
		super();
	}

	public InvalidParameters(String message, Throwable cause)
	{
		super(message, cause);
	}

	public InvalidParameters(String message)
	{
		super(message);
	}

	public InvalidParameters(Throwable cause)
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
          return InvalidParameters.NAME;
    }

}
