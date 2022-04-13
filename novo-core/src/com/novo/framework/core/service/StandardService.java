package com.novo.framework.core.service;

import com.novo.framework.core.protocol.BaseRequestProtocol;

import java.io.Serializable;

/***
 * @ClassName: StandardService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author chen chuang
 * @date 2020年1月12日 下午5:57:24
 */
public interface StandardService<T extends BaseRequestProtocol, V extends Serializable>
        extends SaveService<T, V>, SelectService<T, V>, UpdateService<T, V> {

}
