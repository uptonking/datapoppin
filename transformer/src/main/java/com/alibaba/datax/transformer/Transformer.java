package com.alibaba.datax.transformer;

import com.alibaba.datax.common.element.Record;

/**
 * 转换器抽象类
 * <p>
 * 定义执行转换的抽象方法为evaluate()
 * <p>
 * Created by liqiang on 16/3/3.
 */
public abstract class Transformer {

    /**
     * transformerName的唯一性在datax中检查，或者提交到插件中心检查
     */
    private String transformerName;


    public String getTransformerName() {
        return transformerName;
    }

    public void setTransformerName(String transformerName) {
        this.transformerName = transformerName;
    }

    /**
     * 执行转换的方法
     *
     * @param record 行记录，UDF进行record的处理后，更新相应的record
     * @param paras  transformer函数参数
     */
    abstract public Record evaluate(Record record, Object... paras);
}
