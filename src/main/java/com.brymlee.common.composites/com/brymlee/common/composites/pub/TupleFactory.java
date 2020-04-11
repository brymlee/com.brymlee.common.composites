package com.brymlee.common.composites.pub;

public class TupleFactory{

	public static <T, U> Tuple2<T, U> tuple(final T t1, final U t2){
		return new Tuple2<T, U>(t1, t2);
	}

	public static <T, U, V> Tuple3<T, U, V> tuple(final T t1, final U t2, final V t3){
		return new Tuple3<T, U, V>(t1, t2, t3);
	}

	public static <T, U, V, W> Tuple4<T, U, V, W> tuple(final T t1, final U t2, final V t3, final W t4){
		return new Tuple4<T, U, V, W>(t1, t2, t3, t4);
	}

	public static <T, U, V, W, X> Tuple5<T, U, V, W, X> tuple(final T t1, final U t2, final V t3, final W t4, final X t5){
		return new Tuple5<T, U, V, W, X>(t1, t2, t3, t4, t5);
	}

	public static <T, U, V, W, X, Y> Tuple6<T, U, V, W, X, Y> tuple(final T t1, final U t2, final V t3, final W t4, final X t5, final Y t6){
		return new Tuple6<T, U, V, W, X, Y>(t1, t2, t3, t4, t5, t6);
	}

	public static <T, U, V, W, X, Y, Z> Tuple7<T, U, V, W, X, Y, Z> tuple(final T t1, final U t2, final V t3, final W t4, final X t5, final Y t6, final Z t7){
		return new Tuple7<T, U, V, W, X, Y, Z>(t1, t2, t3, t4, t5, t6, t7);
	}

	public static <T, U, V, W, X, Y, Z, A> Tuple8<T, U, V, W, X, Y, Z, A> tuple(final T t1, final U t2, final V t3, final W t4, final X t5, final Y t6, final Z t7, final A t8){
		return new Tuple8<T, U, V, W, X, Y, Z, A>(t1, t2, t3, t4, t5, t6, t7, t8);
	}

	public static <T, U, V, W, X, Y, Z, A, B> Tuple9<T, U, V, W, X, Y, Z, A, B> tuple(final T t1, final U t2, final V t3, final W t4, final X t5, final Y t6, final Z t7, final A t8, final B t9){
		return new Tuple9<T, U, V, W, X, Y, Z, A, B>(t1, t2, t3, t4, t5, t6, t7, t8, t9);
	}
}
