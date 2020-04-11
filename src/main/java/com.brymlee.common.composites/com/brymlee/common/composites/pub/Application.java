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

		final Tuple6<Integer, Integer, Integer, Integer, Integer, Integer> tuple6 = tuple(1, 2, 3, 4, 5, 6);
		System.out.println(tuple6.t1());
		System.out.println(tuple6.t2());
		System.out.println(tuple6.t3());
		System.out.println(tuple6.t4());
		System.out.println(tuple6.t5());
		System.out.println(tuple6.t6());

		final Tuple7<Integer, Integer, Integer, Integer, Integer, Integer, Integer> tuple7 = tuple(1, 2, 3, 4, 5, 6, 7);
		System.out.println(tuple7.t1());
		System.out.println(tuple7.t2());
		System.out.println(tuple7.t3());
		System.out.println(tuple7.t4());
		System.out.println(tuple7.t5());
		System.out.println(tuple7.t6());
		System.out.println(tuple7.t7());

		final Tuple8<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> tuple8 = tuple(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println(tuple8.t1());
		System.out.println(tuple8.t2());
		System.out.println(tuple8.t3());
		System.out.println(tuple8.t4());
		System.out.println(tuple8.t5());
		System.out.println(tuple8.t6());
		System.out.println(tuple8.t7());
		System.out.println(tuple8.t8());

		final Tuple9<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> tuple9 = tuple(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(tuple9.t1());
		System.out.println(tuple9.t2());
		System.out.println(tuple9.t3());
		System.out.println(tuple9.t4());
		System.out.println(tuple9.t5());
		System.out.println(tuple9.t6());
		System.out.println(tuple9.t7());
		System.out.println(tuple9.t8());
		System.out.println(tuple9.t9());

		System.out.println(tuple9.tail().head());
	}

}
