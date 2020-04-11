package com.brymlee.common.composites.pub;

public class Tuple5<T, U, V, W, X>{

	private final T t1;
	private final U t2;
	private final V t3;
	private final W t4;
	private final X t5;

	public Tuple5(final T t1, 
				  final U t2, 
				  final V t3,
				  final W t4,
				  final X t5){
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		this.t4 = t4;
		this.t5 = t5;
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

	public W t4(){
		return this.t4;
	}

	public X t5(){
		return this.t5;
	}

	public T head(){
		return this.t1;
	}

	public Tuple4<U, V, W, X> tail(){
		return TupleFactory.tuple(this.t2, this.t3, this.t4, this.t5);
	}
}
