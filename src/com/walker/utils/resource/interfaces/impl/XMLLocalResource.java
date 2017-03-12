package com.walker.utils.resource.interfaces.impl;

import com.sun.istack.internal.NotNull;
import com.walker.utils.tools.StringUtil;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/12 11:08.
 */
public class XMLLocalResource extends AbstractLocalResource {

    @Override
    public Map<String, String> getValue() {
        return dom2Map();
    }

    @Override
    public String getValue(@NotNull String key) {
        return getValue() == null ? null : getValue().get(key);
    }

    private Map<String, String> dom2Map() {
        String xmlStr = readXmlContent();
        if (StringUtil.isBlank(xmlStr)) return null;
        Map<String, String> map = null;
        Document doc = null;
        try {
            doc = DocumentHelper.parseText(xmlStr);
            if (doc == null) return map;
            map = new HashMap<>();
            Element root = doc.getRootElement();
            for (Iterator iterator = root.elementIterator(); iterator.hasNext(); ) {
                Element e = (Element) iterator.next();
                map.put(e.getName(), e.getText());
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return map;
    }

    private String readXmlContent() {
        InputStreamReader read = null;
        BufferedReader bufferedReader = null;
        try {
            String encoding = "UTF-8";
            File file = new File(String.format("src/%s", getSourceFile()));
            if (file.isFile() && file.exists()) {
                read = new InputStreamReader(new FileInputStream(file), encoding);
                bufferedReader = new BufferedReader(read);
                String lineText = bufferedReader.readLine().trim();
                StringBuffer sb = new StringBuffer();
                while (lineText != null) {
                    sb.append(lineText.trim());
                    lineText = bufferedReader.readLine();
                    if (lineText == null) break;
                }
                return sb.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) bufferedReader = null;
            try {
                if (read != null) read.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
