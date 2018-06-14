package jp.co.dao.pg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.dao.AdminDao;
import jp.co.entity.Admin;

@Repository

public class PgAdminDao implements AdminDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final String SQL_SELECT_ID_PASS = "SELECT * FROM admin WHERE admin_id = ? AND password = ?";

	@Override
	public Admin findByIdAndPass(String id, String pass) {
		List<Admin> list = jdbcTemplate.query(SQL_SELECT_ID_PASS,new BeanPropertyRowMapper<Admin>(Admin.class),id,pass);

		if(list.size()==0) {
			return null;
		}
		return list.get(0);
	}

}
