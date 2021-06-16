package kira.formation.test.demo.printer;

public class SysoPrinter implements Printer{

	@Override
	public void print(String message) {
		System.out.println(message);
	}
}
