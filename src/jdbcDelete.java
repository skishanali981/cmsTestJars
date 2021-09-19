import cmsTest.LogicDelete;

public class jdbcDelete {
public static void main(String[] args) throws Exception{
	LogicDelete ld= new LogicDelete();
	int x = ld.delete();
	System.out.println(x+" record deleted");
}
}
