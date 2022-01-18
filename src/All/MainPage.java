
package All;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class MainPage extends javax.swing.JFrame {
     long elapsedTime = 0;
     long seconds =0;
     long minutes =0;
     String seconds_string = String.format("%02d", seconds);
     String minutes_string = String.format("%02d", minutes);
     
  Timer timerReading = new Timer(1000, new ActionListener() {
    @Override                   
  public void actionPerformed(ActionEvent e) {
   elapsedTime=elapsedTime+1000;
   minutes = (elapsedTime/60000);
   seconds = (elapsedTime/1000) % 60;
   seconds_string = String.format("%02d", seconds);
   minutes_string = String.format("%02d", minutes);
   ReadingTimer.setText(minutes_string+":"+seconds_string);
  }
 });
  Timer timerThinking = new Timer(1000, new ActionListener() {
    @Override                   
  public void actionPerformed(ActionEvent e) {
   elapsedTime=elapsedTime+1000;
   minutes = (elapsedTime/60000);
   seconds = (elapsedTime/1000) % 60;
   seconds_string = String.format("%02d", seconds);
   minutes_string = String.format("%02d", minutes);
   ThinkingTimer.setText(minutes_string+":"+seconds_string);
  }
 });   
  Timer timerCoding = new Timer(1000, new ActionListener() {
    @Override                   
  public void actionPerformed(ActionEvent e) {
   elapsedTime=elapsedTime+1000;
   minutes = (elapsedTime/60000);
   seconds = (elapsedTime/1000) % 60;
   seconds_string = String.format("%02d", seconds);
   minutes_string = String.format("%02d", minutes);
   CodingTimer.setText(minutes_string+":"+seconds_string);
  }
 });   
  Timer timerDebug = new Timer(1000, new ActionListener() {
    @Override                   
  public void actionPerformed(ActionEvent e) {
   elapsedTime=elapsedTime+1000;
   minutes = (elapsedTime/60000);
   seconds = (elapsedTime/1000) % 60;
   seconds_string = String.format("%02d", seconds);
   minutes_string = String.format("%02d", minutes);
   DebugTimer.setText(minutes_string+":"+seconds_string);
  }
 });
    public MainPage() {
        this.setIcon();
        this.setTitle("Problems Timer");
        this.setBounds(200,200,720, 560);
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        StartingBtn = new javax.swing.JButton();
        ReadingPanel = new javax.swing.JPanel();
        Reading = new javax.swing.JLabel();
        ReadingTimer = new javax.swing.JLabel();
        NextThink = new javax.swing.JButton();
        ThinkingPanel = new javax.swing.JPanel();
        Reading9 = new javax.swing.JLabel();
        ThinkingTimer = new javax.swing.JLabel();
        NextCod = new javax.swing.JButton();
        CodingPanel = new javax.swing.JPanel();
        CodingTimer = new javax.swing.JLabel();
        NextDeb = new javax.swing.JButton();
        Reading10 = new javax.swing.JLabel();
        DebugPanel = new javax.swing.JPanel();
        DebugTimer = new javax.swing.JLabel();
        End = new javax.swing.JButton();
        Reading11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(740, 560));
        setMinimumSize(new java.awt.Dimension(740, 560));
        setPreferredSize(new java.awt.Dimension(740, 560));
        setResizable(false);
        setSize(new java.awt.Dimension(740, 560));

        MainPanel.setBackground(new java.awt.Color(0, 207, 207));
        MainPanel.setMaximumSize(new java.awt.Dimension(720, 560));
        MainPanel.setMinimumSize(new java.awt.Dimension(720, 560));
        MainPanel.setPreferredSize(new java.awt.Dimension(720, 560));

        StartingBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        StartingBtn.setText("Start");
        StartingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartingBtnActionPerformed(evt);
            }
        });

        ReadingPanel.setBackground(new java.awt.Color(255, 255, 255));
        ReadingPanel.setPreferredSize(new java.awt.Dimension(150, 240));
        ReadingPanel.setRequestFocusEnabled(false);

        Reading.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        Reading.setText("Reading");

        ReadingTimer.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
        ReadingTimer.setText("00:00");

        NextThink.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NextThink.setText("Next");
        NextThink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextThinkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReadingPanelLayout = new javax.swing.GroupLayout(ReadingPanel);
        ReadingPanel.setLayout(ReadingPanelLayout);
        ReadingPanelLayout.setHorizontalGroup(
            ReadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReadingPanelLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(ReadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NextThink, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reading, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReadingTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        ReadingPanelLayout.setVerticalGroup(
            ReadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReadingPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(Reading, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ReadingTimer)
                .addGap(34, 34, 34)
                .addComponent(NextThink, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        ThinkingPanel.setBackground(new java.awt.Color(255, 255, 255));

        Reading9.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        Reading9.setText("Thinking");

        ThinkingTimer.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
        ThinkingTimer.setText("00:00");

        NextCod.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NextCod.setText("Next");
        NextCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextCodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ThinkingPanelLayout = new javax.swing.GroupLayout(ThinkingPanel);
        ThinkingPanel.setLayout(ThinkingPanelLayout);
        ThinkingPanelLayout.setHorizontalGroup(
            ThinkingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThinkingPanelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(ThinkingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NextCod, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reading9)
                    .addComponent(ThinkingTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        ThinkingPanelLayout.setVerticalGroup(
            ThinkingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThinkingPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(Reading9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ThinkingTimer)
                .addGap(34, 34, 34)
                .addComponent(NextCod, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        CodingPanel.setBackground(new java.awt.Color(255, 255, 255));

        CodingTimer.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
        CodingTimer.setText("00:00");

        NextDeb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NextDeb.setText("Next");
        NextDeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextDebActionPerformed(evt);
            }
        });

        Reading10.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        Reading10.setText("Coding");

        javax.swing.GroupLayout CodingPanelLayout = new javax.swing.GroupLayout(CodingPanel);
        CodingPanel.setLayout(CodingPanelLayout);
        CodingPanelLayout.setHorizontalGroup(
            CodingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CodingPanelLayout.createSequentialGroup()
                .addGroup(CodingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CodingPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(CodingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Reading10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CodingTimer)))
                    .addGroup(CodingPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(NextDeb, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        CodingPanelLayout.setVerticalGroup(
            CodingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CodingPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Reading10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CodingTimer)
                .addGap(35, 35, 35)
                .addComponent(NextDeb, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        DebugPanel.setBackground(new java.awt.Color(255, 255, 255));

        DebugTimer.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
        DebugTimer.setText("00:00");

        End.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        End.setText("End");
        End.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndActionPerformed(evt);
            }
        });

        Reading11.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        Reading11.setText("Debug");

        javax.swing.GroupLayout DebugPanelLayout = new javax.swing.GroupLayout(DebugPanel);
        DebugPanel.setLayout(DebugPanelLayout);
        DebugPanelLayout.setHorizontalGroup(
            DebugPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DebugPanelLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(DebugPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DebugPanelLayout.createSequentialGroup()
                        .addComponent(End, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DebugPanelLayout.createSequentialGroup()
                        .addGroup(DebugPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DebugTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Reading11))
                        .addContainerGap())))
        );
        DebugPanelLayout.setVerticalGroup(
            DebugPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DebugPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Reading11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DebugTimer)
                .addGap(35, 35, 35)
                .addComponent(End, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(ReadingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ThinkingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CodingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DebugPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(StartingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(StartingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ReadingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ThinkingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CodingPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DebugPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(159, 159, 159))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartingBtnActionPerformed
     timerReading.stop();
     timerThinking.stop();
     timerCoding.stop();
     timerDebug.stop();
     ReadingTimer.setText("00:00");
     ThinkingTimer.setText("00:00");
     CodingTimer.setText("00:00");
     DebugTimer.setText("00:00");
        
     elapsedTime = 0;
     seconds = 0;
     minutes =0;
     timerReading.start();
    }//GEN-LAST:event_StartingBtnActionPerformed

    private void NextThinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextThinkActionPerformed
    timerReading.stop();    
     elapsedTime = 0;
     seconds = 0;
     minutes =0;
    timerThinking.start();
    }//GEN-LAST:event_NextThinkActionPerformed

    private void NextCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextCodActionPerformed
    timerThinking.stop();    
     elapsedTime = 0;
     seconds = 0;
     minutes =0;
    timerCoding.start();    }//GEN-LAST:event_NextCodActionPerformed

    private void NextDebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextDebActionPerformed
    timerCoding.stop();    
     elapsedTime = 0;
     seconds = 0;
     minutes =0;
    timerDebug.start();
    }//GEN-LAST:event_NextDebActionPerformed

    private void EndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndActionPerformed
    timerReading.stop();
    timerThinking.stop();
    timerCoding.stop();
    timerDebug.stop();
     elapsedTime = 0;
     seconds = 0;
     minutes =0;
    }//GEN-LAST:event_EndActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CodingPanel;
    private javax.swing.JLabel CodingTimer;
    private javax.swing.JPanel DebugPanel;
    private javax.swing.JLabel DebugTimer;
    private javax.swing.JButton End;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton NextCod;
    private javax.swing.JButton NextDeb;
    private javax.swing.JButton NextThink;
    private javax.swing.JLabel Reading;
    private javax.swing.JLabel Reading1;
    private javax.swing.JLabel Reading10;
    private javax.swing.JLabel Reading11;
    private javax.swing.JLabel Reading2;
    private javax.swing.JLabel Reading3;
    private javax.swing.JLabel Reading4;
    private javax.swing.JLabel Reading5;
    private javax.swing.JLabel Reading6;
    private javax.swing.JLabel Reading7;
    private javax.swing.JLabel Reading8;
    private javax.swing.JLabel Reading9;
    private javax.swing.JPanel ReadingPanel;
    private javax.swing.JPanel ReadingPanel1;
    private javax.swing.JPanel ReadingPanel2;
    private javax.swing.JPanel ReadingPanel3;
    private javax.swing.JLabel ReadingTimer;
    private javax.swing.JButton StartingBtn;
    private javax.swing.JPanel ThinkingPanel;
    private javax.swing.JLabel ThinkingTimer;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon.png")));
    }
}
