package jp.co.service;

import jp.co.entity.Admin;

public interface LoginService {

	public Admin findByIdAndPass(String id, String pass) ;

}
