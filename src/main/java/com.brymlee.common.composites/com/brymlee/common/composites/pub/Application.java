package com.brymlee.common.composites.pub;

import static com.brymlee.common.composites.pub.TupleFactory.tuple;

public class Application{

	public static void main(final String[] arguments){
		final Tuple2<Integer, Integer> tuple2 = tuple(1, 2);
		System.out.println(tuple2.t1());
		System.out.println(tuple2.t2());

		final Tuple3<Integer, Character, Integer> tuple3 = tuple(1, 'c', 2);
		System.out.println(tuple3.t1());
		System.out.println(tuple3.t2());
		System.out.println(tuple3.t3());
	}

}
