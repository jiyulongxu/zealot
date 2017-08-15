package com.blinkfox.zealot.test.core.concrete;

import com.blinkfox.zealot.test.bean.BuildSource;
import com.blinkfox.zealot.test.bean.SqlInfo;
import com.blinkfox.zealot.test.consts.ZealotConst;
import com.blinkfox.zealot.test.core.IConditHandler;
import com.blinkfox.zealot.test.helpers.ParseHelper;
import com.blinkfox.zealot.test.helpers.XmlNodeHelper;

/**
 * 引用标签对应的动态sql生成处理器的实现类.
 * <p>引用标签的主要内容：`<include match="" namespace="" zealotid="" params="" />`</p>
 * Created by blinkfox on 2017/8/15.
 */
public class IncludeHandler implements IConditHandler {
    /**
     * 构建include标签的sqlInfo信息.
     * @param source 构建所需的资源对象
     * @return 返回SqlInfo对象
     */
    @Override
    public SqlInfo buildSqlInfo(BuildSource source) {
        String matchText = XmlNodeHelper.getNodeAttrText(source.getNode(), ZealotConst.ATTR_MATCH);
        if (ParseHelper.isNotMatch(matchText, source.getParamObj())) {
            return source.getSqlInfo();
        }

        return source.getSqlInfo();
    }

}