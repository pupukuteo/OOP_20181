/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl.oop.main;


import btl.oop.database.ConnectDatabase;
import btl.oop.database.ExecuteQuery;




/**
 *
 * @author Nguyen Anh Phuong
 */
public class MainExecute {
    public static void main(String[] args) {
    	// Các câu truy vấn
    	String query[] = new String[21];
    	query[1] = "select ?o\n"
    			+ "where\n"
    			+ "{\n"
    			+ "?s ?p ?o .\n"
    			+ "?s <http://google.com/id> \"﻿NguoiLa2\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "}";
    	query[2] = "select ?o\n"
    			+ "where\n"
    			+ "{\n"
    			+ "?s <http://google.com/description> ?o .\n"
    			+ "?s <http://google.com/id> \"﻿LeThanhHon10\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "}";
    	query[3] = "select ?o\n"
    			+ "where\n"
    			+ "{\n"
    			+ "?s <http://google.com/source> ?o .\n"
    			+ "?s <http://google.com/id> \"﻿VietNam15\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "}";
    	query[4] = "select ?o\n"
    			+ "where\n"
    			+ "{\n"
    			+ "?s <http://google.com/name> ?o .\n"
    			+ "?s <http://google.com/id> \"﻿UNESCO10\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "}";
    	query[5] = "select ?o\n"
    			+ "where\n"
    			+ "{\n"
    			+ "?s <http://google.com/description> ?o .\n"
    			+ "?s <http://google.com/id> \"﻿BachKhoa18\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "}";
    	query[6] = "select ?o\n"
    			+ "where\n"
    			+ "{\n"
    			+ "?s <http://google.com/source> ?o .\n"
    			+ "?s <http://google.com/id> \"﻿NguoiLa10\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "}";
    	query[7] = "select distinct ?o\n" 
    			+ "where\n" 
    			+ "{\n"
    			+ "?s <http://google.com/entity1> \"﻿LeThanhHon15\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "?s <http://google.com/nameRelationship> \"diễn_ra_tại\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "?s <http://google.com/entity2> ?o.\n"
    			+ "}";
    	query[8] = "select distinct ?o\n" 
    			+ "where\n" 
    			+ "{\n"
    			+ "?s <http://google.com/entity1> \"﻿UNESCO1\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "?s <http://google.com/nameRelationship> \"tổ_chức\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "?s <http://google.com/entity2> ?o.\n"
    			+ "}";
    	query[9] = "select distinct ?o\n" 
    			+ "where\n" 
    			+ "{\n"
    			+ "?s <http://google.com/entity1> ?o.\n"
    			+ "?s <http://google.com/nameRelationship> \"đến_thăm\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "?s <http://google.com/entity2> \"﻿BachKhoa10\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "}";
    	query[10] = "select distinct ?o\n" 
    			+ "where\n" 
    			+ "{\n"
    			+ "?s <http://google.com/entity1> \"﻿NguoiLa10\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "?s <http://google.com/nameRelationship> \"tham_gia\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "?s <http://google.com/entity2> ?o.\n"
    			+ "}";
    	query[11] = "select ?o\n"
    			+ "where\n"
    			+ "{\n"
    			+ "?s <http://google.com/description> ?o.\n"
    			+ "?s <http://google.com/name> \"Neymar\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"		
    			+ "}";
    	query[12] = "select ?o\n"
    			+ "where\n"
    			+ "{\n"
    			+ "?s ?p ?o .\n"
    			+ "?s <http://google.com/name> \"Lionel Messi\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"		
    			+ "}";
    	query[13] = "select distinct ?o\n"
    			+ "where\n"
    			+ "{\n"
    			+ "?s ?p ?o.\n"
    			+ "?s <http://google.com/source> ?o.\n"
    			+ "?s <http://google.com/name> \"Ra mắt Iphone 3\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"		
    			+ "}";
    	query[14] = "select ?o\n"
    			+ "where\n"
    			+ "{\n"
    			+ "?s ?p ?o.\n"
    			+ "?s <http://google.com/id> ?o.\n"
    			+ "?s <http://google.com/name> \"Việt Nam\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "?s <http://google.com/continent> \"Châu Á\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "}";
    	query[15] = "select distinct ?o\n" 
    			+ "where\n" 
    			+ "{\n"
    			+ "?s <http://google.com/entity1> ?o.\n"
    			+ "?s <http://google.com/nameRelationship> \"diễn_ra_tại\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "?s <http://google.com/entity2> ?c.\n"
    			+ "?s1 <http://google.com/name> \"Lăng chủ tịch Hồ Chí Minh\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "?s1 <http://google.com/id> ?c.\n"
    			+ "}";
    	query[16] = "select ?o\n" 
    			+ "where\n" 
    			+ "{\n"
    			+ "?s1 <http://google.com/entity1> ?s.\n"
    			+ "?s1 <http://google.com/nameRelationship> \"tham_gia\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "?s1 <http://google.com/entity2> ?o.\n"
    			+ "?s1 <http://google.com/time> \"2018\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "?s2 <http://google.com/name> \"Jack Ma\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "?s2 <http://google.com/id> ?s.\n"
    			+ "}";
    	query[17] = "select ?o\n" 
    			+ "where\n" 
    			+ "{\n"
    			+ "?s1 <http://google.com/entity1> ?s.\n"
    			+ "?s1 <http://google.com/nameRelationship> \"tổ_chức\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "?s1 <http://google.com/entity2> ?c.\n"
    			+ "?s2 <http://google.com/name> \"Messi giành quả bóng vàng thế giới\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "?s2 <http://google.com/id> ?c.\n"
    			+ "?s3 <http://google.com/description> ?o.\n"
    			+ "?s3 <http://google.com/id> ?s.\n"
    			+ "}";
    	query[18] = "select ?o\n" 
    			+ "where\n" 
    			+ "{\n"
    			+ "?s1 <http://google.com/entity1> ?s.\n"
    			+ "?s1 <http://google.com/nameRelationship> \"đến_thăm\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "?s1 <http://google.com/entity2> ?c.\n"
    			+ "?s2 <http://google.com/name> \"Vũ Đức Đam\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "?s2 <http://google.com/id> ?s.\n"
    			+ "?s3 <http://google.com/name> ?o.\n"
    			+ "?s3 <http://google.com/id> ?c.\n"
    			+ "}";
    	query[19] = "select distinct ?o\n" 
    			+ "where\n" 
    			+ "{\n"
    			+ "?s <http://google.com/entity1> ?d.\n"    			
    			+ "?s <http://google.com/nameRelationship> \"diễn_ra_tại\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "?s <http://google.com/entity2> ?c.\n"
    			+ "?s1 <http://google.com/name> \"Việt Nam\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "?s1 <http://google.com/id> ?c.\n"
    			+ "?s2 <http://google.com/name> ?o.\n"
    			+ "?s2 <http://google.com/id> ?d.\n"
    			+ "}";
    	query[20] = "select ?o\n" 
    			+ "where\n" 
    			+ "{\n"
    			+ "?s1 <http://google.com/entity1> ?s.\n"
    			+ "?s1 <http://google.com/nameRelationship> \"đến_thăm\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "?s1 <http://google.com/entity2> ?c.\n"
    			+ "?s1 <http://google.com/time> \"2016\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "?s2 <http://google.com/name> \"Phủ Tây Hồ\"^^<http://www.w3.org/2001/XMLSchema#string>.\n"
    			+ "?s2 <http://google.com/id> ?c.\n"
    			+ "?s3 <http://google.com/name> ?o.\n"
    			+ "?s3 <http://google.com/id> ?s.\n"
    			+ "}";  
    	// Kết nối cơ sở dữ liệu
    	ConnectDatabase.connectDB();   	   	
    	for(int i = 1; i <= 20; i++){
    		System.out.println("*** CÂU TRUY VẤN " + i + " ***");
    		ExecuteQuery.executeQuery(query[i]);
    		System.out.println();
    	}
//		ExecuteQuery.executeQuery(query[3]);
		;
	
		

		
    	
    	ConnectDatabase.closeDB();
    }
}
