package com.novo.framework.core.converter;

/***
 * 转换器
* @ClassName: Converter 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author chen chuang
* @date 2020年10月11日 下午3:03:57 
* 
* @param <S>
* @param <T>
 */
public interface Converter<S,T> {
	/***
	 * @Title: convert   
	 * @Description: 将目标对象转换为其他对象。 
	 * @param:  @param s
	 * @param:  @return      
	 * @return: T      
	 * @throws
	 */
	public T convert(final S s);
}