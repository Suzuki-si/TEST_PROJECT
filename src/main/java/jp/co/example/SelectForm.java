package jp.co.example;

public class SelectForm { //フォームから送信されたパラメーターを格納するためのクラス

	//フィールド

	private String id;
	private String name;
	private String password;

	//アクセサー

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String setName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


}
