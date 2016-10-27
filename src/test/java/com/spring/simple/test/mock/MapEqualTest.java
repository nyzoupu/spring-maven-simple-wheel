package com.spring.simple.test.mock;
/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.beans.BeanUtils;

/**
 * 
 * @author wb-zp195009
 * @version $Id: MapEqualTest.java, v 0.1 2016年7月6日 上午11:14:19 wb-zp195009 Exp $
 */
public class MapEqualTest {

    private static int age;

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        int num = 0;
        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("name", "zoupu");
        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("name", "zoupu");
        map1 = map2;
        age = 1;
        num = 1;
        System.out.println(num);
        System.out.println(age++);
        System.out.println(map1 == map2);

        Integer intAge = 23;
        intAge = 12;
        System.out.println(intAge);
        System.out.printf("%s", intAge);

        FromBean bean = new FromBean();
        bean.setAge(12);
        bean.setName("zou");
        Map<String, String> mp = new HashMap<>();
        bean.setMapParams(mp);
        bean.mapParams.put("hz", "杭州");
        FromBean bean2 = new FromBean();
        BeanUtils.copyProperties(bean, bean2);
        bean2.setName("mxm");
        System.out.println(bean.getName());
        System.out.println(bean2.getName());
        System.out.println(bean2.getMapParams().get("hz"));
    }

}

class FromBean {
    int    age;
    String name;
    Map<String, String> mapParams;

    /**
     * 
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     * 
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property <tt>mapParams</tt>.
     * 
     * @return property value of mapParams
     */
    public Map<String, String> getMapParams() {
        return mapParams;
    }

    /**
     * Setter method for property <tt>mapParams</tt>.
     * 
     * @param mapParams value to be assigned to property mapParams
     */
    public void setMapParams(Map<String, String> mapParams) {
        this.mapParams = mapParams;
    }

    /** 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((mapParams == null) ? 0 : mapParams.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    /** 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FromBean other = (FromBean) obj;
        if (age != other.age)
            return false;
        if (mapParams == null) {
            if (other.mapParams != null)
                return false;
        } else if (!mapParams.equals(other.mapParams))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    /** 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        final int maxLen = 10;
        return "FromBean [age=" + age + ", name=" + name + ", mapParams="
               + (mapParams != null ? toString(mapParams.entrySet(), maxLen) : null) + "]";
    }

    private String toString(Collection<?> collection, int maxLen) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        int i = 0;
        for (Iterator<?> iterator = collection.iterator(); iterator.hasNext() && i < maxLen; i++) {
            if (i > 0)
                builder.append(", ");
            builder.append(iterator.next());
        }
        builder.append("]");
        return builder.toString();
    }

   
}


