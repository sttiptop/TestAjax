package controller;

import classes.Toster;
import interfaces.Divice;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Yevgeni on 06.02.2016.
 */
public class trr {

    public String getS() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        String s="classes.Toster";
        Toster toster=new Toster();
        Class c= toster.getClass();
        Object a=Class.forName(s).newInstance();
        System.out.println(toster.getClass());
        System.out.println(c.getClass());
        System.out.println(a.getClass());
        Method method1=toster.getClass().getMethod("turnOn");
        //Method method2=a.getMethod("turnOn");
        Method method3=a.getClass().getMethod("turnOn");
        String string=(String)method3.invoke(a);
        System.out.println(string);
        return string;
    }


}
