package btl.oop.main;

import btl.oop.database.ConnectDatabase;
import btl.oop.database.ExecuteQuery;
import btl.oop.genentity.GenGeneral;

public class MainAddData {
	public static void main(String[] args) {
		GenGeneral GenG = new GenGeneral();
		GenG.genGeneral(100, 200);
		ConnectDatabase.connectDB();
    	// Xóa cơ sở dữ liệu cũ
    	ConnectDatabase.conn.clear();
    	// Đẩy hết các thực thể quan hệ vào cơ sở dữ liệu và test thời gian
    	double startTime = System.currentTimeMillis();
    	ExecuteQuery.addEntityRelationship();
    	System.out.println("Add dữ liệu thành công!");
    	System.out.println("Thời gian đẩy lên CSDL: " + (System.currentTimeMillis() - startTime) + " ms");	
    	ConnectDatabase.closeDB();
	}
}
