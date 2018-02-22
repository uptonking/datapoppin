package com.alibaba.datax.common.element;

import com.alibaba.fastjson.JSON;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * 单个字段抽象类
 * <p>
 * 内含枚举enum Type，即datax内置数据类型
 * <p>
 * Created by jingxing on 14-8-24.
 */
public abstract class Column {

    private Type type;

    private Object rawData;

    private int byteSize;

    public Column(final Object object, final Type type, int byteSize) {
        this.rawData = object;
        this.type = type;
        this.byteSize = byteSize;
    }

    public Object getRawData() {
        return this.rawData;
    }

    public Type getType() {
        return this.type;
    }

    public int getByteSize() {
        return this.byteSize;
    }

    protected void setType(Type type) {
        this.type = type;
    }

    protected void setRawData(Object rawData) {
        this.rawData = rawData;
    }

    protected void setByteSize(int byteSize) {
        this.byteSize = byteSize;
    }

    public abstract Long asLong();

    public abstract Double asDouble();

    public abstract String asString();

    public abstract Date asDate();

    public abstract byte[] asBytes();

    public abstract Boolean asBoolean();

    //BigDecimal大浮点数，Java只有BigDecimal而没有Decimal，理论上无限大
    public abstract BigDecimal asBigDecimal();

    //BigInteger大整数，支持的范围比Long大，Long最大19位，理论上无限大
    public abstract BigInteger asBigInteger();

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    /**
     * datax内置数据类型，7种常用(INT待定)，2种特殊
     */
    public enum Type {
        BAD, NULL, INT, LONG, DOUBLE, STRING, BOOL, DATE, BYTES
    }

}
