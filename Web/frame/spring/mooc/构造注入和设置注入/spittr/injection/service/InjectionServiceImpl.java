package spittr.injection.service;

public class InjectionServiceImpl implements InjectionService {

    private InjectionDAO injectionDAO;

    // 构造器注入
    // public InjectionServiceImpl(InjectionDAO injectionDAO) {
    // this.injectionDAO = injectionDAO;
    // }

    // 设置注入
    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    public void save(String arg) {
        // 模拟业务操作
        System.out.println("Service接收参数：" + arg);
        arg = arg + this.hashCode();
        injectionDAO.save(arg);
    }
}
