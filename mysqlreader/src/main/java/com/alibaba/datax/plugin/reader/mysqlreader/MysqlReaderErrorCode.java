package com.alibaba.datax.plugin.reader.mysqlreader;

import com.alibaba.datax.common.spi.ErrorCode;

public enum MysqlReaderErrorCode implements ErrorCode {

    //此枚举类无实例对象
    ;

    private final String code;
    private final String description;

    private MysqlReaderErrorCode(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return String.format("Code:[%s], Description:[%s]. ", this.code, this.description);
    }

}
