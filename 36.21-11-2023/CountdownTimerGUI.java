import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountdownTimerGUI {
    private int seconds = 500;
    private Timer timer;
    private JLabel timerLabel;

    public CountdownTimerGUI() {
        JFrame frame = new JFrame("Countdown Timer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        timerLabel = new JLabel("Time: " + seconds);
        timerLabel.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(timerLabel);

        JButton startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startTimer();
            }
        });
        frame.add(startButton);

        JButton stopButton = new JButton("Stop");
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stopTimer();
            }
        });
        frame.add(stopButton);

        frame.setVisible(true);
    }

    private void startTimer() {
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (seconds > 0) {
                    seconds--;
                    timerLabel.setText("Time: " + seconds);
                } else {
                    stopTimer();
                    JOptionPane.showMessageDialog(null, "Countdown Finished!");
                }
            }
        });
        timer.start();
    }

    private void stopTimer() {
        if (timer != null && timer.isRunning()) {
            timer.stop();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CountdownTimerGUI();
            }
        });
    }
}
