package cn.zr.mybatis.generator.plugins;

import org.mybatis.generator.api.PluginAdapter;

import java.util.List;

/**
 * @author Created by rui.zhang on 2018/4/9.
 * @version ver1.0
 * @email misterchangray@hotmail.com
 * @description �������ݿ�ע�Ͷ�ʵ��������swagger2�ĵ�ע��
 */
public class GeneratorBatchDelete  extends PluginAdapter {


    public boolean validate(List<String> list) {
        return false;
    }
}
