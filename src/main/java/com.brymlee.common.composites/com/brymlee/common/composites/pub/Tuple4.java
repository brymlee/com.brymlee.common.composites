package com.brymlee.common.composites.pub;

import static com.brymlee.common.composites.pub.TupleFactory.tuple;

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
		return tuple(this.t2, this.t3, this.t4);
	}

	public <X> Tuple5<T, U, V, W, X> append(final X x){
		return tuple(this.t1, this.t2, this.t3, this.t4, x);
	}

	public <X, Y> Tuple6<T, U, V, W, X, Y> append(final X x, final Y y){
		return tuple(this.t1, this.t2, this.t3, this.t4, x, y);
	}

	public <X, Y> Tuple6<T, U, V, W, X, Y> append(final Tuple2<X, Y> tuple){
		return tuple(this.t1, this.t2, this.t3, this.t4, tuple.t1(), tuple.t2());
	}

	public <X, Y, Z> Tuple7<T, U, V, W, X, Y, Z> append(final X x, final Y y, final Z z){
		return tuple(this.t1, this.t2, this.t3, this.t4, x, y, z);
	}

	public <X, Y, Z> Tuple7<T, U, V, W, X, Y, Z> append(final Tuple3<X, Y, Z> tuple){
		return tuple(this.t1, this.t2, this.t3, this.t4, tuple.t1(), tuple.t2(), tuple.t3());
	}

	public <X, Y, Z, A> Tuple8<T, U, V, W, X, Y, Z, A> append(final X x, final Y y, final Z z, final A a){
		return tuple(this.t1, this.t2, this.t3, this.t4, x, y, z, a);
	}

	public <X, Y, Z, A> Tuple8<T, U, V, W, X, Y, Z, A> append(final Tuple4<X, Y, Z, A> tuple){
		return tuple(this.t1, this.t2, this.t3, this.t4, tuple.t1(), tuple.t2(), tuple.t3(), tuple.t4());
	}

	public <X, Y, Z, A, B> Tuple9<T, U, V, W, X, Y, Z, A, B> append(final X x, final Y y, final Z z, final A a, final B b){
		return tuple(this.t1, this.t2, this.t3, this.t4, x, y, z, a, b);
	}

	public <X, Y, Z, A, B> Tuple9<T, U, V, W, X, Y, Z, A, B> append(final Tuple5<X, Y, Z, A, B> tuple){
		return tuple(this.t1, this.t2, this.t3, this.t4, tuple.t1(), tuple.t2(), tuple.t3(), tuple.t4(), tuple.t5());
	}
}
