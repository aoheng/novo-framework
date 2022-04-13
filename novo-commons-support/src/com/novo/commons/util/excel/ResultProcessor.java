/**
 * 
 */
package com.novo.commons.util.excel;

import java.util.List;

/**
 * @description <br>
 * @author aoheng
 * @date 2020年1月18日
 */
public interface ResultProcessor<T> {

	int batchSize();
	void process(List<T> datas);
	
}
