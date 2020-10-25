package com.neu.hospital.baseinformation.vo;

import java.util.List;

/**
 * V-View O-Object
 * 视图层，用于展示层，它的作用是把某个指定页面（或组件）的所有数据封装起来
 */
public class ResultVO<T> {

    private String message;

    private int status;

    private List<T> data;

    private T Object;

    public ResultVO() {
    }

    public ResultVO(String message, int status) {
        this.message = message;
        this.status = status;
    }

    public ResultVO(String message, int status, T object) {
        this.message = message;
        this.status = status;
        Object = object;
    }

    public ResultVO(String message, int status, List<T> data) {
        this.message = message;
        this.status = status;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public T getObject() {
        return Object;
    }

    public void setObject(T object) {
        Object = object;
    }
}
