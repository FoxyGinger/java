package HomeWork_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Task2 {
    public void generateTextFromJson(String jsonArray) {
        String[] rawJsons = jsonArray.split("},");
        for (String json : rawJsons) {
            String[] pairs = json.split(",");
            List<String> values = new ArrayList<String>();
            for (String pair : pairs) {
                StringBuilder sb = new StringBuilder(pair);
                int firstIndex = sb.indexOf("\"");
                int lastIndex = sb.indexOf("\"", firstIndex + 1);
                String key = sb.substring(firstIndex + 1, lastIndex);
                firstIndex = sb.indexOf("\"", lastIndex + 1);
                lastIndex = sb.indexOf("\"", firstIndex + 1);
                String value = sb.substring(firstIndex + 1, lastIndex);
                values.add(value);
            }
            StringBuilder text = new StringBuilder();
            text.append("Студент ").append(values.get(0)).append(" получил ").append(values.get(1)).append(" по предмету ").append(values.get(2));
            String str = text.toString();
            System.out.println(str);
        }
    }

    public String readJsonFromFile(String file) throws IOException {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(file);
        assert is != null;
        InputStreamReader streamReader = new InputStreamReader(is);
        BufferedReader reader = new BufferedReader(streamReader);

        return reader.readLine();
    }
}
