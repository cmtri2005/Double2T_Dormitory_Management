/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.dashboard;

import RegisterRoom.DangKiPhong;
import View.CTHDSV;
import View.DangKyGiuXe;
import View.DangKyInternetFrame;
import View.DangKyTheThao;
import View.HopDong;
import View.Login;
import View.TheKTXSV;
import Visualize.PhongChart;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import model.UserSession;

/**
 *
 * @author NguyenTri
 */
public class Home extends javax.swing.JFrame {
    private String cccd;
    private String masv;
    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        
        // Tạo popup menu Đăng kí phòng
Color menuBackground = new Color(255, 255, 255);  // tím nhạt
Color textColor = Color.BLACK;
        Font menuFont = new Font("Segoe UI", Font.PLAIN, 18);
        Dimension menuSize = new Dimension(150, 40);

        JMenuItem menuDangKiPhong = new JMenuItem("Đăng kí phòng");
menuDangKiPhong.setBackground(menuBackground);
menuDangKiPhong.setForeground(textColor);
menuDangKiPhong.setFont(menuFont);
menuDangKiPhong.setPreferredSize(menuSize);

        JPopupMenu popupMenuPhong = new JPopupMenu();
popupMenuPhong.setBackground(menuBackground);
popupMenuPhong.setBorder(BorderFactory.createLineBorder(Color.WHITE));
popupMenuPhong.add(menuDangKiPhong);

// Gắn sự kiện click chuột cho JLabel "Dịch Vụ" (jLabel10)
jLabel6.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        // Hiển thị popup menu tại vị trí chuột trên jLabel10
        popupMenuPhong.show(jLabel6, e.getX(), e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        jLabel6.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
});
    menuDangKiPhong.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
         DangKiPhong dkFrame=new DangKiPhong(Home.this.cccd);
        dkFrame.setVisible(true);
        dkFrame.setLocationRelativeTo(null);
        dispose();
    }
});
    JMenuItem menuDichVu = new JMenuItem("Internet");
menuDichVu.setBackground(menuBackground);
menuDichVu.setForeground(textColor);
menuDichVu.setFont(menuFont);
menuDichVu.setPreferredSize(menuSize);

JMenuItem menuDichVu2= new JMenuItem("Giữ xe");
menuDichVu2.setBackground(menuBackground);
menuDichVu2.setForeground(textColor);
menuDichVu2.setFont(menuFont);
menuDichVu2.setPreferredSize(menuSize);

JMenuItem menuDichVu3 = new JMenuItem("Thể thao");
menuDichVu3.setBackground(menuBackground);
menuDichVu3.setForeground(textColor);
menuDichVu3.setFont(menuFont);
menuDichVu3.setPreferredSize(menuSize);

JPopupMenu popupMenuDichVu = new JPopupMenu();
popupMenuDichVu.setBackground(menuBackground);
popupMenuDichVu.setBorder(BorderFactory.createLineBorder(Color.WHITE));
popupMenuDichVu.add(menuDichVu);
popupMenuDichVu.add(menuDichVu2);
popupMenuDichVu.add(menuDichVu3);

jLabel10.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        // Hiển thị popup menu tại vị trí chuột trên jLabel10
        popupMenuDichVu.show(jLabel10, e.getX(), e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        jLabel10.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
});
menuDichVu.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        DangKyInternetFrame internetFrame=new DangKyInternetFrame();
        dispose();
        internetFrame.setVisible(true);
        internetFrame.setLocationRelativeTo(null);
//        dispose();
    }
});
menuDichVu2.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        DangKyGiuXe xeFrame=new DangKyGiuXe();
        dispose();
        xeFrame.setVisible(true);
        xeFrame.setLocationRelativeTo(null);
        
    }
});
menuDichVu3.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        DangKyTheThao theThaoFrame=new DangKyTheThao();
        dispose();
        theThaoFrame.setVisible(true);
        theThaoFrame.setLocationRelativeTo(null);
        
    }
});
        JMenuItem menuSV = new JMenuItem("Thẻ KTX");
        menuSV.setBackground(menuBackground);
        menuSV.setForeground(textColor);
        menuSV.setFont(menuFont);
        menuSV.setPreferredSize(menuSize);

        JMenuItem menuSV2= new JMenuItem("Hợp Đồng");
        menuSV2.setBackground(menuBackground);
        menuSV2.setForeground(textColor);
        menuSV2.setFont(menuFont);
        menuSV2.setPreferredSize(menuSize);

        JMenuItem menuSV3 = new JMenuItem("Hóa Đơn");
        menuSV3.setBackground(menuBackground);
        menuSV3.setForeground(textColor);
        menuSV3.setFont(menuFont);
        menuSV3.setPreferredSize(menuSize);
        
        JPopupMenu popupMenuSV = new JPopupMenu();
        popupMenuSV.setBackground(menuBackground);
        popupMenuSV.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        popupMenuSV.add(menuSV);
        popupMenuSV.add(menuSV2);
        popupMenuSV.add(menuSV3);

