class  PatternsEx1
{
	public static void main(String[] args) 
	{
		int n = 5;
		int m = 5;
		// outer loop
		for(int i=1; i<=n; i++) {
			// inner loop
			for(int j=1; j<=m; j++){
				System.out.println("* ");
			}
			System.out.println();
		}
	}
}
