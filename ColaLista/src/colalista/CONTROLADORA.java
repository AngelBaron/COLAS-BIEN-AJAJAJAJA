/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colalista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author angel
 */
public class CONTROLADORA extends JFrame implements ActionListener{
    private JButton bi,lin,cir,ins;
    private JLabel eti;
    private JTextField num;
    private int[] nume;
    public CONTROLADORA(){
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        componentes();
        setVisible(true);
                
                
    }
    public void componentes(){
        bi = new JButton("EN BICOLA");
        bi.setBounds(200,100,120,30);
        bi.addActionListener(this);
        add(bi);
        
        lin = new JButton("LINEAL");
        lin.setBounds(200,150,100,30);
        lin.addActionListener(this);
        add(lin);
        
        cir = new JButton("LINEAL");
        cir.setBounds(200,200,100,30);
        cir.addActionListener(this);
        add(cir);
        
        eti = new JLabel("INSERTE CUANTOS ELEMENTOS QUIERE ALMACENAR");
        eti.setBounds(10,10,400,30);
        add(eti);
        num = new JTextField();
        num.setBounds(30,40,100,30);
        add(num);
        
        ins = new JButton("INSERTAR ELEMENTOS");
        ins.setBounds(150,40,200,30);
        ins.addActionListener(this);
        add(ins);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== ins){
            try{
            nume= new int[Integer.parseInt(num.getText())];
            for(int i=0; i<Integer.parseInt(num.getText());i++){
                nume[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESA EL ELEMENTO " +i));
                
            }
            }catch(Exception x){
                JOptionPane.showMessageDialog(null, "ERROR EN LOS DATOS INGRESADOS");
            }
            
            
        }
        if(e.getSource()==bi){
            try{
                if(nume!=null){
                    
                }
            }catch(Exception x){
                JOptionPane.showMessageDialog(null, "ERROR EN LOS DATOS INGRESADOS");
            }
        }
    }
}
