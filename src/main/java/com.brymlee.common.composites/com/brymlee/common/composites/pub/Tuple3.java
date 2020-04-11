package com.brymlee.common.composites.pub;

import static com.brymlee.common.composites.pub.TupleFactory.tuple;

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

	public T head(){
		return this.t1;
	}

	public Tuple2<U, V> tail(){
		return tuple(this.t2, this.t3);
	}

	public <W> Tuple4<T, U, V, W> append(final W w){
		return tuple(this.t1, this.t2, this.t3, w);
	}

	public <W, X> Tuple5<T, U, V, W, X> append(final W w, final X x){
		return tuple(this.t1, this.t2, this.t3, w, x);
	}

	public <W, X> Tuple5<T, U, V, W, X> append(final Tuple2<W, X> tuple){
		return tuple(this.t1, this.t2, this.t3, tuple.t1(), tuple.t2());
	}

	public <W, X, Y> Tuple6<T, U, V, W, X, Y> append(final W w, final X x, final Y y){
		return tuple(this.t1, this.t2, this.t3, w, x, y);
	}

	public <W, X, Y> Tuple6<T, U, V, W, X, Y> append(final Tuple3<W, X, Y> tuple){
		return tuple(this.t1, this.t2, this.t3, tuple.t1(), tuple.t2(), tuple.t3());
	}

	public <W, X, Y, Z> Tuple7<T, U, V, W, X, Y, Z> append(final W w, final X x, final Y y, final Z z){
		return tuple(this.t1, this.t2, this.t3, w, x, y, z);
	}

	public <W, X, Y, Z> Tuple7<T, U, V, W, X, Y, Z> append(final Tuple4<W, X, Y, Z> tuple){
		return tuple(this.t1, this.t2, this.t3, tuple.t1(), tuple.t2(), tuple.t3(), tuple.t4());
	}

	public <W, X, Y, Z, A> Tuple8<T, U, V, W, X, Y, Z, A> append(final W w, final X x, final Y y, final Z z, final A a){
		return tuple(this.t1, this.t2, this.t3, w, x, y, z, a);
	}

	public <W, X, Y, Z, A> Tuple8<T, U, V, W, X, Y, Z, A> append(final Tuple5<W, X, Y, Z, A> tuple){
		return tuple(this.t1, this.t2, this.t3, tuple.t1(), tuple.t2(), tuple.t3(), tuple.t4(), tuple.t5());
	}

	public <W, X, Y, Z, A, B> Tuple9<T, U, V, W, X, Y, Z, A, B> append(final W w, final X x, final Y y, final Z z, final A a, final B b){
		return tuple(this.t1, this.t2, this.t3, w, x, y, z, a, b);
	}

	public <W, X, Y, Z, A, B> Tuple9<T, U, V, W, X, Y, Z, A, B> append(final Tuple6<W, X, Y, Z, A, B> tuple){
		return tuple(this.t1, this.t2, this.t3, tuple.t1(), tuple.t2(), tuple.t3(), tuple.t4(), tuple.t5(), tuple.t6());
	}
}
