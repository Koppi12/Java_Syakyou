
class HasStaticAndNormalField 
{
	static int dataStatic;
	
	int dataNormal;
}

class HasStaticAndFieldRunner
{

	public static void main(String[] args) 
	{
		// TODO 自動生成されたメソッド・スタブ
		HasStaticAndNormalField.dataStatic = 1;
		
		HasStaticAndNormalField ref1 = new HasStaticAndNormalField();
		HasStaticAndNormalField ref2 = new HasStaticAndNormalField();
		
		ref1.dataNormal  =100;
		ref2.dataNormal  =200;
		
		System.out.println( HasStaticAndNormalField.dataStatic );
		
		System.out.println( ref1.dataNormal );
		System.out.println( ref2.dataNormal );
		
		
		
		
				
	}

}
