package HomeWork_2;

import java.util.Objects;

// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
public class Task1 {
    private String getWhereFromJson(String json) {
        StringBuilder where = new StringBuilder();
        json = json.substring(1, json.length() - 1);
        String[] rawPairs = json.split(", ");
        boolean firstPair = true;
        for (String pair : rawPairs) {
            StringBuilder sb = new StringBuilder(pair);
            int firstIndex = sb.indexOf("\"");
            int lastIndex = sb.indexOf("\"", firstIndex + 1);
            String key = sb.substring(firstIndex + 1, lastIndex);
            firstIndex = sb.indexOf("\"", lastIndex + 1);
            lastIndex = sb.indexOf("\"", firstIndex + 1);
            String value = sb.substring(firstIndex + 1, lastIndex);
            if (Objects.equals(value, "null")) {
                continue;
            }

            if (!firstPair) {
                where.append(" AND ");
            }
            else {
                firstPair = false;
            }

            where.append(key).append(" = ").append("'").append(value).append("'");
        }

        return where.toString();
    }

    public String generateSqlQuery(String queryPart, String json) {
        return queryPart + getWhereFromJson(json);
    }
}
