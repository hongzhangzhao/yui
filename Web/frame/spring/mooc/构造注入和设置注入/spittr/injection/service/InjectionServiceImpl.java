package spittr.injection.service;

public class InjectionServiceImpl implements InjectionService {

    private InjectionDAO injectionDAO;

    // 构造器注入
    // 参数的名字要和配置文件中name属性定义的一样
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
