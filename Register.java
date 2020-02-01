import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Register{

    public static void main(String[] args){

        JFrame registration = new JFrame("Hospital Corona");

        registration.setVisible(true);
        registration.setSize(500,500);
        registration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel submit_section = new JPanel();
        JButton submit_button = new JButton("Register");
        JButton patients_button = new JButton("Show Archive");

        JPanel form_section = new JPanel(new GridLayout(4,1,10,10));

        // Labels
        JLabel []labels = new JLabel[4];
        labels[0] = new JLabel("First Name:");
        labels[1] = new JLabel("Last Name:");
        labels[2] = new JLabel("Blood Type:");
        labels[3] = new JLabel("Gender:");

        // Text fields
        JTextField firstName_input = new JTextField(10);   
        JTextField lastName_input = new JTextField(10);

        // Radio Buttons
        JRadioButton a_positive_bloodType = new JRadioButton("A+");
        JRadioButton a_negative_bloodType = new JRadioButton("A-");
        JRadioButton b_positive_bloodType = new JRadioButton("B+");
        JRadioButton b_negative_bloodType = new JRadioButton("B-");
        JRadioButton male_gender = new JRadioButton("Male");
        JRadioButton female_gender = new JRadioButton("Female");

        // Button Groups
        ButtonGroup bloodTypes = new ButtonGroup();
        bloodTypes.add(a_positive_bloodType);
        bloodTypes.add(a_negative_bloodType);
        bloodTypes.add(b_positive_bloodType);
        bloodTypes.add(b_negative_bloodType);
        ButtonGroup genderlist = new ButtonGroup();
        genderlist.add(male_gender);
        genderlist.add(female_gender);

        // Panels
        JPanel firstName = new JPanel();
        JPanel lastName = new JPanel();
        JPanel bloodType = new JPanel();
        JPanel gender = new JPanel();

        // Placement in Panels
        firstName.add(labels[0]);
        firstName.add(firstName_input);
        lastName.add(labels[1]);
        lastName.add(lastName_input);
        bloodType.add(labels[2]);
        bloodType.add(a_positive_bloodType);
        bloodType.add(a_negative_bloodType);
        bloodType.add(b_positive_bloodType);
        bloodType.add(b_negative_bloodType);
        gender.add(labels[3]);
        gender.add(male_gender);
        gender.add(female_gender);
        form_section.add(firstName);
        form_section.add(lastName);
        form_section.add(bloodType);
        form_section.add(gender);
        submit_section.add(submit_button);
        submit_section.add(patients_button);

        // Outer Panels Placement
        registration.add(BorderLayout.CENTER, form_section);
        registration.add(BorderLayout.SOUTH, submit_section);


        Patient newPatient = new Patient();

        ArrayList<String> patientFirstName = new ArrayList<>();
        ArrayList<String> patientLastName = new ArrayList<>();
        ArrayList<String> patientBloodType = new ArrayList<>();
        ArrayList<String> patientGender = new ArrayList<>();


        submit_button.addActionListener((ActionEvent e) -> {

            String currentFirstName = firstName_input.getText();
            String currentLastName = lastName_input.getText();
            String currentGender;
            String currentBloodType;

            if(male_gender.isSelected()){
                currentGender = "Male";
            } else {
                currentGender = "Female";
            }

            if(a_positive_bloodType.isSelected()){
                currentBloodType = "A+";
            } else if (a_negative_bloodType.isSelected()){
                currentBloodType = "A-";
            } else if (b_positive_bloodType.isSelected()){
                currentBloodType = "B+";
            } else {
                currentBloodType = "B-";
            }
            
            patientFirstName.add(currentFirstName);
            patientLastName.add(currentLastName);
            patientBloodType.add(currentBloodType);
            patientGender.add(currentGender);

            firstName_input.setText("");
            lastName_input.setText("");

            bloodTypes.clearSelection();
            genderlist.clearSelection();

        });

        patients_button.addActionListener((ActionEvent e) -> {
        
            newPatient.setFirstName(patientFirstName);
            newPatient.setlastName(patientLastName);
            newPatient.setBloodType(patientBloodType);
            newPatient.setGender(patientGender);

            System.out.println(newPatient);
            
        
        });  

    }

}