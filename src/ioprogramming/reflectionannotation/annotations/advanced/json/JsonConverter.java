package ioprogramming.reflectionannotation.annotations.advanced.json;

import java.lang.reflect.*;

public class JsonConverter {
    public static String toJson(Object obj) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append("{");

        Field[] fields = obj.getClass().getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            JsonField jf = fields[i].getAnnotation(JsonField.class);

            sb.append("\"").append(jf.name()).append("\":\"");
            sb.append(fields[i].get(obj)).append("\"");

            if (i < fields.length - 1) sb.append(",");
        }

        sb.append("}");
        return sb.toString();
    }
}
