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
	//�ṩ4������user pwd url driver
	//oracle���µ�.OracleDriver.class�ļ�����·��,ɾ��.class��׺
	public static final String DRIVER = "oracle.jdbc.OracleDriver";
	public static final String USER = "TC25";
	public static final String PWD = "123456";
	/*
	 * jdbc:oracle:thin Э��
	 * 127.0.0.1/localhost host������ַ
	 * 1521 �˿ں�
	 * xe/ORCL/���ݿ��� ʵ����/���ݿ���
	 */
	public static final String URL = "jdbc:oralce:thin:@localhost:1521:ORCL";
	
	/* 
	 * ͨ�������������ʺͲ������ݿ�
	 * 1.connection ����
	 * 2.preparedstatement Ԥ����
	 * 3.resultset �����
	 */
	
	private Connection mConnection;
	/**
	 * ��ȡ���ݿ�����
	 * @return
	 */
	public Connection getConnection() {
		//��������
		try {
			Class.forName(DRIVER);
			//�ж����Ӷ����Ƿ�Ϊnull
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
		 * ��ɾ��
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