jLabel4.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        popupMenuSV.show(jLabel4, e.getX(), e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        jLabel4.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
});
menuSV.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        TheKTXSV theFrame = null;
        try {
            theFrame = new TheKTXSV(Home.this.masv);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        theFrame.setVisible(true);
        theFrame.setLocationRelativeTo(null);
        theFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
});
menuSV2.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        HopDong hopdongFrame = null;
        try {
            hopdongFrame = new HopDong(Home.this.cccd);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        hopdongFrame.setVisible(true);
        hopdongFrame.setLocationRelativeTo(null);
        hopdongFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
});
menuSV3.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        CTHDSV hoadonFrame=null;
        try {
            hoadonFrame = new CTHDSV(Home.this.masv);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        hoadonFrame.setVisible(true);
        hoadonFrame.setLocationRelativeTo(null);
        hoadonFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
});
    }
    public Home(String cccd){
        this.cccd=cccd;
        initComponents();
        // Tạo popup menu Đăng kí phòng
Color menuBackground = new Color(255, 255, 255);  // tím nhạt
Color textColor = Color.BLACK;
        Font menuFont = new Font("Segoe UI", Font.PLAIN, 18);
        Dimension menuSize = new Dimension(150, 40);

        JMenuItem menuDangKiPhong = new JMenuItem("Đăng kí phòng");
menuDangKiPhong.setBackground(menuBackground);
menuDangKiPhong.setForeground(textColor);
menuDangKiPhong.setFont(menuFont);
menuDangKiPhong.setPreferredSize(menuSize);

        JPopupMenu popupMenuPhong = new JPopupMenu();
popupMenuPhong.setBackground(menuBackground);
popupMenuPhong.setBorder(BorderFactory.createLineBorder(Color.WHITE));
popupMenuPhong.add(menuDangKiPhong);

// Gắn sự kiện click chuột cho JLabel "Dịch Vụ" (jLabel10)
jLabel6.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        // Hiển thị popup menu tại vị trí chuột trên jLabel10
        popupMenuPhong.show(jLabel6, e.getX(), e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        jLabel6.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
});
    menuDangKiPhong.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        DangKiPhong dkFrame=new DangKiPhong(Home.this.cccd);
        dkFrame.setVisible(true);
        dkFrame.setLocationRelativeTo(null);
        dispose();
    }
});
        System.out.println("CCCD: "+ this.cccd);
    try (Connection conn = ConnectDB.ConnectionUtils.getMyConnectionOracle()) {
        String sql = "SELECT s.hoten " +
             "FROM sinhvien s " +
             "WHERE s.cccd = ?";

        
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1,this.cccd);
        ResultSet rs = stmt.executeQuery();
       
        if (rs.next()) {
            String name = rs.getString("hoten");
            String loiChao= "Chào mừng bạn "+name+" đến với trang KTX!";
            jLabel15.setText(loiChao);
        }

    } catch (SQLException | ClassNotFoundException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu: " + ex.getMessage());
    }
        JMenuItem menuDichVu = new JMenuItem("Internet");
menuDichVu.setBackground(menuBackground);
menuDichVu.setForeground(textColor);
menuDichVu.setFont(menuFont);
menuDichVu.setPreferredSize(menuSize);

JMenuItem menuDichVu2= new JMenuItem("Giữ xe");
menuDichVu2.setBackground(menuBackground);
menuDichVu2.setForeground(textColor);
menuDichVu2.setFont(menuFont);
menuDichVu2.setPreferredSize(menuSize);

JMenuItem menuDichVu3 = new JMenuItem("Thể thao");
menuDichVu3.setBackground(menuBackground);
menuDichVu3.setForeground(textColor);
menuDichVu3.setFont(menuFont);
menuDichVu3.setPreferredSize(menuSize);

