package jp.co.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.dao.pg.PgAdminDao;
import jp.co.entity.Admin;
import jp.co.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private PgAdminDao adi;

	@Override
	public Admin findByIdAndPass(String id, String pass) {
		Admin a = adi.findByIdAndPass(id, pass);

		if(a == null) {
			return null;
		}

		return a;

	}
}
