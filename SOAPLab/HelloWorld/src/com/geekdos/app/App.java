package com.geekdos.app;

import com.geekdos.client.HalimaService;

/**
 * Created by theXuser on 1/3/2017.
 */
public class App {
    public static void main(String[] args){
        HalimaService halimaService = new HalimaService();
        halimaService.getHalimaPort().sayChirira();
    }
}
