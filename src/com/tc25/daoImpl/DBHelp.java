package com.tc25.daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tc25.bean.MyDvd;
import com.tc25.data.MyDvds;
import com.tc25.data.Users;

public class DBHelp {
	//提供4个常量user pwd url driver
	//oracle包下的.OracleDriver.class文件完整路径,删除.class后缀
	public static final String DRIVER = "oracle.jdbc.OracleDriver";
	public static final String USER = "TC25";
	public static final String PWD = "123456";
	/*
	 * jdbc:oracle:thin 协议
	 * 127.0.0.1/localhost host主机地址
	 * 1521 端口号
	 * xe/ORCL/数据库名 实例名/数据库名
	 */
	public static final String URL = "jdbc:oralce:thin:@localhost:1521:ORCL";
	
	/* 
	 * 通过三个类来访问和操作数据库
	 * 1.connection 连接
	 * 2.preparedstatement 预处理
	 * 3.resultset 结果集
	 */
	
	private Connection mConnection;
	/**
	 * 获取数据库连接
	 * @return
	 */
	public Connection getConnection() {
		//加载驱动
		try {
			Class.forName(DRIVER);
			//判断连接对象是否为null
			if (mConnection == null) {
				mConnection = DriverManager.getConnection(URL,USER,PWD);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mConnection;
	}
	
	public static void main(String[] args) throws SQLException {
		MyDvds dvds = new MyDvds();
		DBHelp db = new DBHelp();
//		System.out.println(db.getConnection() == null);
		Connection conn = db.getConnection();
		PreparedStatement pStatement = conn.prepareStatement("select * from dvd_dvd");
		ResultSet rSet = pStatement.executeQuery();
		/*
		 * executeUpdate
		 * 增删改
		 */
		while (rSet.next()) {
			MyDvd dvd = new MyDvd();
			dvd.setDvdId(rSet.getInt("DVD_ID"));
			dvd.setDvdName(rSet.getString("DVD_NAME"));
			dvd.setDvdData(rSet.getDate("DVD_Date"));
			dvd.setDvdStatus(rSet.getInt("DVD_STATUS"));
			dvd.setDvdLendCount(rSet.getInt("DVD_ID"));
			dvds.getMyDvds().add(dvd);
		}
	}
	
}
