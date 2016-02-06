package service;

import dao.ClassesDao;
import model.ClassesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Yevgeni on 06.02.2016.
 */
@Service
public class ClassesServiceImpl implements ClassesService {
    @Autowired
    ClassesDao classesDao;
    @Transactional
    public ClassesEntity getClasses(int id){
       return classesDao.getClass(id);
    }


}
