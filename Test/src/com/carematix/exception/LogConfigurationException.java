package com.carematix.exception;

public class LogConfigurationException extends ConfigurationException
{
	private static final long serialVersionUID = 1L;
	private final static String  NAME = "LogConfigurationException";

	public LogConfigurationException()
	{
		super();
	}

	public LogConfigurationException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public LogConfigurationException(String detail)
	{
		super(detail);
	}

	public LogConfigurationException(Throwable cause)
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
          return LogConfigurationException.NAME;
    }
}