JPopupMenu popupMenuDichVu = new JPopupMenu();
popupMenuDichVu.setBackground(menuBackground);
popupMenuDichVu.setBorder(BorderFactory.createLineBorder(Color.WHITE));
popupMenuDichVu.add(menuDichVu);
popupMenuDichVu.add(menuDichVu2);
popupMenuDichVu.add(menuDichVu3);

jLabel10.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        // Hiển thị popup menu tại vị trí chuột trên jLabel10
        popupMenuDichVu.show(jLabel10, e.getX(), e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        jLabel10.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
});
menuDichVu.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        DangKyInternetFrame internetFrame=new DangKyInternetFrame();
        dispose();
        internetFrame.setVisible(true);
        internetFrame.setLocationRelativeTo(null);
        internetFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
});
menuDichVu2.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        DangKyGiuXe xeFrame=new DangKyGiuXe();
        dispose();
        xeFrame.setVisible(true);
        xeFrame.setLocationRelativeTo(null);
        xeFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
});
menuDichVu3.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        DangKyTheThao theThaoFrame=new DangKyTheThao();
        dispose();
        theThaoFrame.setVisible(true);
        theThaoFrame.setLocationRelativeTo(null);
        theThaoFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
});

        JMenuItem menuSV = new JMenuItem("Thẻ KTX");
        menuSV.setBackground(menuBackground);
        menuSV.setForeground(textColor);
        menuSV.setFont(menuFont);
        menuSV.setPreferredSize(menuSize);

        JMenuItem menuSV2= new JMenuItem("Hợp Đồng");
        menuSV2.setBackground(menuBackground);
        menuSV2.setForeground(textColor);
        menuSV2.setFont(menuFont);
        menuSV2.setPreferredSize(menuSize);

        JMenuItem menuSV3 = new JMenuItem("Hóa Đơn");
        menuSV3.setBackground(menuBackground);
        menuSV3.setForeground(textColor);
        menuSV3.setFont(menuFont);
        menuSV3.setPreferredSize(menuSize);

        JPopupMenu popupMenuSV = new JPopupMenu();
        popupMenuSV.setBackground(menuBackground);
        popupMenuSV.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        popupMenuSV.add(menuSV);
        popupMenuSV.add(menuSV2);
        popupMenuSV.add(menuSV3);

