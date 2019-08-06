package org.data.util;

import org.data.consts.CommonConstants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author wangguodong
 */
public final class ConnectionUtil {

	private ConnectionUtil(){}

	public static Connection getConnection(String url) {
		try {
			Class.forName(CommonConstants.DRIVER_MYSQL);
			return DriverManager.getConnection(url, CommonConstants.USER_NAME, CommonConstants.PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static void closeResource(Connection conn, Statement state, ResultSet rs) {
		try {
			if(rs != null) {
				rs.close();
			}
			if(state != null) {
				state.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
