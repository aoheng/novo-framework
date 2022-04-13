package com.novo.framework.core.protocol;

import java.util.List;

public interface DataScope {

    public static final String base_field_dataScope = "dataScope";

    public static final String base_field_creators = "creators";

    public DefinitionDataScope getDataScope();

    public void setDataScope(DefinitionDataScope dataScope);

    public List<Long> getCreators();

    public void setCreators(List<Long> creators);
}
