package cn.mobilephone.shop.util;

public class JsonResult<T> {
	public static final int SUCCESS=0;
	public static final int ERROR=1;
	private int state;
	private T result;
	private String message;
	public JsonResult() {
		
	}
	public JsonResult(T t) {
		state  = SUCCESS;
		result = t;
		message = "";
	}
	public JsonResult(Throwable e){
		state = ERROR;
		result = null;
		message = e.getMessage();
	}
	public JsonResult(int state,Throwable e){
		this.state = state;
		this.message = e.getMessage();
		this.result = null;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}	
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
