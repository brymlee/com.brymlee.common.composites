package com.brymlee.common.composites.pub;

public class Tuple3<T, U, V>{
	private final T t1;
	private final U t2;
	private final V t3;

	public Tuple3(final T t1, final U t2, final V t3){
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}

	public T t1(){
		return this.t1;
	}

	public U t2(){
		return this.t2;
	}

	public V t3(){
		return this.t3;
	}

}
