package com.novo.framework.core.protocol;

import java.util.List;

public class DefaultRequestProtocol extends RequestProtocol implements DataScope {

    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = 1L;

    protected DefinitionDataScope dataScope;

    protected List<Long> creators;

    @Override
    public DefinitionDataScope getDataScope() {
        return this.dataScope;
    }

    @Override
    public void setDataScope(DefinitionDataScope dataScope) {
        this.dataScope = dataScope;
    }

    @Override
    public List<Long> getCreators() {
        return creators;
    }

    @Override
    public void setCreators(List<Long> creators) {
        this.creators = creators;
    }
}
