/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photoshop380;
import cpit380practice.*;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Ahmed
 */
public class HistogramFrame extends javax.swing.JFrame {

    /**
     * Creates new form HistogramFrame
     */
    public int [] red;
    public int [] green;
    public int [] blue;
    String fileName = "C:\\Users\\Ahmed\\Documents\\NetBeansProjects\\photoshop380\\histo.png";
    Picture redPic;
    Picture greenPic;
    Picture bluePic;
    public HistogramFrame(int [] red, int [] green, int [] blue) {
        initComponents();
        this.red = red;
        this.green = green;
        this.blue = blue;
        redPic = new Picture(256, greaterValue(red));
        greenPic = new Picture(256, greaterValue(green));
        bluePic = new Picture(256, greaterValue(blue));
        drawHistogram(red, redHisto, redPic,java.awt.Color.red);
        drawHistogram(green, greenHisto, greenPic, java.awt.Color.green);
        drawHistogram(blue, blueHisto, bluePic, java.awt.Color.blue);
    }
    private int greaterValue(int [] colors){
            int greater = 0;
        for (int i = 0; i < colors.length; i++) {
            if(colors[i] > colors[greater]){
                greater = i;
            }
        }
        
        return colors[greater];
    }
    
    private void drawHistogram(int [] color, JLabel frame, Picture pic, java.awt.Color rgb){
                Pixel [] pixels = pic.getPixels();
                
                for (int x = 0; x < color.length; x++) {
                    
                    for (int y = 0; y < color[x]; y++) {
                        
                        pic.getPixel(x, y).setColor(rgb);
                    }
        }
                pic.rotate180();
        ImageIcon icn = new ImageIcon(pic.getImage());
        frame.setIcon(icn);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        redFrame = new javax.swing.JPanel();
        redHisto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        blueHisto = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        greenHisto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        redFrame.setBackground(new java.awt.Color(255, 0, 51));

        redHisto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        redHisto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmed\\Documents\\NetBeansProjects\\photoshop380\\histo.png")); // NOI18N

        javax.swing.GroupLayout redFrameLayout = new javax.swing.GroupLayout(redFrame);
        redFrame.setLayout(redFrameLayout);
        redFrameLayout.setHorizontalGroup(
            redFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(redHisto, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );
        redFrameLayout.setVerticalGroup(
            redFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(redHisto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(redFrame);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        blueHisto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blueHisto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmed\\Documents\\NetBeansProjects\\photoshop380\\histo.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blueHisto, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blueHisto, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel1);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel2.setBackground(new java.awt.Color(0, 255, 51));

        greenHisto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        greenHisto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmed\\Documents\\NetBeansProjects\\photoshop380\\histo.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(greenHisto, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(greenHisto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane3.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blueHisto;
    private javax.swing.JLabel greenHisto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel redFrame;
    private javax.swing.JLabel redHisto;
    // End of variables declaration//GEN-END:variables
}
