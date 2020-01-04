package IOTest;


import java.io.*;
import java.util.Arrays;
import java.util.Date;
//import java.util.logging.FileHandler;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestFile {
    private static Logger logger = Logger.getLogger(TestFile.class);

    public static void main(String[] args) throws IOException {
        PropertyConfigurator.configure("C:\\Users\\Administrator\\Desktop\\IdeaProjects\\Practise\\src\\log4j.properties");

//        File f = new File("C:\\Users\\Administrator\\Desktop\\janny.log");
//        logger.debug( Arrays.toString(f.list()));
//        File[] fs = f.listFiles();
//        logger.debug(f.getParent());
//        logger.debug(f.getParentFile());
//        f.mkdir();
//        f.mkdirs();
//
//        logger.debug(Arrays.toString(f.listRoots()));
//        f.delete();
//        f.deleteOnExit();
//        if (!f.exists()){
////            f.canWrite()
//            if (f.createNewFile()){
//                logger.debug("create file success");
//            }
//        }
//
//        if (f.isDirectory()){
//            logger.debug(f.getName()+" is directory");
//        }
//        if (f.isFile()){
//            logger.debug(f.getName()+" is file");
//        }
//
//        if (f.canWrite())
//        {
//            logger.debug(f.getName()+" can be writen");
//        }
//
//        f.renameTo(new File("janny.log"));
//
//        long time = f.lastModified();
//        Date d = new Date(time);
//        logger.debug(d);
//
//        logger.debug("file length:"+ f.length());

        rFile();
    }

    public static void rFile() {
        File f = new File("C:\\Users\\Administrator\\Desktop\\");
        if (f.isDirectory()) {
            for (File fs : f.listFiles()) {
                if (fs.isFile()) {
                    logger.debug(fs.toString());
                }
            }
        }

    }



}
