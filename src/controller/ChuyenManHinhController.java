package controller;

import bean.DanhMucBean;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JPanel;
import view.component.LabelGoogleIcon;
import view.main.BangDieuKhienJPanel;
import view.main.DangXuatJPanel;
import view.main.DatTiecJPanel;
import view.main.DoanhThuJPanel;
import view.main.KhachHangJPanel;
import view.main.NhanVienJPanel;
import view.main.TaiKhoanJPanel;
import view.main.ThucDonJPanel;

public class ChuyenManHinhController {

    private JPanel root;
    private String kindSelected = "";

    private List<DanhMucBean> listItem = null;

    public ChuyenManHinhController(JPanel jpnRoot) {
        this.root = jpnRoot;
    }

    public void setView(JPanel jpnItem, LabelGoogleIcon jlbItem) {
        kindSelected = "BangDieuKhien";
        jpnItem.setBackground(new Color(255, 51, 51));
        jlbItem.setBackground(new Color(255, 51, 51));

        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new BangDieuKhienJPanel());
        root.validate();
        root.repaint();
    }

    public void setEvent(List<DanhMucBean> listItem) {
        this.listItem = listItem;
        for (DanhMucBean item : listItem) {
            item.getJpn().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), (LabelGoogleIcon) item.getJlb()));
        }
        
    }

    class LabelEvent implements MouseListener {

        private JPanel node;

        private String kind;
        private JPanel jpnItem;
        private LabelGoogleIcon jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, LabelGoogleIcon jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "BangDieuKhien":
                    node = new BangDieuKhienJPanel();
                    break;
                case "KhachHang":
                    node = new KhachHangJPanel();
                    break;
                case "NhanVien":
                    node = new NhanVienJPanel();
                    break;
                case "ThucDon":
                    node = new ThucDonJPanel();
                    break;
                case "DatTiec":
                    node = new DatTiecJPanel();
                    break;
                case "DoanhThu":
                    node = new DoanhThuJPanel();
                    break;
                case "TaiKhoan":
                    node = new TaiKhoanJPanel();
                    break;
                case "DangXuat":
                    node = new DangXuatJPanel();
                    break;
                default:
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(new Color(46,11,47));
            jlbItem.setBackground(new Color(46,11,47));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if (!kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(46,11,47));
                jlbItem.setBackground(new Color(46,11,47));
            }
//            jpnItem.setBackground(new Color(96, 100, 191));
//            jlbItem.setBackground(new Color(96, 100, 191));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(102,102,102));
                jlbItem.setBackground(new Color(102,102,102));
            }
        }

    }

    private void setChangeBackground(String kind) {
        for (DanhMucBean item : listItem) {
            if (item.getKind().equalsIgnoreCase(kind)) {
                item.getJpn().setBackground(new Color(255, 51, 51));
                item.getJlb().setBackground(new Color(255, 51, 51));
            } else {
                item.getJpn().setBackground(new Color(102,102,102));
                item.getJlb().setBackground(new Color(102,102,102));
            }
        }
    }
}
