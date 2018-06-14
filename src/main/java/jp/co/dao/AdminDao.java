package jp.co.dao;

import jp.co.entity.Admin;

public interface AdminDao {

	public Admin findByIdAndPass(String id, String pass) ;

}
