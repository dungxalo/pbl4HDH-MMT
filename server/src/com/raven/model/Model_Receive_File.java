/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.model;

/**
 *
 * @author MTMQ
 */
public class Model_Receive_File {

    public Model_Receive_File() {
    }
    private String nameFIle;

    public String getNameFIle() {
        return nameFIle;
    }

    public void setNameFIle(String nameFIle) {
        this.nameFIle = nameFIle;
    }
    private int fileID;

    public Model_Receive_File(int fileID) {
        this.fileID = fileID;
    }

    public int getFileID() {
        return fileID;
    }

    public void setFileID(int fileID) {
        this.fileID = fileID;
        
    }
}
