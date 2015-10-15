class HasStaticAndNormalMethod
{
	static int dataStatic;
	
	int dataNormal;
	
	static void staticPrintData()
	
	{
		System.out.println( dataStatic ); 
	}
	void normalPrintData()
	{
		System.out.println( dataStatic );
		
		System.out.println( dataNormal );
		
	}		
}

class HasMethodAndNormalRunner
{
	public static void main(String[] args) 
	{
		// TODO 自動生成されたメソッド・スタブ
		HasStaticAndNormalMethod.dataStatic	= 1;
		
		HasStaticAndNormalMethod ref = new HasStaticAndNormalMethod();
		ref.dataNormal = 100;
		
		HasStaticAndNormalMethod.staticPrintData();
		
		ref.normalPrintData();
		
		
	}

}
