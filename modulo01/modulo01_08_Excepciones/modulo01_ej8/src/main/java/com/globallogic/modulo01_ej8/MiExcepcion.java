package com.globallogic.modulo01_ej8;

public class MiExcepcion extends Exception{
	private String msg;

	public MiExcepcion(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}
	public String setMsg(String msg) {
		return msg;
	}
}
