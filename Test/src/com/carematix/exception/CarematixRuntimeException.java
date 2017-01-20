package com.carematix.exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;

public class CarematixRuntimeException extends RuntimeException
{
	private static final long serialVersionUID = 1L;
	/**
	 * Currently executing thread name.
	 */
	private String threadName;

	/**
	 * Holds exception detail message.
	 */
	private String message;

	/**
	 *Holds the time when this exception object is created.
	 */
	private Date timeNow;

	private final static String  NAME = "CarematixRuntimeException";

	public CarematixRuntimeException()
	{
		super();

		this.timeNow = new Date();
		this.threadName = new String(Thread.currentThread().getName());
	}

	public CarematixRuntimeException(String message, Throwable cause)
	{
		super(message, cause);

		this.timeNow = new Date();
		this.threadName = new String(Thread.currentThread().getName());
		this.message = message;
	}

	public CarematixRuntimeException(String message)
	{
		super(message);

		this.timeNow = new Date();
		this.threadName = new String(Thread.currentThread().getName());
		this.message = message;
	}

	public CarematixRuntimeException(Throwable cause)
	{
		super(cause);

		this.timeNow = new Date();
		this.threadName = new String(Thread.currentThread().getName());
	}

	/**
     * Retrives the detail message of this exception.
     *
     * @return String - a detail message of exception.
     */
    public String getMessage()
    {
    	if(this.message == null)
    		return getName();

    	return this.message;
    }

    /**
     * Retrives the Name of this exception
     *
     * @return String - name of exception.
     */
    protected String getName()
    {
          return CarematixRuntimeException.NAME;
    }

    private String exceptionString;

    /**
     * Retrives the full exception message consist of exception
     * <code>NAME</code> and <code>message</code>.
     *
     * @return a complete exception message.
     */
    public String getExceptionString()
    {
      if(exceptionString == null)
      {
    	  exceptionString = this.getName();

        if(this.message != null)
        {
        	exceptionString += " : ";
        	exceptionString += this.message;
        }
      }

      return exceptionString;
    }

    /**
     * Retrives the full exception detail in XML format.
     *
     * @return xml form of full exception detail.
     */
    public String toString()
    {
    	StringBuilder builder = new StringBuilder();
    	builder.append('<');
    	builder.append(getName());
    	builder.append('>');

    	builder.append("<Date>");
    	builder.append(this.timeNow.toString());
    	builder.append("</Date>");

    	builder.append("<ThreadName>");
    	builder.append(this.threadName);
    	builder.append("</ThreadName>");

    	if(this.message != null)
        {
        	builder.append("<Details>");
            builder.append(this.message);
            builder.append("</Details>");
        }
        if(getCause() != null)
        {
        	builder.append("<Cause> ");
        	builder.append(this.printCauseStackTrace(getCause()));
        	builder.append("</Cause>");
        }

        builder.append("</");
        builder.append(getName());
        builder.append('>');
        return builder.toString();
    }

    private String printCauseStackTrace(Throwable cause)
    {
    	String errorCause = "";
    	try
    	{
    		if(cause != null)
        	{
    			StringWriter writer = new StringWriter();
    			PrintWriter prnWriter = new PrintWriter(writer);
    			cause.printStackTrace(prnWriter);
    			writer.flush();
    			errorCause = writer.getBuffer().toString();
        	}
    	}
    	catch(Exception ex)
    	{
    		//Log Messages.210 to log file
    		ex.printStackTrace();
    	}

    	return errorCause;
    }
}
