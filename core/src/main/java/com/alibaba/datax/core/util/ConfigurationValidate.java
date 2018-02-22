package com.alibaba.datax.core.util;

import com.alibaba.datax.common.util.Configuration;
import org.apache.commons.lang.Validate;

/**
 * 对配置文件做整体检查的类,3类检查，核心配置、job配置、插件配置
 * todo 检查项目实现
 * <p>
 * Created by jingxing on 14-9-16.
 */
public class ConfigurationValidate {

    public static void doValidate(Configuration allConfig) {
        Validate.isTrue(allConfig != null, "");

        coreValidate(allConfig);

        pluginValidate(allConfig);

        jobValidate(allConfig);
    }

    private static void coreValidate(Configuration allconfig) {
        return;
    }

    private static void jobValidate(Configuration allConfig) {
        return;
    }

    private static void pluginValidate(Configuration allConfig) {
        return;
    }


}
