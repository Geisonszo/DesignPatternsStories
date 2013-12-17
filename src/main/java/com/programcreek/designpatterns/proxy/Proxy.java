package com.programcreek.designpatterns.proxy;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-16
 * Time: 下午9:28
 * Description: To change this template use File | Settings | File Templates.
 */
interface CheatingWife {
    public void seduceMan();

    public void happyWithMan();
}

class HouseWifeOne implements CheatingWife {
    @Override
    public void seduceMan() {
        System.out.println("HouseWifeOne seduce men...");
    }

    @Override
    public void happyWithMan() {
        System.out.println("HouseWifeOne is happy with man...");
    }
}

class BusinessAgent implements CheatingWife {
    private CheatingWife cheatingWife;

    public BusinessAgent() {
        this.cheatingWife = new HouseWifeOne();
    }

    public BusinessAgent(CheatingWife cheatingWife) {
        this.cheatingWife = cheatingWife;
    }

    @Override
    public void seduceMan() {
        this.cheatingWife.seduceMan();
    }

    @Override
    public void happyWithMan() {
        this.cheatingWife.happyWithMan();
    }
}

public class Proxy {
    public static void run() {
        BusinessAgent businessAgent = new BusinessAgent();
        businessAgent.seduceMan();
        businessAgent.happyWithMan();
    }
}
