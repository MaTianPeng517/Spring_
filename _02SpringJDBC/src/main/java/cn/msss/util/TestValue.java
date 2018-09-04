package cn.msss.util;

import org.springframework.beans.factory.annotation.Value;

public class TestValue  {

    @Value("${jdbc.driver}")
    private String jdbcname;

    public String getJdbcname() {
        return jdbcname;
    }

    public void setJdbcname(String jdbcname) {
        this.jdbcname = jdbcname;
    }

    public TestValue() {
    }

    @Override
    public String toString() {
        return "TestValue{" +
                "jdbcname='" + jdbcname + '\'' +
                '}';
    }
}

