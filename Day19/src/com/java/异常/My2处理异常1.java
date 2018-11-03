package com.java.异常;

public class My2处理异常1 {

	/**
 A:异常处理的两种方式
	* a:try…catch…finally
		* try catch
		* try catch finally
		* try finally 
	* b:throws
* B:try...catch处理异常的基本格式
	* try…catch…finally
* C:案例演示
	* try...catch的方式处理1个异常
	 */
	public static void main(String[] args) {
		// try 用来监测异常
		// catch  用来捕获异常
		//finally 用来释放资源
		
		int[] arr = {11,22,33,44,55};
		
		 Method m = new Method();
		 try {									//在try中的内容出问题时,就会找catch解决,否则不会执行catch
			 int x = m.div(10, 1);
			 System.out.println(x);
			 System.out.println(arr[10]);
//			 arr = null;
//			 System.out.println(arr[0]);
			                                
//		} catch (ArithmeticException e) {        //catch检测是否为ArithmeticException错误 ,如果是就执行
//			 System.out.println("除数不可以为0");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			 System.out.println("索引越界异常");
//		} catch (Exception e) {                     //相当于父类引用指向子类对象   应该放到catch的最后面
//			System.out.println("出错了");	        //一个try跟多个catch时小的放前面,大的放后面
//		}
		 
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { //catch检测是否为ArithmeticException错误 ,如果是就执行
			
			System.out.println("出错了:除数不可以为0 或者出现的索引越界");
		} 
		 
		 

		

	}

}
