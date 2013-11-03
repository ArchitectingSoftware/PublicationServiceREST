package edu.drexel.model;

/**
 * Created with IntelliJ IDEA.
 * User: bsmitc
 * Date: 11/3/13
 * Time: 7:58 AM
 * To change this template use File | Settings | File Templates.
 */
public class RequestError
{

    public RequestError(){

    }

    public RequestError(int id, String msg)
    {
        this.code = id;
        this.message = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private int code;
    private String message;
}
