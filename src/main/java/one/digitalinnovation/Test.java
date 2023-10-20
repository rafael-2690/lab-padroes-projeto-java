package one.digitalinnovation;

import one.digitalinnovation.Facade.Facade;
import one.digitalinnovation.Singleton.SingletonEager;
import one.digitalinnovation.Singleton.SingletonLazy;
import one.digitalinnovation.Singleton.SingletonLazyHolder;
import one.digitalinnovation.Strategy.*;

public class Test {
    public static void main(String[] args) {

        //Singleton

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonLazyHolder lazyholder = SingletonLazyHolder.getInstance();
        System.out.println(lazyholder);
        lazyholder = SingletonLazyHolder.getInstance();
        System.out.println(lazyholder);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoOfencivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();

        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Rafael", "23945-23");
    }
}
