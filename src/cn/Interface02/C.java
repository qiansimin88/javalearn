package cn.Interface02;

/**
 * 接口和接口 才有 多继承
 * Created by qsm on 2017/11/21.
 *  接口与接口之间是继承关系
 *  Java支持接口之间的多继承 一个接口可以同时继承多个接口  C继承Ab
 */
public interface C extends A,B {
    public abstract void c ();
}
