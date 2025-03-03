class Addition 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

// the retuened value will replace the method call stmt:

		System.out.println(add(10,20));
		System.out.println(add(12,34));
	}
		public static int add (int a , int b)
	{
		int res = a + b;
		return res;
	}
}
