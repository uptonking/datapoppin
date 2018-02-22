package com.alibaba.datax.common.constant;

/**
 * 插件类型枚举，4类
 * pluginType还代表了资源目录，很难扩展,或者说需要足够必要才扩展。先mark Handler（其实和transformer一样），再讨论
 * <p>
 * Created by jingxing on 14-8-31.
 */
public enum PluginType {

    READER("reader"), TRANSFORMER("transformer"), WRITER("writer"), HANDLER("handler");

    private String pluginType;

    private PluginType(String pluginType) {
        this.pluginType = pluginType;
    }

    @Override
    public String toString() {
        return this.pluginType;
    }
}
