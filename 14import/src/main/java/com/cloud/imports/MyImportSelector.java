package com.cloud.imports;

import com.cloud.beans.OtherBean2;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/30
 * @Time 5:36
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        // AnnotationMetadata 注解元数据，封装的是使用了import注解的那个类上的其他注解的元信息
        Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(ComponentScan.class.getName());
        annotationAttributes.forEach((attrName, attrValue) -> {
            System.out.println(attrName + "==" + attrValue);
        });

        // 返回数组，封装需要注册到Spring中的Bean的全限定名
        return new String[]{OtherBean2.class.getName()};
    }
}
