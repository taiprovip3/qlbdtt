package util;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.Timer;

public class GetLocalTime {
	JLabel lblDate, lblTime;

    public GetLocalTime(JLabel lblDate, JLabel lblTime) {
        this.lblDate = lblDate;
        this.lblTime = lblTime;
    }

    public void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        lblDate.setText(s.format(d));
    }

    public void showTime() {
        new Timer(0, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                lblTime.setText(s.format(d));
            }
        }).start();
    }//End hàm
}
