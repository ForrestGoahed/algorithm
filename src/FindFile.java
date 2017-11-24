import java.io.File;

/**
 * ClassName��
 * Description��
 * <p>company��58ͬ�� <br>
 * Copyright��Copyright ? 2011 58.com All Rights Reserved<br>
 *
 * @author shaohongtao
 * @Date 2017/11/15 15:43
 * @since JRE 1.6.0_22  or higher
 */
public class FindFile {

    /**
     * ��һ���ļ�·�����ݹ�����Ƿ����ĳ���ļ�
     * @param path
     * @param fieName
     */
    public static void findFilePath(String path,String fieName){
        File file = new File(path);
        if(file.isFile()){
            if(fieName.equals(file.getName()))
                System.out.println(file.getAbsolutePath());
        }
        File[] files = file.listFiles();
        for(int i=0;i<files.length;i++){
            findFilePath(files[i].getAbsolutePath(),fieName);
        }
    }

    public static void main(String[] args) {
        findFilePath("D:\\ideaproject\\ceping\\branches\\web\\ceping\\ceping_dev_BRANCH\\src\\main\\java\\com\\bj58\\ceping","WtableEntity.java");
    }
}
