package jp.co.example;

public class LoginForm { //フォームから送信されたパラメーターを格納するためのクラス

	//フィールド

	private String id;
	private String pass;

	//アクセサー

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

}
