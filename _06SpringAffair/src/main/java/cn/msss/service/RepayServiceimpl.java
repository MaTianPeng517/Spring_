package cn.msss.service;

import cn.msss.dao.FormoneyDao;
import cn.msss.dao.PoorDaoimpl;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class RepayServiceimpl implements RepayService {


    PoorDaoimpl pdao;
    FormoneyDao fdao;

    public PoorDaoimpl getPdao() {
        return pdao;
    }

    public void setPdao(PoorDaoimpl pdao) {
        this.pdao = pdao;
    }

    public FormoneyDao getFdao() {
        return fdao;
    }

    public void setFdao(FormoneyDao fdao) {
        this.fdao = fdao;
    }

    /**
     * 注解方式
     * @param money
     * @param id
     */
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,rollbackFor = RuntimeException.class)
    @Override
    public void total(double money,String id) {
        pdao.poor(money,id);
        if (true){
            throw new RuntimeException("还钱失败");
        }
        fdao.formoney(money,id);
    }
}
