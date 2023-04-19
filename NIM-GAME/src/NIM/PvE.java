/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NIM;

import jaco.mp3.player.MP3Player;
import java.awt.Color;
import java.io.File;
import static java.lang.Integer.parseInt;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

/**
 *
 * @author HP
 */
public class PvE extends javax.swing.JFrame {

    /**
     * Creates new form PvP
     */
    public PvE() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        Random();
        
        dongXu();
        
        NIMSUM();
        
        //mp3player.play();
        
        //doiLuot();
    }
    
    
    // Am thanh nhac nen
    public static final String SONG = "D:\\6Loc\\Tu_hoc\\CT239(01)_NLCSN\\Project\\Sounds\\Gunny.mp3";
    MP3Player mp3player = new MP3Player(new File(SONG));
    // Am thanh chon dong xu
    public static final String ChonDong = "D:\\6Loc\\Tu_hoc\\CT239(01)_NLCSN\\Project\\Sounds\\CARTOON BOING.mp3";
    MP3Player chonDong = new MP3Player(new File(ChonDong));
    // Am thanh Lay xu
    public static final String LayXu = "D:\\6Loc\\Tu_hoc\\CT239(01)_NLCSN\\Project\\Sounds\\Gold Fall.mp3";
    MP3Player layXu = new MP3Player(new File(LayXu));
    // Am thanh nguoi choi thua
    public static final String Thua = "D:\\6Loc\\Tu_hoc\\CT239(01)_NLCSN\\Project\\Sounds\\FAIL - WHA WHA VERSION.mp3";
    MP3Player thua = new MP3Player(new File(Thua));
    // Am thanh nguoi choi thang
    public static final String Thang = "D:\\6Loc\\Tu_hoc\\CT239(01)_NLCSN\\Project\\Sounds\\Yeah.mp3";
    MP3Player thang = new MP3Player(new File(Thang));
    // Am thanh nhap so khong hop le
    public static final String KHL = "D:\\6Loc\\Tu_hoc\\CT239(01)_NLCSN\\Project\\Sounds\\Wrong.mp3";
    MP3Player khl = new MP3Player(new File(KHL));
    
    //Khoi tao so luong xu tung dong
    int d1, d2, d3, d4, d5, d6;
    // NIMSUM
    int nimsum = 0;
    //Bien dung de doi luot nguoi choi
    int c = 0;
    int n = 0;
    
    public void Random(){
        Random random = new Random();
        int x = random.nextInt(10);
        for(int i = 1; i <= 6; i++){
            x = random.nextInt(6);
            if(i == 1)
                d1 = x;
            if(i == 2)
                d2 = x;
            if(i == 3)
                d3 = x;
            if(i == 4)
                d4 = x;
            if(i == 5)
                d5 = x;
            if(i == 6)
                d6 = x;
        }
    }
    
    public void NIMSUM(){
         
	int n1=d1, n2=d2, n3=d3, n4=d4, n5=d5, n6=d6; 
	int i1, i2, i3, i4, i5, i6; 
        
        // Mang 1 chieu
        int a1[] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int a2[] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int a3[] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int a4[] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int a5[] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int a6[] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
               
        // Chuyen thap phan sang nhi phan
	for(i1 = 0; n1 > 0; i1++)  {  
		a1[i1] = n1%2;  
		n1 = n1/2;  
	}
	for(i2 = 0; n2 > 0; i2++)  {  
		a2[i2] = n2%2;  
		n2 = n2/2;  
	}
	for(i3 = 0; n3 > 0; i3++)  {  
		a3[i3] = n3%2;  
		n3 = n3/2;  
	}
	for(i4 = 0; n4 > 0; i4++)  {  
		a4[i4] = n4%2;  
		n4 = n4/2;  
	}
	for(i5 = 0; n5 > 0; i5++)  {  
		a5[i5] = n5%2;  
		n5 = n5/2;  
	}
	for(i6 = 0; n6 > 0; i6++)  {  
		a6[i6] = n6%2;  
		n6 = n6/2;  
	}
        
        // Mang 2 chieu
        int arr[][] = { {a1[9], a1[8], a1[7], a1[6], a1[5], a1[4], a1[3], a1[2], a1[1], a1[0]},
                        {a2[9], a2[8], a2[7], a2[6], a2[5], a2[4], a2[3], a2[2], a2[1], a2[0]},
                        {a3[9], a3[8], a3[7], a3[6], a3[5], a3[4], a3[3], a3[2], a3[1], a3[0]},
                        {a4[9], a4[8], a4[7], a4[6], a4[5], a4[4], a4[3], a4[2], a4[1], a4[0]},
                        {a5[9], a5[8], a5[7], a5[6], a5[5], a5[4], a5[3], a5[2], a5[1], a5[0]},
                        {a6[9], a6[8], a6[7], a6[6], a6[5], a6[4], a6[3], a6[2], a6[1], a6[0]} };
        
	// Tinh NIMSUM Mang 2 chieu
	//XOR Cot 0
	int col0 = 0;
	for(int i = 0; i < 6; i++){
		col0 = col0 + arr[i][9];
	}
	if(col0 % 2 == 0){
		col0 = 0;
	}else{
		col0 = 1;
	}
	
	//XOR Cot 1
	int col1 = 0;
	for(int i = 0; i < 6; i++){
		col1 = col1 + arr[i][8];
	}
	if(col1 % 2 == 0){
		col1 = 0;
	}else{
		col1 = 1;
	}
	
	//XOR Cot 2
	int col2 = 0;
	for(int i = 0; i < 6; i++){
		col2 = col2 + arr[i][7];
	}
	if(col2 % 2 == 0){
		col2 = 0;
	}else{
		col2 = 1;
	}
	
	//XOR Cot 3
	int col3 = 0;
	for(int i = 0; i < 6; i++){
		col3 = col3 + arr[i][6];
	}
	if(col3 % 2 == 0){
		col3 = 0;
	}else{
		col3 = 1;
	}
	
	//XOR Cot 4
	int col4 = 0;
	for(int i = 0; i < 6; i++){
		col4 = col4 + arr[i][5];
	}
	if(col4 % 2 == 0){
		col4 = 0;
	}else{
		col4 = 1;
	}
	
	//XOR Cot 5
	int col5 = 0;
	for(int i = 0; i < 6; i++){
		col5 = col5 + arr[i][4];
	}
	if(col5 % 2 == 0){
		col5 = 0;
	}else{
		col5 = 1;
	}
	
	//XOR Cot 6
	int col6 = 0;
	for(int i = 0; i < 6; i++){
		col6 = col6 + arr[i][3];
	}
	if(col6 % 2 == 0){
		col6 = 0;
	}else{
		col6 = 1;
	}
	
	//XOR Cot 7
	int col7 = 0;
	for(int i = 0; i < 6; i++){
		col7 = col7 + arr[i][2];
	}
	if(col7 % 2 == 0){
		col7 = 0;
	}else{
		col7 = 1;
	}
	
	//XOR Cot 8
	int col8 = 0;
	for(int i = 0; i < 6; i++){
		col8 = col8 + arr[i][1];
	}
	if(col8 % 2 == 0){
		col8 = 0;
	}else{
		col8 = 1;
	}
	
	//XOR Cot 9
	int col9 = 0;
	for(int i = 0; i < 6; i++){
		col9 = col9 + arr[i][0];
	}
	if(col9 % 2 == 0){
		col9 = 0;
	}else{
		col9 = 1;
	}
	
        // NUMSIM
	nimsum = col0 + col1 + col2 + col3 + col4 + col5 + col6 + col7 + col8 + col9;
	if(nimsum % 2 == 0){
            nimsum = 0;
	}else{
            nimsum = 1;
	}

        if(nimsum == 0){
            PnlDetail2.setBackground(Color.green);
            PnlDetail1.setBackground(Color.white);
        }
        if(nimsum == 1){
            PnlDetail1.setBackground(Color.green);
            PnlDetail2.setBackground(Color.white);
        }
            
    }
       
    public void PC(){
        
        // Gan so luong xu tung dong
        int i1 = d1, i2 = d2, i3 = d3, i4 = d4, i5 = d5, i6 = d6;
        // Tao mang chua so luong tung dong
        int arr[] = new int[] { i1, i2, i3, i4, i5, i6 };
        
        // Tao bien dem, sl xu hien tai, sl xu lay ra
        int n = 0;
        int in = 0;
        int out = 0;
        
        // Tao bien sl xu lon nhat, thu tu dong sl xu lon nhat
        int big = 0;
        int ig = 0;
        
        // Tao bien so dong 1 xu, so dong >1 xu
        int one = 0;
        int plus = 0;
        
        // Cac bien truong hop
        int op = 0; // Truong hop 1 dong > 1xu, cac dong khac 1 xu . 1
        int only = 0; // Truong hop chi con 1 dong . 2
        int same = 0; // Truong hop cac dong co sl xu bang nhau . 3
        int ns = 1; // Truong hop danh theo NIMSUM = 0. 4
        
        //Tim dong co nhieu xu nhat
        int arr_max[] = {i1, i2, i3, i4, i5, i6};
        int max = 0;
        for(int i = 0; i < 6; i++){
            if(arr_max[i] == 0){
                continue;
            }else{
                if(arr_max[i] > max)
                    max = arr_max[i];
                    big = max;
                    if(max > arr_max[i]){
			ig = ig;	
                    }else{
			ig = i+1;
                    }
            }
        }
        
        // Kiem tra so dong 1 xu
        for(int i = 0; i < 6; i++){
            if(arr[i] == 1)
                one++;
        }
               
        // Kiem tra so dong co nhieu hon 1 xu
        for(int i = 0; i < 6; i++){
            if(arr[i] > 1)
                plus++;
        }
        
        // Danh dau TH1
        if( plus == 1 && one % 2 == 0 || plus == 1 && one % 2 != 0 ){
            op = 1; 
        }
        
        // Danh dau TH2
        if( plus == 0 && one % 2 == 0 ){
            same = 1;
        }
        
        // Truong hop 1
        if( op == 1 ){
            if( one % 2 == 0){
                out = big - 1;
                big = big - out;
                if(ig == 1){
                    d1 = big;
                    n = 1;
                }
                if(ig == 2){
                    d2 = big;
                    n = 2;
                }
                if(ig == 3){
                    d3 = big;
                    n = 3;
                }
                if(ig == 4){
                    d4 = big;
                    n = 4;
                }
                if(ig == 5){
                    d5 = big;
                    n = 5;
                }
                if(ig == 6){
                    d6 = big;
                    n = 6;
                }
            }else{
                out = big;
                big = big - out;
                if(ig == 1){
                    d1 = big;
                    n = 1;
                }
                if(ig == 2){
                    d2 = big;
                    n = 2;
                }
                if(ig == 3){
                    d3 = big;
                    n = 3;
                }
                if(ig == 4){
                    d4 = big;
                    n = 4;
                }
                if(ig == 5){
                    d5 = big;
                    n = 5;
                }
                if(ig == 6){
                    d6 = big;
                    n = 6;
                }
            }
        only = 1; // 2
        }else
        
        // Truong hop 2
        if(only == 1){
            if(i1 > 1 && i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0){
                out = i1-1;
                i1 = i1 - out;
                d1 = i1;
                n = 1;
            }else
            if(i1 == 0 && i2 > 1 && i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0){
                out = i2-1;
                i2 = i2 - out;
                d2 = i2;
                n = 2;
            }else
            if(i1 == 0 && i2 == 0 && i3 > 1 && i4 == 0 && i5 == 0 && i6 == 0){
                out = i3-1;
                i3 = i3 - out;
                d3 = i3;
                n = 3;
            }else
            if(i1 == 0 && i2 == 0 && i3 == 0 && i4 > 1 && i5 == 0 && i6 == 0){
                out = i4-1;
                i4 = i4 - out;
                d4 = i4;
                n = 4;
            }else
            if(i1 == 0 && i2 == 0 && i3 == 0 && i4 == 0 && i5 > 1 && i6 == 0){
                out = i5-1;
                i5 = i5 - out;
                d5 = i5;
                n = 5;
            }else
            if(i1 == 0 && i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0 && i6 > 1){
                out = i6-1;
                i6 = i6 - out;
                d6 = i6;
                n = 6;
            }
        }else
            
        // Truong hop 3
        if(same == 1){
            out = big;
            big = big - out;
            if(ig == 1){
                d1 = big;
                n = 1;
            }
            if(ig == 2){
                d2 = big;
                n = 2;
            }
            if(ig == 3){
                d3 = big;
                n = 3;
            }
            if(ig == 4){
                d4 = big;
                n = 4;
            }
            if(ig == 5){
                d5 = big;
                n = 5;
            }
            if(ig == 6){
                d6 = big;
                n = 6;
            }
        }else   
        
        // Truong hop 4
        if(ns == 1){ 
            int c = 0;
            for( int i = 1; i <= 6; i++ ){
                    if( i == 1 ){
                        in = i1;
                        n = 1;
                        for(int j = 1; j <= in; j++){
                            out = j;
                            in = in - out;
                            d1 = in;
                            NIMSUM();
                            if(nimsum == 0){
                                c = 1;
                                break;
                            }else{
                                in = in + out;
                                d1 = in;
                                out = 0;
                                continue;
                            }
                        }
                        //break;
                    }else
                    if( i == 2 ){
                        in = i2;
                        n = 2;
                        for(int j = 1; j <= in; j++){
                            out = j;
                            in = in - out;
                            d2 = in;
                            NIMSUM();
                            if(nimsum == 0){
                                c = 1;
                                break;
                            }else{
                                in = in + out;
                                d2 = in;
                                out = 0;
                                continue;
                            }
                        }
                        //break;
                    }else
                    if( i == 3 ){
                        in = i3;
                        n = 3;
                        for(int j = 1; j <= in; j++){
                            out = j;
                            in = in - out;
                            d3 = in;
                            NIMSUM();
                            if(nimsum == 0){
                                c = 1;
                                break;
                            }else{
                                in = in + out;
                                d3 = in;
                                out = 0;
                                continue;
                            }
                        }
                        //break;
                    }else
                    if( i == 4 ){
                        in = i4;
                        n = 4;
                        for(int j = 1; j <= in; j++){
                            out = j;
                            in = in - out;
                            d4 = in;
                            NIMSUM();
                            if(nimsum == 0){
                                c = 1;
                                break;
                            }else{
                                in = in + out;
                                d4 = in;
                                out = 0;
                                continue;
                            }
                        }
                        //break;
                    }else
                    if( i == 5 ){
                        in = i5;
                        n = 5;
                        for(int j = 1; j <= in; j++){
                            out = j;
                            in = in - out;
                            d5 = in;
                            NIMSUM();
                            if(nimsum == 0){
                                c = 1;
                                break;
                            }else{
                                in = in + out;
                                d5 = in;
                                out = 0;
                                continue;
                            }
                        }
                        //break;
                    }else
                    if( i == 6 ){
                        in = i6;
                        n = 6;
                        for(int j = 1; j <= in; j++){
                            out = j;
                            in = in - out;
                            d6 = in;
                            NIMSUM();
                            if(nimsum == 0){
                                c = 1;
                                break;
                            }else{
                                in = in + out;
                                d6 = in;
                                out = 0;
                                continue;
                            }
                        }
                        //break;
                    }
                    
            if(c == 1)
                break;
            }
        }
                                                                                 
        //Hien thi xu ra mang hinh
        dongXu();
        
        //Hien thi chi tiet lay xu
        Detail2.setText(" Lấy " + out + " xu từ đống số " + n); 
        
        //NIMSUM
        NIMSUM();
               
        //Kiem tra trang thai tro choi
        if(d1<=0 && d2<=0 && d3<=0 && d4<=0 && d5<=0 && d6<=0){
            thang.play();
            JOptionPane.showMessageDialog(rootPane, "Trò chơi kết thúc! \n Chúc mừng bạn đã chiến thắng! ");
            mp3player.stop();
            this.setVisible(false);
        }
        
    }
    
    public void dongXu(){
        
        //Kiem tra so luong xu tung dong de hien thi
        if(d1 <= 0){
            Loc1.setBackground(Color.white);
            gold1.setVisible(false);
            xu1.setVisible(false);
        }
        if(d2 <= 0){
            Loc2.setBackground(Color.white);
            gold2.setVisible(false);
            xu2.setVisible(false);
        }
        if(d3 <= 0){
            Loc3.setBackground(Color.white);
            gold3.setVisible(false);
            xu3.setVisible(false);
        }
        if(d4 <= 0){
            Loc4.setBackground(Color.white);
            gold4.setVisible(false);
            xu4.setVisible(false);
        }
        if(d5 <= 0){
            Loc5.setBackground(Color.white);
            gold5.setVisible(false);
            xu5.setVisible(false);
        }
        if(d6 <= 0){
            Loc6.setBackground(Color.white);
            gold6.setVisible(false);
            xu6.setVisible(false);
        }
        
        //Hien thi so xu
        xu1.setText("" + d1);
        xu2.setText("" + d2);
        xu3.setText("" + d3);
        xu4.setText("" + d4);
        xu5.setText("" + d5);
        xu6.setText("" + d6);
        
        Detail1.setText("");
        Detail2.setText("");
    }
    
    public void doiLuot(){
        //Doi luot nguoi choi   
            P1.setBackground(Color.yellow);        
            //P2.setBackground(Color.yellow);                 
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Loc2 = new javax.swing.JPanel();
        gold2 = new javax.swing.JLabel();
        xu2 = new javax.swing.JLabel();
        Loc3 = new javax.swing.JPanel();
        gold3 = new javax.swing.JLabel();
        xu3 = new javax.swing.JLabel();
        Loc4 = new javax.swing.JPanel();
        gold4 = new javax.swing.JLabel();
        xu4 = new javax.swing.JLabel();
        Loc5 = new javax.swing.JPanel();
        gold5 = new javax.swing.JLabel();
        xu5 = new javax.swing.JLabel();
        Loc6 = new javax.swing.JPanel();
        gold6 = new javax.swing.JLabel();
        xu6 = new javax.swing.JLabel();
        Loc1 = new javax.swing.JPanel();
        gold1 = new javax.swing.JLabel();
        xu1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        btnTakeout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Loc = new javax.swing.JTextField();
        Num = new javax.swing.JTextField();
        Num_out = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        P1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        PnlDetail1 = new javax.swing.JPanel();
        Detail1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        P2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PnlDetail2 = new javax.swing.JPanel();
        Detail2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trò chơi NIM");
        setName("frame1\n"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setEnabled(false);
        jPanel3.setFocusable(false);
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setVerifyInputWhenFocusTarget(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setEnabled(false);
        jPanel4.setFocusable(false);
        jPanel4.setRequestFocusEnabled(false);
        jPanel4.setVerifyInputWhenFocusTarget(false);

        Loc2.setBackground(new java.awt.Color(255, 255, 255));

        gold2.setIcon(new javax.swing.ImageIcon("D:\\B1906515\\22_23\\HK1\\CT239(01)_NLCSN\\Project\\Image\\gold.png")); // NOI18N
        gold2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gold2MouseClicked(evt);
            }
        });

        xu2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        xu2.setText("?");

        javax.swing.GroupLayout Loc2Layout = new javax.swing.GroupLayout(Loc2);
        Loc2.setLayout(Loc2Layout);
        Loc2Layout.setHorizontalGroup(
            Loc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Loc2Layout.createSequentialGroup()
                .addComponent(gold2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Loc2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(xu2)
                .addContainerGap())
        );
        Loc2Layout.setVerticalGroup(
            Loc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Loc2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gold2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xu2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Loc3.setBackground(new java.awt.Color(255, 255, 255));

        gold3.setIcon(new javax.swing.ImageIcon("D:\\B1906515\\22_23\\HK1\\CT239(01)_NLCSN\\Project\\Image\\gold.png")); // NOI18N
        gold3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gold3MouseClicked(evt);
            }
        });

        xu3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        xu3.setText("?");

        javax.swing.GroupLayout Loc3Layout = new javax.swing.GroupLayout(Loc3);
        Loc3.setLayout(Loc3Layout);
        Loc3Layout.setHorizontalGroup(
            Loc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Loc3Layout.createSequentialGroup()
                .addComponent(gold3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Loc3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(xu3)
                .addContainerGap())
        );
        Loc3Layout.setVerticalGroup(
            Loc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Loc3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gold3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(xu3)
                .addContainerGap())
        );

        Loc4.setBackground(new java.awt.Color(255, 255, 255));

        gold4.setIcon(new javax.swing.ImageIcon("D:\\B1906515\\22_23\\HK1\\CT239(01)_NLCSN\\Project\\Image\\gold.png")); // NOI18N
        gold4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gold4MouseClicked(evt);
            }
        });

        xu4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        xu4.setText("?");

        javax.swing.GroupLayout Loc4Layout = new javax.swing.GroupLayout(Loc4);
        Loc4.setLayout(Loc4Layout);
        Loc4Layout.setHorizontalGroup(
            Loc4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Loc4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(gold4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Loc4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(xu4)
                .addContainerGap())
        );
        Loc4Layout.setVerticalGroup(
            Loc4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Loc4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gold4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xu4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Loc5.setBackground(new java.awt.Color(255, 255, 255));

        gold5.setIcon(new javax.swing.ImageIcon("D:\\B1906515\\22_23\\HK1\\CT239(01)_NLCSN\\Project\\Image\\gold.png")); // NOI18N
        gold5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gold5MouseClicked(evt);
            }
        });

        xu5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        xu5.setText("?");

        javax.swing.GroupLayout Loc5Layout = new javax.swing.GroupLayout(Loc5);
        Loc5.setLayout(Loc5Layout);
        Loc5Layout.setHorizontalGroup(
            Loc5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Loc5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(gold5))
            .addGroup(Loc5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(xu5)
                .addContainerGap())
        );
        Loc5Layout.setVerticalGroup(
            Loc5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Loc5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gold5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xu5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Loc6.setBackground(new java.awt.Color(255, 255, 255));

        gold6.setIcon(new javax.swing.ImageIcon("D:\\B1906515\\22_23\\HK1\\CT239(01)_NLCSN\\Project\\Image\\gold.png")); // NOI18N
        gold6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gold6MouseClicked(evt);
            }
        });

        xu6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        xu6.setText("?");

        javax.swing.GroupLayout Loc6Layout = new javax.swing.GroupLayout(Loc6);
        Loc6.setLayout(Loc6Layout);
        Loc6Layout.setHorizontalGroup(
            Loc6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Loc6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(gold6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Loc6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xu6)
                .addGap(42, 42, 42))
        );
        Loc6Layout.setVerticalGroup(
            Loc6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Loc6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gold6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xu6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Loc1.setBackground(new java.awt.Color(255, 255, 255));

        gold1.setIcon(new javax.swing.ImageIcon("D:\\B1906515\\22_23\\HK1\\CT239(01)_NLCSN\\Project\\Image\\gold.png")); // NOI18N
        gold1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gold1MouseClicked(evt);
            }
        });

        xu1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        xu1.setText("?");

        javax.swing.GroupLayout Loc1Layout = new javax.swing.GroupLayout(Loc1);
        Loc1.setLayout(Loc1Layout);
        Loc1Layout.setHorizontalGroup(
            Loc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Loc1Layout.createSequentialGroup()
                .addComponent(gold1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Loc1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(xu1)
                .addContainerGap())
        );
        Loc1Layout.setVerticalGroup(
            Loc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Loc1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gold1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xu1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 397, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Loc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Loc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Loc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Loc5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Loc6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Loc3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Loc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Loc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Loc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Loc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Loc6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Loc5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnTakeout.setBackground(new java.awt.Color(255, 255, 255));
        btnTakeout.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnTakeout.setText("Lấy ra");
        btnTakeout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTakeoutActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Số Xu:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Đống:");

        Loc.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Loc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocActionPerformed(evt);
            }
        });

        Num.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        Num_out.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Loc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Num, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnTakeout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Num_out, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Loc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Num, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTakeout)
                    .addComponent(Num_out, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        jPanel5.setBackground(new java.awt.Color(255, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Chế Độ : Người Vs Máy");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnBack.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBack.setText("Menu");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        P1.setBackground(new java.awt.Color(255, 255, 255));
        P1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\B1906515\\22_23\\HK1\\CT239(01)_NLCSN\\Project\\Image\\Black.png")); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel12.setText("Người Chơi 1");

        javax.swing.GroupLayout P1Layout = new javax.swing.GroupLayout(P1);
        P1.setLayout(P1Layout);
        P1Layout.setHorizontalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        P1Layout.setVerticalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        PnlDetail1.setBackground(new java.awt.Color(255, 255, 255));
        PnlDetail1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Detail1.setBackground(new java.awt.Color(255, 255, 255));
        Detail1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        Detail1.setText(" Lấy ? xu từ đống số ?");

        javax.swing.GroupLayout PnlDetail1Layout = new javax.swing.GroupLayout(PnlDetail1);
        PnlDetail1.setLayout(PnlDetail1Layout);
        PnlDetail1Layout.setHorizontalGroup(
            PnlDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Detail1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        PnlDetail1Layout.setVerticalGroup(
            PnlDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlDetail1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Detail1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PnlDetail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(btnBack)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlDetail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnBack))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        P2.setBackground(new java.awt.Color(255, 255, 255));
        P2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\B1906515\\22_23\\HK1\\CT239(01)_NLCSN\\Project\\Image\\Robot.png")); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel11.setText("PC");

        javax.swing.GroupLayout P2Layout = new javax.swing.GroupLayout(P2);
        P2.setLayout(P2Layout);
        P2Layout.setHorizontalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        P2Layout.setVerticalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        PnlDetail2.setBackground(new java.awt.Color(255, 255, 255));
        PnlDetail2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Detail2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        Detail2.setText(" Lấy ? xu từ đống số ?");

        javax.swing.GroupLayout PnlDetail2Layout = new javax.swing.GroupLayout(PnlDetail2);
        PnlDetail2.setLayout(PnlDetail2Layout);
        PnlDetail2Layout.setHorizontalGroup(
            PnlDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Detail2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        PnlDetail2Layout.setVerticalGroup(
            PnlDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlDetail2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Detail2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(P2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PnlDetail2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlDetail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        //Thoat khoi che do PvP    
        this.setVisible(false);
        mp3player.stop();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnTakeoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTakeoutActionPerformed
       
        //So thu tu dong xu
        int mark = (int) Double.parseDouble(Loc.getText());
        int same = mark;
        
        //Lay 2 gia tri (so xu) hien tai va bi lay ra
        int in = (int) Double.parseDouble(Num.getText());
        int out = (int) Double.parseDouble(Num_out.getText());
        
        //Lay so xu hien tai tru so xu lay ra
        // Kiem tra out < in
        if(out > in){
            khl.play();
            JOptionPane.showMessageDialog(rootPane, " Không được nhập số xu lấy ra lớn hơn số xu hiện tại của đống! \n"
                        + "Và không được nhập dạng kí tự! \nVui lòng nhập lại!");
            
                Loc1.setBackground(Color.white);
                Loc2.setBackground(Color.white);
                Loc3.setBackground(Color.white);
                Loc4.setBackground(Color.white);
                Loc5.setBackground(Color.white);
                Loc6.setBackground(Color.white);
                Num_out.setText("");
                               
                return;
        }else 
            // Kienm tra out la so nguyen
            if(out != 1 && out != 2 && out != 3 && out != 4 && out != 5 && out != 6 && out != 7 && out != 8 && out != 9 && out != 10 
            && out != 11 && out != 12 && out != 13 && out != 14 && out != 15 && out != 16 && out != 17 && out != 18 && out != 19 ){
                khl.play();
                JOptionPane.showMessageDialog(rootPane, " Không được nhập số xu lấy ra lớn hơn số xu hiện tại của đống! \n"
                        + "Và không được nhập dạng kí tự! \nVui lòng nhập lại!");
            
                Loc1.setBackground(Color.white);
                Loc2.setBackground(Color.white);
                Loc3.setBackground(Color.white);
                Loc4.setBackground(Color.white);
                Loc5.setBackground(Color.white);
                Loc6.setBackground(Color.white);
                Num_out.setText("");
                
                return;
        }else{
            in = in - out;
        }
        //Kiem tra mark cua tung dong xu de hien thi so xu con lai sau khi lay ra
        if(same == 1){
            d1 = in;    
        } else
        if(same == 2){
            d2 = in;
        } else
        if(same == 3){
            d3 = in;
        } else
        if(same == 4){
            d4 = in;                
        } else
        if(same == 5){
            d5 = in;                
        } else
        if(same == 6){
            d6 = in;
        }
        
        //Xoa trang so thu tu dong xu, so xu hien tai va so xu lay ra sau khi lay xu    
        Loc.setText("");
        Num.setText("");
        Num_out.setText("");
                    
        //Cai dat mau nen cua Panel mau trang
        Loc1.setBackground(Color.white);
        Loc2.setBackground(Color.white);
        Loc3.setBackground(Color.white);
        Loc4.setBackground(Color.white);
        Loc5.setBackground(Color.white);
        Loc6.setBackground(Color.white);      
        
        //Kiem tra de hien thi lai dong xu va so luong tung dong
        dongXu();
        
        //NIMSUM
        NIMSUM();
        
        // Am thanh lay xu
        layXu.play();
                              
        //Kiem tra trang thai tro choi
        if(d1<=0 && d2<=0 && d3<=0 && d4<=0 && d5<=0 && d6<=0){
            thua.play();
            JOptionPane.showMessageDialog(rootPane, "Trò chơi kết thúc! \n Bạn đã thua \n Chúc bạn may mắn lần sau! ");
            mp3player.stop();
            this.setVisible(false);
        }else{
            //PC
            PC();
        }
        
        //Hien thi chi lay xu
        Detail1.setText(" Lấy " + out + " xu từ đống số " + mark);
        
    }//GEN-LAST:event_btnTakeoutActionPerformed

    private void gold1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gold1MouseClicked

        //Hien thi background mau do khi nhap vao dong xu 1 
        Loc1.setBackground(Color.red);
        Loc2.setBackground(Color.white);
        Loc3.setBackground(Color.white);
        Loc4.setBackground(Color.white);
        Loc5.setBackground(Color.white);
        Loc6.setBackground(Color.white);
        
        Num.setText("" + d1);
        Loc.setText("1");
        chonDong.play();
    }//GEN-LAST:event_gold1MouseClicked

    private void gold6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gold6MouseClicked

        //Hien thi background mau do khi nhap vao dong xu 6
        Loc1.setBackground(Color.white);
        Loc2.setBackground(Color.white);
        Loc3.setBackground(Color.white);
        Loc4.setBackground(Color.white);
        Loc5.setBackground(Color.white);
        Loc6.setBackground(Color.red);
        
        Num.setText("" + d6);
        Loc.setText("6");
        chonDong.play();
    }//GEN-LAST:event_gold6MouseClicked

    private void gold5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gold5MouseClicked

        //Hien thi background mau do khi nhap vao dong xu 5
        Loc1.setBackground(Color.white);
        Loc2.setBackground(Color.white);
        Loc3.setBackground(Color.white);
        Loc4.setBackground(Color.white);
        Loc5.setBackground(Color.red);
        Loc6.setBackground(Color.white);
        
        Num.setText("" + d5);
        Loc.setText("5");
        chonDong.play();
    }//GEN-LAST:event_gold5MouseClicked

    private void gold4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gold4MouseClicked

        //Hien thi background mau do khi nhap vao dong xu 4
        Loc1.setBackground(Color.white);
        Loc2.setBackground(Color.white);
        Loc3.setBackground(Color.white);
        Loc4.setBackground(Color.red);
        Loc5.setBackground(Color.white);
        Loc6.setBackground(Color.white);
        
        Num.setText("" + d4);
        Loc.setText("4");
        chonDong.play();
    }//GEN-LAST:event_gold4MouseClicked

    private void gold3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gold3MouseClicked
        
        //Hien thi background mau do khi nhap vao dong xu 3
        Loc1.setBackground(Color.white);
        Loc2.setBackground(Color.white);
        Loc3.setBackground(Color.red);
        Loc4.setBackground(Color.white);
        Loc5.setBackground(Color.white);
        Loc6.setBackground(Color.white);
        
        Num.setText("" + d3);
        Loc.setText("3");
        chonDong.play();
    }//GEN-LAST:event_gold3MouseClicked

    private void gold2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gold2MouseClicked
        
        //Hien thi background mau do khi nhap vao dong xu 2
        Loc1.setBackground(Color.white);
        Loc2.setBackground(Color.red);
        Loc3.setBackground(Color.white);
        Loc4.setBackground(Color.white);
        Loc5.setBackground(Color.white);
        Loc6.setBackground(Color.white);
        
        Num.setText("" + d2);
        Loc.setText("2");
        chonDong.play();
    }//GEN-LAST:event_gold2MouseClicked

    private void LocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocActionPerformed

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
            java.util.logging.Logger.getLogger(PvE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PvE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PvE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PvE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PvE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Detail1;
    private javax.swing.JLabel Detail2;
    private javax.swing.JTextField Loc;
    private javax.swing.JPanel Loc1;
    private javax.swing.JPanel Loc2;
    private javax.swing.JPanel Loc3;
    private javax.swing.JPanel Loc4;
    private javax.swing.JPanel Loc5;
    private javax.swing.JPanel Loc6;
    private javax.swing.JTextField Num;
    private javax.swing.JTextField Num_out;
    private javax.swing.JPanel P1;
    private javax.swing.JPanel P2;
    private javax.swing.JPanel PnlDetail1;
    private javax.swing.JPanel PnlDetail2;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnTakeout;
    private javax.swing.JLabel gold1;
    private javax.swing.JLabel gold2;
    private javax.swing.JLabel gold3;
    private javax.swing.JLabel gold4;
    private javax.swing.JLabel gold5;
    private javax.swing.JLabel gold6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel xu1;
    private javax.swing.JLabel xu2;
    private javax.swing.JLabel xu3;
    private javax.swing.JLabel xu4;
    private javax.swing.JLabel xu5;
    private javax.swing.JLabel xu6;
    // End of variables declaration//GEN-END:variables
}
