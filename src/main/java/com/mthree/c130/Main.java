package com.mthree.c130;

import com.mthree.c130.controller.ItemsController;
import com.mthree.c130.dao.ItemAuditDao;
import com.mthree.c130.dao.ItemAuditDaoFileImpl;
import com.mthree.c130.dao.ItemsDao;
import com.mthree.c130.dao.ItemsDaoFileImpl;
import com.mthree.c130.service.ItemsServiceLayer;
import com.mthree.c130.service.ItemsServiceLayerImpl;
import com.mthree.c130.ui.ItemsView;
import com.mthree.c130.ui.UserIO;
import com.mthree.c130.ui.UserIOConsoleImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

//        UserIO myIo = new UserIOConsoleImpl();
//        ItemsView myView = new ItemsView(myIo);
//        ItemsDao myDao = new ItemsDaoFileImpl();
//        ItemAuditDao myAuditDao = new ItemAuditDaoFileImpl();
//        ItemsServiceLayer myService = new ItemsServiceLayerImpl(myDao,myAuditDao);
//        ItemsController controller = new ItemsController(myService, myView);
//        controller.run();

        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.mthree.c130");
        appContext.refresh();

        ItemsController controller = appContext.getBean("itemsController", ItemsController.class);
        controller.run();



    }
}
