package com.novo.data.txLCN;

import com.codingapi.tx.config.service.TxManagerTxUrlService;

/**
 * @author Aoheng on 2020/11/29.
 */
public class TxManagerTxUrlServiceImpl implements TxManagerTxUrlService {

    private String txUrl;

    public TxManagerTxUrlServiceImpl(String txUrl) {
        this.txUrl = txUrl;
    }

    public TxManagerTxUrlServiceImpl() {}

    @Override
    public String getTxUrl() {
        return txUrl;
    }
}
