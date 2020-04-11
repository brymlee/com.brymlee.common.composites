package com.brymlee.common.composites.pub;

import static com.brymlee.common.composites.pub.TupleFactory.tuple;

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

	public <V> Tuple3<T, U, V> append(final V v){
		return tuple(this.t1, this.t2, v);
	}

	public <V, W> Tuple4<T, U, V, W> append(final V v, final W w){
		return tuple(this.t1, this.t2, v, w);
	}

	public <V, W> Tuple4<T, U, V, W> append(final Tuple2<V, W> tuple){
		return tuple(this.t1, this.t2, tuple.t1(), tuple.t2());
	}

	public <V, W, X> Tuple5<T, U, V, W, X> append(final V v, final W w, final X x){
		return tuple(this.t1, this.t2, v, w, x);
	}

	public <V, W, X> Tuple5<T, U, V, W, X> append(final Tuple3<V, W, X> tuple){
		return tuple(this.t1, this.t2, tuple.t1(), tuple.t2(), tuple.t3());
	}

	public <V, W, X, Y> Tuple6<T, U, V, W, X, Y> append(final V v, final W w, final X x, final Y y){
		return tuple(this.t1, this.t2, v, w, x, y);
	}

	public <V, W, X, Y> Tuple6<T, U, V, W, X, Y> append(final Tuple4<V, W, X, Y> tuple){
		return tuple(this.t1, this.t2, tuple.t1(), tuple.t2(), tuple.t3(), tuple.t4());
	}

	public <V, W, X, Y, Z> Tuple7<T, U, V, W, X, Y, Z> append(final V v, final W w, final X x, final Y y, final Z z){
		return tuple(this.t1, this.t2, v, w, x, y, z);
	}

	public <V, W, X, Y, Z> Tuple7<T, U, V, W, X, Y, Z> append(final Tuple5<V, W, X, Y, Z> tuple){
		return tuple(this.t1, this.t2, tuple.t1(), tuple.t2(), tuple.t3(), tuple.t4(), tuple.t5());
	}

	public <V, W, X, Y, Z, A> Tuple8<T, U, V, W, X, Y, Z, A> append(final V v, final W w, final X x, final Y y, final Z z, final A a){
		return tuple(this.t1, this.t2, v, w, x, y, z, a);
	}

	public <V, W, X, Y, Z, A> Tuple8<T, U, V, W, X, Y, Z, A> append(final Tuple6<V, W, X, Y, Z, A> tuple){
		return tuple(this.t1, this.t2, tuple.t1(), tuple.t2(), tuple.t3(), tuple.t4(), tuple.t5(), tuple.t6());
	}

	public <V, W, X, Y, Z, A, B> Tuple9<T, U, V, W, X, Y, Z, A, B> append(final V v, final W w, final X x, final Y y, final Z z, final A a, final B b){
		return tuple(this.t1, this.t2, v, w, x, y, z, a, b);
	}

	public <V, W, X, Y, Z, A, B> Tuple9<T, U, V, W, X, Y, Z, A, B> append(final Tuple7<V, W, X, Y, Z, A, B> tuple){
		return tuple(this.t1, this.t2, tuple.t1(), tuple.t2(), tuple.t3(), tuple.t4(), tuple.t5(), tuple.t6(), tuple.t7());
	}
}
