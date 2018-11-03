package com.java.异常;

/*
* A:为什么需要自定义异常
	* 使的异常变得个性化
* B:自定义异常概述
	* 继承自Exception
	* 继承自RuntimeException (一般用这个)
 */

public class My5自定义异常 {
}

class  年龄超出异常 extends RuntimeException {     //自己定义一个异常    然后重写有参构造 就可以再抛出异常时直接应用

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public 年龄超出异常() {
		super();
		// TODO Auto-generated constructor stub
	}

	public 年龄超出异常(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public 年龄超出异常(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public 年龄超出异常(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public 年龄超出异常(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}	
}