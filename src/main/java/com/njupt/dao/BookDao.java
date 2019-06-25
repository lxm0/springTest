package com.njupt.dao;

import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
    private String value="1";

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BookDao{" +
                "value='" + value + '\'' +
                '}';
    }
}
