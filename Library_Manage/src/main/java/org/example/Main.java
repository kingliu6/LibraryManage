package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.entity.Books;
import org.example.entity.Student;
import org.example.mapper.BookMapper;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner=new Scanner(System.in)){
            while(true){

                System.out.println("=======================");
                System.out.println("1.录入学生信息");
                System.out.println("2.录入书籍信息");
                System.out.println("输入您想要执行的操作（输入任意其他数字退出）");
                int input;
                try {
                    input= Integer.parseInt(scanner.next());
                    
                }catch (Exception e){
                    return;
                }

            }

        }

    }

}
