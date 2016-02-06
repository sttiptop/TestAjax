package dao;


import model.KeywordsEntity;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Yevgeni on 06.02.2016.
 */
@Repository
public class KeywordsDaoImpl implements KeywordsDao {
    @Autowired
    SessionFactory sessionFactory;

    public int getClassesId(String classKey) {
        //String s="select classId from KeywordsEntity where keyword like '%"+classKey+"'";
        //return Integer.valueOf(String.valueOf(sessionFactory.getCurrentSession().createQuery("select classId from  KeywordsEntity where keyword="+classKey)));
        Query query= sessionFactory.getCurrentSession().createQuery("from KeywordsEntity where keyword=?");
        KeywordsEntity keywordsEntity = (KeywordsEntity) query.setText(0,classKey).uniqueResult();
        return keywordsEntity.getClassId();
    }
}
