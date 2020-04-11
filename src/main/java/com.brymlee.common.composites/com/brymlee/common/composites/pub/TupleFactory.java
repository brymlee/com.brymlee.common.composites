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
}
