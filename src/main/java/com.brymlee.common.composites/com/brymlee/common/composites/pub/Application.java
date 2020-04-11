package com.brymlee.common.composites.pub;

public class Application{

	public static void main(final String[] arguments){
		final Tuple2<Integer, Integer> tuple = TupleFactory.<Integer, Integer>tuple(1, 2);
		System.out.println(tuple.t1());
		System.out.println(tuple.t2());
	}

}
