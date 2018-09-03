package com.xiong.domain.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.javassist.expr.NewArray;
import org.junit.Test;

public class testList {

	private static class A {
		private int a1 = 1;
		private List<Integer> list = new ArrayList<>();

		public List<Integer> getList() {
			return list;
		}

		public void setList(List<Integer> list) {
			this.list = list;
		}

		@Override
		public String toString() {
			return "a [a1=" + a1 + ", list=" + list + "]";
		}

	}

	@Test
	public void test() {
		A a1 = new A();
		a1.list.add(11);
		a1.list.add(12);
		System.out.println(a1);
	}
}
