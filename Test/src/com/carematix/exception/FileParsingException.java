package com.carematix.exception;

/**
 * <code>FileParsingException</code> class indicate conditions that parsing
 * a file part might want to catch.
 *
 * @author RChaudhary
 */
public class FileParsingException extends CarematixException
{
	private static final long serialVersionUID = 1L;
	private final static String  NAME = "FileParsingException";

	public FileParsingException()
	{
		super();
	}

	public FileParsingException(String message)
	{
		super(message);
	}

	public FileParsingException(Throwable cause)
	{
		super(cause);
	}

	public FileParsingException(String detail, Throwable cause)
	{
		super(detail, cause);
	}

	/**
     * Retrives the Name of this exception
     *
     * @return name of exception.
     */
    protected String getName()
    {
          return FileParsingException.NAME;
    }
}
