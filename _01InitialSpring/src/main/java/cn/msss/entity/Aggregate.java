package cn.msss.entity;

import java.io.Serializable;

public class Aggregate implements Serializable {

    private Integer A_id;
    private String A_Name;

    @Override
    public String toString() {
        return "Aggregate{" +
                "A_id=" + A_id +
                ", A_Name='" + A_Name + '\'' +
                '}';
    }

    public Aggregate() {
    }

    public Aggregate(Integer a_id, String a_Name) {
        A_id = a_id;
        A_Name = a_Name;
    }

    public Integer getA_id() {
        return A_id;
    }

    public void setA_id(Integer a_id) {
        A_id = a_id;
    }

    public String getA_Name() {
        return A_Name;
    }

    public void setA_Name(String a_Name) {
        A_Name = a_Name;
    }
}
