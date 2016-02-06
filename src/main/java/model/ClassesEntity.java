package model;

import javax.persistence.*;


/**
 * Created by Yevgeni on 06.02.2016.
 */
@Entity
@Table(name = "classes", schema = "public", catalog = "divice")
public class ClassesEntity {
    private int id;
    private String classname;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "classname", nullable = true, length = -1)
    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }


}
