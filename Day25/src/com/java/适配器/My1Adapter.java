package com.java.适配器;

public class My1Adapter {

	/**
	 * @param args
	 * 此处天罡星就是一个适配器
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface 和尚 {                //创建一个接口,接口中有若干方法
	
	public void 打坐();
	public void 念经();
	public void 撞钟();
	public void 习武();
	
}

 abstract class 天罡星 implements 和尚{  //创建一个类去实现上面的接口,重写上面的方法,
	 									//将他定义为抽象类,为了不让别人去创它的对象,因为方法都是空的,创建没意义
	@Override							//因此它可以作为和尚接口的适配器,别的类可以通过继承此类来实现里面的某几个方法
										//这样就省的继承"和尚"接口时要重写全部方法
	public void 打坐() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 念经() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 撞钟() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 习武() {
		// TODO Auto-generated method stub
		
	}
	
}

 class 鲁智深 extends 天罡星 {
	 @Override
	public void 习武() {
		// TODO Auto-generated method stub
		System.out.println("倒拔垂杨柳");
	}
 }
 