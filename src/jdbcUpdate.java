import cmsTest.LogicUpdate;

public class jdbcUpdate {
public static void main(String[] args) throws Exception{
	LogicUpdate ld = new LogicUpdate();
	int x = ld.update();
	System.out.println(x+" records updated");
}
}
