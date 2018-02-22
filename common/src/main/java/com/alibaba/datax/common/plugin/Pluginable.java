package com.alibaba.datax.common.plugin;

import com.alibaba.datax.common.util.Configuration;

/**
 * 插件定义接口
 * 主要是元信息和具体配置
 */
public interface Pluginable {

	String getDeveloper();

    String getDescription();

    void setPluginConf(Configuration pluginConf);

	void init();

	void destroy();

    String getPluginName();

    Configuration getPluginJobConf();

    Configuration getPeerPluginJobConf();

    public String getPeerPluginName();

    void setPluginJobConf(Configuration jobConf);

    void setPeerPluginJobConf(Configuration peerPluginJobConf);

    public void setPeerPluginName(String peerPluginName);

}
