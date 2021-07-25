package com.example.demoServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Author Adil
 * @create 25.07.2021 21:35
 */

@WebServlet(name = "/tempServlet", value = "/tempServlet")
public class tempServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        System.out.println("\nHERE: ");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            new Thread() {
                @Override
                public void run(){
                    try{
                        URLConnection urlConnection=new URL("http://localhost:8080/demoServlet_war_exploded/tempServlet").openConnection();
                        urlConnection.getInputStream();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
}
