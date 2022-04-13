package com.novo.data.txLCN;

import com.codingapi.tx.netty.service.TxManagerHttpRequestService;
import com.lorne.core.framework.utils.http.HttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Aoheng on 2020/11/29.
 */
public class TxManagerHttpRequestServiceImpl implements TxManagerHttpRequestService {

    private final static Logger LOG = LoggerFactory.getLogger(TxManagerTxUrlServiceImpl.class);

    @Override
    public String httpGet(String url) {
        LOG.debug("txLCN-httpGet-start: " + url);
        String res = HttpUtils.get(url);
        LOG.debug("txLCN-httpGet-end: " + res);
        return res;
    }

    @Override
    public String httpPost(String url, String params) {
        LOG.debug(String.format("txLCN-httpPost-start: %s %s", url, params));
        String res = HttpUtils.post(url, params);
        LOG.debug("txLCN-httpPost-end: " + res);
        return res;
    }
}
