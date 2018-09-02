package cn.msss.entity;

import java.io.Serializable;
import java.util.*;

public class User implements Serializable {

    private Integer u_id;
    private String u_Name;
    private Aggregate aggregate; //域属性
    private Integer [] num=new Integer[5];
    private List<Serializable> list=new ArrayList<>();
    private Set<Serializable> set=new HashSet<>();
    private Map  mao=new HashMap();
    private Properties properties=new Properties();

    public User() {
    }

    public User(Integer u_id, String u_Name, Aggregate aggregate, Integer[] num, List<Serializable> list, Set<Serializable> set, Map mao, Properties properties) {
        this.u_id = u_id;
        this.u_Name = u_Name;
        this.aggregate = aggregate;
        this.num = num;
        this.list = list;
        this.set = set;
        this.mao = mao;
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "User{" +
                "u_id=" + u_id +
                ", u_Name='" + u_Name + '\'' +
                ", aggregate=" + aggregate +
                ", num=" + Arrays.toString(num) +
                ", list=" + list +
                ", set=" + set +
                ", mao=" + mao +
                ", properties=" + properties +
                '}';
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getU_Name() {
        return u_Name;
    }

    public void setU_Name(String u_Name) {
        this.u_Name = u_Name;
    }

    public Aggregate getAggregate() {
        return aggregate;
    }

    public void setAggregate(Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    public Integer[] getNum() {
        return num;
    }

    public void setNum(Integer[] num) {
        this.num = num;
    }

    public List<Serializable> getList() {
        return list;
    }

    public void setList(List<Serializable> list) {
        this.list = list;
    }

    public Set<Serializable> getSet() {
        return set;
    }

    public void setSet(Set<Serializable> set) {
        this.set = set;
    }

    public Map getMao() {
        return mao;
    }

    public void setMao(Map mao) {
        this.mao = mao;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
