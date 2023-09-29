import com.itcast.controller.DeptController;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * TODO 类描述
 *
 * @author Aaron.
 * @date 2023/9/24 10:18
 */
@Slf4j
@SpringBootTest
public class SpringTest {
    @Resource
    private ApplicationContext applicationContext;

    @Test
    public void getBeanName(){
        DeptController deptController = (DeptController) applicationContext.getBean("deptController");
        log.info("容器中的Bean",deptController);
    }
    @Test
    public void testUUID(){
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);

    }
}
