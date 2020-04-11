package com.brymlee.common.composites.pub;

public class Tuple4<T, U, V, W>{
	private final T t1;
	private final U t2;
	private final V t3;
	private final W t4;

	public Tuple4(final T t1,
				  final U t2,
				  final V t3,
				  final W t4){
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		this.t4 = t4;
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

	public T head(){
		return this.t1;
	}

	public Tuple3<U, V, W> tail(){
		return TupleFactory.tuple(this.t2, this.t3, this.t4);
	}

}
