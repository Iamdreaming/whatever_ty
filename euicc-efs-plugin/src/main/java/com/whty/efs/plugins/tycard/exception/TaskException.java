package com.whty.efs.plugins.tycard.exception;

import com.whty.efs.common.exception.EuiccBaseException;


public class TaskException extends EuiccBaseException {

	private static final long serialVersionUID = -1463788440407966391L;

	public TaskException() {
	}

	public TaskException(String message) {
		super(message);
	}

	public TaskException(Throwable cause) {
		super(cause);
	}

	public TaskException(String message, Throwable cause) {
		super(message, cause);
	}

	@Override
	public String getCode() {
		// TODO Auto-generated method stub
		return "000007";
	}

}
