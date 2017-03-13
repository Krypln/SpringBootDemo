package com.nokia.example.Serializable;

/**
 * Created by YLongYao on 2017/2/6.
 */
public class Base {

    /**
     * Serialization（序列化）：是一种将对象以一连串的字节描述的过程，反序列化是将这些字节重构成对象的过程
     *
     * 使用场景：
     *      将内存中的对象保存到文件中或者数据库中
     *      用套接字在网络中传送对象时
     *      通过RMI传送对象时
     *
     * 实现序列化：将序列化的类实现Serializable接口就可以了
     *
     * 序列化前后对象的地址不同了，但是内容是相同的，且对象中包含的引用也相同，是深复制
     * 序列化操作可以是实现对任何可Serializable对象的深度复制，复制的是整个对象网
     * 序列化不保存静态变量的状态，静态成员属于类级别的所以不能序列化，即序列化的是对象的状态不是类的状态
     * transient后的变量也不能序列化，父类实现了序列化子类自动实现序列化
     * 当一个对象的实例变量引用其他对象，序列化该对象时也把应用对象进行了序列化
     */

}
