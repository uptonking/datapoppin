package com.alibaba.datax.transformer;

import com.alibaba.datax.common.element.Record;

import java.util.Map;

/**
 * 复合转换器抽象类
 * <p>
 * 转换方法可添加配置
 * <p>
 * Created by liqiang on 16/3/3.
 */
public abstract class ComplexTransformer {

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
     * @param record   行记录，UDF进行record的处理后，更新相应的record
     * @param tContext transformer运行的配置项
     * @param paras    transformer函数参数
     */
    abstract public Record evaluate(Record record, Map<String, Object> tContext, Object... paras);
}
