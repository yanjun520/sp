package com.sp.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class SystemListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent arg0) {
        System.out.println("##sysytem listener destory.");
    }

    public void contextInitialized(ServletContextEvent arg0) {
        System.out.println("##sysytem listener init.");
    }

}
