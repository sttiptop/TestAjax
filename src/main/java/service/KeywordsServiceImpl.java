package service;

import dao.KeywordsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Yevgeni on 06.02.2016.
 */
@Service
public class KeywordsServiceImpl implements KeywordsService {
    @Autowired
    KeywordsDao keywordsDao;

    @Transactional
    public int getClassesId(String classKey) {
        return keywordsDao.getClassesId(classKey);
    }
}
