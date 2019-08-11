package org.data.common.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author wangguodong
 */
public final class FileUtils {

    private FileUtils(){}

    public static void writeFile(String path,String content) throws IOException {
        OutputStream out = new FileOutputStream(new File(path));
        out.write(content.getBytes());
        out.flush();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        writeFile("d:\\test.txt","hello\r\nwgd");
    }
}