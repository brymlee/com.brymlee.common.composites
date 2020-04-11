package com.brymlee.common.composites.pub;

import static com.brymlee.common.composites.pub.TupleFactory.tuple;

public class Tuple8<T, U, V, W, X, Y, Z, A>{

	private final T t1;
	private final U t2;
	private final V t3;
	private final W t4;
	private final X t5;
	private final Y t6;
	private final Z t7;
	private final A t8;

	public Tuple8(final T t1, 
				  final U t2, 
				  final V t3,
				  final W t4,
				  final X t5,
				  final Y t6,
				  final Z t7,
				  final A t8){
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		this.t4 = t4;
		this.t5 = t5;
		this.t6 = t6;
		this.t7 = t7;
		this.t8 = t8;
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

	public Y t6(){
		return this.t6;
	}

	public Z t7(){
		return this.t7;
	}

	public A t8(){
		return this.t8;
	}

	public T head(){
		return this.t1;
	}

	public Tuple7<U, V, W, X, Y, Z, A> tail(){
		return tuple(this.t2, this.t3, this.t4, this.t5, this.t6, this.t7, this.t8);
	}

	public <B> Tuple9<T, U, V, W, X, Y, Z, A, B> append(final B b){
		return tuple(this.t1, this.t2, this.t3, this.t4, this.t5, this.t6, this.t7, this.t8, b);
	}
}