jLabel4.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        popupMenuSV.show(jLabel4, e.getX(), e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        jLabel4.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
});
menuSV.addActionListener(new ActionListener() {
    String mssv1 = UserSession.getMssv();
    public void actionPerformed(ActionEvent e) {
        TheKTXSV theFrame = null;
        try {
            theFrame = new TheKTXSV(mssv1);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        theFrame.setVisible(true);
        theFrame.setLocationRelativeTo(null);
        theFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
});
menuSV2.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String cccd2 = UserSession.getCccd();
        HopDong hopdongFrame = null;
        try {
            hopdongFrame = new HopDong(cccd2);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        hopdongFrame.setVisible(true);
        hopdongFrame.setLocationRelativeTo(null);
        hopdongFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
});
menuSV3.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String mssv3=UserSession.getMssv();
        CTHDSV hoadonFrame=null;
        try {
            hoadonFrame = new CTHDSV(mssv3);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        hoadonFrame.setVisible(true);
        hoadonFrame.setLocationRelativeTo(null);
        hoadonFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
});
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        sidepane = new javax.swing.JPanel();
        btn_them = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_sinhvien = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_phong = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_trangchu = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_dichvu = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        calendarPanel1 = new com.github.lgooddatepicker.components.CalendarPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Picture = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sidepane.setBackground(new java.awt.Color(153, 204, 255));
        sidepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_them.setBackground(new java.awt.Color(255, 255, 255));
        btn_them.setPreferredSize(new java.awt.Dimension(285, 60));

        jLabel2.setText("Thêm");
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout btn_themLayout = new javax.swing.GroupLayout(btn_them);
        btn_them.setLayout(btn_themLayout);
        btn_themLayout.setHorizontalGroup(
            btn_themLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_themLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        btn_themLayout.setVerticalGroup(
            btn_themLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_themLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(btn_themLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_themLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_themLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(17, 17, 17))))
        );

        sidepane.add(btn_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 310, 60));

        btn_sinhvien.setBackground(new java.awt.Color(255, 255, 255));
        btn_sinhvien.setPreferredSize(new java.awt.Dimension(285, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Icons8-Windows-8-Users-Guest.24.png"))); // NOI18N

        jLabel4.setText("Sinh Viên");
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout btn_sinhvienLayout = new javax.swing.GroupLayout(btn_sinhvien);
        btn_sinhvien.setLayout(btn_sinhvienLayout);
        btn_sinhvienLayout.setHorizontalGroup(
            btn_sinhvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_sinhvienLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        btn_sinhvienLayout.setVerticalGroup(
            btn_sinhvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_sinhvienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(btn_sinhvienLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        sidepane.add(btn_sinhvien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 310, -1));

        btn_phong.setBackground(new java.awt.Color(255, 255, 255));
        btn_phong.setPreferredSize(new java.awt.Dimension(285, 60));

        jLabel6.setText("Phòng");
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Pictogrammers-Material-Bunk-bed.24.png"))); // NOI18N

        javax.swing.GroupLayout btn_phongLayout = new javax.swing.GroupLayout(btn_phong);
        btn_phong.setLayout(btn_phongLayout);
        btn_phongLayout.setHorizontalGroup(
            btn_phongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_phongLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        btn_phongLayout.setVerticalGroup(
            btn_phongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_phongLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(btn_phongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        sidepane.add(btn_phong, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 310, -1));

        btn_trangchu.setBackground(new java.awt.Color(255, 255, 255));
        btn_trangchu.setPreferredSize(new java.awt.Dimension(285, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Steve-Zondicons-Home.24.png"))); // NOI18N

        jLabel8.setText("Trang Chủ");
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout btn_trangchuLayout = new javax.swing.GroupLayout(btn_trangchu);
        btn_trangchu.setLayout(btn_trangchuLayout);
        btn_trangchuLayout.setHorizontalGroup(
            btn_trangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_trangchuLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        btn_trangchuLayout.setVerticalGroup(
            btn_trangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_trangchuLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(17, 17, 17))
            .addGroup(btn_trangchuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidepane.add(btn_trangchu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 310, 60));

        btn_dichvu.setBackground(new java.awt.Color(255, 255, 255));
        btn_dichvu.setPreferredSize(new java.awt.Dimension(285, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Custom-Icon-Design-Mono-General-2-Search.24.png"))); // NOI18N

        jLabel10.setText("Dịch Vụ");
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout btn_dichvuLayout = new javax.swing.GroupLayout(btn_dichvu);
        btn_dichvu.setLayout(btn_dichvuLayout);
        btn_dichvuLayout.setHorizontalGroup(
            btn_dichvuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_dichvuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        btn_dichvuLayout.setVerticalGroup(
            btn_dichvuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_dichvuLayout.createSequentialGroup()
                .addGroup(btn_dichvuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btn_dichvuLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addGroup(btn_dichvuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        sidepane.add(btn_dichvu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 310, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setText("4T Dormitory");
        sidepane.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        sidepane.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 290, 10));

        calendarPanel1.setBackground(new java.awt.Color(153, 204, 255));
        sidepane.add(calendarPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 220, 200));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Iconsmind-Outline-Hotel.24.png"))); // NOI18N
        sidepane.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 30, 30));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 126));

        jLabel15.setText("Introduction ...");
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel17.setText("Welcome to 4T Dormitory");
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Ionic-Ionicons-Log-out-outline.48.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(233, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(55, 55, 55))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(jLabel17)
                    .addContainerGap(106, Short.MAX_VALUE)))
        );

        Picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/hinhnen.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Picture, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Picture, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(sidepane, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1022, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidepane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 1274, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
       
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        Login loginframe=new Login();
        this.dispose();
        loginframe.setVisible(true);
        
        
    }//GEN-LAST:event_jLabel12MouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
                try {
            // Cài theme FlatLaf sáng
            UIManager.setLookAndFeel(new FlatLightLaf());
            UIManager.setLookAndFeel(new FlatLightLaf());
            UIManager.put("Button.arc", 10);
            UIManager.put("Component.arc", 10);
            UIManager.put("TextComponent.arc", 5);
        } catch (Exception ex) {
            System.err.println("Không thể cài FlatLaf");
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Picture;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btn_dichvu;
    private javax.swing.JPanel btn_phong;
    private javax.swing.JPanel btn_sinhvien;
    private javax.swing.JPanel btn_them;
    private javax.swing.JPanel btn_trangchu;
    private com.github.lgooddatepicker.components.CalendarPanel calendarPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel sidepane;
    // End of variables declaration//GEN-END:variables
}
