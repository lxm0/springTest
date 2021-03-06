package com.njupt.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Dependency {
    private int[] array;

    private List<String> list;

    private Map<String, String> map;

    private Properties properties;

    public int[] getArray() {

        return array;

    }

    public void setArray(int[] array) {

        this.array = array;

    }

    public List<String> getList() {

        return list;

    }

    public void setList(List<String> list) {

        this.list = list;

    }

    public Map<String, String> getMap() {

        return map;

    }

    public void setMap(Map<String, String> map) {

        this.map = map;

    }

    public Properties getProperties() {

        return properties;

    }

    public void setProperties(Properties properties) {

        this.properties = properties;

    }

    @Override
    public String toString() {
        return "Dependency{" +
                "array=" + Arrays.toString(array) +
                ", list=" + list +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
