package com.jperf.prestineqube.example.s1192;

/*
 *  Exceptions To prevent generating some false-positives, literals having less than 5 characters are excluded.
 */
public class Foo {
	public void run() {
		prepare("action1"); // Noncompliant - "action1" is duplicated 3 times
		execute("action1");
		release("action1");
	}

	private void release(String string) {
	}

	private void execute(String string) {
	}

	private void prepare(String string) {
	}

	public String method3(String a) {
		System.out.println("'" + a + "'"); // Compliant - literal "'" has less than 5 characters and is excluded
		return ""; // Compliant - literal "" has less than 5 characters and is excluded
	}
}
