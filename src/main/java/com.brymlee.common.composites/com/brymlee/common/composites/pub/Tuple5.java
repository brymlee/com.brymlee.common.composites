package com.brymlee.common.composites.pub;

import com.brymlee.common.composites.pub.TupleFactory.tuple;

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
		return tuple(this.t2, this.t3, this.t4, this.t5);
	}

	public <Y> Tuple6<T, U, V, W, X, Y> append(final Y y){
		return tuple(this.t1, this.t2, this.t3, this.t4, this.t5, y);
	}

	public <Y, Z> Tuple7<T, U, V, W, X, Y, Z> append(final Y y, final Z z){
		return tuple(this.t1, this.t2, this.t3, this.t4, this.t5, y, z){
	}

	public <Y, Z> Tuple7<T, U, V, W, X, Y, Z> append(final Tuple2<Y, Z> tuple){
		return tuple(this.t1, this.t2, this.t3, this.t4, this.t5, tuple.t1(), tuple.t2());
	}

	public <Y, Z, A> Tuple8<T, U, V, W, X, Y, Z, A> append(final Y y, final Z z, final A a){
		return tuple(this.t1, this.t2, this.t3, this.t4, this.t5, y, z, a);
	}

	public <Y, Z, A> Tuple8<T, U, V, W, X, Y, Z, A> append(final Tuple3<Y, Z, A> tuple){
		return tuple(this.t1, this.t2, this.t3, this.t4, this.t5, tuple.t1(), tuple.t2(), tuple.t3());
	}

	public <Y, Z, A, B> Tuple9<T, U, V, W, X, Y, Z, A, B> append(final Y y, final Z z, final A a, final B b){
		return tuple(this.t1, this.t2, this.t3, this.t4, this.t5, y, z, a, b);
	}

	public <Y, Z, A, B> Tuple9<T, U, V, W, X, Y, Z, A, B> append(final Tuple4<Y, Z, A, B> tuple){
		return tuple(this.t1, this.t2, this.t3, this.t4, this.t5, tuple.t1(), tuple.t2(), tuple.t3(), tuple.t4());
	}
}
