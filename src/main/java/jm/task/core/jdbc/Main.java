package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoHibernateImpl();

        userDao.createUsersTable();
        userDao.saveUser("Name1", "LastName1", (byte) 20);
        userDao.saveUser("Name2", "LastName2", (byte) 25);
        userDao.saveUser("Name3", "LastName3", (byte) 30);
        userDao.saveUser("Name4", "LastName4", (byte) 35);
        System.out.println(userDao.getAllUsers());
        userDao.cleanUsersTable();
        userDao.dropUsersTable();

    }
}