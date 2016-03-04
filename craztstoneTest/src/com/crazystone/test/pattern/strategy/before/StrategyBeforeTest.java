package com.crazystone.test.pattern.strategy.before;

/**
 * Created by crazystone on 2016/1/20.
 */
public class StrategyBeforeTest {

    public static void mian(String[] rags) {
        Role[] roles = new Role[3];
        roles[0] = new RoleA();
        roles[1] = new RoleB();
        roles[2] = new RoleB();

        for (Role role : roles) {
            role.name();
            role.attack();
            role.defense();
            role.run();
            System.out.println(">>>>>>>>>>>>>>>>>");
        }
    }
}
