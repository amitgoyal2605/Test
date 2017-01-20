package com.carematix.exception;

/**
 * The class <code>ConfigurationException</code> is form of <code>CarematixException</code>
 * that indicates conditions the Parsing, validating and setting configuration to application
 * part might want to catch.
 *
 * @author RChaudhary
 */
public class ConfigurationException extends CarematixException
{
	private static final long serialVersionUID = 1L;
	private final static String  NAME = "ConfigurationException";

	public ConfigurationException()
	{
		super();
	}

	public ConfigurationException(String detail)
	{
		super(detail);
	}

	public ConfigurationException(Throwable cause)
	{
		super(cause);
	}

	public ConfigurationException(String message, Throwable cause)
	{
		super(message, cause);
	}

	/**
     * Retrives the Name of this exception
     *
     * @return name of exception.
     */
    protected String getName()
    {
          return ConfigurationException.NAME;
    }
}
