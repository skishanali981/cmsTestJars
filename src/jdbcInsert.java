import cmsTest.LogicInsert;
public class jdbcInsert {
	public static void main(String[] args) throws Exception{
		LogicInsert li = new LogicInsert();
		int x=li.res();
		System.out.println(x+" Records have been inserted");
	}
}
