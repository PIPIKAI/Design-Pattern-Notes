package pattern.created.PrototypePattern.v3;

import java.io.IOException;

class Client {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        WeeklyLog log_previous, log_new;
        log_previous = new WeeklyLog(); //创建原型对象
        Attachment attachment = new Attachment(); //创建附件对象
        log_previous.setAttachment(attachment);  //将附件添加到周报中
        log_new = log_previous.clone(); //调用克隆方法创建克隆对象
        //比较周报
        System.out.println("周报是否相同？ " + (log_previous == log_new));
        //比较附件
        System.out.println("附件是否相同？ " + (log_previous.getAttachment() == log_new.getAttachment()));
//        true 浅拷贝，引用数据类型的数据地址相同


        WeeklyLog log_deepclone =log_previous.deepClone();
        System.out.println("--------深拷贝-----------");
        //比较周报
        System.out.println("周报是否相同？ " + (log_previous == log_deepclone));
        //比较附件
        System.out.println("附件是否相同？ " + (log_previous.getAttachment() == log_deepclone.getAttachment()));
    }
}