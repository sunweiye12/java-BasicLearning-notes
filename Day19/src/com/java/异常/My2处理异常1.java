package com.java.�쳣;

public class My2�����쳣1 {

	/**
 A:�쳣��������ַ�ʽ
	* a:try��catch��finally
		* try catch
		* try catch finally
		* try finally 
	* b:throws
* B:try...catch�����쳣�Ļ�����ʽ
	* try��catch��finally
* C:������ʾ
	* try...catch�ķ�ʽ����1���쳣
	 */
	public static void main(String[] args) {
		// try ��������쳣
		// catch  ���������쳣
		//finally �����ͷ���Դ
		
		int[] arr = {11,22,33,44,55};
		
		 Method m = new Method();
		 try {									//��try�е����ݳ�����ʱ,�ͻ���catch���,���򲻻�ִ��catch
			 int x = m.div(10, 1);
			 System.out.println(x);
			 System.out.println(arr[10]);
//			 arr = null;
//			 System.out.println(arr[0]);
			                                
//		} catch (ArithmeticException e) {        //catch����Ƿ�ΪArithmeticException���� ,����Ǿ�ִ��
//			 System.out.println("����������Ϊ0");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			 System.out.println("����Խ���쳣");
//		} catch (Exception e) {                     //�൱�ڸ�������ָ���������   Ӧ�÷ŵ�catch�������
//			System.out.println("������");	        //һ��try�����catchʱС�ķ�ǰ��,��ķź���
//		}
		 
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { //catch����Ƿ�ΪArithmeticException���� ,����Ǿ�ִ��
			
			System.out.println("������:����������Ϊ0 ���߳��ֵ�����Խ��");
		} 
		 
		 

		

	}

}
