package com.alibaba.datax.common.plugin;

/**
 * 作业类抽象插件
 * <p>
 * Created by jingxing on 14-8-24.
 */
public abstract class AbstractJobPlugin extends AbstractPlugin {
    /**
     * @return the jobPluginCollector
     */
    public JobPluginCollector getJobPluginCollector() {
        return jobPluginCollector;
    }

    /**
     * @param jobPluginCollector the jobPluginCollector to set
     */
    public void setJobPluginCollector(
            JobPluginCollector jobPluginCollector) {
        this.jobPluginCollector = jobPluginCollector;
    }

    private JobPluginCollector jobPluginCollector;

}
