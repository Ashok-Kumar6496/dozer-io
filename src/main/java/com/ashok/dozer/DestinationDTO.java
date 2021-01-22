package com.ashok.dozer;

import java.util.List;

/**
 * @author Ashok Kumar
 */
public class DestinationDTO {
    private String name;
    private Long age;
    private boolean isEmployee;
    private List list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public boolean isEmployee() {
        return isEmployee;
    }

    public void setEmployee(boolean employee) {
        isEmployee = employee;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DestinationDTO{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", isEmployee=").append(isEmployee);
        sb.append(", list=").append(list);
        sb.append('}');
        return sb.toString();
    }
}
