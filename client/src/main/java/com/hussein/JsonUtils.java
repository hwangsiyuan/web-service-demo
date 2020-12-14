package com.hussein;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import lombok.Data;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Map;
import java.util.TimeZone;

/**
 * json解析工具（依赖jackson）
 * Created by log.chang on 2019/6/19.
 */
@SuppressWarnings("all")
public class JsonUtils {

    private static ObjectMapper defaultMapper;
    private static ObjectMapper snakeMapper;

    static {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        defaultMapper = new ObjectMapper();
        defaultMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        defaultMapper.setDateFormat(sdf);
        defaultMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        snakeMapper = new ObjectMapper();
        snakeMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        snakeMapper.setDateFormat(sdf);
        snakeMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        snakeMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
    }

    /**
     * 对象转json
     * 1、key默认与对象属性名相同
     * 2、配置JsonProperty则使用配置做key
     */
    public static String toJson(Object obj) {
        try {
            return obj == null ? null : defaultMapper.writeValueAsString(obj);
        } catch (IOException var2) {
            // log.error("[writeValueAsString]：" + var2.getMessage(), var2);
            return null;
        }
    }

    /**
     * 对象转json
     * 1、如果对象属性名为驼峰则json对应的key转为下划线
     * 2、配置JsonProperty则使用配置做key
     */
    public static String toJsonSnake(Object obj) {
        try {
            return obj == null ? null : snakeMapper.writeValueAsString(obj);
        } catch (IOException var2) {
            // log.error("[writeValueAsString]：" + var2.getMessage(), var2);
            return null;
        }
    }

    public static <T> T toObj(String json, Class<T> clazz) {
        try {
            return json == null || json.trim().length() == 0 ? null : defaultMapper.readValue(json, clazz);
        } catch (IOException var3) {
            // log.error("[readValue]：" + var3.getMessage(), var3);
            return null;
        }
    }


    public static <T> T toObj(String json, TypeReference<T> typeRef) {
        try {
            return json == null || json.trim().length() == 0 ? null : defaultMapper.readValue(json, typeRef);
        } catch (IOException var3) {
//            log.error("[readValue]：" + var3.getMessage(), var3);
            return null;
        }
    }


    public static <T> T toObjSnake(String json, Class<T> clazz) {
        try {
            return json == null || json.trim().length() == 0 ? null : snakeMapper.readValue(json, clazz);
        } catch (IOException var3) {
            // log.error("[readValue]：" + var3.getMessage(), var3);
            return null;
        }
    }

    public static <T> T toObj(String json, Class<? extends Collection> collectionClass, Class<?> elementClass) {
        try {
            if (json == null || json.trim().length() == 0) {
                return null;
            } else {
                JavaType javaType = defaultMapper.getTypeFactory().constructCollectionType(collectionClass, elementClass);
                return defaultMapper.readValue(json, javaType);
            }
        } catch (IOException var4) {
            // log.error("[toObj]" + var4.getMessage(), var4);
            return null;
        }
    }

    public static <T> T toObj(String json, Class<? extends Map> mapClass, Class<?> keyClass, Class<?> valueClass) {
        try {
            if (json == null || json.trim().length() == 0) {
                return null;
            } else {
                JavaType javaType = defaultMapper.getTypeFactory().constructMapType(mapClass, keyClass, valueClass);
                return defaultMapper.readValue(json, javaType);
            }
        } catch (IOException var5) {
            // log.error("[toObj]" + var5.getMessage(), var5);
            return null;
        }
    }

    public static String formatJson(String json) {
        try {
            if (json == null) {
                return null;
            } else {
                Object obj = defaultMapper.readValue(json, Object.class);
                return defaultMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
            }
        } catch (Exception var2) {
            // log.error("[formatJson]：" + var2.getMessage(), var2);
            return json;
        }
    }

    /**
     * 获取json某个节点
     */
    public static <T> T elementToObj(String json, String key, Class<T> clazz) {
        return elementToObj(defaultMapper, json, key, clazz);
    }

    public static <T> T elementToObjSnake(String json, String key, Class<T> clazz) {
        return elementToObj(snakeMapper, json, key, clazz);
    }

    private static <T> T elementToObj(ObjectMapper mapper, String json, String key, Class<T> clazz) {
        JsonNode node = null;
        try {
            node = mapper.readTree(json);
            JsonNode value = node.findValue(key);
            return mapper.readValue(value.toString(), clazz);
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        JsonTestObj sanz = new JsonTestObj();
        sanz.setPersonName("张三");
        sanz.setPersonAge(30);
        sanz.setPerson_address("昆仑山");
        sanz.setPerson_phone("110");
        JsonTestObj sil = new JsonTestObj();
        sil.setPersonName("李四");
        sil.setPersonAge(25);
        sil.setPerson_address("长白山");
        sil.setPerson_phone("120");
        System.err.println(toJson(sanz));
        System.err.println(toJsonSnake(sanz));
        System.err.println(toJsonSnake(sanz));
    }

    @Data
    public static class JsonTestObj {
        @JsonProperty("person_name")
        private String personName;
        private Integer personAge;
        private String person_address;
        @JsonProperty("personPhone")
        private String person_phone;
    }

}
