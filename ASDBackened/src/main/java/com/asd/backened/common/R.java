package com.asd.backened.common;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * The general return result, the data responded by the server will eventually be encapsulated into this object
 * @param <T>
 */
@Data
public class R<T> {

    private Integer code; //Coding: 1 for success, 0 and other numbers for failure

    private String msg; //errorMessage

    private T data; //data
    private Map map = new HashMap(); //dynamicData

    public static <T> R<T> success(T object) {
        R<T> r = new R<T>();
        r.data = object;
        r.code = 1;
        return r;
    }

    public static <T> R<T> error(String msg) {
        R r = new R();
        r.msg = msg;
        r.code = 0;
        return r;
    }

    public R<T> add(String key, Object value) {
        this.map.put(key, value);
        return this;
    }

}
