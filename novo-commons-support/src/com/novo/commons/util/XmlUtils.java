package com.novo.commons.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XmlUtils {
	private static Log log = LogFactory.getLog(XmlUtils.class);
	@SuppressWarnings({ "unused", "unchecked" })
	public static Map<String, String> parseXml(String request)  
			throws Exception { 
			 // 解析结果存储在HashMap 
			 Map<String, String> map = new HashMap<String, String>(); 
			 // 读取输入流 
			 SAXReader reader = new SAXReader(); 
			 Document document = DocumentHelper.parseText(request); 
			 // 得到xml根元素 
			 Element root = document.getRootElement(); 
			 // 得到根元素的所有子节点 
			 List<Element> elementList = root.elements(); 
			 log.info(root.elements());
			 // 遍历所有子节点 
			 for (Element e : elementList) 
			 map.put(e.getName(), e.getText()); 
			 
			 // 释放资源  
			 return map; 
	}  
}
