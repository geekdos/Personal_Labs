package com.geekdos.metier;

import com.geekdos.dao.DaoMysql;

public class SayHello implements Metier{

	@Override
	public String doSomthings() {
		DaoMysql mysql = new DaoMysql();
		return mysql.connexion();
	}

}
