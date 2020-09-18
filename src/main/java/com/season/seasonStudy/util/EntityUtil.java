package com.season.seasonStudy.util;

import org.springframework.util.ObjectUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class EntityUtil {

    /**
     * 根据传入的参数名，与参数值，获取list中符合要求的数据集合
     */
    public static <T> List<T> getEntityFromList (List<T> list, String itemName, Object itemValue) {
        List<T> result = new ArrayList<>();
        if (ObjectUtils.isEmpty(list) || ObjectUtils.isEmpty(itemName) || ObjectUtils.isEmpty(itemValue)) {
            return result;
        }

        // 寻找泛型Field
        Class clazz = list.get(0).getClass();
        Field targetField = null;

        for (; clazz != null; clazz = clazz.getSuperclass()) {
            Field[] fields = clazz.getDeclaredFields();
            try {
                targetField = clazz.getDeclaredField(itemName);
                break;
            } catch (Exception e) {
                continue;
            }
        }
        if (targetField == null) { // 没有这个属性
            return result;
        }

        targetField.setAccessible(true); // 使私有属性也可被访问
        for (T data : list) {
            try {
                if (itemValue.equals(targetField.get(data))) {
                    result.add(data);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
