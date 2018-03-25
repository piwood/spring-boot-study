/**
 * 
 */
package com.sharkman.demo.model;

/**
 * <p> Description: User</p>
 * <p> CreationTime: 2018年3月25日 下午6:53:11
 * @author piwood
 */
public class User {
    private Long id;
    private String name;
    private Integer age;
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }
    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }
}
