/*
* @ Ho Van Thuong.java    1.0 
* Copyright (c)  IUH. All rights reserved
*
*/

package iuh.edu.fit;


/*
* @description:
* @author:
* @date: 21/08/2024
* @version: 1.0
*/

public class Map {
    private String key;
    private int value;
    public Map(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void put(String key) {
        this.value = 0;
        this.key = key;
    }

    public void tangValue()
    {
        this.value = this.value + 1;
    }

}
