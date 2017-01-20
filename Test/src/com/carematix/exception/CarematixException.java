package com.carematix.exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;

//import com.carematix.util.DebugUtil;

/**
 * The class <code>CarematixException</code> and its subclasses are form of
 * <code>Exception</code> that indicates conditions that Carematix Applications
 * might want to catch.
 *
 * @author RChaudhary
 */
public class CarematixException extends java.lang.Exception
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**Database vendor-specific exception code,
	 * when <code>CarematixException</code> or it's subclass exception is thrown
	 * because of <code>SQLException</code>
	 */
	private int errorCode = -1;

	/**
	 * An XOPEN or SQL 99 code identifying the exception
	 * when <code>CarematixException</code> or it's subclass exception is thrown
	 * because of <code>SQLException</code>
	 */
	private String SQLState;

	/**
	 * Currently executing thread name.
	 */
	private String threadName;

	/**
	 * Holds exception detail message.
	 */
	private String message;

	/**
	 * Holds root cause of exception.
	 */
	private Throwable cause;

	/**
	 *Holds the time when this exception object is created.
	 */
	private Date timeNow;

	private final static String  NAME = "CareMatixException";

	/**
	 * Constructs a new <code>CarematixException</code> exception object with
	 * current time and executing thread name.
	 * the <code>SQLState</code> is default to <code>null</code>,
	 * the <code>message</code> is default to <code>null</code>,
	 * the <code>errorCode</code> is default to <code>-1</code>.
	 */
	public CarematixException()
    {
		super();

		this.timeNow = new Date();
		this.threadName = new String(Thread.currentThread().getName());
    }

	/**
	 * Constructs a new <code>CarematixException</code> exception object with a vendor code.
	 * the <code>SQLState</code> is default to <code>null</code>,
	 * the <code>detail</code> is default to <code>null</code>,
	 *
	 * @param vendorCode - database vendor-specific exception code in case of <code>SQLException</code>
	 */
    public CarematixException(int vendorCode)
    {
    	super();

    	this.timeNow = new Date();
    	this.threadName = new String(Thread.currentThread().getName());
    	this.errorCode = vendorCode;

    	this.message = null;
    	this.SQLState = null;
    }

    /**
	 * Constructs a new <code>CarematixException</code> exception object with specified message.
	 * the <code>SQLState</code> is default to <code>null</code>,
	 * the <code>errorCode</code> is default to <code>-1</code>.
	 *
	 * @param message - the detail message (which is saved for later retrieval by the
	 * 					{@link #getMessage()} method.)
	 */
    public CarematixException(String message)
    {
    	super(message);
    	this.timeNow = new Date();
    	this.threadName = new String(Thread.currentThread().getName());
    	this.message = message;

    	this.errorCode = -1;
    	this.SQLState = null;
    }

    /**
	 * Constructs a new <code>CarematixException</code> exception object with specified cause.
	 * the <code>SQLState</code> is default to <code>null</code>,
	 * the <code>errorCode</code> is default to <code>-1</code>.
	 *
	 * @param message - the detail message (which is saved for later retrieval by the
	 * 					{@link #getMessage()} method.)
	 */
    public CarematixException(Throwable cause)
    {
    	super(cause);
    	this.timeNow = new Date();
    	this.threadName = new String(Thread.currentThread().getName());
    	this.cause = cause;

    	this.message = null;
    	this.errorCode = -1;
    	this.SQLState = null;
    }

    /**
     * Construct a new <code>CarematixException</code> exception object with specified message
     * and cause. Note that the detail message associated with cause in not automatically
     * incorporated in this exception's detail message.
     * the <code>SQLState</code> is default to <code>null</code>,
	 * the <code>errorCode</code> is default to <code>-1</code>.
     *
     * @param message - the detail message (which is saved for later retrieval by the
     * 				   {@link #getMessage()} method.)
     * @param cause	- the cause (which is saved for later retrieval by the {@link #getCause()} method.}
     */
    public CarematixException(String message, Throwable cause)
    {
    	super(message, cause);
    	this.timeNow = new Date();
    	this.threadName = new String(Thread.currentThread().getName());
    	this.message = message;
    	this.cause = cause;

    	this.errorCode = -1;
    	this.SQLState = null;
    }

    /**
	 * Constructs a new <code>CarematixException</code> exception object with a vendor code and exception message.
	 * the <code>SQLState</code> is default to <code>null</code>.
	 *
	 * @param vendorCode - database vendor-specific exception code in case of <code>SQLException</code>
	 * @param message - a message of exception
	 */
    public CarematixException(int vendorCode, String message)
    {
    	super(message);

    	this.timeNow = new Date();
    	this.threadName = new String(Thread.currentThread().getName());
    	this.errorCode = vendorCode;
    	this.message = message;
    	this.SQLState = null;
    }

    /**
	 * Constructs a new <code>CarematixException</code> exception object with a vendor code,
	 * SQLState and exception detail.
	 *
	 * @param vendorCode - database vendor-specific exception code in case of <code>SQLException</code>.
	 * @param sqlState - An XOPEN or SQL 99 code identifying the exception.
	 * @param message - a message of exception.
	 */
    public CarematixException(int vendorCode,String sqlState, String message)
    {
    	super(message);

    	this.timeNow = new Date();
    	this.threadName = new String(Thread.currentThread().getName());
    	this.errorCode = vendorCode;
    	this.SQLState = sqlState;
    	this.message = message;
    }

    /**
	 * Constructs a new <code>CarematixException</code> exception object with a vendor code,
	 * SQLState and message and cause.
	 *
	 * @param vendorCode - database vendor-specific exception code in case of <code>SQLException</code>.
	 * @param sqlState - An XOPEN or SQL 99 code identifying the exception.
	 * @param message - a message of exception.
	 * @param cause - the cause (which is saved for later retrieval by the {@link #getCause()} method.}
	 */
    public CarematixException(int vendorCode,String sqlState, String message, Throwable cause)
    {
    	super(message, cause);

    	this.timeNow = new Date();
    	this.threadName = new String(Thread.currentThread().getName());
    	this.errorCode = vendorCode;
    	this.SQLState = sqlState;
    	this.message = message;
    	this.cause = cause;
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
          return CarematixException.NAME;
    }

    /**
     * Retrives database vendor-specific SQL Error Code.
     *
     * @return database vendr-specific SQL Error Code.
     */
    public int getErrorCode()
    {
    	return this.errorCode;
    }

    /**
     * Retrives XOPEN or SQL 99 code identifying the exception
     *
     * @return - XOPEN or SQL 99 code identifying the exception
     */
    public String getSQLState()
    {
    	return this.SQLState;
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

    public Throwable getCause()
    {
    	return this.cause;
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
    	builder.append("\n\t");

    	builder.append("<Date>");
    	builder.append(this.timeNow.toString());
    	builder.append("</Date>");
    	builder.append("\n\t");

    	builder.append("<ThreadName>");
    	builder.append(this.threadName);
    	builder.append("</ThreadName>");
    	builder.append("\n\t");

    	if(this.errorCode != -1)
    	{
    		builder.append("<ErrorCode>");
        	builder.append(this.errorCode);
        	builder.append("</ErrorCode>");
        	builder.append("\n\t");
    	}

    	if(this.SQLState != null)
    	{
    		builder.append("<SQLState>");
            builder.append(this.SQLState);
            builder.append("</SQLState>");
            builder.append("\n\t");
    	}

        if(this.message != null)
        {
        	builder.append("<CustomMessage>");
            builder.append(this.message);
            builder.append("</CustomMessage>");
            builder.append("\n\t");
        }
        if(getCause() != null)
        {
        	builder.append("<Cause> ");
        	builder.append("<CauseMessage>");
        	builder.append(getCause().getMessage());
        	builder.append("</CauseMessage>");
        	builder.append("<![PCDATA[");
        	//if(getCause() instanceof CarematixException)
        	{
        		builder.append("\n\t\t");
        		builder.append(printCauseStackTrace(getCause()));
        	}
        	builder.append("]]");
        	builder.append("</Cause>");
        	builder.append("\n");
        }

        builder.append("</");
        builder.append(getName());
        builder.append('>');
        return builder.toString();
    }

    public static String printCauseStackTrace(Throwable cause)
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
