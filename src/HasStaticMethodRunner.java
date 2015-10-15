
class HasStaticMethod 
{
	static int dataStatic;
	
	static void printData()
	{
		System.out.println( dataStatic );
	}
}

class HasStaticMethodRunner
{
	public static void main(String[] args) 
	{
		// TODO 自動生成されたメソッド・スタブ
		HasStaticMethod.dataStatic = 100;
		HasStaticMethod.printData();
		
	}

}
