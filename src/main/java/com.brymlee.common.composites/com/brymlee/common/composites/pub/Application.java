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

		final Tuple4<Integer, Integer, Integer, Integer> tuple4 = tuple(1, 2, 3, 4);
		System.out.println(tuple4.t1());
		System.out.println(tuple4.t2());
		System.out.println(tuple4.t3());
		System.out.println(tuple4.t4());

		final Tuple5<Integer, Integer, Integer, Integer, Integer> tuple5 = tuple(1, 2, 3, 4, 5);
		System.out.println(tuple5.t1());
		System.out.println(tuple5.t2());
		System.out.println(tuple5.t3());
		System.out.println(tuple5.t4());
		System.out.println(tuple5.t5());
	}

}
