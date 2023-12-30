package com.raven.component;

import com.raven.event.EventFileReceiver;
import com.raven.model.File_Name;
import com.raven.model.Model_File_Sender;
import com.raven.model.Model_Receive_File;
import com.raven.service.Service;
import java.io.File;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;

public class Chat_File extends javax.swing.JPanel {

   
      public Chat_File(boolean right) {
        initComponents();
         setOpaque(false);
     
        }
      
        public void addFile(Model_File_Sender fileSender) {
//        Icon image = new ImageIcon(fileSender.getFile().getAbsolutePath());
//        Image_Item pic = new Image_Item();
//        pic.setPreferredSize(getAutoSize(image, 200, 200));
//        pic.setImage(image, fileSender);
//       
//        add(pic, "wrap");
       // Giả sử lbFileName là một JLabel đã được khai báo và khởi tạo trước đó
        lbFileName.setText(fileSender.getFile().getName());
           // File_Name.name=fileSender.getFile().getName();
           
        revalidate();
        repaint();
        
    }
        public void addFile(Model_Receive_File file){
             
            lbFileName.setText(file.getFileName());
              try {
            Service.getInstance().addFileReceiver(file.getFileID(), new EventFileReceiver() {
                @Override
                public void onReceiving(double percentage) {
//                    progress.setValue((int) percentage);
                }

                @Override
                public void onStartReceiving() {

                }

                @Override
                public void onFinish(File file) {
//                    progress.setVisible(false);
//                    pic.setImage(new ImageIcon(file.getAbsolutePath()));
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
         revalidate();
        repaint();
        }
    public void setFile(String fileName, String size) {
        lbFileName.setText(fileName);
        lbFileSize.setText(size);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progress1 = new com.raven.swing.Progress();
        jPanel1 = new javax.swing.JPanel();
        lbFileName = new javax.swing.JLabel();
        lbFileSize = new javax.swing.JLabel();

        progress1.setProgressType(com.raven.swing.Progress.ProgressType.FILE);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(2, 1));

        lbFileName.setText("My File Name.file");
        jPanel1.add(lbFileName);

        lbFileSize.setForeground(new java.awt.Color(7, 98, 153));
        lbFileSize.setText("5 MB");
        jPanel1.add(lbFileSize);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(progress1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(progress1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbFileName;
    private javax.swing.JLabel lbFileSize;
    private com.raven.swing.Progress progress1;
    // End of variables declaration//GEN-END:variables
}
