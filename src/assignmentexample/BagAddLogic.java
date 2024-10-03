/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentexample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author NGC
 */
public class BagAddLogic {
    public boolean GetValidBag (int bagID, String bagCategory){
        return true;
    }
    public void AddNewBag (Bag newBag){
        String  bagData = newBag.getbName()+","+
                newBag.getbCategory()+","+
                newBag.getBagQty()+","+
                newBag.getbPrice();
        try{
            Writer output;
            
            output = new BufferedWriter(new FileWriter("E:\\icbt assignment\\sem2\\sem 2.2\\oop\\AssignmentExample\\bags.txt",true));
            output.append(bagData);
            output.append("\n");
            output.close();
            JOptionPane.showMessageDialog(null, "New bag has been added successfully");
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public List<Bag> DisplayBagList(){
        List<Bag> totalbagList=new ArrayList<Bag>();
        try{
            File bagFile=new File("E:\\icbt assignment\\sem2\\sem 2.2\\oop\\AssignmentExample\\bags.txt");
            Scanner myReader=new Scanner(bagFile);
            while(myReader.hasNextLine()){
                String bagData=myReader.nextLine();
                ArrayList<String> bagList=new ArrayList<>(Arrays.asList(bagData.split(",")));
                Bag bags=new Bag();
                bags.setBagQty(Integer.parseInt(bagList.get(0)));
                bags.setbName(bagList.get(1));
                bags.setbCategory(bagList.get(2));
                bags.setbPrice(Double.parseDouble(bagList.get(3)));
            totalbagList.add(bags);                
            }
            myReader.close();
        }
        catch (FileNotFoundException e){
                JOptionPane.showMessageDialog(null, e);
        }
        return totalbagList;       
        
    
    }

    
}
