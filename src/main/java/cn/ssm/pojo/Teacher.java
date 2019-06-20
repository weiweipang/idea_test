package cn.ssm.pojo;

import java.util.List;

public class Teacher {
    private Integer tid;
    private String tname;
    private List<Classes> classes;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public List<Classes> getClasses() {
        return classes;
    }

    public void setClasses(List<Classes> classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Teacher [tid=" + tid + ", tname=" + tname + "]";
    }
}