package IOTest;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class TestStream {
    private static org.apache.log4j.Logger logger = Logger.getLogger(TestFile.class);


    public static void createPath(String filePath){
        if (filePath.length() == 0){
            return;
        }
        String[] path = filePath.split("\\\\");
        try{
            String dir = path[0];
            File temp_file ;
            for (int i = 1; i < path.length ; i++ )
            {
                temp_file = new File(dir);
                if (!temp_file.exists()){
                    temp_file.mkdir();
                }
                dir = dir +"\\" + path[i];
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws IOException {
        PropertyConfigurator.configure("C:\\Users\\Administrator\\Desktop\\IdeaProjects\\Practise\\src\\log4j.properties");

//        try {
//            File f = new File("C:\\tt.txt");
//            FileOutputStream fileOutPutStream = new FileOutputStream(f);
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//        String filename = "D:\\xyz\\abc\\def\\lol2.txt";
        String srcfile = "C:\\Users\\Administrator\\Desktop\\ds.txt";
//        String srcfile = "C:\\Users\\Administrator\\Desktop\\dd.txt";
        String destfile = "D:\\aaa\\aa\\tt.txt";
        copyfiles2(srcfile,destfile);
//        fileSplit(filename);
//        combineFiles();
//        try{
//            File f = new File(filename);
//            byte data[] = {88,99};
//            createPath(filename);
////            while (f.getParent() == null){
////                 f = f.getParentFile();
////            }
////            f = new File(filename);
//            FileOutputStream fo = new FileOutputStream(f);
//            fo.write(data);
//            fo.close();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }


    public static void fileSplit(String file) throws IOException {
        File f = new File(file);
        int max = 100;

        int temp_length = 1024;
        int n = 0;
        int rst_int = 1;
        FileOutputStream fos= null;
        FileInputStream fis=null;
        try{
            fis = new FileInputStream(f);
            byte[] data = new byte[temp_length];
            while (n != -1){
                n = fis.read(data);
                max--;
                File f_temp = new File(file+"-"+rst_int);
                fos = new FileOutputStream(f_temp,true);
                fos.write(data);
                if (max==0){
                    max = 100;
                    rst_int++;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            fis.close();
            fos.close();
        }
    }

    public static void combineFiles() throws IOException {
        String filename = "C:\\Users\\Administrator\\Desktop\\dd.txt";
        String filename2 = "C:\\Users\\Administrator\\Desktop\\dd.txt-2";
        String filename3 = "C:\\Users\\Administrator\\Desktop\\dd.txt-3";
        int n = 0;
        String rstfile = "C:\\Users\\Administrator\\Desktop\\tt.txt";

        File outfile = new File(rstfile);
        if (!outfile.exists())
        {
            outfile.createNewFile();
        }
        FileInputStream fis = null;
        FileOutputStream fos = new FileOutputStream(outfile,true);
        try{
            for (int i = 1;i<=3;i++){
                File file = new File(filename+"-"+i);
                fis = new FileInputStream(file);
                while (n != -1){
                    byte[] data = new byte[1024];
                    n = fis.read(data);
                    fos.write(data);
                }
                n=0;
                fis.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            fos.close();
        }
    }

    public static void copyFile(String srcFile,String destFile) throws IOException {
        if (srcFile.length() == 0 )
            return;
        File src = new File(srcFile);
        if (!src.exists()){
            return;
        }
        if (destFile.length() == 0)
            return;
        File dest = new File(destFile);
        if (!dest.exists()) {
            createPath(destFile);
            dest.createNewFile();
        }

        FileInputStream fis = new FileInputStream(src);
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream(dest,true);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        byte[] data = new byte[256];
        int len = 0;
        try {
            while (bis.read(data) != -1) {
                len = bis.read();
//                if (data[] < 200

                bos.write(data);
//                System.out.println(new String(data, 0, len));
//                logger.debug(new String(data));
            }

            bos.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
//            fis.close();
            bis.close();
//            fos.close();
            bos.close();
        }
    }

    public static void copyfiles2(String srcpath,String despath) throws IOException {
        File srcfile = new File(srcpath);

        createPath(despath);
        File desfile = new File(despath);
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        FileChannel inputChannel = null;
        FileChannel outputChannel = null;
        try {
            fileInputStream = new FileInputStream(srcfile);
            inputChannel = fileInputStream.getChannel();
            fileOutputStream = new FileOutputStream(desfile);
            outputChannel = fileOutputStream.getChannel();

            ByteBuffer buf = ByteBuffer.allocate(1024);
            int temp = 0;
            while ((temp = inputChannel.read(buf)) != -1){
                buf.flip();
                outputChannel.write(buf);
                buf.clear();
            }

//            inputChannel.transferTo(1000,100,outputChannel);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            fileInputStream.close();
            fileOutputStream.close();
            inputChannel.close();
            outputChannel.close();
        }

    }

}
