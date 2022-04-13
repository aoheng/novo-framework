package com.novo.data.mybatis.util;

import com.novo.framework.core.protocol.RequestProtocol;
import com.novo.framework.core.protocol.SortRequestProtocol;

/**
 * @author BinksRao on 2020/11/23
 */
public class SqlUtil {

    private static final String blank = " ";
    private static final String comma = ",";
    private static final String line = "_";
    private static final StringBuilder clauseBuilder = new StringBuilder();
    private static final StringBuilder fieldBuilder = new StringBuilder();

    public static String getOrderByClause(RequestProtocol requestProtocol){
        SortRequestProtocol sortRequest = (SortRequestProtocol)requestProtocol;
        clauseBuilder.setLength(0);
        if (sortRequest.getSortType() != null && sortRequest.getSortFields() != null){
            for (String field : sortRequest.getSortFields()) {
                if (!field.contains(line))
                    field = underscoreName(field);
                clauseBuilder.append(field).append(blank).append(sortRequest.getSortType().name()).append(comma);
            }
            clauseBuilder.setLength(clauseBuilder.length()-1);
        }
        return clauseBuilder.toString();
    }

    public static String underscoreName(String name) {
        fieldBuilder.setLength(0);
        if (name != null && name.length() > 0) {
            // 将第一个字符处理成大写
            fieldBuilder.append(name.substring(0, 1).toUpperCase());
            // 循环处理其余字符
            for (int i = 1; i < name.length(); i++) {
                String s = name.substring(i, i + 1);
                // 在大写字母前添加下划线
                if (s.equals(s.toUpperCase()) && !Character.isDigit(s.charAt(0))) {
                    fieldBuilder.append("_");
                }
                // 其他字符直接转成大写
                fieldBuilder.append(s);
            }
        }
        return fieldBuilder.toString().toLowerCase();
    }
}
