package com.alibaba.datax.core.transport.transformer;

import com.alibaba.datax.common.element.Record;
import com.alibaba.datax.transformer.ComplexTransformer;
import com.alibaba.datax.transformer.Transformer;

import java.util.Map;

/**
 * 复合转换器代理类，仅字面意义
 * Created by liqiang on 16/3/8.
 */
public class ComplexTransformerProxy extends ComplexTransformer {

    private Transformer realTransformer;

    public ComplexTransformerProxy(Transformer transformer) {
        setTransformerName(transformer.getTransformerName());
        this.realTransformer = transformer;
    }

    @Override
    public Record evaluate(Record record, Map<String, Object> tContext, Object... paras) {
        return this.realTransformer.evaluate(record, paras);
    }

    public Transformer getRealTransformer() {
        return realTransformer;
    }
}
