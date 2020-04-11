package com.brymlee.common.composites.pub;

public class TupleFactory{

	public static <T, U> Tuple2 tuple(final T t1, final T t2){
		return new Tuple2(t1, t2);
	}
}
