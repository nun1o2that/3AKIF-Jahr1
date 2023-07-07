public class Memory {

	private void foo(Object param) {
		String str = param.toString();
        System.out.println(str);
    }

	public static void main(String[] args) {
		int i = 1;
		Object obj = new Object();
		Memory mem = new Memory();
		mem.foo(obj);
	}

}
