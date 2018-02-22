package com.alibaba.datax.dataxservice.face.domain.enums;

/**
 * 作业运行状态，7种
 */
@SuppressWarnings("all")
public enum State implements EnumVal {

    SUBMITTING(10),
    WAITING(20),
    RUNNING(30),
    KILLING(40),
    KILLED(50),
    FAILED(60),
    SUCCEEDED(70);

    /**
     * 枚举类的实例变量
     */
    //    int value;
    private final int value;

    /**
     * 枚举类设计成不可变类，需要在构造器中为实例变量设置初始值
     */
    private State(int value) {
        this.value = value;
    }

    @Override
    public int value() {
        return this.value;
    }


    public boolean isFinished() {
        return this == KILLED || this == FAILED || this == SUCCEEDED;
    }

    public boolean isRunning() {
        return !isFinished();
    }

    @Override
    public String toString() {
        return "State{" +
                "value=" + value +
                '}';
    }
}
