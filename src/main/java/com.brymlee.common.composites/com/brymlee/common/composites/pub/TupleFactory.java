package com.brymlee.common.composites.pub;

public class TupleFactory{

	public static <T, U> Tuple2<T, U> tuple(final T t1, final U t2){
		return new Tuple2<T, U>(t1, t2);
	}
}
