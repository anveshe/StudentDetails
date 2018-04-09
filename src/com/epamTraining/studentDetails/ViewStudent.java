package com.epamTraining.studentDetails;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ViewStudent extends JFrame {
	static ViewStudent frame;
	public ViewStudent() {

		String data[][]=new String[AdminSection.studentList.size()][5];
		int row=0;
		for(Student s:AdminSection.studentList){
			data[row][0]=s.getName();
			data[row][1]=s.getEmail();
			data[row][2]=s.getCourse();
			data[row][3]=String.valueOf(s.getFee());
			data[row][4]=s.getContactno();
			
			row++;
		}
		String columnNames[]={"Name","Email","Course","Fee","Contact No"};
		
		JTable jt=new JTable(data,columnNames);
		JScrollPane sp=new JScrollPane(jt);
		add(sp);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 400);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ViewStudent();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
