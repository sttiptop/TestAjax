package dao;

import model.ClassesEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Yevgeni on 06.02.2016.
 */
@Repository
public class ClassesDaoImpl implements ClassesDao {
    @Autowired
    SessionFactory sessionFactory;

    public ClassesEntity getClass(int id) {
        return (ClassesEntity) sessionFactory.getCurrentSession().get(ClassesEntity.class, id);
    }
}
