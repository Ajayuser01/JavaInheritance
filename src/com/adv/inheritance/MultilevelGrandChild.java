package com.adv.inheritance;

public class MultilevelGrandChild extends MultilevelParent {
	public void child() {
		System.out.println("Child");
		System.out.println("Inside Child");
		grandParent();
	}
}
