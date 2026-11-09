import java.awt.*;
import java.awt.event.*;

class MainWindow extends Frame implements ActionListener{

    Button b1; // "New Game" button
    Button b[] = new Button[9]; // Game buttons

    int k=0, x=40, y=60;
    int a=0; //O and X
    int z=0, z1=0, z2=0, z3=0, z4=0, z5=0, z6=0, z7=0, z8=0;
    int l = 60;
    
    MainWindow() {
        setLayout(null);
        setVisible(true);
        setSize(800,400);
        setLocation(400,100);
        setBackground(Color.pink);
        setForeground(Color.white);

        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <=3; j++) {

                b[k] = new Button();
                b[k].setSize(100,100);
                b[k].setLocation(x,y);
                b[k].setFont(new Font("", Font.BOLD,40));

                add(b[k]);

                b[k].addActionListener(this);
                b[k].setBackground(new Color(173,216,230)); // light blue

                k++;
                x += 100;
            }
            x = 40;
            y += 100;
        }
        b1 = new Button("New Game");
        b1.setSize(150,50);
        b1.setLocation(615,50);
        b1.setFont(new Font("", Font.BOLD, 20));
        b1.setBackground(new Color(173,216,230));
        b1.setForeground(Color.white);

        add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        
        // New game button
        if(e.getSource()==b1) {
            for(int i=0; i<=8; i++) {
                b[i].setLabel("");
            }
            z=0; z1=0; z2=0; z3=0; z4=0; z5=0; z6=0; z7=0; z8=0;
        }

        // Other 9 buttons during game
        // button 1
        if(e.getSource()==b[0] && z==0) {
            if(a%2==0) {
                b[0].setLabel("O");
                z++;
                a++;
            } else {
            b[0].setLabel("X");
                z++;
                a++;
            }
        }
                // button 2
        if(e.getSource()==b[1] && z1==0) {
            if(a%2==0) {
                b[1].setLabel("O");
                z1++;
                a++;
            } else {
            b[1].setLabel("X");
                z1++;
                a++;
            }
        }
                // button 3
        if(e.getSource()==b[2] && z2==0) {
            if(a%2==0) {
                b[2].setLabel("O");
                z2++;
                a++;
            } else {
            b[2].setLabel("X");
                z2++;
                a++;
            }
        }
                // button 4
        if(e.getSource()==b[3] && z3==0) {
            if(a%2==0) {
                b[3].setLabel("O");
                z3++;
                a++;
            } else {
            b[3].setLabel("X");
                z3++;
                a++;
            }
        }
                // button 5
        if(e.getSource()==b[4] && z4==0) {
            if(a%2==0) {
                b[4].setLabel("O");
                z4++;
                a++;
            } else {
            b[4].setLabel("X");
                z4++;
                a++;
            }
        }
                // button 6
        if(e.getSource()==b[5] && z5==0) {
            if(a%2==0) {
                b[5].setLabel("O");
                z5++;
                a++;
            } else {
            b[5].setLabel("X");
                z5++;
                a++;
            }
        }
                // button 7
        if(e.getSource()==b[6] && z6==0) {
            if(a%2==0) {
                b[6].setLabel("O");
                z6++;
                a++;
            } else {
            b[6].setLabel("X");
                z6++;
                a++;
            }
        }
                // button 8
        if(e.getSource()==b[7] && z7==0) {
            if(a%2==0) {
                b[7].setLabel("O");
                z7++;
                a++;
            } else {
            b[7].setLabel("X");
                z7++;
                a++;
            }
        }
                // button 9
        if(e.getSource()==b[8] && z8==0) {
            if(a%2==0) {
                b[8].setLabel("O");
                z8++;
                a++;
            } else {
            b[8].setLabel("X");
                z8++;
                a++;
            }
        }

        // Winning conditions
        Font f = new Font("", Font.BOLD, 20);
        // Rows
        // Top row
        if(b[0].getLabel()==b[1].getLabel() && b[0].getLabel()==b[2].getLabel()) {
            
            if(b[0].getLabel() == "O") {
                Label p1 = new Label ("Player 1 wins!");
                p1.setSize(150,30);
                p1.setLocation(420,l);
                p1.setFont(f);
                add(p1);
                l += 30;
            }
            if(b[0].getLabel() == "X") {
                Label p1 = new Label ("Player 2 wins!");
                p1.setSize(150,30);
                p1.setLocation(420,l);
                p1.setFont(f);
                add(p1);
                l += 30;
            }
        }
        // Middle row
        if(b[3].getLabel()==b[4].getLabel() && b[3].getLabel()==b[5].getLabel()) {
            
            if(b[3].getLabel() == "O") {
                Label p1 = new Label ("Player 1 wins!");
                p1.setSize(150,30);
                p1.setLocation(420,l);
                p1.setFont(f);
                add(p1);
                l += 30;
            }
            if(b[3].getLabel() == "X") {
                Label p1 = new Label ("Player 2 wins!");
                p1.setSize(150,30);
                p1.setLocation(420,l);
                p1.setFont(f);
                add(p1);
                l += 30;
            }
        }
        // Bottom row
        if(b[6].getLabel()==b[7].getLabel() && b[6].getLabel()==b[8].getLabel()) {
            
            if(b[6].getLabel() == "O") {
                Label p1 = new Label ("Player 1 wins!");
                p1.setSize(150,30);
                p1.setLocation(420,l);
                p1.setFont(f);
                add(p1);
                l += 30;
            }
            if(b[6].getLabel() == "X") {
                Label p1 = new Label ("Player 2 wins!");
                p1.setSize(150,30);
                p1.setLocation(420,l);
                p1.setFont(f);
                add(p1);
                l += 30;
            }
        }
        // Columns
        // Left column
        if(b[0].getLabel()==b[3].getLabel() && b[0].getLabel()==b[6].getLabel()) {
            
            if(b[0].getLabel() == "O") {
                Label p1 = new Label ("Player 1 wins!");
                p1.setSize(150,30);
                p1.setLocation(420,l);
                p1.setFont(f);
                add(p1);
                l += 30;
            }
            if(b[0].getLabel() == "X") {
                Label p1 = new Label ("Player 2 wins!");
                p1.setSize(150,30);
                p1.setLocation(420,l);
                p1.setFont(f);
                add(p1);
                l += 30;
            }
        }
        // Middle column
        if(b[1].getLabel()==b[4].getLabel() && b[1].getLabel()==b[7].getLabel()) {
            
            if(b[1].getLabel() == "O") {
                Label p1 = new Label ("Player 1 wins!");
                p1.setSize(150,30);
                p1.setLocation(420,l);
                p1.setFont(f);
                add(p1);
                l += 30;
            }
            if(b[1].getLabel() == "X") {
                Label p1 = new Label ("Player 2 wins!");
                p1.setSize(150,30);
                p1.setLocation(420,l);
                p1.setFont(f);
                add(p1);
                l += 30;
            }
        }
        // Right column
        if(b[2].getLabel()==b[5].getLabel() && b[2].getLabel()==b[8].getLabel()) {
            
            if(b[2].getLabel() == "O") {
                Label p1 = new Label ("Player 1 wins!");
                p1.setSize(150,30);
                p1.setLocation(420,l);
                p1.setFont(f);
                add(p1);
                l += 30;
            }
            if(b[2].getLabel() == "X") {
                Label p1 = new Label ("Player 2 wins!");
                p1.setSize(150,30);
                p1.setLocation(420,l);
                p1.setFont(f);
                add(p1);
                l += 30;
            }
        }
        // Diagonals
        // Top left, Bottom right
        if(b[0].getLabel()==b[4].getLabel() && b[0].getLabel()==b[8].getLabel()) {
            
            if(b[0].getLabel() == "O") {
                Label p1 = new Label ("Player 1 wins!");
                p1.setSize(150,30);
                p1.setLocation(420,l);
                p1.setFont(f);
                add(p1);
                l += 30;
            }
            if(b[0].getLabel() == "X") {
                Label p1 = new Label ("Player 2 wins!");
                p1.setSize(150,30);
                p1.setLocation(420,l);
                p1.setFont(f);
                add(p1);
                l += 30;
            }
        }
        // Top right, Bottom left
        if(b[2].getLabel()==b[4].getLabel() && b[2].getLabel()==b[6].getLabel()) {
            
            if(b[2].getLabel() == "O") {
                Label p1 = new Label ("Player 1 wins!");
                p1.setSize(150,30);
                p1.setLocation(420,l);
                p1.setFont(f);
                add(p1);
                l += 30;
            }
            if(b[2].getLabel() == "X") {
                Label p1 = new Label ("Player 2 wins!");
                p1.setSize(150,30);
                p1.setLocation(420,l);
                p1.setFont(f);
                add(p1);
                l += 30;
            }
        }
    }
}