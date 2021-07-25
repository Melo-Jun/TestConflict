import com.melo.SSM.generator.domain.TblEmp;
import com.melo.SSM.generator.service.impl.TblEmpServiceImpl;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestCrud {


    @Autowired
    SqlSession sqlSession;

    @Autowired
    TblEmpServiceImpl tblEmpService;


    @Test
    public void testInsert(){
        tblEmpService.save(new TblEmp("5","5"));
    }
}
