/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NIM;

import jaco.mp3.player.MP3Player;
import static java.awt.SystemColor.menu;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        mp3player.play();
        
    }
    
    //Nhac nen 
    public static final String SONG = "D:\\6Loc\\Tu_hoc\\CT239(01)_NLCSN\\Project\\Sounds\\Gunny.mp3";
    MP3Player mp3player = new MP3Player(new File(SONG));
    int i = 1;
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnGuide = new javax.swing.JButton();
        btnOffMusic = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnPvE = new javax.swing.JButton();
        btnPvP = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trò chơi NIM");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnGuide.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnGuide.setText("Hướng dẫn");
        btnGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuideActionPerformed(evt);
            }
        });

        btnOffMusic.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnOffMusic.setText("Bật/Tắt Nhạc");
        btnOffMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOffMusicActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 102, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Trò chơi NIM");

        btnPvE.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnPvE.setText("Đấu Với Máy");
        btnPvE.setPreferredSize(new java.awt.Dimension(289, 60));
        btnPvE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPvEActionPerformed(evt);
            }
        });

        btnPvP.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnPvP.setText("Đấu Với Người");
        btnPvP.setPreferredSize(new java.awt.Dimension(289, 60));
        btnPvP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPvPActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\B1906515\\22_23\\HK1\\CT239(01)_NLCSN\\Project\\Image\\Tom&Jerry.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnPvE, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(btnPvP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuide)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOffMusic)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(171, 171, 171))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPvP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPvE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOffMusic)
                    .addComponent(btnGuide))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOffMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOffMusicActionPerformed
     
        //Bat va tat nhac
        if(i % 2 == 0){
            mp3player.play();
            i++;
        }else{
            mp3player.pause();
            i++;
        }
    }//GEN-LAST:event_btnOffMusicActionPerformed

    private void btnPvPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPvPActionPerformed
        
        //Chuyen sang giao dien PvP
        PvP pvp = new PvP();        
        pvp.setVisible(true);
        //mp3player.stop();
    }//GEN-LAST:event_btnPvPActionPerformed

    private void btnPvEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPvEActionPerformed
        
        //Chuyen sang giao dien PvE
        PvE pve = new PvE();        
        pve.setVisible(true);
        //mp3player.stop();
    }//GEN-LAST:event_btnPvEActionPerformed

    private void btnGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuideActionPerformed
        
        //Hien thi huong dan tro choi
        JOptionPane.showMessageDialog(rootPane,
            "   Trò chơi NIM \n" +
            "   Cho n đống xu, trong đó hai người chơi thay phiên nhau lấy ra các xu từ đống. Trên mỗi lượt, người chơi\n" +
            "phải loại bỏ ít nhất một đối tượng và có thể loại bỏ bất kỳ số lượng đối tượng nào miễn là tất cả chúng đều\n" +
            "đến từ cùng một đống và người chơi nào loại bỏ xu cuối cùng sẽ thua cuộc.\n" +
            "   Ở các chế độ chơi (Đấu Với Người hoặc Đấu Với Máy) sẽ có giao diện hiển thị đầy đủ thông tin cần thiết \n" +
            "cho người chơi. Khi người chơi Nhấp Chọn vào một đống xu thì Số thứ tự đống và Số xu trong đống sẽ \n" +
            "được hiển thị, người chơi nhập số xu cần lấy ra (Lưu ý chỉ nhập số nguyên, không được nhập kí tự gì khác) \n" +
            "sau đó Số xu của đống được chọn bị trừ.");
    }//GEN-LAST:event_btnGuideActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuide;
    private javax.swing.JButton btnOffMusic;
    private javax.swing.JButton btnPvE;
    private javax.swing.JButton btnPvP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
