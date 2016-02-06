package model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Yevgeni on 06.02.2016.
 */
@Entity
@Table(name = "keywords", schema = "public", catalog = "divice")
public class KeywordsEntity {
    private int id;
    private String keyword;
    private int classId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "keyword", nullable = true, length = -1)
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Basic
    @Column(name = "class_id", nullable = true)
    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

}
