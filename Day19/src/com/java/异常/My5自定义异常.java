package com.java.�쳣;

/*
* A:Ϊʲô��Ҫ�Զ����쳣
	* ʹ���쳣��ø��Ի�
* B:�Զ����쳣����
	* �̳���Exception
	* �̳���RuntimeException (һ�������)
 */

public class My5�Զ����쳣 {
}

class  ���䳬���쳣 extends RuntimeException {     //�Լ�����һ���쳣    Ȼ����д�вι��� �Ϳ������׳��쳣ʱֱ��Ӧ��

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ���䳬���쳣() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ���䳬���쳣(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ���䳬���쳣(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ���䳬���쳣(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ���䳬���쳣(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}	
}