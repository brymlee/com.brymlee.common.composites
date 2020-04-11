package com.brymlee.common.composites.pub;

public class Tuple2<T, U>{

	private final T t1;
	private final U t2;

	public Tuple2(final T t1, final U t2){
		this.t1 = t1;
		this.t2 = t2;
	}

	public T t1(){
		return this.t1;
	}

	public U t2(){
		return this.t2;
	}

	public T head(){
		return this.t1;
	}

	public U tail(){
		return this.t2;
	}
}
