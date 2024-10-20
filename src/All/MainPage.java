
package All;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Timer;

public class MainPage extends javax.swing.JFrame {
     long elapsedTime = 0;
     long seconds =0;
     long minutes =0;
     long totalElapsed = 0;
     long totalMin =0;
     long totalSec = 0;
     String seconds_string = String.format("%02d", seconds);
     String minutes_string = String.format("%02d", minutes);
     public ring ala;
     public TotalRing fiftyMin;
     public Boolean flg = true; 

     
  Timer totalTimer = new Timer(1000, new ActionListener() {
    @Override                   
  public void actionPerformed(ActionEvent e) {
      totalElapsed = totalElapsed+1000;
      totalMin = (totalElapsed/60000);
      totalSec = (totalElapsed/1000) % 60;
        if (totalMin == 45 && flg) {
            try {
            flg = false;
                fiftyMin.Start();
            } catch (LineUnavailableException | IOException | NullPointerException ex) {
                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
 
   seconds_string = String.format("%02d", totalSec);
   minutes_string = String.format("%02d", totalMin);
   TotalTimer.setText(minutes_string+":"+seconds_string);
  }
 });
  
  Timer timerReading = new Timer(1000, new ActionListener() {
    @Override                   
  public void actionPerformed(ActionEvent e) {
   elapsedTime = elapsedTime+1000;
    minutes = (elapsedTime/60000);
    seconds = (elapsedTime/1000) % 60;
 
        if (minutes % 5 == 0 && seconds == 0) {
            try {
                ala.Start();
            } catch (LineUnavailableException | IOException | NullPointerException ex) {
                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
 
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

        if (minutes % 5 == 0 && seconds == 0) {
            try {
                ala.Start();
            } catch (LineUnavailableException | IOException | NullPointerException ex) {
                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
        
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
   
        if (minutes % 5 == 0 && seconds == 0) {
            try {
                ala.Start();
            } catch (LineUnavailableException | IOException | NullPointerException ex) {
                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
        
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

        if (minutes % 5 == 0 && seconds == 0) {
            try {
                ala.Start();
            } catch (LineUnavailableException | IOException | NullPointerException ex) {
                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

   seconds_string = String.format("%02d", seconds);
   minutes_string = String.format("%02d", minutes);
   DebugTimer.setText(minutes_string+":"+seconds_string);
  }
 });
    public MainPage() throws UnsupportedAudioFileException{
         try {
             this.ala = new ring();
             this.fiftyMin = new TotalRing();
         } catch (IOException | LineUnavailableException ex) {
             Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
         }
       
        this.setIcon();
        this.setTitle("Problems Timer");
        this.setBounds(200,200,720, 560);
        
        initComponents();
        NextThink.setEnabled(false);
        NextCod.setEnabled(false);
        NextDeb.setEnabled(false);
        End.setEnabled(false);
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
        Thinking = new javax.swing.JLabel();
        ThinkingTimer = new javax.swing.JLabel();
        NextCod = new javax.swing.JButton();
        CodingPanel = new javax.swing.JPanel();
        CodingTimer = new javax.swing.JLabel();
        NextDeb = new javax.swing.JButton();
        Coding = new javax.swing.JLabel();
        DebugPanel = new javax.swing.JPanel();
        DebugTimer = new javax.swing.JLabel();
        End = new javax.swing.JButton();
        Debugging = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        TotalTimePanel = new javax.swing.JPanel();
        TotalLapel = new javax.swing.JLabel();
        TotalTimer = new javax.swing.JLabel();
        label1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(750, 560));
        setMinimumSize(new java.awt.Dimension(750, 560));
        setResizable(false);
        setSize(new java.awt.Dimension(750, 560));

        MainPanel.setBackground(new java.awt.Color(0, 207, 207));
        MainPanel.setMaximumSize(new java.awt.Dimension(720, 560));
        MainPanel.setMinimumSize(new java.awt.Dimension(720, 560));
        MainPanel.setPreferredSize(new java.awt.Dimension(720, 560));

        StartingBtn.setBackground(new java.awt.Color(0, 115, 139));
        StartingBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        StartingBtn.setForeground(new java.awt.Color(255, 255, 255));
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

        Thinking.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        Thinking.setText("Thinking");

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
                    .addComponent(Thinking)
                    .addComponent(ThinkingTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        ThinkingPanelLayout.setVerticalGroup(
            ThinkingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThinkingPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(Thinking, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        Coding.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        Coding.setText("Coding");

        javax.swing.GroupLayout CodingPanelLayout = new javax.swing.GroupLayout(CodingPanel);
        CodingPanel.setLayout(CodingPanelLayout);
        CodingPanelLayout.setHorizontalGroup(
            CodingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CodingPanelLayout.createSequentialGroup()
                .addGroup(CodingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CodingPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(CodingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Coding, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(Coding, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CodingTimer)
                .addGap(35, 35, 35)
                .addComponent(NextDeb, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        DebugPanel.setBackground(new java.awt.Color(255, 255, 255));

        DebugTimer.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
        DebugTimer.setText("00:00");

        End.setBackground(new java.awt.Color(171, 71, 68));
        End.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        End.setForeground(new java.awt.Color(255, 255, 255));
        End.setText("End");
        End.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndActionPerformed(evt);
            }
        });

        Debugging.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        Debugging.setText("Debug");

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
                            .addComponent(Debugging))
                        .addContainerGap())))
        );
        DebugPanelLayout.setVerticalGroup(
            DebugPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DebugPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Debugging, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DebugTimer)
                .addGap(35, 35, 35)
                .addComponent(End, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        Title.setFont(new java.awt.Font("Segoe Print", 1, 30)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Problem Solving Stopwatch");

        TotalTimePanel.setBackground(new java.awt.Color(64, 162, 195));

        TotalLapel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        TotalLapel.setForeground(new java.awt.Color(255, 255, 255));
        TotalLapel.setText("Total:");

        TotalTimer.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        TotalTimer.setForeground(new java.awt.Color(255, 255, 255));
        TotalTimer.setText("00:00");

        javax.swing.GroupLayout TotalTimePanelLayout = new javax.swing.GroupLayout(TotalTimePanel);
        TotalTimePanel.setLayout(TotalTimePanelLayout);
        TotalTimePanelLayout.setHorizontalGroup(
            TotalTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TotalTimePanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(TotalLapel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(TotalTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        TotalTimePanelLayout.setVerticalGroup(
            TotalTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TotalTimePanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(TotalTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalLapel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalTimer))
                .addGap(15, 15, 15))
        );

        label1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(102, 102, 102));
        label1.setText("© Mahmoud Abdelazim - MAMCPC");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MainPanelLayout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(ReadingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ThinkingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(CodingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(DebugPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(MainPanelLayout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(MainPanelLayout.createSequentialGroup()
                                    .addComponent(StartingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(TotalTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(MainPanelLayout.createSequentialGroup()
                                    .addComponent(Title)
                                    .addGap(132, 132, 132)))))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StartingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(TotalTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ReadingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThinkingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DebugPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
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
     totalTimer.stop();
     TotalTimer.setText("00:00");
     ReadingTimer.setText("00:00");
     ReadingPanel.setBackground(Color.orange);
     ThinkingPanel.setBackground(Color.white);
     CodingPanel.setBackground(Color.white);
     DebugPanel.setBackground(Color.white);
     ThinkingTimer.setText("00:00");
     CodingTimer.setText("00:00");
     DebugTimer.setText("00:00");
     StartingBtn.setText("Start again");
     
     elapsedTime = 0;
     seconds = 0;
     minutes =0;
     totalElapsed = 0;
     totalMin = 0;
     totalSec = 0;
     timerReading.start();
     totalTimer.start();
     NextThink.setEnabled(true);
     NextCod.setEnabled(false);
     NextDeb.setEnabled(false);
     End.setEnabled(true);
    }//GEN-LAST:event_StartingBtnActionPerformed

    private void NextThinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextThinkActionPerformed
    timerReading.stop();    
     ReadingPanel.setBackground(Color.white);
     ThinkingPanel.setBackground(Color.orange);
     CodingPanel.setBackground(Color.white);
     DebugPanel.setBackground(Color.white);
     elapsedTime = 0;
     seconds = 0;
     minutes =0;
    timerThinking.start();
    NextThink.setEnabled(false);
     NextCod.setEnabled(true);
     NextDeb.setEnabled(false);
     End.setEnabled(true);
    }//GEN-LAST:event_NextThinkActionPerformed

    private void NextCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextCodActionPerformed
    timerThinking.stop();  
     ReadingPanel.setBackground(Color.white);
     ThinkingPanel.setBackground(Color.white);
     CodingPanel.setBackground(Color.orange);
     DebugPanel.setBackground(Color.white);
     elapsedTime = 0;
     seconds = 0;
     minutes =0;
    timerCoding.start();
     NextThink.setEnabled(false);
     NextCod.setEnabled(false);
     NextDeb.setEnabled(true);
     End.setEnabled(true);
    }//GEN-LAST:event_NextCodActionPerformed

    private void NextDebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextDebActionPerformed
    timerCoding.stop();
     ReadingPanel.setBackground(Color.white);
     ThinkingPanel.setBackground(Color.white);
     CodingPanel.setBackground(Color.white);
     DebugPanel.setBackground(Color.orange);    
     elapsedTime = 0;
     seconds = 0;
     minutes =0;
    timerDebug.start();
     NextThink.setEnabled(false);
     NextCod.setEnabled(false);
     NextDeb.setEnabled(false);
     End.setEnabled(true);
    }//GEN-LAST:event_NextDebActionPerformed

    private void EndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndActionPerformed
    timerReading.stop();
    timerThinking.stop();
    timerCoding.stop();
    timerDebug.stop();
    totalTimer.stop();
    ReadingPanel.setBackground(Color.white);
     ThinkingPanel.setBackground(Color.white);
     CodingPanel.setBackground(Color.white);
     DebugPanel.setBackground(Color.white);
     elapsedTime = 0;
     seconds = 0;
     minutes =0;
     NextThink.setEnabled(false);
     NextCod.setEnabled(false);
     NextDeb.setEnabled(false);
     End.setEnabled(false);
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
                try {
                    new MainPage().setVisible(true);
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Coding;
    private javax.swing.JPanel CodingPanel;
    private javax.swing.JLabel CodingTimer;
    private javax.swing.JPanel DebugPanel;
    private javax.swing.JLabel DebugTimer;
    private javax.swing.JLabel Debugging;
    public javax.swing.JButton End;
    private javax.swing.JPanel MainPanel;
    public javax.swing.JButton NextCod;
    public javax.swing.JButton NextDeb;
    public javax.swing.JButton NextThink;
    private javax.swing.JLabel Reading;
    private javax.swing.JPanel ReadingPanel;
    private javax.swing.JLabel ReadingTimer;
    private javax.swing.JButton StartingBtn;
    private javax.swing.JLabel Thinking;
    private javax.swing.JPanel ThinkingPanel;
    private javax.swing.JLabel ThinkingTimer;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel TotalLapel;
    private javax.swing.JPanel TotalTimePanel;
    private javax.swing.JLabel TotalTimer;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon.png")));
    }
}
