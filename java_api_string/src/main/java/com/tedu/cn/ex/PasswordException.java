package com.tedu.cn.ex;

public class PasswordException extends RuntimeException {
    public PasswordException() {
    }

    public PasswordException(String message) {
        super(message);
    }

    public PasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordException(Throwable cause) {
        super(cause);
    }

    public PasswordException(int type,String message){
        switch (type){
            case 1:
                System.out.println(message);
                break;
            case 2:
                System.out.println(message);
                break;
            case 3:
                System.out.println(message);
                break;
        }

    }
}
