import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;
import java.io.IOException;
import java.io.*;

class demoregex {

    public static void main(String[] args) throws Exception {

        try {
            File file = new File("chat.txt"); // creates a new file instance
            FileReader fr = new FileReader(file); // reads the file
            BufferedReader br = new BufferedReader(fr); // creates a buffering character input stream
            String line;
            Pattern p = Pattern.compile("\\d\\d.\\d\\d.\\d\\d,\\s\\d\\d?:\\d\\d\\s(p|a)m\\s-\\sDipak\\sGautam:.+");
//             Pattern p = Pattern.compile("\\d\\d.\\d\\d.\\d\\d,\\s\\d\\d?:\\d\\d\\s(p|a)m\\s-\\s[Name of that person which appers in you chat if there is space in between  put \\s ]:.+");

            Pattern p1 = Pattern.compile("\\d\\d.\\d\\d.\\d\\d,\\s\\d\\d?:\\d\\d\\s(p|a)m\\s-\\s[^Dipak]");
            line = br.readLine();
            int count = 0;
            while (line != null) {
                StringBuffer sb = new StringBuffer(); // constructs a string buffer with no characters
                Matcher m = p.matcher(line);
                if (m.find()) {
                    count++;
                    // System.out.println("0000000000" + line);
                    sb.append(line);
                    sb.append("\n");
                    // System.out.println(line);

                    line = br.readLine();
                    while (line != null) {
                        // System.out.println("0000000000000000");
                        Matcher m1 = p.matcher(line);
                        Matcher m2 = p1.matcher(line);
                        if (m1.find()) {
                            break;
                        }
                        if (m2.find()) {
                            // System.out.println("fffffffffffffffff" + line);
                            line = br.readLine();
                            break;
                        } else {
                            // System.out.println("-----------------" + line);
                            // System.out.println(line);
                            sb.append(line);
                            sb.append("\n");
                        }
                        line = br.readLine();

                    }

                    sb.append(""+count+"---------------------");
                    sb.append("\n");
                    System.out.print(sb);

                } else {
                    line = br.readLine();
                }
                // System.err.println("-------------------------------------");
                sb = null;
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
