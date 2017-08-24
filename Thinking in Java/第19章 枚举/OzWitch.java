package com.MyJavaBase.Enums;
/**
 *
 * 添加新方法
 *
 * */
public enum OzWitch {
    WEST("Miss Gulch, aka the Wicked Witch of the West"),
    NORTH("Glinda, the Good Witch of the North"),
    EAST("Wicked Witch of the East, wearer od the ruby" + "Slippers, crushed by Dorothy's house"),
    SOUTH("Good by inference, but missing");

    private String description;
    //构造函数必须是默认和私有访问权限:
    private OzWitch(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
    public static void main(String[] args){
        for(OzWitch witch : OzWitch.values())
            System.out.println(witch + ": " + witch.getDescription());
    }
}
