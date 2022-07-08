import com.yi.pojo.*;
import com.yi.service.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class MyTest {
    @Test
    public void Test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        GoodsTypeServiceImpl gt = (GoodsTypeServiceImpl) context.getBean("goodsTypeServiceImpl");
        CustomerServiceImpl cs = (CustomerServiceImpl) context.getBean("customerServiceImpl");
        CustomerOrderServiceImpl co = (CustomerOrderServiceImpl) context.getBean("customerOrderServiceImpl");
//        SupplierOrderServiceImpl so = (SupplierOrderServiceImpl) context.getBean("supplierOrderServiceImpl");
//        Date date = new Date();
//        String nowTime = date.toString();
//        System.out.println(nowTime);
//        int flag = so.addSupplierOrder(new SupplierOrder(0, 2, 1, "进货入库", 1, "2022-06-15", "1"));
        int flag1 = co.addCustomerOrder(new CustomerOrder(0, 1, 1, "", 10, "2000-02-01", ""));
        System.out.println(flag1);
    }
}
